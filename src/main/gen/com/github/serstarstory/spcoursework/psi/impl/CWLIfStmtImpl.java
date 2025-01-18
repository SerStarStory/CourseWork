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

public class CWLIfStmtImpl extends ASTWrapperPsiElement implements CWLIfStmt {

  public CWLIfStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CWLVisitor visitor) {
    visitor.visitIfStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CWLVisitor) accept((CWLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CWLExpression getExpression() {
    return findNotNullChildByClass(CWLExpression.class);
  }

  @Override
  @NotNull
  public List<CWLStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CWLStatement.class);
  }

}
