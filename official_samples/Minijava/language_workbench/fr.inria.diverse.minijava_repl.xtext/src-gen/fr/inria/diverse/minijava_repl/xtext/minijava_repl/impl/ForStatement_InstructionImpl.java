/**
 * generated by Xtext 2.24.0
 */
package fr.inria.diverse.minijava_repl.xtext.minijava_repl.impl;

import fr.inria.diverse.minijava_repl.xtext.minijava_repl.ForStatement_Instruction;
import fr.inria.diverse.minijava_repl.xtext.minijava_repl.Minijava_replPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tetrabox.minijava.xtext.miniJava.ForStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Statement Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.minijava_repl.xtext.minijava_repl.impl.ForStatement_InstructionImpl#getOriginal <em>Original</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForStatement_InstructionImpl extends InterpretableInstructionImpl implements ForStatement_Instruction
{
  /**
	 * The cached value of the '{@link #getOriginal() <em>Original</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOriginal()
	 * @generated
	 * @ordered
	 */
  protected ForStatement original;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ForStatement_InstructionImpl()
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
		return Minijava_replPackage.Literals.FOR_STATEMENT_INSTRUCTION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public ForStatement getOriginal()
  {
		return original;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetOriginal(ForStatement newOriginal, NotificationChain msgs)
  {
		ForStatement oldOriginal = original;
		original = newOriginal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Minijava_replPackage.FOR_STATEMENT_INSTRUCTION__ORIGINAL, oldOriginal, newOriginal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setOriginal(ForStatement newOriginal)
  {
		if (newOriginal != original) {
			NotificationChain msgs = null;
			if (original != null)
				msgs = ((InternalEObject)original).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Minijava_replPackage.FOR_STATEMENT_INSTRUCTION__ORIGINAL, null, msgs);
			if (newOriginal != null)
				msgs = ((InternalEObject)newOriginal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Minijava_replPackage.FOR_STATEMENT_INSTRUCTION__ORIGINAL, null, msgs);
			msgs = basicSetOriginal(newOriginal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Minijava_replPackage.FOR_STATEMENT_INSTRUCTION__ORIGINAL, newOriginal, newOriginal));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case Minijava_replPackage.FOR_STATEMENT_INSTRUCTION__ORIGINAL:
				return basicSetOriginal(null, msgs);
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
		switch (featureID) {
			case Minijava_replPackage.FOR_STATEMENT_INSTRUCTION__ORIGINAL:
				return getOriginal();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case Minijava_replPackage.FOR_STATEMENT_INSTRUCTION__ORIGINAL:
				setOriginal((ForStatement)newValue);
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
		switch (featureID) {
			case Minijava_replPackage.FOR_STATEMENT_INSTRUCTION__ORIGINAL:
				setOriginal((ForStatement)null);
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
		switch (featureID) {
			case Minijava_replPackage.FOR_STATEMENT_INSTRUCTION__ORIGINAL:
				return original != null;
		}
		return super.eIsSet(featureID);
	}

} //ForStatement_InstructionImpl
