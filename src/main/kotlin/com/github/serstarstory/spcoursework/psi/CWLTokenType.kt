package com.github.serstarstory.spcoursework.psi

import com.github.serstarstory.spcoursework.CWLLanguage
import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls

class CWLTokenType(debugName: @NonNls String): IElementType(debugName, CWLLanguage) {
    override fun toString(): String {
        return "CWLTokenType." + super.toString()
    }
}