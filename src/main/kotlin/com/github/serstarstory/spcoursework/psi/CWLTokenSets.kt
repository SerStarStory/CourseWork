package com.github.serstarstory.spcoursework.psi

import com.intellij.psi.tree.TokenSet

object CWLTokenSets {
    val IDENTIFIERS: TokenSet = TokenSet.create(CWLTypes.IDENTIFIER)

    val COMMENTS: TokenSet = TokenSet.create(CWLTypes.COMMENT)
}