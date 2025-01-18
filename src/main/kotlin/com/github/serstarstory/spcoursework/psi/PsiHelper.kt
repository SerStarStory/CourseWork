package com.github.serstarstory.spcoursework.psi

import com.intellij.psi.PsiElement
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.psi.util.elementType
import com.intellij.util.containers.filterSmartMutable

object PsiHelper {
    fun isDeclarationExists(elem: PsiElement): Boolean {
        val file = elem.containingFile
        val elems = PsiTreeUtil.findChildOfType(file, CWLVariableDeclaration::class.java) ?: return false
        return elems.children.filterIsInstance<CWLVariableName>().any {
            it.text == elem.text
        }
    }

    fun isLabelDeclared(elem: PsiElement): Boolean {
        val file = elem.containingFile
        val elems = PsiTreeUtil.findChildrenOfType(file, CWLLabelDef::class.java) ?: return false
        return elems.any {
            it.text == elem.text
        }
    }
}