/**
 */
package idm.mm.fil.mm.util;

import idm.mm.fil.mm.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see idm.mm.fil.mm.MmPackage
 * @generated
 */
public class MmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MmSwitch() {
		if (modelPackage == null) {
			modelPackage = MmPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case MmPackage.UE: {
			UE ue = (UE) theEObject;
			T result = caseUE(ue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.RESSOURCE: {
			Ressource ressource = (Ressource) theEObject;
			T result = caseRessource(ressource);
			if (result == null)
				result = caseContenu(ressource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.SEMAINIER: {
			Semainier semainier = (Semainier) theEObject;
			T result = caseSemainier(semainier);
			if (result == null)
				result = caseContenu(semainier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.FORMATION: {
			Formation formation = (Formation) theEObject;
			T result = caseFormation(formation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.SEMESTRE: {
			Semestre semestre = (Semestre) theEObject;
			T result = caseSemestre(semestre);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.FIL: {
			FIL fil = (FIL) theEObject;
			T result = caseFIL(fil);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.MENTION: {
			Mention mention = (Mention) theEObject;
			T result = caseMention(mention);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.PROFESSEUR: {
			Professeur professeur = (Professeur) theEObject;
			T result = caseProfesseur(professeur);
			if (result == null)
				result = casePersonne(professeur);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.SECRETAIRE_PEDAGOGIQUE: {
			SecretairePedagogique secretairePedagogique = (SecretairePedagogique) theEObject;
			T result = caseSecretairePedagogique(secretairePedagogique);
			if (result == null)
				result = casePersonne(secretairePedagogique);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.PARCOURS: {
			Parcours parcours = (Parcours) theEObject;
			T result = caseParcours(parcours);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.CONTENU: {
			Contenu contenu = (Contenu) theEObject;
			T result = caseContenu(contenu);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.PERSONNE: {
			Personne personne = (Personne) theEObject;
			T result = casePersonne(personne);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.SEMAINE: {
			Semaine semaine = (Semaine) theEObject;
			T result = caseSemaine(semaine);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUE(UE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ressource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ressource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRessource(Ressource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semainier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semainier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemainier(Semainier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormation(Formation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semestre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semestre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemestre(Semestre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FIL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FIL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFIL(FIL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mention</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mention</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMention(Mention object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Professeur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Professeur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfesseur(Professeur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secretaire Pedagogique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secretaire Pedagogique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecretairePedagogique(SecretairePedagogique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parcours</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parcours</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParcours(Parcours object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenu(Contenu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Personne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Personne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonne(Personne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semaine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semaine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemaine(Semaine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MmSwitch
