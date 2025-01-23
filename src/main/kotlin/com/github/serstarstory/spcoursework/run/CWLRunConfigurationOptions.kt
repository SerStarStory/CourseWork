package com.github.serstarstory.spcoursework.run

import com.intellij.execution.configurations.RunConfigurationOptions
import com.intellij.openapi.components.StoredProperty

class CWLRunConfigurationOptions : RunConfigurationOptions() {
    private val inputFileProp: StoredProperty<String?> = string("").provideDelegate(
        this, "inputFile"
    )
    private val workingDirProp: StoredProperty<String?> = string("").provideDelegate(
        this, "workingDir"
    )

    var inputFile: String
        get() = inputFileProp.getValue(this).toString()
        set(value) {
            inputFileProp.setValue(this, value)
        }

    var workingDir: String
        get() = workingDirProp.getValue(this).toString()
        set(value) {
            workingDirProp.setValue(this, value)
        }
}