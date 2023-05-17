/**
 */
package idm.mm.fil.mm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.mm.fil.mm.UE#getDescription <em>Description</em>}</li>
 *   <li>{@link idm.mm.fil.mm.UE#getSemainier <em>Semainier</em>}</li>
 *   <li>{@link idm.mm.fil.mm.UE#getRessourcepedagogique <em>Ressourcepedagogique</em>}</li>
 *   <li>{@link idm.mm.fil.mm.UE#getName <em>Name</em>}</li>
 *   <li>{@link idm.mm.fil.mm.UE#getEnseignants <em>Enseignants</em>}</li>
 *   <li>{@link idm.mm.fil.mm.UE#getNbECTS <em>Nb ECTS</em>}</li>
 * </ul>
 *
 * @see idm.mm.fil.mm.MmPackage#getUE()
 * @model
 * @generated
 */
public interface UE extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see idm.mm.fil.mm.MmPackage#getUE_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link idm.mm.fil.mm.UE#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Semainier</b></em>' containment reference list.
	 * The list contents are of type {@link idm.mm.fil.mm.Semainier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semainier</em>' containment reference list.
	 * @see idm.mm.fil.mm.MmPackage#getUE_Semainier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semainier> getSemainier();

	/**
	 * Returns the value of the '<em><b>Ressourcepedagogique</b></em>' containment reference list.
	 * The list contents are of type {@link idm.mm.fil.mm.Ressource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressourcepedagogique</em>' containment reference list.
	 * @see idm.mm.fil.mm.MmPackage#getUE_Ressourcepedagogique()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ressource> getRessourcepedagogique();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see idm.mm.fil.mm.MmPackage#getUE_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link idm.mm.fil.mm.UE#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Enseignants</b></em>' reference list.
	 * The list contents are of type {@link idm.mm.fil.mm.Professeur}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enseignants</em>' reference list.
	 * @see idm.mm.fil.mm.MmPackage#getUE_Enseignants()
	 * @model required="true"
	 * @generated
	 */
	EList<Professeur> getEnseignants();

	/**
	 * Returns the value of the '<em><b>Nb ECTS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb ECTS</em>' attribute.
	 * @see #setNbECTS(int)
	 * @see idm.mm.fil.mm.MmPackage#getUE_NbECTS()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getNbECTS();

	/**
	 * Sets the value of the '{@link idm.mm.fil.mm.UE#getNbECTS <em>Nb ECTS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb ECTS</em>' attribute.
	 * @see #getNbECTS()
	 * @generated
	 */
	void setNbECTS(int value);

} // UE
