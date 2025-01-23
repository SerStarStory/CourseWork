package com.github.serstarstory.spcoursework.run

import com.github.serstarstory.spcoursework.CWLIcons
import com.intellij.execution.configurations.ConfigurationTypeBase
import com.intellij.icons.AllIcons

class CWLRunConfigurationType: ConfigurationTypeBase("cwl", "CWL", null, CWLIcons.FILE) {
    init {
        addFactory(CWLConfigurationFactory(this))
    }
}