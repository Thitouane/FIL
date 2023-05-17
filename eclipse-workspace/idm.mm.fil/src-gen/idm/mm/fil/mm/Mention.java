/**
 */
package idm.mm.fil.mm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mention</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.mm.fil.mm.Mention#getDescription <em>Description</em>}</li>
 *   <li>{@link idm.mm.fil.mm.Mention#getComposeDeSemestres <em>Compose De Semestres</em>}</li>
 *   <li>{@link idm.mm.fil.mm.Mention#getComposeDesParcours <em>Compose Des Parcours</em>}</li>
 *   <li>{@link idm.mm.fil.mm.Mention#getName <em>Name</em>}</li>
 *   <li>{@link idm.mm.fil.mm.Mention#getResponsableFormation <em>Responsable Formation</em>}</li>
 *   <li>{@link idm.mm.fil.mm.Mention#getRessourcepedagogique <em>Ressourcepedagogique</em>}</li>
 *   <li>{@link idm.mm.fil.mm.Mention#getRessourceadministrative <em>Ressourceadministrative</em>}</li>
 *   <li>{@link idm.mm.fil.mm.Mention#getUeOptionnelles <em>Ue Optionnelles</em>}</li>
 * </ul>
 *
 * @see idm.mm.fil.mm.MmPackage#getMention()
 * @model
 * @generated
 */
public interface Mention extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see idm.mm.fil.mm.MmPackage#getMention_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link idm.mm.fil.mm.Mention#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Compose De Semestres</b></em>' containment reference list.
	 * The list contents are of type {@link idm.mm.fil.mm.Semestre}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compose De Semestres</em>' containment reference list.
	 * @see idm.mm.fil.mm.MmPackage#getMention_ComposeDeSemestres()
	 * @model containment="true" upper="6"
	 * @generated
	 */
	EList<Semestre> getComposeDeSemestres();

	/**
	 * Returns the value of the '<em><b>Compose Des Parcours</b></em>' containment reference list.
	 * The list contents are of type {@link idm.mm.fil.mm.Parcours}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compose Des Parcours</em>' containment reference list.
	 * @see idm.mm.fil.mm.MmPackage#getMention_ComposeDesParcours()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parcours> getComposeDesParcours();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see idm.mm.fil.mm.MmPackage#getMention_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link idm.mm.fil.mm.Mention#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Responsable Formation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsable Formation</em>' reference.
	 * @see #setResponsableFormation(Professeur)
	 * @see idm.mm.fil.mm.MmPackage#getMention_ResponsableFormation()
	 * @model
	 * @generated
	 */
	Professeur getResponsableFormation();

	/**
	 * Sets the value of the '{@link idm.mm.fil.mm.Mention#getResponsableFormation <em>Responsable Formation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsable Formation</em>' reference.
	 * @see #getResponsableFormation()
	 * @generated
	 */
	void setResponsableFormation(Professeur value);

	/**
	 * Returns the value of the '<em><b>Ressourcepedagogique</b></em>' containment reference list.
	 * The list contents are of type {@link idm.mm.fil.mm.Ressource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressourcepedagogique</em>' containment reference list.
	 * @see idm.mm.fil.mm.MmPackage#getMention_Ressourcepedagogique()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ressource> getRessourcepedagogique();

	/**
	 * Returns the value of the '<em><b>Ressourceadministrative</b></em>' containment reference list.
	 * The list contents are of type {@link idm.mm.fil.mm.Ressource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressourceadministrative</em>' containment reference list.
	 * @see idm.mm.fil.mm.MmPackage#getMention_Ressourceadministrative()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ressource> getRessourceadministrative();

	/**
	 * Returns the value of the '<em><b>Ue Optionnelles</b></em>' reference list.
	 * The list contents are of type {@link idm.mm.fil.mm.UE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ue Optionnelles</em>' reference list.
	 * @see idm.mm.fil.mm.MmPackage#getMention_UeOptionnelles()
	 * @model
	 * @generated
	 */
	EList<UE> getUeOptionnelles();

} // Mention
