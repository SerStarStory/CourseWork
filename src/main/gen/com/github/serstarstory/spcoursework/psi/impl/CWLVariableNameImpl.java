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

public class CWLVariableNameImpl extends ASTWrapperPsiElement implements CWLVariableName {

  public CWLVariableNameImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CWLVisitor visitor) {
    visitor.visitVariableName(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CWLVisitor) accept((CWLVisitor)visitor);
    else super.accept(visitor);
  }

}
