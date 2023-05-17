/**
 */
package idm.mm.fil.mm.impl;

import idm.mm.fil.mm.FIL;
import idm.mm.fil.mm.Formation;
import idm.mm.fil.mm.MmPackage;
import idm.mm.fil.mm.Professeur;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FIL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link idm.mm.fil.mm.impl.FILImpl#getComposeDesFormations <em>Compose Des Formations</em>}</li>
 *   <li>{@link idm.mm.fil.mm.impl.FILImpl#getName <em>Name</em>}</li>
 *   <li>{@link idm.mm.fil.mm.impl.FILImpl#getEnseignantsChercheurs <em>Enseignants Chercheurs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FILImpl extends MinimalEObjectImpl.Container implements FIL {
	/**
	 * The cached value of the '{@link #getComposeDesFormations() <em>Compose Des Formations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposeDesFormations()
	 * @generated
	 * @ordered
	 */
	protected EList<Formation> composeDesFormations;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnseignantsChercheurs() <em>Enseignants Chercheurs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnseignantsChercheurs()
	 * @generated
	 * @ordered
	 */
	protected EList<Professeur> enseignantsChercheurs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FILImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmPackage.Literals.FIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Formation> getComposeDesFormations() {
		if (composeDesFormations == null) {
			composeDesFormations = new EObjectContainmentEList<Formation>(Formation.class, this,
					MmPackage.FIL__COMPOSE_DES_FORMATIONS);
		}
		return composeDesFormations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.FIL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Professeur> getEnseignantsChercheurs() {
		if (enseignantsChercheurs == null) {
			enseignantsChercheurs = new EObjectContainmentEList<Professeur>(Professeur.class, this,
					MmPackage.FIL__ENSEIGNANTS_CHERCHEURS);
		}
		return enseignantsChercheurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MmPackage.FIL__COMPOSE_DES_FORMATIONS:
			return ((InternalEList<?>) getComposeDesFormations()).basicRemove(otherEnd, msgs);
		case MmPackage.FIL__ENSEIGNANTS_CHERCHEURS:
			return ((InternalEList<?>) getEnseignantsChercheurs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MmPackage.FIL__COMPOSE_DES_FORMATIONS:
			return getComposeDesFormations();
		case MmPackage.FIL__NAME:
			return getName();
		case MmPackage.FIL__ENSEIGNANTS_CHERCHEURS:
			return getEnseignantsChercheurs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MmPackage.FIL__COMPOSE_DES_FORMATIONS:
			getComposeDesFormations().clear();
			getComposeDesFormations().addAll((Collection<? extends Formation>) newValue);
			return;
		case MmPackage.FIL__NAME:
			setName((String) newValue);
			return;
		case MmPackage.FIL__ENSEIGNANTS_CHERCHEURS:
			getEnseignantsChercheurs().clear();
			getEnseignantsChercheurs().addAll((Collection<? extends Professeur>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MmPackage.FIL__COMPOSE_DES_FORMATIONS:
			getComposeDesFormations().clear();
			return;
		case MmPackage.FIL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MmPackage.FIL__ENSEIGNANTS_CHERCHEURS:
			getEnseignantsChercheurs().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MmPackage.FIL__COMPOSE_DES_FORMATIONS:
			return composeDesFormations != null && !composeDesFormations.isEmpty();
		case MmPackage.FIL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MmPackage.FIL__ENSEIGNANTS_CHERCHEURS:
			return enseignantsChercheurs != null && !enseignantsChercheurs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FILImpl
