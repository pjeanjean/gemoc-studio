/**
 * generated by Xtext 2.24.0
 */
package fr.inria.diverse.minijava_repl.xtext.minijava_repl.impl;

import fr.inria.diverse.minijava_repl.xtext.minijava_repl.Import_Instruction;
import fr.inria.diverse.minijava_repl.xtext.minijava_repl.Minijava_replPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tetrabox.minijava.xtext.miniJava.Import;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.minijava_repl.xtext.minijava_repl.impl.Import_InstructionImpl#getOriginal <em>Original</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Import_InstructionImpl extends InterpretableInstructionImpl implements Import_Instruction
{
  /**
	 * The cached value of the '{@link #getOriginal() <em>Original</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOriginal()
	 * @generated
	 * @ordered
	 */
  protected Import original;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected Import_InstructionImpl()
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
		return Minijava_replPackage.Literals.IMPORT_INSTRUCTION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Import getOriginal()
  {
		return original;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetOriginal(Import newOriginal, NotificationChain msgs)
  {
		Import oldOriginal = original;
		original = newOriginal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Minijava_replPackage.IMPORT_INSTRUCTION__ORIGINAL, oldOriginal, newOriginal);
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
  public void setOriginal(Import newOriginal)
  {
		if (newOriginal != original) {
			NotificationChain msgs = null;
			if (original != null)
				msgs = ((InternalEObject)original).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Minijava_replPackage.IMPORT_INSTRUCTION__ORIGINAL, null, msgs);
			if (newOriginal != null)
				msgs = ((InternalEObject)newOriginal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Minijava_replPackage.IMPORT_INSTRUCTION__ORIGINAL, null, msgs);
			msgs = basicSetOriginal(newOriginal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Minijava_replPackage.IMPORT_INSTRUCTION__ORIGINAL, newOriginal, newOriginal));
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
			case Minijava_replPackage.IMPORT_INSTRUCTION__ORIGINAL:
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
			case Minijava_replPackage.IMPORT_INSTRUCTION__ORIGINAL:
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
			case Minijava_replPackage.IMPORT_INSTRUCTION__ORIGINAL:
				setOriginal((Import)newValue);
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
			case Minijava_replPackage.IMPORT_INSTRUCTION__ORIGINAL:
				setOriginal((Import)null);
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
			case Minijava_replPackage.IMPORT_INSTRUCTION__ORIGINAL:
				return original != null;
		}
		return super.eIsSet(featureID);
	}

} //Import_InstructionImpl
