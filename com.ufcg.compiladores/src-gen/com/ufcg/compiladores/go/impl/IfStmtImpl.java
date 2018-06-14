/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go.impl;

import com.ufcg.compiladores.go.Block;
import com.ufcg.compiladores.go.Expression;
import com.ufcg.compiladores.go.GoPackage;
import com.ufcg.compiladores.go.IfStmt;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.impl.IfStmtImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.impl.IfStmtImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.impl.IfStmtImpl#getIfStmt <em>If Stmt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfStmtImpl extends MinimalEObjectImpl.Container implements IfStmt
{
  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected EList<Expression> expression;

  /**
   * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock()
   * @generated
   * @ordered
   */
  protected EList<Block> block;

  /**
   * The cached value of the '{@link #getIfStmt() <em>If Stmt</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfStmt()
   * @generated
   * @ordered
   */
  protected EList<IfStmt> ifStmt;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfStmtImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GoPackage.Literals.IF_STMT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getExpression()
  {
    if (expression == null)
    {
      expression = new EObjectContainmentEList<Expression>(Expression.class, this, GoPackage.IF_STMT__EXPRESSION);
    }
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Block> getBlock()
  {
    if (block == null)
    {
      block = new EObjectContainmentEList<Block>(Block.class, this, GoPackage.IF_STMT__BLOCK);
    }
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IfStmt> getIfStmt()
  {
    if (ifStmt == null)
    {
      ifStmt = new EObjectContainmentEList<IfStmt>(IfStmt.class, this, GoPackage.IF_STMT__IF_STMT);
    }
    return ifStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GoPackage.IF_STMT__EXPRESSION:
        return ((InternalEList<?>)getExpression()).basicRemove(otherEnd, msgs);
      case GoPackage.IF_STMT__BLOCK:
        return ((InternalEList<?>)getBlock()).basicRemove(otherEnd, msgs);
      case GoPackage.IF_STMT__IF_STMT:
        return ((InternalEList<?>)getIfStmt()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GoPackage.IF_STMT__EXPRESSION:
        return getExpression();
      case GoPackage.IF_STMT__BLOCK:
        return getBlock();
      case GoPackage.IF_STMT__IF_STMT:
        return getIfStmt();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GoPackage.IF_STMT__EXPRESSION:
        getExpression().clear();
        getExpression().addAll((Collection<? extends Expression>)newValue);
        return;
      case GoPackage.IF_STMT__BLOCK:
        getBlock().clear();
        getBlock().addAll((Collection<? extends Block>)newValue);
        return;
      case GoPackage.IF_STMT__IF_STMT:
        getIfStmt().clear();
        getIfStmt().addAll((Collection<? extends IfStmt>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GoPackage.IF_STMT__EXPRESSION:
        getExpression().clear();
        return;
      case GoPackage.IF_STMT__BLOCK:
        getBlock().clear();
        return;
      case GoPackage.IF_STMT__IF_STMT:
        getIfStmt().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GoPackage.IF_STMT__EXPRESSION:
        return expression != null && !expression.isEmpty();
      case GoPackage.IF_STMT__BLOCK:
        return block != null && !block.isEmpty();
      case GoPackage.IF_STMT__IF_STMT:
        return ifStmt != null && !ifStmt.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //IfStmtImpl