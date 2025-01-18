package com.github.serstarstory.spcoursework

import com.intellij.lang.Language

object CWLLanguage: Language("CWL") {
    private fun readResolve(): Any = CWLLanguage
}