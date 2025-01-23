package com.github.serstarstory.spcoursework.run

import com.intellij.execution.Executor
import com.intellij.execution.configuration.EmptyRunProfileState
import com.intellij.execution.configurations.*
import com.intellij.execution.process.*
import com.intellij.execution.runners.ExecutionEnvironment
import com.intellij.openapi.application.assertWriteAccessAllowed
import com.intellij.openapi.application.runWriteAction
import com.intellij.openapi.application.writeAction
import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.io.toNioPath
import io.ktor.utils.io.*
import java.nio.file.Files
import java.nio.file.StandardCopyOption
import kotlin.io.path.Path
import kotlin.io.path.pathString
import kotlin.io.path.relativeTo


class CWLRunConfiguration constructor(project: Project, factory: ConfigurationFactory, name: String): RunConfigurationBase<CWLRunConfigurationOptions?>(project, factory, name) {

    var inputFile by options::inputFile
    var workingDir by options::workingDir

    override fun getOptions(): CWLRunConfigurationOptions {
        return super.getOptions() as CWLRunConfigurationOptions
    }

    override fun getConfigurationEditor(): SettingsEditor<out RunConfiguration?> {
        return CWLSettingsEditor()
    }

    override fun getState(
        executor: Executor,
        environment: ExecutionEnvironment
    ): RunProfileState {
        if (!Files.exists(workingDir.toNioPath())) {
            throw RuntimeException("Working dir not found")
        }
        val compiler = Path(workingDir, "compiler.exe")
        if (!Files.exists(compiler)) {
            Files.copy(CWLRunConfiguration::class.java.getResourceAsStream("/compiler.exe"), compiler, StandardCopyOption.REPLACE_EXISTING)
        }
        val inputFilePath = inputFile.toNioPath()
        if (!Files.exists(inputFilePath)) {
            throw RuntimeException("Input file not found")
        }
        val inputFileName = inputFilePath.fileName.pathString
        val inputFileWorkingPath = Path(workingDir, inputFileName)
        Files.copy(inputFilePath, inputFileWorkingPath, StandardCopyOption.REPLACE_EXISTING)

        return object: CommandLineState(environment) {
            override fun startProcess(): ProcessHandler {
                val commandLine: GeneralCommandLine =
                    GeneralCommandLine("compiler.exe").withWorkDirectory(workingDir).apply {
                        addParameters("-all", inputFileName)
                    }
                val fileNameWithoutExtension = inputFileName.substring(0, inputFileName.lastIndexOf('.'))
                val processHandler = ProcessHandlerFactory.getInstance()
                    .createColoredProcessHandler(commandLine)
                ProcessTerminatedListener.attach(processHandler)
                runWriteAction {

                }
                return processHandler
            }
        }
    }
}