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

public class CWLLeftExpressionImpl extends ASTWrapperPsiElement implements CWLLeftExpression {

  public CWLLeftExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CWLVisitor visitor) {
    visitor.visitLeftExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CWLVisitor) accept((CWLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CWLExpression getExpression() {
    return findChildByClass(CWLExpression.class);
  }

  @Override
  @Nullable
  public CWLUnaryOperation getUnaryOperation() {
    return findChildByClass(CWLUnaryOperation.class);
  }

  @Override
  @Nullable
  public CWLVariableName getVariableName() {
    return findChildByClass(CWLVariableName.class);
  }

}
