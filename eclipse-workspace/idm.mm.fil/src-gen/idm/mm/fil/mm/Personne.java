/**
 */
package idm.mm.fil.mm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Personne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.mm.fil.mm.Personne#getName <em>Name</em>}</li>
 *   <li>{@link idm.mm.fil.mm.Personne#getEmail <em>Email</em>}</li>
 * </ul>
 *
 * @see idm.mm.fil.mm.MmPackage#getPersonne()
 * @model abstract="true"
 * @generated
 */
public interface Personne extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see idm.mm.fil.mm.MmPackage#getPersonne_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link idm.mm.fil.mm.Personne#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see idm.mm.fil.mm.MmPackage#getPersonne_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link idm.mm.fil.mm.Personne#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

} // Personne
