/**
 */
package idm.mm.fil.mm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semaine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.mm.fil.mm.Semaine#getRessourcepedagogique <em>Ressourcepedagogique</em>}</li>
 *   <li>{@link idm.mm.fil.mm.Semaine#getDébut <em>Début</em>}</li>
 *   <li>{@link idm.mm.fil.mm.Semaine#getFin <em>Fin</em>}</li>
 *   <li>{@link idm.mm.fil.mm.Semaine#getRemarque <em>Remarque</em>}</li>
 * </ul>
 *
 * @see idm.mm.fil.mm.MmPackage#getSemaine()
 * @model
 * @generated
 */
public interface Semaine extends EObject {
	/**
	 * Returns the value of the '<em><b>Ressourcepedagogique</b></em>' reference list.
	 * The list contents are of type {@link idm.mm.fil.mm.Ressource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressourcepedagogique</em>' reference list.
	 * @see idm.mm.fil.mm.MmPackage#getSemaine_Ressourcepedagogique()
	 * @model
	 * @generated
	 */
	EList<Ressource> getRessourcepedagogique();

	/**
	 * Returns the value of the '<em><b>Début</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Début</em>' attribute.
	 * @see #setDébut(String)
	 * @see idm.mm.fil.mm.MmPackage#getSemaine_Début()
	 * @model
	 * @generated
	 */
	String getDébut();

	/**
	 * Sets the value of the '{@link idm.mm.fil.mm.Semaine#getDébut <em>Début</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Début</em>' attribute.
	 * @see #getDébut()
	 * @generated
	 */
	void setDébut(String value);

	/**
	 * Returns the value of the '<em><b>Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin</em>' attribute.
	 * @see #setFin(String)
	 * @see idm.mm.fil.mm.MmPackage#getSemaine_Fin()
	 * @model
	 * @generated
	 */
	String getFin();

	/**
	 * Sets the value of the '{@link idm.mm.fil.mm.Semaine#getFin <em>Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin</em>' attribute.
	 * @see #getFin()
	 * @generated
	 */
	void setFin(String value);

	/**
	 * Returns the value of the '<em><b>Remarque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remarque</em>' attribute.
	 * @see #setRemarque(String)
	 * @see idm.mm.fil.mm.MmPackage#getSemaine_Remarque()
	 * @model
	 * @generated
	 */
	String getRemarque();

	/**
	 * Sets the value of the '{@link idm.mm.fil.mm.Semaine#getRemarque <em>Remarque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarque</em>' attribute.
	 * @see #getRemarque()
	 * @generated
	 */
	void setRemarque(String value);

} // Semaine
