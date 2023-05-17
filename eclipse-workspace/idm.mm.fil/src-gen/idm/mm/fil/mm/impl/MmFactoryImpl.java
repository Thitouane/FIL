/**
 */
package idm.mm.fil.mm.impl;

import idm.mm.fil.mm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MmFactoryImpl extends EFactoryImpl implements MmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MmFactory init() {
		try {
			MmFactory theMmFactory = (MmFactory) EPackage.Registry.INSTANCE.getEFactory(MmPackage.eNS_URI);
			if (theMmFactory != null) {
				return theMmFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MmPackage.UE:
			return createUE();
		case MmPackage.RESSOURCE:
			return createRessource();
		case MmPackage.SEMAINIER:
			return createSemainier();
		case MmPackage.FORMATION:
			return createFormation();
		case MmPackage.SEMESTRE:
			return createSemestre();
		case MmPackage.FIL:
			return createFIL();
		case MmPackage.MENTION:
			return createMention();
		case MmPackage.PROFESSEUR:
			return createProfesseur();
		case MmPackage.SECRETAIRE_PEDAGOGIQUE:
			return createSecretairePedagogique();
		case MmPackage.PARCOURS:
			return createParcours();
		case MmPackage.SEMAINE:
			return createSemaine();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UE createUE() {
		UEImpl ue = new UEImpl();
		return ue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ressource createRessource() {
		RessourceImpl ressource = new RessourceImpl();
		return ressource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semainier createSemainier() {
		SemainierImpl semainier = new SemainierImpl();
		return semainier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formation createFormation() {
		FormationImpl formation = new FormationImpl();
		return formation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semestre createSemestre() {
		SemestreImpl semestre = new SemestreImpl();
		return semestre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FIL createFIL() {
		FILImpl fil = new FILImpl();
		return fil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mention createMention() {
		MentionImpl mention = new MentionImpl();
		return mention;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Professeur createProfesseur() {
		ProfesseurImpl professeur = new ProfesseurImpl();
		return professeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecretairePedagogique createSecretairePedagogique() {
		SecretairePedagogiqueImpl secretairePedagogique = new SecretairePedagogiqueImpl();
		return secretairePedagogique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parcours createParcours() {
		ParcoursImpl parcours = new ParcoursImpl();
		return parcours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semaine createSemaine() {
		SemaineImpl semaine = new SemaineImpl();
		return semaine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MmPackage getMmPackage() {
		return (MmPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MmPackage getPackage() {
		return MmPackage.eINSTANCE;
	}

} //MmFactoryImpl
