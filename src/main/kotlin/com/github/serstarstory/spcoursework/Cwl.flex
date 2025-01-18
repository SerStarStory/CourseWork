package com.github.serstarstory.spcoursework;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER; // Pre-defined bad character token.
import static com.intellij.psi.TokenType.WHITE_SPACE; // Pre-defined whitespace character token.
import static com.github.serstarstory.spcoursework.psi.CWLTypes.*; // Note that is the class which is specified as `elementTypeHolderClass`
// in bnf grammar file. This will contain all other tokens which we will use.

%%

%public
%class CWLLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

IDENTIFIER=[A-Z][a-z]{7}

WHITE_SPACE=[ \t\n\x0B\f\r]+

COMMENT = "##" [^#] ~"##" | "##" "#"+ "#"

VALUE = [0-9]*

%%
<YYINITIAL> {
    "#program" { return PROGRAM; }
    "start" { return START; }
    "variable" { return VARIABLE; }
    "integer_4" { return VARIABLE_TYPE; }
    "stop" { return STOP; }
    "," { return COMMA; }
    ";" { return SEMICOLON; }
    ":" { return COLON; }
    "(" { return LBRACKET; }
    ")" { return RBRACKET; }
    "input" { return INPUT; }
    "output" { return OUTPUT; }
    "+" { return PLUS; }
    "-" { return MINUS; }
    "*" { return MUL; }
    "/" { return DIV; }
    "%" { return MOD; }
    "!!" { return NOT; }
    "&&" { return AND; }
    "||" { return OR; }
    "<-" { return ASSIGN; }
    "==" { return EQ; }
    "!=" { return NEQ; }
    ">=" { return GRE; }
    "<=" { return LSE; }
    "goto" { return GOTO; }
    "if" { return IF; }
    "else" { return ELSE; }
    "for" { return FOR; }
    "to" { return TO; }
    "downto" { return DOWNTO; }
    "do" { return DO; }
    "while" { return WHILE; }
    "end" { return END; }
    "repeat" { return REPEAT; }
    "until" { return UNTIL; }
    "exit" { return EXIT; }
    "continue" { return CONTINUE; }


  {IDENTIFIER}       { return IDENTIFIER; }
  {WHITE_SPACE}      { return WHITE_SPACE; }
  {COMMENT}      { return COMMENT; }
  {VALUE}      { return VALUE; }
}

// If the character sequence does not match any of the above rules, we return BAD_CHARACTER which indicates that
// there is an error in the character sequence. This is used to highlight errors.
[^] { return BAD_CHARACTER; }