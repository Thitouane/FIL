/**
 */
package idm.mm.fil.mm.impl;

import idm.mm.fil.mm.Formation;
import idm.mm.fil.mm.Mention;
import idm.mm.fil.mm.MmPackage;
import idm.mm.fil.mm.Ressource;
import idm.mm.fil.mm.SecretairePedagogique;

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
 * An implementation of the model object '<em><b>Formation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link idm.mm.fil.mm.impl.FormationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link idm.mm.fil.mm.impl.FormationImpl#getComposeDesMentions <em>Compose Des Mentions</em>}</li>
 *   <li>{@link idm.mm.fil.mm.impl.FormationImpl#getRessourcesAdministratives <em>Ressources Administratives</em>}</li>
 *   <li>{@link idm.mm.fil.mm.impl.FormationImpl#getName <em>Name</em>}</li>
 *   <li>{@link idm.mm.fil.mm.impl.FormationImpl#getSecretairepedagogique <em>Secretairepedagogique</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormationImpl extends MinimalEObjectImpl.Container implements Formation {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComposeDesMentions() <em>Compose Des Mentions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposeDesMentions()
	 * @generated
	 * @ordered
	 */
	protected EList<Mention> composeDesMentions;

	/**
	 * The cached value of the '{@link #getRessourcesAdministratives() <em>Ressources Administratives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessourcesAdministratives()
	 * @generated
	 * @ordered
	 */
	protected EList<Ressource> ressourcesAdministratives;

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
	 * The cached value of the '{@link #getSecretairepedagogique() <em>Secretairepedagogique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretairepedagogique()
	 * @generated
	 * @ordered
	 */
	protected SecretairePedagogique secretairepedagogique;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmPackage.Literals.FORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.FORMATION__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mention> getComposeDesMentions() {
		if (composeDesMentions == null) {
			composeDesMentions = new EObjectContainmentEList<Mention>(Mention.class, this,
					MmPackage.FORMATION__COMPOSE_DES_MENTIONS);
		}
		return composeDesMentions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ressource> getRessourcesAdministratives() {
		if (ressourcesAdministratives == null) {
			ressourcesAdministratives = new EObjectContainmentEList<Ressource>(Ressource.class, this,
					MmPackage.FORMATION__RESSOURCES_ADMINISTRATIVES);
		}
		return ressourcesAdministratives;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.FORMATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecretairePedagogique getSecretairepedagogique() {
		return secretairepedagogique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecretairepedagogique(SecretairePedagogique newSecretairepedagogique,
			NotificationChain msgs) {
		SecretairePedagogique oldSecretairepedagogique = secretairepedagogique;
		secretairepedagogique = newSecretairepedagogique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MmPackage.FORMATION__SECRETAIREPEDAGOGIQUE, oldSecretairepedagogique, newSecretairepedagogique);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecretairepedagogique(SecretairePedagogique newSecretairepedagogique) {
		if (newSecretairepedagogique != secretairepedagogique) {
			NotificationChain msgs = null;
			if (secretairepedagogique != null)
				msgs = ((InternalEObject) secretairepedagogique).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MmPackage.FORMATION__SECRETAIREPEDAGOGIQUE, null, msgs);
			if (newSecretairepedagogique != null)
				msgs = ((InternalEObject) newSecretairepedagogique).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MmPackage.FORMATION__SECRETAIREPEDAGOGIQUE, null, msgs);
			msgs = basicSetSecretairepedagogique(newSecretairepedagogique, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.FORMATION__SECRETAIREPEDAGOGIQUE,
					newSecretairepedagogique, newSecretairepedagogique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MmPackage.FORMATION__COMPOSE_DES_MENTIONS:
			return ((InternalEList<?>) getComposeDesMentions()).basicRemove(otherEnd, msgs);
		case MmPackage.FORMATION__RESSOURCES_ADMINISTRATIVES:
			return ((InternalEList<?>) getRessourcesAdministratives()).basicRemove(otherEnd, msgs);
		case MmPackage.FORMATION__SECRETAIREPEDAGOGIQUE:
			return basicSetSecretairepedagogique(null, msgs);
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
		case MmPackage.FORMATION__DESCRIPTION:
			return getDescription();
		case MmPackage.FORMATION__COMPOSE_DES_MENTIONS:
			return getComposeDesMentions();
		case MmPackage.FORMATION__RESSOURCES_ADMINISTRATIVES:
			return getRessourcesAdministratives();
		case MmPackage.FORMATION__NAME:
			return getName();
		case MmPackage.FORMATION__SECRETAIREPEDAGOGIQUE:
			return getSecretairepedagogique();
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
		case MmPackage.FORMATION__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case MmPackage.FORMATION__COMPOSE_DES_MENTIONS:
			getComposeDesMentions().clear();
			getComposeDesMentions().addAll((Collection<? extends Mention>) newValue);
			return;
		case MmPackage.FORMATION__RESSOURCES_ADMINISTRATIVES:
			getRessourcesAdministratives().clear();
			getRessourcesAdministratives().addAll((Collection<? extends Ressource>) newValue);
			return;
		case MmPackage.FORMATION__NAME:
			setName((String) newValue);
			return;
		case MmPackage.FORMATION__SECRETAIREPEDAGOGIQUE:
			setSecretairepedagogique((SecretairePedagogique) newValue);
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
		case MmPackage.FORMATION__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case MmPackage.FORMATION__COMPOSE_DES_MENTIONS:
			getComposeDesMentions().clear();
			return;
		case MmPackage.FORMATION__RESSOURCES_ADMINISTRATIVES:
			getRessourcesAdministratives().clear();
			return;
		case MmPackage.FORMATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MmPackage.FORMATION__SECRETAIREPEDAGOGIQUE:
			setSecretairepedagogique((SecretairePedagogique) null);
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
		case MmPackage.FORMATION__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case MmPackage.FORMATION__COMPOSE_DES_MENTIONS:
			return composeDesMentions != null && !composeDesMentions.isEmpty();
		case MmPackage.FORMATION__RESSOURCES_ADMINISTRATIVES:
			return ressourcesAdministratives != null && !ressourcesAdministratives.isEmpty();
		case MmPackage.FORMATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MmPackage.FORMATION__SECRETAIREPEDAGOGIQUE:
			return secretairepedagogique != null;
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
		result.append(" (description: ");
		result.append(description);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FormationImpl
