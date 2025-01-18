package com.github.serstarstory.spcoursework.psi

import com.github.serstarstory.spcoursework.CWLFileType
import com.github.serstarstory.spcoursework.CWLLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class CWLFile(viewProvider: FileViewProvider) :
    PsiFileBase(viewProvider, CWLLanguage) {
    override fun getFileType(): FileType {
        return CWLFileType
    }

    override fun toString(): String {
        return "CWL"
    }
}