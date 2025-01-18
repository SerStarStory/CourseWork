// This is a generated file. Not intended for manual editing.
package com.github.serstarstory.spcoursework.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.serstarstory.spcoursework.psi.impl.*;

public interface CWLTypes {

  IElementType BINARY_ACTION = new CWLElementType("BINARY_ACTION");
  IElementType EXPRESSION = new CWLElementType("EXPRESSION");
  IElementType FOR_TO_DOWN_TO_STMT = new CWLElementType("FOR_TO_DOWN_TO_STMT");
  IElementType GOTO_STMT = new CWLElementType("GOTO_STMT");
  IElementType IF_STMT = new CWLElementType("IF_STMT");
  IElementType INPUT_STATEMENT = new CWLElementType("INPUT_STATEMENT");
  IElementType LABEL_CALL = new CWLElementType("LABEL_CALL");
  IElementType LABEL_DEF = new CWLElementType("LABEL_DEF");
  IElementType LABEL_STMT = new CWLElementType("LABEL_STMT");
  IElementType LEFT_EXPRESSION = new CWLElementType("LEFT_EXPRESSION");
  IElementType OUTPUT_STATEMENT = new CWLElementType("OUTPUT_STATEMENT");
  IElementType PROGRAM_BODY = new CWLElementType("PROGRAM_BODY");
  IElementType PROGRAM_NAME = new CWLElementType("PROGRAM_NAME");
  IElementType REPEAT_UNTIL_STMT = new CWLElementType("REPEAT_UNTIL_STMT");
  IElementType RL_EXPRESSION = new CWLElementType("RL_EXPRESSION");
  IElementType STATEMENT = new CWLElementType("STATEMENT");
  IElementType UNARY_OPERATION = new CWLElementType("UNARY_OPERATION");
  IElementType VARIABLE_DECLARATION = new CWLElementType("VARIABLE_DECLARATION");
  IElementType VARIABLE_NAME = new CWLElementType("VARIABLE_NAME");
  IElementType WHILE_STATEMENT = new CWLElementType("WHILE_STATEMENT");
  IElementType WHILE_STMT = new CWLElementType("WHILE_STMT");

  IElementType AND = new CWLTokenType("AND");
  IElementType ASSIGN = new CWLTokenType("ASSIGN");
  IElementType COLON = new CWLTokenType("COLON");
  IElementType COMMA = new CWLTokenType("COMMA");
  IElementType COMMENT = new CWLTokenType("");
  IElementType CONTINUE = new CWLTokenType("CONTINUE");
  IElementType DIV = new CWLTokenType("DIV");
  IElementType DO = new CWLTokenType("DO");
  IElementType DOWNTO = new CWLTokenType("DOWNTO");
  IElementType ELSE = new CWLTokenType("ELSE");
  IElementType END = new CWLTokenType("END");
  IElementType EQ = new CWLTokenType("EQ");
  IElementType EXIT = new CWLTokenType("EXIT");
  IElementType FOR = new CWLTokenType("FOR");
  IElementType GOTO = new CWLTokenType("GOTO");
  IElementType GRE = new CWLTokenType("GRE");
  IElementType IDENTIFIER = new CWLTokenType("IDENTIFIER");
  IElementType IF = new CWLTokenType("IF");
  IElementType INPUT = new CWLTokenType("INPUT");
  IElementType LBRACKET = new CWLTokenType("LBRACKET");
  IElementType LSE = new CWLTokenType("LSE");
  IElementType MINUS = new CWLTokenType("MINUS");
  IElementType MOD = new CWLTokenType("MOD");
  IElementType MUL = new CWLTokenType("MUL");
  IElementType NEQ = new CWLTokenType("NEQ");
  IElementType NOT = new CWLTokenType("NOT");
  IElementType OR = new CWLTokenType("OR");
  IElementType OUTPUT = new CWLTokenType("OUTPUT");
  IElementType PLUS = new CWLTokenType("PLUS");
  IElementType PROGRAM = new CWLTokenType("PROGRAM");
  IElementType RBRACKET = new CWLTokenType("RBRACKET");
  IElementType REPEAT = new CWLTokenType("REPEAT");
  IElementType SEMICOLON = new CWLTokenType("SEMICOLON");
  IElementType START = new CWLTokenType("START");
  IElementType STOP = new CWLTokenType("STOP");
  IElementType TO = new CWLTokenType("TO");
  IElementType UNTIL = new CWLTokenType("UNTIL");
  IElementType VALUE = new CWLTokenType("VALUE");
  IElementType VARIABLE = new CWLTokenType("VARIABLE");
  IElementType VARIABLE_TYPE = new CWLTokenType("VARIABLE_TYPE");
  IElementType WHILE = new CWLTokenType("WHILE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == BINARY_ACTION) {
        return new CWLBinaryActionImpl(node);
      }
      else if (type == EXPRESSION) {
        return new CWLExpressionImpl(node);
      }
      else if (type == FOR_TO_DOWN_TO_STMT) {
        return new CWLForToDownToStmtImpl(node);
      }
      else if (type == GOTO_STMT) {
        return new CWLGotoStmtImpl(node);
      }
      else if (type == IF_STMT) {
        return new CWLIfStmtImpl(node);
      }
      else if (type == INPUT_STATEMENT) {
        return new CWLInputStatementImpl(node);
      }
      else if (type == LABEL_CALL) {
        return new CWLLabelCallImpl(node);
      }
      else if (type == LABEL_DEF) {
        return new CWLLabelDefImpl(node);
      }
      else if (type == LABEL_STMT) {
        return new CWLLabelStmtImpl(node);
      }
      else if (type == LEFT_EXPRESSION) {
        return new CWLLeftExpressionImpl(node);
      }
      else if (type == OUTPUT_STATEMENT) {
        return new CWLOutputStatementImpl(node);
      }
      else if (type == PROGRAM_BODY) {
        return new CWLProgramBodyImpl(node);
      }
      else if (type == PROGRAM_NAME) {
        return new CWLProgramNameImpl(node);
      }
      else if (type == REPEAT_UNTIL_STMT) {
        return new CWLRepeatUntilStmtImpl(node);
      }
      else if (type == RL_EXPRESSION) {
        return new CWLRlExpressionImpl(node);
      }
      else if (type == STATEMENT) {
        return new CWLStatementImpl(node);
      }
      else if (type == UNARY_OPERATION) {
        return new CWLUnaryOperationImpl(node);
      }
      else if (type == VARIABLE_DECLARATION) {
        return new CWLVariableDeclarationImpl(node);
      }
      else if (type == VARIABLE_NAME) {
        return new CWLVariableNameImpl(node);
      }
      else if (type == WHILE_STATEMENT) {
        return new CWLWhileStatementImpl(node);
      }
      else if (type == WHILE_STMT) {
        return new CWLWhileStmtImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
