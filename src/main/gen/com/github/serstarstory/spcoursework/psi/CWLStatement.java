// This is a generated file. Not intended for manual editing.
package com.github.serstarstory.spcoursework.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CWLStatement extends PsiElement {

  @Nullable
  CWLForToDownToStmt getForToDownToStmt();

  @Nullable
  CWLGotoStmt getGotoStmt();

  @Nullable
  CWLIfStmt getIfStmt();

  @Nullable
  CWLInputStatement getInputStatement();

  @Nullable
  CWLLabelStmt getLabelStmt();

  @Nullable
  CWLOutputStatement getOutputStatement();

  @Nullable
  CWLRepeatUntilStmt getRepeatUntilStmt();

  @Nullable
  CWLRlExpression getRlExpression();

  @Nullable
  CWLWhileStmt getWhileStmt();

}
