/**
 */
package idm.mm.fil.mm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.mm.fil.mm.Ressource#getContenu <em>Contenu</em>}</li>
 * </ul>
 *
 * @see idm.mm.fil.mm.MmPackage#getRessource()
 * @model
 * @generated
 */
public interface Ressource extends Contenu {
	/**
	 * Returns the value of the '<em><b>Contenu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenu</em>' attribute.
	 * @see #setContenu(String)
	 * @see idm.mm.fil.mm.MmPackage#getRessource_Contenu()
	 * @model
	 * @generated
	 */
	String getContenu();

	/**
	 * Sets the value of the '{@link idm.mm.fil.mm.Ressource#getContenu <em>Contenu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenu</em>' attribute.
	 * @see #getContenu()
	 * @generated
	 */
	void setContenu(String value);

} // Ressource
