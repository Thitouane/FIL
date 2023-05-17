/**
 */
package idm.mm.fil.mm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semainier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.mm.fil.mm.Semainier#getComposeDeSemaines <em>Compose De Semaines</em>}</li>
 * </ul>
 *
 * @see idm.mm.fil.mm.MmPackage#getSemainier()
 * @model
 * @generated
 */
public interface Semainier extends Contenu {
	/**
	 * Returns the value of the '<em><b>Compose De Semaines</b></em>' containment reference list.
	 * The list contents are of type {@link idm.mm.fil.mm.Semaine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compose De Semaines</em>' containment reference list.
	 * @see idm.mm.fil.mm.MmPackage#getSemainier_ComposeDeSemaines()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semaine> getComposeDeSemaines();

} // Semainier
