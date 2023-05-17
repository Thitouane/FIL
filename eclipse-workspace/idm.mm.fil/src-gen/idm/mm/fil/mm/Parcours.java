/**
 */
package idm.mm.fil.mm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parcours</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.mm.fil.mm.Parcours#getSemestres <em>Semestres</em>}</li>
 *   <li>{@link idm.mm.fil.mm.Parcours#getUeObligatoires <em>Ue Obligatoires</em>}</li>
 *   <li>{@link idm.mm.fil.mm.Parcours#getUeOptionelles <em>Ue Optionelles</em>}</li>
 *   <li>{@link idm.mm.fil.mm.Parcours#getName <em>Name</em>}</li>
 *   <li>{@link idm.mm.fil.mm.Parcours#getResponsableParcours <em>Responsable Parcours</em>}</li>
 *   <li>{@link idm.mm.fil.mm.Parcours#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see idm.mm.fil.mm.MmPackage#getParcours()
 * @model
 * @generated
 */
public interface Parcours extends EObject {
	/**
	 * Returns the value of the '<em><b>Semestres</b></em>' reference list.
	 * The list contents are of type {@link idm.mm.fil.mm.Semestre}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semestres</em>' reference list.
	 * @see idm.mm.fil.mm.MmPackage#getParcours_Semestres()
	 * @model upper="6"
	 * @generated
	 */
	EList<Semestre> getSemestres();

	/**
	 * Returns the value of the '<em><b>Ue Obligatoires</b></em>' reference list.
	 * The list contents are of type {@link idm.mm.fil.mm.UE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ue Obligatoires</em>' reference list.
	 * @see idm.mm.fil.mm.MmPackage#getParcours_UeObligatoires()
	 * @model
	 * @generated
	 */
	EList<UE> getUeObligatoires();

	/**
	 * Returns the value of the '<em><b>Ue Optionelles</b></em>' reference list.
	 * The list contents are of type {@link idm.mm.fil.mm.UE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ue Optionelles</em>' reference list.
	 * @see idm.mm.fil.mm.MmPackage#getParcours_UeOptionelles()
	 * @model
	 * @generated
	 */
	EList<UE> getUeOptionelles();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see idm.mm.fil.mm.MmPackage#getParcours_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link idm.mm.fil.mm.Parcours#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Responsable Parcours</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsable Parcours</em>' reference.
	 * @see #setResponsableParcours(Professeur)
	 * @see idm.mm.fil.mm.MmPackage#getParcours_ResponsableParcours()
	 * @model
	 * @generated
	 */
	Professeur getResponsableParcours();

	/**
	 * Sets the value of the '{@link idm.mm.fil.mm.Parcours#getResponsableParcours <em>Responsable Parcours</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsable Parcours</em>' reference.
	 * @see #getResponsableParcours()
	 * @generated
	 */
	void setResponsableParcours(Professeur value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see idm.mm.fil.mm.MmPackage#getParcours_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link idm.mm.fil.mm.Parcours#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Parcours
