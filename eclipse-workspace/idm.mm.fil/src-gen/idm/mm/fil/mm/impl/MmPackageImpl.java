/**
 */
package idm.mm.fil.mm.impl;

import idm.mm.fil.mm.Contenu;
import idm.mm.fil.mm.Formation;
import idm.mm.fil.mm.Mention;
import idm.mm.fil.mm.MmFactory;
import idm.mm.fil.mm.MmPackage;
import idm.mm.fil.mm.Parcours;
import idm.mm.fil.mm.Personne;
import idm.mm.fil.mm.Professeur;
import idm.mm.fil.mm.Ressource;
import idm.mm.fil.mm.SecretairePedagogique;
import idm.mm.fil.mm.Semaine;
import idm.mm.fil.mm.Semainier;
import idm.mm.fil.mm.Semestre;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MmPackageImpl extends EPackageImpl implements MmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ressourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semainierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semestreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mentionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass professeurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secretairePedagogiqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parcoursEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semaineEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see idm.mm.fil.mm.MmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MmPackageImpl() {
		super(eNS_URI, MmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MmPackage init() {
		if (isInited)
			return (MmPackage) EPackage.Registry.INSTANCE.getEPackage(MmPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMmPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MmPackageImpl theMmPackage = registeredMmPackage instanceof MmPackageImpl ? (MmPackageImpl) registeredMmPackage
				: new MmPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMmPackage.createPackageContents();

		// Initialize created meta-data
		theMmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMmPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MmPackage.eNS_URI, theMmPackage);
		return theMmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUE() {
		return ueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUE_Description() {
		return (EAttribute) ueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUE_Semainier() {
		return (EReference) ueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUE_Ressourcepedagogique() {
		return (EReference) ueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUE_Name() {
		return (EAttribute) ueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUE_Enseignants() {
		return (EReference) ueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUE_NbECTS() {
		return (EAttribute) ueEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRessource() {
		return ressourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRessource_Contenu() {
		return (EAttribute) ressourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemainier() {
		return semainierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemainier_ComposeDeSemaines() {
		return (EReference) semainierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormation() {
		return formationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormation_Description() {
		return (EAttribute) formationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormation_ComposeDesMentions() {
		return (EReference) formationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormation_RessourcesAdministratives() {
		return (EReference) formationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormation_Name() {
		return (EAttribute) formationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormation_Secretairepedagogique() {
		return (EReference) formationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemestre() {
		return semestreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemestre_ComposesDesUEs() {
		return (EReference) semestreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemestre_Name() {
		return (EAttribute) semestreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFIL() {
		return filEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFIL_ComposeDesFormations() {
		return (EReference) filEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFIL_Name() {
		return (EAttribute) filEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFIL_EnseignantsChercheurs() {
		return (EReference) filEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMention() {
		return mentionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMention_Description() {
		return (EAttribute) mentionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMention_ComposeDeSemestres() {
		return (EReference) mentionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMention_ComposeDesParcours() {
		return (EReference) mentionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMention_Name() {
		return (EAttribute) mentionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMention_ResponsableFormation() {
		return (EReference) mentionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMention_Ressourcepedagogique() {
		return (EReference) mentionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMention_Ressourceadministrative() {
		return (EReference) mentionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMention_UeOptionnelles() {
		return (EReference) mentionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfesseur() {
		return professeurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecretairePedagogique() {
		return secretairePedagogiqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParcours() {
		return parcoursEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParcours_Semestres() {
		return (EReference) parcoursEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParcours_UeObligatoires() {
		return (EReference) parcoursEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParcours_UeOptionelles() {
		return (EReference) parcoursEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParcours_Name() {
		return (EAttribute) parcoursEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParcours_ResponsableParcours() {
		return (EReference) parcoursEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParcours_Description() {
		return (EAttribute) parcoursEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenu() {
		return contenuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenu_Name() {
		return (EAttribute) contenuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonne() {
		return personneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonne_Name() {
		return (EAttribute) personneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonne_Email() {
		return (EAttribute) personneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemaine() {
		return semaineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemaine_Ressourcepedagogique() {
		return (EReference) semaineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemaine_Début() {
		return (EAttribute) semaineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemaine_Fin() {
		return (EAttribute) semaineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemaine_Remarque() {
		return (EAttribute) semaineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MmFactory getMmFactory() {
		return (MmFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		ueEClass = createEClass(UE);
		createEAttribute(ueEClass, UE__DESCRIPTION);
		createEReference(ueEClass, UE__SEMAINIER);
		createEReference(ueEClass, UE__RESSOURCEPEDAGOGIQUE);
		createEAttribute(ueEClass, UE__NAME);
		createEReference(ueEClass, UE__ENSEIGNANTS);
		createEAttribute(ueEClass, UE__NB_ECTS);

		ressourceEClass = createEClass(RESSOURCE);
		createEAttribute(ressourceEClass, RESSOURCE__CONTENU);

		semainierEClass = createEClass(SEMAINIER);
		createEReference(semainierEClass, SEMAINIER__COMPOSE_DE_SEMAINES);

		formationEClass = createEClass(FORMATION);
		createEAttribute(formationEClass, FORMATION__DESCRIPTION);
		createEReference(formationEClass, FORMATION__COMPOSE_DES_MENTIONS);
		createEReference(formationEClass, FORMATION__RESSOURCES_ADMINISTRATIVES);
		createEAttribute(formationEClass, FORMATION__NAME);
		createEReference(formationEClass, FORMATION__SECRETAIREPEDAGOGIQUE);

		semestreEClass = createEClass(SEMESTRE);
		createEReference(semestreEClass, SEMESTRE__COMPOSES_DES_UES);
		createEAttribute(semestreEClass, SEMESTRE__NAME);

		filEClass = createEClass(FIL);
		createEReference(filEClass, FIL__COMPOSE_DES_FORMATIONS);
		createEAttribute(filEClass, FIL__NAME);
		createEReference(filEClass, FIL__ENSEIGNANTS_CHERCHEURS);

		mentionEClass = createEClass(MENTION);
		createEAttribute(mentionEClass, MENTION__DESCRIPTION);
		createEReference(mentionEClass, MENTION__COMPOSE_DE_SEMESTRES);
		createEReference(mentionEClass, MENTION__COMPOSE_DES_PARCOURS);
		createEAttribute(mentionEClass, MENTION__NAME);
		createEReference(mentionEClass, MENTION__RESPONSABLE_FORMATION);
		createEReference(mentionEClass, MENTION__RESSOURCEPEDAGOGIQUE);
		createEReference(mentionEClass, MENTION__RESSOURCEADMINISTRATIVE);
		createEReference(mentionEClass, MENTION__UE_OPTIONNELLES);

		professeurEClass = createEClass(PROFESSEUR);

		secretairePedagogiqueEClass = createEClass(SECRETAIRE_PEDAGOGIQUE);

		parcoursEClass = createEClass(PARCOURS);
		createEReference(parcoursEClass, PARCOURS__SEMESTRES);
		createEReference(parcoursEClass, PARCOURS__UE_OBLIGATOIRES);
		createEReference(parcoursEClass, PARCOURS__UE_OPTIONELLES);
		createEAttribute(parcoursEClass, PARCOURS__NAME);
		createEReference(parcoursEClass, PARCOURS__RESPONSABLE_PARCOURS);
		createEAttribute(parcoursEClass, PARCOURS__DESCRIPTION);

		contenuEClass = createEClass(CONTENU);
		createEAttribute(contenuEClass, CONTENU__NAME);

		personneEClass = createEClass(PERSONNE);
		createEAttribute(personneEClass, PERSONNE__NAME);
		createEAttribute(personneEClass, PERSONNE__EMAIL);

		semaineEClass = createEClass(SEMAINE);
		createEReference(semaineEClass, SEMAINE__RESSOURCEPEDAGOGIQUE);
		createEAttribute(semaineEClass, SEMAINE__DÉBUT);
		createEAttribute(semaineEClass, SEMAINE__FIN);
		createEAttribute(semaineEClass, SEMAINE__REMARQUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ressourceEClass.getESuperTypes().add(this.getContenu());
		semainierEClass.getESuperTypes().add(this.getContenu());
		professeurEClass.getESuperTypes().add(this.getPersonne());
		secretairePedagogiqueEClass.getESuperTypes().add(this.getPersonne());

		// Initialize classes, features, and operations; add parameters
		initEClass(ueEClass, idm.mm.fil.mm.UE.class, "UE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUE_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				idm.mm.fil.mm.UE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getUE_Semainier(), this.getSemainier(), null, "semainier", null, 0, -1, idm.mm.fil.mm.UE.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUE_Ressourcepedagogique(), this.getRessource(), null, "ressourcepedagogique", null, 0, -1,
				idm.mm.fil.mm.UE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUE_Name(), ecorePackage.getEString(), "name", null, 0, 1, idm.mm.fil.mm.UE.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUE_Enseignants(), this.getProfesseur(), null, "enseignants", null, 1, -1,
				idm.mm.fil.mm.UE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUE_NbECTS(), theXMLTypePackage.getInt(), "nbECTS", null, 0, 1, idm.mm.fil.mm.UE.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ressourceEClass, Ressource.class, "Ressource", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRessource_Contenu(), ecorePackage.getEString(), "contenu", null, 0, 1, Ressource.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semainierEClass, Semainier.class, "Semainier", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSemainier_ComposeDeSemaines(), this.getSemaine(), null, "composeDeSemaines", null, 0, -1,
				Semainier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formationEClass, Formation.class, "Formation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormation_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Formation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getFormation_ComposeDesMentions(), this.getMention(), null, "composeDesMentions", null, 0, -1,
				Formation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormation_RessourcesAdministratives(), this.getRessource(), null, "ressourcesAdministratives",
				null, 0, -1, Formation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Formation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormation_Secretairepedagogique(), this.getSecretairePedagogique(), null,
				"secretairepedagogique", null, 0, 1, Formation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semestreEClass, Semestre.class, "Semestre", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSemestre_ComposesDesUEs(), this.getUE(), null, "composesDesUEs", null, 0, -1, Semestre.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemestre_Name(), ecorePackage.getEString(), "name", null, 0, 1, Semestre.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filEClass, idm.mm.fil.mm.FIL.class, "FIL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFIL_ComposeDesFormations(), this.getFormation(), null, "composeDesFormations", null, 0, -1,
				idm.mm.fil.mm.FIL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFIL_Name(), ecorePackage.getEString(), "name", null, 0, 1, idm.mm.fil.mm.FIL.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFIL_EnseignantsChercheurs(), this.getProfesseur(), null, "enseignantsChercheurs", null, 0, -1,
				idm.mm.fil.mm.FIL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mentionEClass, Mention.class, "Mention", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMention_Description(), ecorePackage.getEString(), "description", null, 0, 1, Mention.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMention_ComposeDeSemestres(), this.getSemestre(), null, "composeDeSemestres", null, 0, 6,
				Mention.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMention_ComposeDesParcours(), this.getParcours(), null, "composeDesParcours", null, 0, -1,
				Mention.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMention_Name(), ecorePackage.getEString(), "name", null, 0, 1, Mention.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMention_ResponsableFormation(), this.getProfesseur(), null, "responsableFormation", null, 0,
				1, Mention.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMention_Ressourcepedagogique(), this.getRessource(), null, "ressourcepedagogique", null, 0,
				-1, Mention.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMention_Ressourceadministrative(), this.getRessource(), null, "ressourceadministrative", null,
				0, -1, Mention.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMention_UeOptionnelles(), this.getUE(), null, "ueOptionnelles", null, 0, -1, Mention.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(professeurEClass, Professeur.class, "Professeur", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(secretairePedagogiqueEClass, SecretairePedagogique.class, "SecretairePedagogique", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parcoursEClass, Parcours.class, "Parcours", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParcours_Semestres(), this.getSemestre(), null, "semestres", null, 0, 6, Parcours.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParcours_UeObligatoires(), this.getUE(), null, "ueObligatoires", null, 0, -1, Parcours.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParcours_UeOptionelles(), this.getUE(), null, "ueOptionelles", null, 0, -1, Parcours.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParcours_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parcours.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParcours_ResponsableParcours(), this.getProfesseur(), null, "responsableParcours", null, 0, 1,
				Parcours.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParcours_Description(), ecorePackage.getEString(), "description", null, 0, 1, Parcours.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contenuEClass, Contenu.class, "Contenu", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContenu_Name(), ecorePackage.getEString(), "name", null, 0, 1, Contenu.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personneEClass, Personne.class, "Personne", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonne_Name(), ecorePackage.getEString(), "name", null, 0, 1, Personne.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonne_Email(), ecorePackage.getEString(), "email", null, 0, 1, Personne.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semaineEClass, Semaine.class, "Semaine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSemaine_Ressourcepedagogique(), this.getRessource(), null, "ressourcepedagogique", null, 0,
				-1, Semaine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemaine_Début(), ecorePackage.getEString(), "Début", null, 0, 1, Semaine.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemaine_Fin(), ecorePackage.getEString(), "Fin", null, 0, 1, Semaine.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemaine_Remarque(), ecorePackage.getEString(), "Remarque", null, 0, 1, Semaine.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MmPackageImpl
