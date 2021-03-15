/**
 * generated by Xtext 2.24.0
 */
package fr.inria.diverse.minijava_repl.xtext.minijava_repl.impl;

import fr.inria.diverse.minijava_repl.xtext.minijava_repl.InterpretableInstruction;
import fr.inria.diverse.minijava_repl.xtext.minijava_repl.Minijava_replPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interpretable Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.minijava_repl.xtext.minijava_repl.impl.InterpretableInstructionImpl#getPrevious <em>Previous</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterpretableInstructionImpl extends MinimalEObjectImpl.Container implements InterpretableInstruction
{
  /**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected InterpretableInstruction previous;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected InterpretableInstructionImpl()
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
		return Minijava_replPackage.Literals.INTERPRETABLE_INSTRUCTION;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterpretableInstruction getPrevious() {
		return previous;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevious(InterpretableInstruction newPrevious, NotificationChain msgs) {
		InterpretableInstruction oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Minijava_replPackage.INTERPRETABLE_INSTRUCTION__PREVIOUS, oldPrevious, newPrevious);
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
	public void setPrevious(InterpretableInstruction newPrevious) {
		if (newPrevious != previous) {
			NotificationChain msgs = null;
			if (previous != null)
				msgs = ((InternalEObject)previous).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Minijava_replPackage.INTERPRETABLE_INSTRUCTION__PREVIOUS, null, msgs);
			if (newPrevious != null)
				msgs = ((InternalEObject)newPrevious).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Minijava_replPackage.INTERPRETABLE_INSTRUCTION__PREVIOUS, null, msgs);
			msgs = basicSetPrevious(newPrevious, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Minijava_replPackage.INTERPRETABLE_INSTRUCTION__PREVIOUS, newPrevious, newPrevious));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Minijava_replPackage.INTERPRETABLE_INSTRUCTION__PREVIOUS:
				return basicSetPrevious(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Minijava_replPackage.INTERPRETABLE_INSTRUCTION__PREVIOUS:
				return getPrevious();
		}
		return super.eGet(featureID, resolve, coreType);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Minijava_replPackage.INTERPRETABLE_INSTRUCTION__PREVIOUS:
				setPrevious((InterpretableInstruction)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case Minijava_replPackage.INTERPRETABLE_INSTRUCTION__PREVIOUS:
				setPrevious((InterpretableInstruction)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Minijava_replPackage.INTERPRETABLE_INSTRUCTION__PREVIOUS:
				return previous != null;
		}
		return super.eIsSet(featureID);
	}

} //InterpretableInstructionImpl
