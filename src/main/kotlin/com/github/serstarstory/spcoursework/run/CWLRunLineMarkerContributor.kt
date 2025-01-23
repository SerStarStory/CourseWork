package com.github.serstarstory.spcoursework.run

import com.github.serstarstory.spcoursework.psi.CWLTypes
import com.intellij.codeInsight.daemon.LineMarkerInfo
import com.intellij.execution.ProgramRunnerUtil
import com.intellij.execution.RunManager
import com.intellij.execution.configurations.ConfigurationTypeUtil
import com.intellij.execution.executors.DefaultRunExecutor
import com.intellij.execution.impl.RunManagerImpl
import com.intellij.execution.lineMarker.RunLineMarkerContributor
import com.intellij.icons.AllIcons
import com.intellij.openapi.actionSystem.ActionManager
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.psi.PsiElement
import com.intellij.psi.util.elementType
import com.intellij.structuralsearch.plugin.ui.ConfigurationManager
import kotlinx.coroutines.runBlocking
import java.nio.file.Files
import kotlin.io.path.Path

class CWLRunLineMarkerContributor: RunLineMarkerContributor() {
    override fun getInfo(element: PsiElement): Info? {
        if (element.elementType != CWLTypes.PROGRAM) return null
        return Info(AllIcons.RunConfigurations.TestState.Run, {"Run"}, object: AnAction() {
            override fun actionPerformed(e: AnActionEvent) {
                val configurationFactory = ConfigurationTypeUtil.findConfigurationType("cwl")?.configurationFactories?.firstOrNull()
                    ?: return
                val file = element.containingFile ?: return
                val project = element.project

                val runManager = RunManager.getInstance(project)

                val workingDir = Path(project.basePath ?: return, "working")
                if (!Files.exists(workingDir)) {
                    Files.createDirectory(workingDir)
                }
                val settings = runManager.createConfiguration("Run ${file.name}", configurationFactory)
                (settings.configuration as CWLRunConfiguration).apply {
                    this.inputFile = file.virtualFile?.path ?: return
                    this.workingDir = workingDir.toString()
                }

                runManager.addConfiguration(settings)
                runManager.selectedConfiguration = settings

                ProgramRunnerUtil.executeConfiguration(settings, DefaultRunExecutor.getRunExecutorInstance())
            }
        })
    }
}