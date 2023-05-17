/**
 */
package idm.mm.fil.mm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semestre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.mm.fil.mm.Semestre#getComposesDesUEs <em>Composes Des UEs</em>}</li>
 *   <li>{@link idm.mm.fil.mm.Semestre#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see idm.mm.fil.mm.MmPackage#getSemestre()
 * @model
 * @generated
 */
public interface Semestre extends EObject {
	/**
	 * Returns the value of the '<em><b>Composes Des UEs</b></em>' containment reference list.
	 * The list contents are of type {@link idm.mm.fil.mm.UE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composes Des UEs</em>' containment reference list.
	 * @see idm.mm.fil.mm.MmPackage#getSemestre_ComposesDesUEs()
	 * @model containment="true"
	 * @generated
	 */
	EList<UE> getComposesDesUEs();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see idm.mm.fil.mm.MmPackage#getSemestre_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link idm.mm.fil.mm.Semestre#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Semestre
