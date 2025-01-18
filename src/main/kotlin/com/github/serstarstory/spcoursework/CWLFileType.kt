package com.github.serstarstory.spcoursework

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object CWLFileType:  LanguageFileType(CWLLanguage) {
    override fun getName(): String {
        return "CWL"
    }

    override fun getDescription(): String {
        return "CWL"
    }

    override fun getDefaultExtension(): String {
        return "cwl"
    }

    override fun getIcon(): Icon {
        return CWLIcons.FILE
    }
}