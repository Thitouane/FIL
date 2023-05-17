/**
 */
package idm.mm.fil.mm.impl;

import idm.mm.fil.mm.MmPackage;
import idm.mm.fil.mm.Semaine;
import idm.mm.fil.mm.Semainier;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semainier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link idm.mm.fil.mm.impl.SemainierImpl#getComposeDeSemaines <em>Compose De Semaines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemainierImpl extends ContenuImpl implements Semainier {
	/**
	 * The cached value of the '{@link #getComposeDeSemaines() <em>Compose De Semaines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposeDeSemaines()
	 * @generated
	 * @ordered
	 */
	protected EList<Semaine> composeDeSemaines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemainierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmPackage.Literals.SEMAINIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semaine> getComposeDeSemaines() {
		if (composeDeSemaines == null) {
			composeDeSemaines = new EObjectContainmentEList<Semaine>(Semaine.class, this,
					MmPackage.SEMAINIER__COMPOSE_DE_SEMAINES);
		}
		return composeDeSemaines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MmPackage.SEMAINIER__COMPOSE_DE_SEMAINES:
			return ((InternalEList<?>) getComposeDeSemaines()).basicRemove(otherEnd, msgs);
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
		case MmPackage.SEMAINIER__COMPOSE_DE_SEMAINES:
			return getComposeDeSemaines();
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
		case MmPackage.SEMAINIER__COMPOSE_DE_SEMAINES:
			getComposeDeSemaines().clear();
			getComposeDeSemaines().addAll((Collection<? extends Semaine>) newValue);
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
		case MmPackage.SEMAINIER__COMPOSE_DE_SEMAINES:
			getComposeDeSemaines().clear();
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
		case MmPackage.SEMAINIER__COMPOSE_DE_SEMAINES:
			return composeDeSemaines != null && !composeDeSemaines.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SemainierImpl
