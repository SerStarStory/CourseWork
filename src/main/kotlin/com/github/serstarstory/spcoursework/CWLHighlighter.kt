package com.github.serstarstory.spcoursework

import com.github.serstarstory.spcoursework.psi.CWLTypes
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType

class CWLHighlighter: SyntaxHighlighterBase() {
    companion object {
        val KEY = arrayOf(createTextAttributesKey("CWL_KEY", DefaultLanguageHighlighterColors.KEYWORD))
        val ASSIGN = arrayOf(createTextAttributesKey("CWL_ASSIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN))
        val IDENTIFIER = arrayOf(createTextAttributesKey("CWL_LABEL", DefaultLanguageHighlighterColors.STRING))
        val SEMICOLON = arrayOf(createTextAttributesKey("CWL_SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON))
        val COMMENT = arrayOf(createTextAttributesKey("CWL_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT))
        val BRACKETS = arrayOf(createTextAttributesKey("CWL_BRACKETS", DefaultLanguageHighlighterColors.LINE_COMMENT))
        val FUNC = arrayOf(createTextAttributesKey("CWL_FUNC", DefaultLanguageHighlighterColors.FUNCTION_DECLARATION))
        val EMPTY = arrayOf<TextAttributesKey>()
    }

    override fun getHighlightingLexer(): Lexer {
        return CWLLexerAdapter()
    }

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> {
        return when (tokenType) {
            CWLTypes.PROGRAM, CWLTypes.VARIABLE, CWLTypes.VARIABLE_TYPE,
                 CWLTypes.IF, CWLTypes.ELSE, CWLTypes.FOR,
                 CWLTypes.TO, CWLTypes.DOWNTO, CWLTypes.DO,
                 CWLTypes.WHILE, CWLTypes.REPEAT, CWLTypes.UNTIL,
                 CWLTypes.END, CWLTypes.CONTINUE, CWLTypes.EXIT -> KEY
            CWLTypes.SEMICOLON -> SEMICOLON
            CWLTypes.COMMENT -> COMMENT
            CWLTypes.ASSIGN -> ASSIGN
            CWLTypes.IDENTIFIER -> IDENTIFIER
            CWLTypes.LBRACKET, CWLTypes.RBRACKET, CWLTypes.START, CWLTypes.STOP -> BRACKETS
            CWLTypes.INPUT, CWLTypes.OUTPUT -> FUNC
            else -> EMPTY
        }
    }
}