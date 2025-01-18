// This is a generated file. Not intended for manual editing.
package com.github.serstarstory.spcoursework.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CWLExpression extends PsiElement {

  @NotNull
  List<CWLBinaryAction> getBinaryActionList();

  @NotNull
  List<CWLLeftExpression> getLeftExpressionList();

}
