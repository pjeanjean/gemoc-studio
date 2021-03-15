/**
 * generated by Xtext 2.24.0
 */
package fr.inria.diverse.minijava_repl.xtext.minijava_repl;

import org.tetrabox.minijava.xtext.miniJava.Import;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.minijava_repl.xtext.minijava_repl.Import_Instruction#getOriginal <em>Original</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.minijava_repl.xtext.minijava_repl.Minijava_replPackage#getImport_Instruction()
 * @model
 * @generated
 */
public interface Import_Instruction extends InterpretableInstruction
{
  /**
	 * Returns the value of the '<em><b>Original</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Original</em>' containment reference.
	 * @see #setOriginal(Import)
	 * @see fr.inria.diverse.minijava_repl.xtext.minijava_repl.Minijava_replPackage#getImport_Instruction_Original()
	 * @model containment="true"
	 * @generated
	 */
  Import getOriginal();

  /**
	 * Sets the value of the '{@link fr.inria.diverse.minijava_repl.xtext.minijava_repl.Import_Instruction#getOriginal <em>Original</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original</em>' containment reference.
	 * @see #getOriginal()
	 * @generated
	 */
  void setOriginal(Import value);

} // Import_Instruction
