package com.github.serstarstory.spcoursework.run

import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.ConfigurationType
import com.intellij.execution.configurations.RunConfiguration
import com.intellij.openapi.components.BaseState
import com.intellij.openapi.project.Project

class CWLConfigurationFactory(type: ConfigurationType): ConfigurationFactory(type) {
    override fun getId(): String {
        return "cwl"
    }

    override fun createTemplateConfiguration(project: Project): RunConfiguration {
        return CWLRunConfiguration(project, this, "Demo")
    }

    override fun getOptionsClass(): Class<out BaseState> {
        return CWLRunConfigurationOptions::class.java
    }
}