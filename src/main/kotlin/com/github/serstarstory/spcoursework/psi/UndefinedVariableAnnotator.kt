package com.github.serstarstory.spcoursework.psi

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.psi.PsiElement
import com.intellij.psi.util.elementType

class UndefinedVariableAnnotator: Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (element is CWLProgramName) {
            if (PsiHelper.isDeclarationExists(element)) {
                holder.newAnnotation(HighlightSeverity.ERROR, "Program name can't be equal to variable name")
                    .range(element.getTextRange())
                    .create();
            } else if (PsiHelper.isLabelDeclared(element)) {
                holder.newAnnotation(HighlightSeverity.ERROR, "Program name can't be equal to label name")
                    .range(element.getTextRange())
                    .create();
            }
        } else if (element is CWLVariableName) {
            if (element.parent is CWLVariableDeclaration) return
            if (!PsiHelper.isDeclarationExists(element)) {
                holder.newAnnotation(HighlightSeverity.ERROR, "Variable is not declared")
                    .range(element.getTextRange())
                    .create();
            }
        } else if (element is CWLLabelCall) {
            if (!PsiHelper.isLabelDeclared(element)) {
                holder.newAnnotation(HighlightSeverity.ERROR, "Label is not declared")
                    .range(element.getTextRange())
                    .create();
            } else if (PsiHelper.isDeclarationExists(element)) {
                holder.newAnnotation(HighlightSeverity.ERROR, "Label name can't be same as variable name")
                    .range(element.getTextRange())
                    .create();
            }
        }
    }
}