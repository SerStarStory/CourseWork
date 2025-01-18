package com.github.serstarstory.spcoursework

import com.github.serstarstory.spcoursework.parser.CWLParser
import com.github.serstarstory.spcoursework.psi.CWLFile
import com.github.serstarstory.spcoursework.psi.CWLTokenSets.COMMENTS
import com.github.serstarstory.spcoursework.psi.CWLTypes
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

internal class CWLParserDefinition : ParserDefinition {
    override fun createLexer(project: Project): Lexer {
        return CWLLexerAdapter()
    }

    override fun getCommentTokens(): TokenSet {
        return COMMENTS
    }

    override fun getStringLiteralElements(): TokenSet {
        return TokenSet.EMPTY
    }

    override fun createParser(project: Project): PsiParser {
        return CWLParser()
    }

    override fun getFileNodeType(): IFileElementType {
        return FILE
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return CWLFile(viewProvider)
    }

    override fun createElement(node: ASTNode): PsiElement {
        return CWLTypes.Factory.createElement(node)
    }

    companion object {
        val FILE: IFileElementType = IFileElementType(CWLLanguage)
    }
}