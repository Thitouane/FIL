/**
 */
package idm.mm.fil.mm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FIL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.mm.fil.mm.FIL#getComposeDesFormations <em>Compose Des Formations</em>}</li>
 *   <li>{@link idm.mm.fil.mm.FIL#getName <em>Name</em>}</li>
 *   <li>{@link idm.mm.fil.mm.FIL#getEnseignantsChercheurs <em>Enseignants Chercheurs</em>}</li>
 * </ul>
 *
 * @see idm.mm.fil.mm.MmPackage#getFIL()
 * @model
 * @generated
 */
public interface FIL extends EObject {
	/**
	 * Returns the value of the '<em><b>Compose Des Formations</b></em>' containment reference list.
	 * The list contents are of type {@link idm.mm.fil.mm.Formation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compose Des Formations</em>' containment reference list.
	 * @see idm.mm.fil.mm.MmPackage#getFIL_ComposeDesFormations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Formation> getComposeDesFormations();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see idm.mm.fil.mm.MmPackage#getFIL_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link idm.mm.fil.mm.FIL#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Enseignants Chercheurs</b></em>' containment reference list.
	 * The list contents are of type {@link idm.mm.fil.mm.Professeur}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enseignants Chercheurs</em>' containment reference list.
	 * @see idm.mm.fil.mm.MmPackage#getFIL_EnseignantsChercheurs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Professeur> getEnseignantsChercheurs();

} // FIL
