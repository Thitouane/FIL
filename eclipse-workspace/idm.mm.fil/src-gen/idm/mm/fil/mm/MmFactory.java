/**
 */
package idm.mm.fil.mm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see idm.mm.fil.mm.MmPackage
 * @generated
 */
public interface MmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MmFactory eINSTANCE = idm.mm.fil.mm.impl.MmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>UE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UE</em>'.
	 * @generated
	 */
	UE createUE();

	/**
	 * Returns a new object of class '<em>Ressource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ressource</em>'.
	 * @generated
	 */
	Ressource createRessource();

	/**
	 * Returns a new object of class '<em>Semainier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semainier</em>'.
	 * @generated
	 */
	Semainier createSemainier();

	/**
	 * Returns a new object of class '<em>Formation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formation</em>'.
	 * @generated
	 */
	Formation createFormation();

	/**
	 * Returns a new object of class '<em>Semestre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semestre</em>'.
	 * @generated
	 */
	Semestre createSemestre();

	/**
	 * Returns a new object of class '<em>FIL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FIL</em>'.
	 * @generated
	 */
	FIL createFIL();

	/**
	 * Returns a new object of class '<em>Mention</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mention</em>'.
	 * @generated
	 */
	Mention createMention();

	/**
	 * Returns a new object of class '<em>Professeur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Professeur</em>'.
	 * @generated
	 */
	Professeur createProfesseur();

	/**
	 * Returns a new object of class '<em>Secretaire Pedagogique</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Secretaire Pedagogique</em>'.
	 * @generated
	 */
	SecretairePedagogique createSecretairePedagogique();

	/**
	 * Returns a new object of class '<em>Parcours</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parcours</em>'.
	 * @generated
	 */
	Parcours createParcours();

	/**
	 * Returns a new object of class '<em>Semaine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semaine</em>'.
	 * @generated
	 */
	Semaine createSemaine();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MmPackage getMmPackage();

} //MmFactory
