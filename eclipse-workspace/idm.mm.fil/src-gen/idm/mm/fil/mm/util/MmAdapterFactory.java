/**
 */
package idm.mm.fil.mm.util;

import idm.mm.fil.mm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see idm.mm.fil.mm.MmPackage
 * @generated
 */
public class MmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MmSwitch<Adapter> modelSwitch = new MmSwitch<Adapter>() {
		@Override
		public Adapter caseUE(UE object) {
			return createUEAdapter();
		}

		@Override
		public Adapter caseRessource(Ressource object) {
			return createRessourceAdapter();
		}

		@Override
		public Adapter caseSemainier(Semainier object) {
			return createSemainierAdapter();
		}

		@Override
		public Adapter caseFormation(Formation object) {
			return createFormationAdapter();
		}

		@Override
		public Adapter caseSemestre(Semestre object) {
			return createSemestreAdapter();
		}

		@Override
		public Adapter caseFIL(FIL object) {
			return createFILAdapter();
		}

		@Override
		public Adapter caseMention(Mention object) {
			return createMentionAdapter();
		}

		@Override
		public Adapter caseProfesseur(Professeur object) {
			return createProfesseurAdapter();
		}

		@Override
		public Adapter caseSecretairePedagogique(SecretairePedagogique object) {
			return createSecretairePedagogiqueAdapter();
		}

		@Override
		public Adapter caseParcours(Parcours object) {
			return createParcoursAdapter();
		}

		@Override
		public Adapter caseContenu(Contenu object) {
			return createContenuAdapter();
		}

		@Override
		public Adapter casePersonne(Personne object) {
			return createPersonneAdapter();
		}

		@Override
		public Adapter caseSemaine(Semaine object) {
			return createSemaineAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.mm.fil.mm.UE <em>UE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.mm.fil.mm.UE
	 * @generated
	 */
	public Adapter createUEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.mm.fil.mm.Ressource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.mm.fil.mm.Ressource
	 * @generated
	 */
	public Adapter createRessourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.mm.fil.mm.Semainier <em>Semainier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.mm.fil.mm.Semainier
	 * @generated
	 */
	public Adapter createSemainierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.mm.fil.mm.Formation <em>Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.mm.fil.mm.Formation
	 * @generated
	 */
	public Adapter createFormationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.mm.fil.mm.Semestre <em>Semestre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.mm.fil.mm.Semestre
	 * @generated
	 */
	public Adapter createSemestreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.mm.fil.mm.FIL <em>FIL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.mm.fil.mm.FIL
	 * @generated
	 */
	public Adapter createFILAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.mm.fil.mm.Mention <em>Mention</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.mm.fil.mm.Mention
	 * @generated
	 */
	public Adapter createMentionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.mm.fil.mm.Professeur <em>Professeur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.mm.fil.mm.Professeur
	 * @generated
	 */
	public Adapter createProfesseurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.mm.fil.mm.SecretairePedagogique <em>Secretaire Pedagogique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.mm.fil.mm.SecretairePedagogique
	 * @generated
	 */
	public Adapter createSecretairePedagogiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.mm.fil.mm.Parcours <em>Parcours</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.mm.fil.mm.Parcours
	 * @generated
	 */
	public Adapter createParcoursAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.mm.fil.mm.Contenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.mm.fil.mm.Contenu
	 * @generated
	 */
	public Adapter createContenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.mm.fil.mm.Personne <em>Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.mm.fil.mm.Personne
	 * @generated
	 */
	public Adapter createPersonneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.mm.fil.mm.Semaine <em>Semaine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.mm.fil.mm.Semaine
	 * @generated
	 */
	public Adapter createSemaineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MmAdapterFactory
