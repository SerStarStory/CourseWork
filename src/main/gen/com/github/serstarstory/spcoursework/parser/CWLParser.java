// This is a generated file. Not intended for manual editing.
package com.github.serstarstory.spcoursework.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.serstarstory.spcoursework.psi.CWLTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CWLParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return StartDefinition(b, l + 1);
  }

  /* ********************************************************** */
  // PLUS|MINUS|MUL|DIV|MOD|AND|OR|NOT|EQ|NEQ|GRE|LSE
  public static boolean BinaryAction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryAction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINARY_ACTION, "<binary action>");
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, MUL);
    if (!r) r = consumeToken(b, DIV);
    if (!r) r = consumeToken(b, MOD);
    if (!r) r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, OR);
    if (!r) r = consumeToken(b, NOT);
    if (!r) r = consumeToken(b, EQ);
    if (!r) r = consumeToken(b, NEQ);
    if (!r) r = consumeToken(b, GRE);
    if (!r) r = consumeToken(b, LSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LeftExpression (BinaryAction LeftExpression)*
  public static boolean Expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = LeftExpression(b, l + 1);
    r = r && Expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (BinaryAction LeftExpression)*
  private static boolean Expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Expression_1", c)) break;
    }
    return true;
  }

  // BinaryAction LeftExpression
  private static boolean Expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BinaryAction(b, l + 1);
    r = r && LeftExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FOR RlExpression {TO|DOWNTO} VALUE DO Statement* SEMICOLON
  public static boolean ForToDownToStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForToDownToStmt")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR);
    r = r && RlExpression(b, l + 1);
    r = r && ForToDownToStmt_2(b, l + 1);
    r = r && consumeTokens(b, 0, VALUE, DO);
    r = r && ForToDownToStmt_5(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, FOR_TO_DOWN_TO_STMT, r);
    return r;
  }

  // TO|DOWNTO
  private static boolean ForToDownToStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForToDownToStmt_2")) return false;
    boolean r;
    r = consumeToken(b, TO);
    if (!r) r = consumeToken(b, DOWNTO);
    return r;
  }

  // Statement*
  private static boolean ForToDownToStmt_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForToDownToStmt_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ForToDownToStmt_5", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // GOTO LabelCall
  public static boolean GotoStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GotoStmt")) return false;
    if (!nextTokenIs(b, GOTO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GOTO);
    r = r && LabelCall(b, l + 1);
    exit_section_(b, m, GOTO_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // IF LBRACKET Expression RBRACKET Statement* SEMICOLON [ELSE Statement* SEMICOLON ]
  public static boolean IfStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStmt")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IF, LBRACKET);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    r = r && IfStmt_4(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && IfStmt_6(b, l + 1);
    exit_section_(b, m, IF_STMT, r);
    return r;
  }

  // Statement*
  private static boolean IfStmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStmt_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IfStmt_4", c)) break;
    }
    return true;
  }

  // [ELSE Statement* SEMICOLON ]
  private static boolean IfStmt_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStmt_6")) return false;
    IfStmt_6_0(b, l + 1);
    return true;
  }

  // ELSE Statement* SEMICOLON
  private static boolean IfStmt_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStmt_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && IfStmt_6_0_1(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // Statement*
  private static boolean IfStmt_6_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStmt_6_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IfStmt_6_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // INPUT LBRACKET VariableName RBRACKET
  public static boolean InputStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InputStatement")) return false;
    if (!nextTokenIs(b, INPUT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INPUT, LBRACKET);
    r = r && VariableName(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, INPUT_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean LabelCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelCall")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, LABEL_CALL, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean LabelDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelDef")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, LABEL_DEF, r);
    return r;
  }

  /* ********************************************************** */
  // LabelDef COLON
  public static boolean LabelStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelStmt")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LabelDef(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, LABEL_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // {LBRACKET Expression RBRACKET} | {UnaryOperation VariableName} | VariableName | VALUE
  public static boolean LeftExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LeftExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LEFT_EXPRESSION, "<left expression>");
    r = LeftExpression_0(b, l + 1);
    if (!r) r = LeftExpression_1(b, l + 1);
    if (!r) r = VariableName(b, l + 1);
    if (!r) r = consumeToken(b, VALUE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LBRACKET Expression RBRACKET
  private static boolean LeftExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LeftExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // UnaryOperation VariableName
  private static boolean LeftExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LeftExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnaryOperation(b, l + 1);
    r = r && VariableName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OUTPUT LBRACKET VariableName RBRACKET
  public static boolean OutputStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OutputStatement")) return false;
    if (!nextTokenIs(b, OUTPUT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OUTPUT, LBRACKET);
    r = r && VariableName(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, OUTPUT_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // Statement*
  public static boolean ProgramBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProgramBody")) return false;
    Marker m = enter_section_(b, l, _NONE_, PROGRAM_BODY, "<program body>");
    while (true) {
      int c = current_position_(b);
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ProgramBody", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean ProgramName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProgramName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, PROGRAM_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // REPEAT Statement* UNTIL LBRACKET Expression RBRACKET
  public static boolean RepeatUntilStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RepeatUntilStmt")) return false;
    if (!nextTokenIs(b, REPEAT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REPEAT);
    r = r && RepeatUntilStmt_1(b, l + 1);
    r = r && consumeTokens(b, 0, UNTIL, LBRACKET);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, REPEAT_UNTIL_STMT, r);
    return r;
  }

  // Statement*
  private static boolean RepeatUntilStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RepeatUntilStmt_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RepeatUntilStmt_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // VariableName ASSIGN Expression
  public static boolean RlExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RlExpression")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableName(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, RL_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // PROGRAM ProgramName SEMICOLON START VariableDeclaration ProgramBody STOP
  static boolean StartDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StartDefinition")) return false;
    if (!nextTokenIs(b, PROGRAM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PROGRAM);
    r = r && ProgramName(b, l + 1);
    r = r && consumeTokens(b, 0, SEMICOLON, START);
    r = r && VariableDeclaration(b, l + 1);
    r = r && ProgramBody(b, l + 1);
    r = r && consumeToken(b, STOP);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // InputStatement|OutputStatement|RlExpression|LabelStmt|GotoStmt|IfStmt|ForToDownToStmt|WhileStmt|RepeatUntilStmt
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = InputStatement(b, l + 1);
    if (!r) r = OutputStatement(b, l + 1);
    if (!r) r = RlExpression(b, l + 1);
    if (!r) r = LabelStmt(b, l + 1);
    if (!r) r = GotoStmt(b, l + 1);
    if (!r) r = IfStmt(b, l + 1);
    if (!r) r = ForToDownToStmt(b, l + 1);
    if (!r) r = WhileStmt(b, l + 1);
    if (!r) r = RepeatUntilStmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // MINUS|NOT
  public static boolean UnaryOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryOperation")) return false;
    if (!nextTokenIs(b, "<unary operation>", MINUS, NOT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY_OPERATION, "<unary operation>");
    r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, NOT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // VARIABLE VARIABLE_TYPE VariableName (COMMA VariableName)* SEMICOLON
  public static boolean VariableDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDeclaration")) return false;
    if (!nextTokenIs(b, VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, VARIABLE, VARIABLE_TYPE);
    r = r && VariableName(b, l + 1);
    r = r && VariableDeclaration_3(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, VARIABLE_DECLARATION, r);
    return r;
  }

  // (COMMA VariableName)*
  private static boolean VariableDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDeclaration_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!VariableDeclaration_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "VariableDeclaration_3", c)) break;
    }
    return true;
  }

  // COMMA VariableName
  private static boolean VariableDeclaration_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDeclaration_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && VariableName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean VariableName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, VARIABLE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // Statement|{CONTINUE|EXIT} WHILE
  public static boolean WhileStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHILE_STATEMENT, "<while statement>");
    r = Statement(b, l + 1);
    if (!r) r = WhileStatement_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // {CONTINUE|EXIT} WHILE
  private static boolean WhileStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = WhileStatement_1_0(b, l + 1);
    r = r && consumeToken(b, WHILE);
    exit_section_(b, m, null, r);
    return r;
  }

  // CONTINUE|EXIT
  private static boolean WhileStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStatement_1_0")) return false;
    boolean r;
    r = consumeToken(b, CONTINUE);
    if (!r) r = consumeToken(b, EXIT);
    return r;
  }

  /* ********************************************************** */
  // WHILE Expression WhileStatement* END WHILE
  public static boolean WhileStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStmt")) return false;
    if (!nextTokenIs(b, WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHILE);
    r = r && Expression(b, l + 1);
    r = r && WhileStmt_2(b, l + 1);
    r = r && consumeTokens(b, 0, END, WHILE);
    exit_section_(b, m, WHILE_STMT, r);
    return r;
  }

  // WhileStatement*
  private static boolean WhileStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStmt_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!WhileStatement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "WhileStmt_2", c)) break;
    }
    return true;
  }

}
