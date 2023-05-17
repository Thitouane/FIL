/**
 */
package idm.mm.fil.mm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.mm.fil.mm.Formation#getDescription <em>Description</em>}</li>
 *   <li>{@link idm.mm.fil.mm.Formation#getComposeDesMentions <em>Compose Des Mentions</em>}</li>
 *   <li>{@link idm.mm.fil.mm.Formation#getRessourcesAdministratives <em>Ressources Administratives</em>}</li>
 *   <li>{@link idm.mm.fil.mm.Formation#getName <em>Name</em>}</li>
 *   <li>{@link idm.mm.fil.mm.Formation#getSecretairepedagogique <em>Secretairepedagogique</em>}</li>
 * </ul>
 *
 * @see idm.mm.fil.mm.MmPackage#getFormation()
 * @model
 * @generated
 */
public interface Formation extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see idm.mm.fil.mm.MmPackage#getFormation_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link idm.mm.fil.mm.Formation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Compose Des Mentions</b></em>' containment reference list.
	 * The list contents are of type {@link idm.mm.fil.mm.Mention}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compose Des Mentions</em>' containment reference list.
	 * @see idm.mm.fil.mm.MmPackage#getFormation_ComposeDesMentions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mention> getComposeDesMentions();

	/**
	 * Returns the value of the '<em><b>Ressources Administratives</b></em>' containment reference list.
	 * The list contents are of type {@link idm.mm.fil.mm.Ressource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressources Administratives</em>' containment reference list.
	 * @see idm.mm.fil.mm.MmPackage#getFormation_RessourcesAdministratives()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ressource> getRessourcesAdministratives();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see idm.mm.fil.mm.MmPackage#getFormation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link idm.mm.fil.mm.Formation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Secretairepedagogique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secretairepedagogique</em>' containment reference.
	 * @see #setSecretairepedagogique(SecretairePedagogique)
	 * @see idm.mm.fil.mm.MmPackage#getFormation_Secretairepedagogique()
	 * @model containment="true"
	 * @generated
	 */
	SecretairePedagogique getSecretairepedagogique();

	/**
	 * Sets the value of the '{@link idm.mm.fil.mm.Formation#getSecretairepedagogique <em>Secretairepedagogique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secretairepedagogique</em>' containment reference.
	 * @see #getSecretairepedagogique()
	 * @generated
	 */
	void setSecretairepedagogique(SecretairePedagogique value);

} // Formation
