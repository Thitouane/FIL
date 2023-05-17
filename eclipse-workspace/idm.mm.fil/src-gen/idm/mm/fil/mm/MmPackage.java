/**
 */
package idm.mm.fil.mm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see idm.mm.fil.mm.MmFactory
 * @model kind="package"
 * @generated
 */
public interface MmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/mm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MmPackage eINSTANCE = idm.mm.fil.mm.impl.MmPackageImpl.init();

	/**
	 * The meta object id for the '{@link idm.mm.fil.mm.impl.UEImpl <em>UE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.mm.fil.mm.impl.UEImpl
	 * @see idm.mm.fil.mm.impl.MmPackageImpl#getUE()
	 * @generated
	 */
	int UE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Semainier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__SEMAINIER = 1;

	/**
	 * The feature id for the '<em><b>Ressourcepedagogique</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__RESSOURCEPEDAGOGIQUE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Enseignants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__ENSEIGNANTS = 4;

	/**
	 * The feature id for the '<em><b>Nb ECTS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__NB_ECTS = 5;

	/**
	 * The number of structural features of the '<em>UE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>UE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.mm.fil.mm.impl.ContenuImpl <em>Contenu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.mm.fil.mm.impl.ContenuImpl
	 * @see idm.mm.fil.mm.impl.MmPackageImpl#getContenu()
	 * @generated
	 */
	int CONTENU = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU__NAME = 0;

	/**
	 * The number of structural features of the '<em>Contenu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Contenu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.mm.fil.mm.impl.RessourceImpl <em>Ressource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.mm.fil.mm.impl.RessourceImpl
	 * @see idm.mm.fil.mm.impl.MmPackageImpl#getRessource()
	 * @generated
	 */
	int RESSOURCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__NAME = CONTENU__NAME;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__CONTENU = CONTENU_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_FEATURE_COUNT = CONTENU_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_OPERATION_COUNT = CONTENU_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.mm.fil.mm.impl.SemainierImpl <em>Semainier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.mm.fil.mm.impl.SemainierImpl
	 * @see idm.mm.fil.mm.impl.MmPackageImpl#getSemainier()
	 * @generated
	 */
	int SEMAINIER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAINIER__NAME = CONTENU__NAME;

	/**
	 * The feature id for the '<em><b>Compose De Semaines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAINIER__COMPOSE_DE_SEMAINES = CONTENU_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Semainier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAINIER_FEATURE_COUNT = CONTENU_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Semainier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAINIER_OPERATION_COUNT = CONTENU_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.mm.fil.mm.impl.FormationImpl <em>Formation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.mm.fil.mm.impl.FormationImpl
	 * @see idm.mm.fil.mm.impl.MmPackageImpl#getFormation()
	 * @generated
	 */
	int FORMATION = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Compose Des Mentions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__COMPOSE_DES_MENTIONS = 1;

	/**
	 * The feature id for the '<em><b>Ressources Administratives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__RESSOURCES_ADMINISTRATIVES = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__NAME = 3;

	/**
	 * The feature id for the '<em><b>Secretairepedagogique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__SECRETAIREPEDAGOGIQUE = 4;

	/**
	 * The number of structural features of the '<em>Formation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Formation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.mm.fil.mm.impl.SemestreImpl <em>Semestre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.mm.fil.mm.impl.SemestreImpl
	 * @see idm.mm.fil.mm.impl.MmPackageImpl#getSemestre()
	 * @generated
	 */
	int SEMESTRE = 4;

	/**
	 * The feature id for the '<em><b>Composes Des UEs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE__COMPOSES_DES_UES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Semestre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Semestre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.mm.fil.mm.impl.FILImpl <em>FIL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.mm.fil.mm.impl.FILImpl
	 * @see idm.mm.fil.mm.impl.MmPackageImpl#getFIL()
	 * @generated
	 */
	int FIL = 5;

	/**
	 * The feature id for the '<em><b>Compose Des Formations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIL__COMPOSE_DES_FORMATIONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Enseignants Chercheurs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIL__ENSEIGNANTS_CHERCHEURS = 2;

	/**
	 * The number of structural features of the '<em>FIL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>FIL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.mm.fil.mm.impl.MentionImpl <em>Mention</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.mm.fil.mm.impl.MentionImpl
	 * @see idm.mm.fil.mm.impl.MmPackageImpl#getMention()
	 * @generated
	 */
	int MENTION = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTION__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Compose De Semestres</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTION__COMPOSE_DE_SEMESTRES = 1;

	/**
	 * The feature id for the '<em><b>Compose Des Parcours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTION__COMPOSE_DES_PARCOURS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTION__NAME = 3;

	/**
	 * The feature id for the '<em><b>Responsable Formation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTION__RESPONSABLE_FORMATION = 4;

	/**
	 * The feature id for the '<em><b>Ressourcepedagogique</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTION__RESSOURCEPEDAGOGIQUE = 5;

	/**
	 * The feature id for the '<em><b>Ressourceadministrative</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTION__RESSOURCEADMINISTRATIVE = 6;

	/**
	 * The feature id for the '<em><b>Ue Optionnelles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTION__UE_OPTIONNELLES = 7;

	/**
	 * The number of structural features of the '<em>Mention</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Mention</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.mm.fil.mm.impl.PersonneImpl <em>Personne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.mm.fil.mm.impl.PersonneImpl
	 * @see idm.mm.fil.mm.impl.MmPackageImpl#getPersonne()
	 * @generated
	 */
	int PERSONNE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__EMAIL = 1;

	/**
	 * The number of structural features of the '<em>Personne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Personne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.mm.fil.mm.impl.ProfesseurImpl <em>Professeur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.mm.fil.mm.impl.ProfesseurImpl
	 * @see idm.mm.fil.mm.impl.MmPackageImpl#getProfesseur()
	 * @generated
	 */
	int PROFESSEUR = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSEUR__NAME = PERSONNE__NAME;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSEUR__EMAIL = PERSONNE__EMAIL;

	/**
	 * The number of structural features of the '<em>Professeur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSEUR_FEATURE_COUNT = PERSONNE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Professeur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSEUR_OPERATION_COUNT = PERSONNE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.mm.fil.mm.impl.SecretairePedagogiqueImpl <em>Secretaire Pedagogique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.mm.fil.mm.impl.SecretairePedagogiqueImpl
	 * @see idm.mm.fil.mm.impl.MmPackageImpl#getSecretairePedagogique()
	 * @generated
	 */
	int SECRETAIRE_PEDAGOGIQUE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETAIRE_PEDAGOGIQUE__NAME = PERSONNE__NAME;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETAIRE_PEDAGOGIQUE__EMAIL = PERSONNE__EMAIL;

	/**
	 * The number of structural features of the '<em>Secretaire Pedagogique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETAIRE_PEDAGOGIQUE_FEATURE_COUNT = PERSONNE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Secretaire Pedagogique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETAIRE_PEDAGOGIQUE_OPERATION_COUNT = PERSONNE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.mm.fil.mm.impl.ParcoursImpl <em>Parcours</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.mm.fil.mm.impl.ParcoursImpl
	 * @see idm.mm.fil.mm.impl.MmPackageImpl#getParcours()
	 * @generated
	 */
	int PARCOURS = 9;

	/**
	 * The feature id for the '<em><b>Semestres</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCOURS__SEMESTRES = 0;

	/**
	 * The feature id for the '<em><b>Ue Obligatoires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCOURS__UE_OBLIGATOIRES = 1;

	/**
	 * The feature id for the '<em><b>Ue Optionelles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCOURS__UE_OPTIONELLES = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCOURS__NAME = 3;

	/**
	 * The feature id for the '<em><b>Responsable Parcours</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCOURS__RESPONSABLE_PARCOURS = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCOURS__DESCRIPTION = 5;

	/**
	 * The number of structural features of the '<em>Parcours</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCOURS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Parcours</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCOURS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.mm.fil.mm.impl.SemaineImpl <em>Semaine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.mm.fil.mm.impl.SemaineImpl
	 * @see idm.mm.fil.mm.impl.MmPackageImpl#getSemaine()
	 * @generated
	 */
	int SEMAINE = 12;

	/**
	 * The feature id for the '<em><b>Ressourcepedagogique</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAINE__RESSOURCEPEDAGOGIQUE = 0;

	/**
	 * The feature id for the '<em><b>Début</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAINE__DÉBUT = 1;

	/**
	 * The feature id for the '<em><b>Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAINE__FIN = 2;

	/**
	 * The feature id for the '<em><b>Remarque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAINE__REMARQUE = 3;

	/**
	 * The number of structural features of the '<em>Semaine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAINE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Semaine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAINE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link idm.mm.fil.mm.UE <em>UE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UE</em>'.
	 * @see idm.mm.fil.mm.UE
	 * @generated
	 */
	EClass getUE();

	/**
	 * Returns the meta object for the attribute '{@link idm.mm.fil.mm.UE#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see idm.mm.fil.mm.UE#getDescription()
	 * @see #getUE()
	 * @generated
	 */
	EAttribute getUE_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.mm.fil.mm.UE#getSemainier <em>Semainier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semainier</em>'.
	 * @see idm.mm.fil.mm.UE#getSemainier()
	 * @see #getUE()
	 * @generated
	 */
	EReference getUE_Semainier();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.mm.fil.mm.UE#getRessourcepedagogique <em>Ressourcepedagogique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ressourcepedagogique</em>'.
	 * @see idm.mm.fil.mm.UE#getRessourcepedagogique()
	 * @see #getUE()
	 * @generated
	 */
	EReference getUE_Ressourcepedagogique();

	/**
	 * Returns the meta object for the attribute '{@link idm.mm.fil.mm.UE#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see idm.mm.fil.mm.UE#getName()
	 * @see #getUE()
	 * @generated
	 */
	EAttribute getUE_Name();

	/**
	 * Returns the meta object for the reference list '{@link idm.mm.fil.mm.UE#getEnseignants <em>Enseignants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enseignants</em>'.
	 * @see idm.mm.fil.mm.UE#getEnseignants()
	 * @see #getUE()
	 * @generated
	 */
	EReference getUE_Enseignants();

	/**
	 * Returns the meta object for the attribute '{@link idm.mm.fil.mm.UE#getNbECTS <em>Nb ECTS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb ECTS</em>'.
	 * @see idm.mm.fil.mm.UE#getNbECTS()
	 * @see #getUE()
	 * @generated
	 */
	EAttribute getUE_NbECTS();

	/**
	 * Returns the meta object for class '{@link idm.mm.fil.mm.Ressource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressource</em>'.
	 * @see idm.mm.fil.mm.Ressource
	 * @generated
	 */
	EClass getRessource();

	/**
	 * Returns the meta object for the attribute '{@link idm.mm.fil.mm.Ressource#getContenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contenu</em>'.
	 * @see idm.mm.fil.mm.Ressource#getContenu()
	 * @see #getRessource()
	 * @generated
	 */
	EAttribute getRessource_Contenu();

	/**
	 * Returns the meta object for class '{@link idm.mm.fil.mm.Semainier <em>Semainier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semainier</em>'.
	 * @see idm.mm.fil.mm.Semainier
	 * @generated
	 */
	EClass getSemainier();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.mm.fil.mm.Semainier#getComposeDeSemaines <em>Compose De Semaines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compose De Semaines</em>'.
	 * @see idm.mm.fil.mm.Semainier#getComposeDeSemaines()
	 * @see #getSemainier()
	 * @generated
	 */
	EReference getSemainier_ComposeDeSemaines();

	/**
	 * Returns the meta object for class '{@link idm.mm.fil.mm.Formation <em>Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formation</em>'.
	 * @see idm.mm.fil.mm.Formation
	 * @generated
	 */
	EClass getFormation();

	/**
	 * Returns the meta object for the attribute '{@link idm.mm.fil.mm.Formation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see idm.mm.fil.mm.Formation#getDescription()
	 * @see #getFormation()
	 * @generated
	 */
	EAttribute getFormation_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.mm.fil.mm.Formation#getComposeDesMentions <em>Compose Des Mentions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compose Des Mentions</em>'.
	 * @see idm.mm.fil.mm.Formation#getComposeDesMentions()
	 * @see #getFormation()
	 * @generated
	 */
	EReference getFormation_ComposeDesMentions();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.mm.fil.mm.Formation#getRessourcesAdministratives <em>Ressources Administratives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ressources Administratives</em>'.
	 * @see idm.mm.fil.mm.Formation#getRessourcesAdministratives()
	 * @see #getFormation()
	 * @generated
	 */
	EReference getFormation_RessourcesAdministratives();

	/**
	 * Returns the meta object for the attribute '{@link idm.mm.fil.mm.Formation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see idm.mm.fil.mm.Formation#getName()
	 * @see #getFormation()
	 * @generated
	 */
	EAttribute getFormation_Name();

	/**
	 * Returns the meta object for the containment reference '{@link idm.mm.fil.mm.Formation#getSecretairepedagogique <em>Secretairepedagogique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Secretairepedagogique</em>'.
	 * @see idm.mm.fil.mm.Formation#getSecretairepedagogique()
	 * @see #getFormation()
	 * @generated
	 */
	EReference getFormation_Secretairepedagogique();

	/**
	 * Returns the meta object for class '{@link idm.mm.fil.mm.Semestre <em>Semestre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semestre</em>'.
	 * @see idm.mm.fil.mm.Semestre
	 * @generated
	 */
	EClass getSemestre();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.mm.fil.mm.Semestre#getComposesDesUEs <em>Composes Des UEs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composes Des UEs</em>'.
	 * @see idm.mm.fil.mm.Semestre#getComposesDesUEs()
	 * @see #getSemestre()
	 * @generated
	 */
	EReference getSemestre_ComposesDesUEs();

	/**
	 * Returns the meta object for the attribute '{@link idm.mm.fil.mm.Semestre#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see idm.mm.fil.mm.Semestre#getName()
	 * @see #getSemestre()
	 * @generated
	 */
	EAttribute getSemestre_Name();

	/**
	 * Returns the meta object for class '{@link idm.mm.fil.mm.FIL <em>FIL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FIL</em>'.
	 * @see idm.mm.fil.mm.FIL
	 * @generated
	 */
	EClass getFIL();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.mm.fil.mm.FIL#getComposeDesFormations <em>Compose Des Formations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compose Des Formations</em>'.
	 * @see idm.mm.fil.mm.FIL#getComposeDesFormations()
	 * @see #getFIL()
	 * @generated
	 */
	EReference getFIL_ComposeDesFormations();

	/**
	 * Returns the meta object for the attribute '{@link idm.mm.fil.mm.FIL#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see idm.mm.fil.mm.FIL#getName()
	 * @see #getFIL()
	 * @generated
	 */
	EAttribute getFIL_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.mm.fil.mm.FIL#getEnseignantsChercheurs <em>Enseignants Chercheurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enseignants Chercheurs</em>'.
	 * @see idm.mm.fil.mm.FIL#getEnseignantsChercheurs()
	 * @see #getFIL()
	 * @generated
	 */
	EReference getFIL_EnseignantsChercheurs();

	/**
	 * Returns the meta object for class '{@link idm.mm.fil.mm.Mention <em>Mention</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mention</em>'.
	 * @see idm.mm.fil.mm.Mention
	 * @generated
	 */
	EClass getMention();

	/**
	 * Returns the meta object for the attribute '{@link idm.mm.fil.mm.Mention#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see idm.mm.fil.mm.Mention#getDescription()
	 * @see #getMention()
	 * @generated
	 */
	EAttribute getMention_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.mm.fil.mm.Mention#getComposeDeSemestres <em>Compose De Semestres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compose De Semestres</em>'.
	 * @see idm.mm.fil.mm.Mention#getComposeDeSemestres()
	 * @see #getMention()
	 * @generated
	 */
	EReference getMention_ComposeDeSemestres();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.mm.fil.mm.Mention#getComposeDesParcours <em>Compose Des Parcours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compose Des Parcours</em>'.
	 * @see idm.mm.fil.mm.Mention#getComposeDesParcours()
	 * @see #getMention()
	 * @generated
	 */
	EReference getMention_ComposeDesParcours();

	/**
	 * Returns the meta object for the attribute '{@link idm.mm.fil.mm.Mention#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see idm.mm.fil.mm.Mention#getName()
	 * @see #getMention()
	 * @generated
	 */
	EAttribute getMention_Name();

	/**
	 * Returns the meta object for the reference '{@link idm.mm.fil.mm.Mention#getResponsableFormation <em>Responsable Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsable Formation</em>'.
	 * @see idm.mm.fil.mm.Mention#getResponsableFormation()
	 * @see #getMention()
	 * @generated
	 */
	EReference getMention_ResponsableFormation();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.mm.fil.mm.Mention#getRessourcepedagogique <em>Ressourcepedagogique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ressourcepedagogique</em>'.
	 * @see idm.mm.fil.mm.Mention#getRessourcepedagogique()
	 * @see #getMention()
	 * @generated
	 */
	EReference getMention_Ressourcepedagogique();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.mm.fil.mm.Mention#getRessourceadministrative <em>Ressourceadministrative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ressourceadministrative</em>'.
	 * @see idm.mm.fil.mm.Mention#getRessourceadministrative()
	 * @see #getMention()
	 * @generated
	 */
	EReference getMention_Ressourceadministrative();

	/**
	 * Returns the meta object for the reference list '{@link idm.mm.fil.mm.Mention#getUeOptionnelles <em>Ue Optionnelles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ue Optionnelles</em>'.
	 * @see idm.mm.fil.mm.Mention#getUeOptionnelles()
	 * @see #getMention()
	 * @generated
	 */
	EReference getMention_UeOptionnelles();

	/**
	 * Returns the meta object for class '{@link idm.mm.fil.mm.Professeur <em>Professeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Professeur</em>'.
	 * @see idm.mm.fil.mm.Professeur
	 * @generated
	 */
	EClass getProfesseur();

	/**
	 * Returns the meta object for class '{@link idm.mm.fil.mm.SecretairePedagogique <em>Secretaire Pedagogique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secretaire Pedagogique</em>'.
	 * @see idm.mm.fil.mm.SecretairePedagogique
	 * @generated
	 */
	EClass getSecretairePedagogique();

	/**
	 * Returns the meta object for class '{@link idm.mm.fil.mm.Parcours <em>Parcours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parcours</em>'.
	 * @see idm.mm.fil.mm.Parcours
	 * @generated
	 */
	EClass getParcours();

	/**
	 * Returns the meta object for the reference list '{@link idm.mm.fil.mm.Parcours#getSemestres <em>Semestres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semestres</em>'.
	 * @see idm.mm.fil.mm.Parcours#getSemestres()
	 * @see #getParcours()
	 * @generated
	 */
	EReference getParcours_Semestres();

	/**
	 * Returns the meta object for the reference list '{@link idm.mm.fil.mm.Parcours#getUeObligatoires <em>Ue Obligatoires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ue Obligatoires</em>'.
	 * @see idm.mm.fil.mm.Parcours#getUeObligatoires()
	 * @see #getParcours()
	 * @generated
	 */
	EReference getParcours_UeObligatoires();

	/**
	 * Returns the meta object for the reference list '{@link idm.mm.fil.mm.Parcours#getUeOptionelles <em>Ue Optionelles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ue Optionelles</em>'.
	 * @see idm.mm.fil.mm.Parcours#getUeOptionelles()
	 * @see #getParcours()
	 * @generated
	 */
	EReference getParcours_UeOptionelles();

	/**
	 * Returns the meta object for the attribute '{@link idm.mm.fil.mm.Parcours#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see idm.mm.fil.mm.Parcours#getName()
	 * @see #getParcours()
	 * @generated
	 */
	EAttribute getParcours_Name();

	/**
	 * Returns the meta object for the reference '{@link idm.mm.fil.mm.Parcours#getResponsableParcours <em>Responsable Parcours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsable Parcours</em>'.
	 * @see idm.mm.fil.mm.Parcours#getResponsableParcours()
	 * @see #getParcours()
	 * @generated
	 */
	EReference getParcours_ResponsableParcours();

	/**
	 * Returns the meta object for the attribute '{@link idm.mm.fil.mm.Parcours#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see idm.mm.fil.mm.Parcours#getDescription()
	 * @see #getParcours()
	 * @generated
	 */
	EAttribute getParcours_Description();

	/**
	 * Returns the meta object for class '{@link idm.mm.fil.mm.Contenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenu</em>'.
	 * @see idm.mm.fil.mm.Contenu
	 * @generated
	 */
	EClass getContenu();

	/**
	 * Returns the meta object for the attribute '{@link idm.mm.fil.mm.Contenu#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see idm.mm.fil.mm.Contenu#getName()
	 * @see #getContenu()
	 * @generated
	 */
	EAttribute getContenu_Name();

	/**
	 * Returns the meta object for class '{@link idm.mm.fil.mm.Personne <em>Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personne</em>'.
	 * @see idm.mm.fil.mm.Personne
	 * @generated
	 */
	EClass getPersonne();

	/**
	 * Returns the meta object for the attribute '{@link idm.mm.fil.mm.Personne#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see idm.mm.fil.mm.Personne#getName()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Name();

	/**
	 * Returns the meta object for the attribute '{@link idm.mm.fil.mm.Personne#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see idm.mm.fil.mm.Personne#getEmail()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Email();

	/**
	 * Returns the meta object for class '{@link idm.mm.fil.mm.Semaine <em>Semaine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semaine</em>'.
	 * @see idm.mm.fil.mm.Semaine
	 * @generated
	 */
	EClass getSemaine();

	/**
	 * Returns the meta object for the reference list '{@link idm.mm.fil.mm.Semaine#getRessourcepedagogique <em>Ressourcepedagogique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ressourcepedagogique</em>'.
	 * @see idm.mm.fil.mm.Semaine#getRessourcepedagogique()
	 * @see #getSemaine()
	 * @generated
	 */
	EReference getSemaine_Ressourcepedagogique();

	/**
	 * Returns the meta object for the attribute '{@link idm.mm.fil.mm.Semaine#getDébut <em>Début</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Début</em>'.
	 * @see idm.mm.fil.mm.Semaine#getDébut()
	 * @see #getSemaine()
	 * @generated
	 */
	EAttribute getSemaine_Début();

	/**
	 * Returns the meta object for the attribute '{@link idm.mm.fil.mm.Semaine#getFin <em>Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fin</em>'.
	 * @see idm.mm.fil.mm.Semaine#getFin()
	 * @see #getSemaine()
	 * @generated
	 */
	EAttribute getSemaine_Fin();

	/**
	 * Returns the meta object for the attribute '{@link idm.mm.fil.mm.Semaine#getRemarque <em>Remarque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remarque</em>'.
	 * @see idm.mm.fil.mm.Semaine#getRemarque()
	 * @see #getSemaine()
	 * @generated
	 */
	EAttribute getSemaine_Remarque();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MmFactory getMmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link idm.mm.fil.mm.impl.UEImpl <em>UE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.mm.fil.mm.impl.UEImpl
		 * @see idm.mm.fil.mm.impl.MmPackageImpl#getUE()
		 * @generated
		 */
		EClass UE = eINSTANCE.getUE();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__DESCRIPTION = eINSTANCE.getUE_Description();

		/**
		 * The meta object literal for the '<em><b>Semainier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UE__SEMAINIER = eINSTANCE.getUE_Semainier();

		/**
		 * The meta object literal for the '<em><b>Ressourcepedagogique</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UE__RESSOURCEPEDAGOGIQUE = eINSTANCE.getUE_Ressourcepedagogique();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__NAME = eINSTANCE.getUE_Name();

		/**
		 * The meta object literal for the '<em><b>Enseignants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UE__ENSEIGNANTS = eINSTANCE.getUE_Enseignants();

		/**
		 * The meta object literal for the '<em><b>Nb ECTS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__NB_ECTS = eINSTANCE.getUE_NbECTS();

		/**
		 * The meta object literal for the '{@link idm.mm.fil.mm.impl.RessourceImpl <em>Ressource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.mm.fil.mm.impl.RessourceImpl
		 * @see idm.mm.fil.mm.impl.MmPackageImpl#getRessource()
		 * @generated
		 */
		EClass RESSOURCE = eINSTANCE.getRessource();

		/**
		 * The meta object literal for the '<em><b>Contenu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCE__CONTENU = eINSTANCE.getRessource_Contenu();

		/**
		 * The meta object literal for the '{@link idm.mm.fil.mm.impl.SemainierImpl <em>Semainier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.mm.fil.mm.impl.SemainierImpl
		 * @see idm.mm.fil.mm.impl.MmPackageImpl#getSemainier()
		 * @generated
		 */
		EClass SEMAINIER = eINSTANCE.getSemainier();

		/**
		 * The meta object literal for the '<em><b>Compose De Semaines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMAINIER__COMPOSE_DE_SEMAINES = eINSTANCE.getSemainier_ComposeDeSemaines();

		/**
		 * The meta object literal for the '{@link idm.mm.fil.mm.impl.FormationImpl <em>Formation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.mm.fil.mm.impl.FormationImpl
		 * @see idm.mm.fil.mm.impl.MmPackageImpl#getFormation()
		 * @generated
		 */
		EClass FORMATION = eINSTANCE.getFormation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMATION__DESCRIPTION = eINSTANCE.getFormation_Description();

		/**
		 * The meta object literal for the '<em><b>Compose Des Mentions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__COMPOSE_DES_MENTIONS = eINSTANCE.getFormation_ComposeDesMentions();

		/**
		 * The meta object literal for the '<em><b>Ressources Administratives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__RESSOURCES_ADMINISTRATIVES = eINSTANCE.getFormation_RessourcesAdministratives();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMATION__NAME = eINSTANCE.getFormation_Name();

		/**
		 * The meta object literal for the '<em><b>Secretairepedagogique</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__SECRETAIREPEDAGOGIQUE = eINSTANCE.getFormation_Secretairepedagogique();

		/**
		 * The meta object literal for the '{@link idm.mm.fil.mm.impl.SemestreImpl <em>Semestre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.mm.fil.mm.impl.SemestreImpl
		 * @see idm.mm.fil.mm.impl.MmPackageImpl#getSemestre()
		 * @generated
		 */
		EClass SEMESTRE = eINSTANCE.getSemestre();

		/**
		 * The meta object literal for the '<em><b>Composes Des UEs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTRE__COMPOSES_DES_UES = eINSTANCE.getSemestre_ComposesDesUEs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTRE__NAME = eINSTANCE.getSemestre_Name();

		/**
		 * The meta object literal for the '{@link idm.mm.fil.mm.impl.FILImpl <em>FIL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.mm.fil.mm.impl.FILImpl
		 * @see idm.mm.fil.mm.impl.MmPackageImpl#getFIL()
		 * @generated
		 */
		EClass FIL = eINSTANCE.getFIL();

		/**
		 * The meta object literal for the '<em><b>Compose Des Formations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIL__COMPOSE_DES_FORMATIONS = eINSTANCE.getFIL_ComposeDesFormations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIL__NAME = eINSTANCE.getFIL_Name();

		/**
		 * The meta object literal for the '<em><b>Enseignants Chercheurs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIL__ENSEIGNANTS_CHERCHEURS = eINSTANCE.getFIL_EnseignantsChercheurs();

		/**
		 * The meta object literal for the '{@link idm.mm.fil.mm.impl.MentionImpl <em>Mention</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.mm.fil.mm.impl.MentionImpl
		 * @see idm.mm.fil.mm.impl.MmPackageImpl#getMention()
		 * @generated
		 */
		EClass MENTION = eINSTANCE.getMention();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENTION__DESCRIPTION = eINSTANCE.getMention_Description();

		/**
		 * The meta object literal for the '<em><b>Compose De Semestres</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENTION__COMPOSE_DE_SEMESTRES = eINSTANCE.getMention_ComposeDeSemestres();

		/**
		 * The meta object literal for the '<em><b>Compose Des Parcours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENTION__COMPOSE_DES_PARCOURS = eINSTANCE.getMention_ComposeDesParcours();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENTION__NAME = eINSTANCE.getMention_Name();

		/**
		 * The meta object literal for the '<em><b>Responsable Formation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENTION__RESPONSABLE_FORMATION = eINSTANCE.getMention_ResponsableFormation();

		/**
		 * The meta object literal for the '<em><b>Ressourcepedagogique</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENTION__RESSOURCEPEDAGOGIQUE = eINSTANCE.getMention_Ressourcepedagogique();

		/**
		 * The meta object literal for the '<em><b>Ressourceadministrative</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENTION__RESSOURCEADMINISTRATIVE = eINSTANCE.getMention_Ressourceadministrative();

		/**
		 * The meta object literal for the '<em><b>Ue Optionnelles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENTION__UE_OPTIONNELLES = eINSTANCE.getMention_UeOptionnelles();

		/**
		 * The meta object literal for the '{@link idm.mm.fil.mm.impl.ProfesseurImpl <em>Professeur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.mm.fil.mm.impl.ProfesseurImpl
		 * @see idm.mm.fil.mm.impl.MmPackageImpl#getProfesseur()
		 * @generated
		 */
		EClass PROFESSEUR = eINSTANCE.getProfesseur();

		/**
		 * The meta object literal for the '{@link idm.mm.fil.mm.impl.SecretairePedagogiqueImpl <em>Secretaire Pedagogique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.mm.fil.mm.impl.SecretairePedagogiqueImpl
		 * @see idm.mm.fil.mm.impl.MmPackageImpl#getSecretairePedagogique()
		 * @generated
		 */
		EClass SECRETAIRE_PEDAGOGIQUE = eINSTANCE.getSecretairePedagogique();

		/**
		 * The meta object literal for the '{@link idm.mm.fil.mm.impl.ParcoursImpl <em>Parcours</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.mm.fil.mm.impl.ParcoursImpl
		 * @see idm.mm.fil.mm.impl.MmPackageImpl#getParcours()
		 * @generated
		 */
		EClass PARCOURS = eINSTANCE.getParcours();

		/**
		 * The meta object literal for the '<em><b>Semestres</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARCOURS__SEMESTRES = eINSTANCE.getParcours_Semestres();

		/**
		 * The meta object literal for the '<em><b>Ue Obligatoires</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARCOURS__UE_OBLIGATOIRES = eINSTANCE.getParcours_UeObligatoires();

		/**
		 * The meta object literal for the '<em><b>Ue Optionelles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARCOURS__UE_OPTIONELLES = eINSTANCE.getParcours_UeOptionelles();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARCOURS__NAME = eINSTANCE.getParcours_Name();

		/**
		 * The meta object literal for the '<em><b>Responsable Parcours</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARCOURS__RESPONSABLE_PARCOURS = eINSTANCE.getParcours_ResponsableParcours();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARCOURS__DESCRIPTION = eINSTANCE.getParcours_Description();

		/**
		 * The meta object literal for the '{@link idm.mm.fil.mm.impl.ContenuImpl <em>Contenu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.mm.fil.mm.impl.ContenuImpl
		 * @see idm.mm.fil.mm.impl.MmPackageImpl#getContenu()
		 * @generated
		 */
		EClass CONTENU = eINSTANCE.getContenu();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENU__NAME = eINSTANCE.getContenu_Name();

		/**
		 * The meta object literal for the '{@link idm.mm.fil.mm.impl.PersonneImpl <em>Personne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.mm.fil.mm.impl.PersonneImpl
		 * @see idm.mm.fil.mm.impl.MmPackageImpl#getPersonne()
		 * @generated
		 */
		EClass PERSONNE = eINSTANCE.getPersonne();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__NAME = eINSTANCE.getPersonne_Name();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__EMAIL = eINSTANCE.getPersonne_Email();

		/**
		 * The meta object literal for the '{@link idm.mm.fil.mm.impl.SemaineImpl <em>Semaine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.mm.fil.mm.impl.SemaineImpl
		 * @see idm.mm.fil.mm.impl.MmPackageImpl#getSemaine()
		 * @generated
		 */
		EClass SEMAINE = eINSTANCE.getSemaine();

		/**
		 * The meta object literal for the '<em><b>Ressourcepedagogique</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMAINE__RESSOURCEPEDAGOGIQUE = eINSTANCE.getSemaine_Ressourcepedagogique();

		/**
		 * The meta object literal for the '<em><b>Début</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMAINE__DÉBUT = eINSTANCE.getSemaine_Début();

		/**
		 * The meta object literal for the '<em><b>Fin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMAINE__FIN = eINSTANCE.getSemaine_Fin();

		/**
		 * The meta object literal for the '<em><b>Remarque</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMAINE__REMARQUE = eINSTANCE.getSemaine_Remarque();

	}

} //MmPackage
