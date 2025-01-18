// This is a generated file. Not intended for manual editing.
package com.github.serstarstory.spcoursework.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.serstarstory.spcoursework.psi.CWLTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.serstarstory.spcoursework.psi.*;

public class CWLStatementImpl extends ASTWrapperPsiElement implements CWLStatement {

  public CWLStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CWLVisitor visitor) {
    visitor.visitStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CWLVisitor) accept((CWLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CWLForToDownToStmt getForToDownToStmt() {
    return findChildByClass(CWLForToDownToStmt.class);
  }

  @Override
  @Nullable
  public CWLGotoStmt getGotoStmt() {
    return findChildByClass(CWLGotoStmt.class);
  }

  @Override
  @Nullable
  public CWLIfStmt getIfStmt() {
    return findChildByClass(CWLIfStmt.class);
  }

  @Override
  @Nullable
  public CWLInputStatement getInputStatement() {
    return findChildByClass(CWLInputStatement.class);
  }

  @Override
  @Nullable
  public CWLLabelStmt getLabelStmt() {
    return findChildByClass(CWLLabelStmt.class);
  }

  @Override
  @Nullable
  public CWLOutputStatement getOutputStatement() {
    return findChildByClass(CWLOutputStatement.class);
  }

  @Override
  @Nullable
  public CWLRepeatUntilStmt getRepeatUntilStmt() {
    return findChildByClass(CWLRepeatUntilStmt.class);
  }

  @Override
  @Nullable
  public CWLRlExpression getRlExpression() {
    return findChildByClass(CWLRlExpression.class);
  }

  @Override
  @Nullable
  public CWLWhileStmt getWhileStmt() {
    return findChildByClass(CWLWhileStmt.class);
  }

}
