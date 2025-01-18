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

public class CWLExpressionImpl extends ASTWrapperPsiElement implements CWLExpression {

  public CWLExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CWLVisitor visitor) {
    visitor.visitExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CWLVisitor) accept((CWLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CWLBinaryAction> getBinaryActionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CWLBinaryAction.class);
  }

  @Override
  @NotNull
  public List<CWLLeftExpression> getLeftExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CWLLeftExpression.class);
  }

}
