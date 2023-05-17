/**
 */
package idm.mm.fil.mm.impl;

import idm.mm.fil.mm.MmPackage;
import idm.mm.fil.mm.Professeur;
import idm.mm.fil.mm.Ressource;
import idm.mm.fil.mm.Semainier;
import idm.mm.fil.mm.UE;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link idm.mm.fil.mm.impl.UEImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link idm.mm.fil.mm.impl.UEImpl#getSemainier <em>Semainier</em>}</li>
 *   <li>{@link idm.mm.fil.mm.impl.UEImpl#getRessourcepedagogique <em>Ressourcepedagogique</em>}</li>
 *   <li>{@link idm.mm.fil.mm.impl.UEImpl#getName <em>Name</em>}</li>
 *   <li>{@link idm.mm.fil.mm.impl.UEImpl#getEnseignants <em>Enseignants</em>}</li>
 *   <li>{@link idm.mm.fil.mm.impl.UEImpl#getNbECTS <em>Nb ECTS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UEImpl extends MinimalEObjectImpl.Container implements UE {
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
	 * The cached value of the '{@link #getSemainier() <em>Semainier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemainier()
	 * @generated
	 * @ordered
	 */
	protected EList<Semainier> semainier;

	/**
	 * The cached value of the '{@link #getRessourcepedagogique() <em>Ressourcepedagogique</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessourcepedagogique()
	 * @generated
	 * @ordered
	 */
	protected EList<Ressource> ressourcepedagogique;

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
	 * The cached value of the '{@link #getEnseignants() <em>Enseignants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnseignants()
	 * @generated
	 * @ordered
	 */
	protected EList<Professeur> enseignants;

	/**
	 * The default value of the '{@link #getNbECTS() <em>Nb ECTS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbECTS()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_ECTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbECTS() <em>Nb ECTS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbECTS()
	 * @generated
	 * @ordered
	 */
	protected int nbECTS = NB_ECTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmPackage.Literals.UE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.UE__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semainier> getSemainier() {
		if (semainier == null) {
			semainier = new EObjectContainmentEList<Semainier>(Semainier.class, this, MmPackage.UE__SEMAINIER);
		}
		return semainier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ressource> getRessourcepedagogique() {
		if (ressourcepedagogique == null) {
			ressourcepedagogique = new EObjectContainmentEList<Ressource>(Ressource.class, this,
					MmPackage.UE__RESSOURCEPEDAGOGIQUE);
		}
		return ressourcepedagogique;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.UE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Professeur> getEnseignants() {
		if (enseignants == null) {
			enseignants = new EObjectResolvingEList<Professeur>(Professeur.class, this, MmPackage.UE__ENSEIGNANTS);
		}
		return enseignants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbECTS() {
		return nbECTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbECTS(int newNbECTS) {
		int oldNbECTS = nbECTS;
		nbECTS = newNbECTS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.UE__NB_ECTS, oldNbECTS, nbECTS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MmPackage.UE__SEMAINIER:
			return ((InternalEList<?>) getSemainier()).basicRemove(otherEnd, msgs);
		case MmPackage.UE__RESSOURCEPEDAGOGIQUE:
			return ((InternalEList<?>) getRessourcepedagogique()).basicRemove(otherEnd, msgs);
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
		case MmPackage.UE__DESCRIPTION:
			return getDescription();
		case MmPackage.UE__SEMAINIER:
			return getSemainier();
		case MmPackage.UE__RESSOURCEPEDAGOGIQUE:
			return getRessourcepedagogique();
		case MmPackage.UE__NAME:
			return getName();
		case MmPackage.UE__ENSEIGNANTS:
			return getEnseignants();
		case MmPackage.UE__NB_ECTS:
			return getNbECTS();
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
		case MmPackage.UE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case MmPackage.UE__SEMAINIER:
			getSemainier().clear();
			getSemainier().addAll((Collection<? extends Semainier>) newValue);
			return;
		case MmPackage.UE__RESSOURCEPEDAGOGIQUE:
			getRessourcepedagogique().clear();
			getRessourcepedagogique().addAll((Collection<? extends Ressource>) newValue);
			return;
		case MmPackage.UE__NAME:
			setName((String) newValue);
			return;
		case MmPackage.UE__ENSEIGNANTS:
			getEnseignants().clear();
			getEnseignants().addAll((Collection<? extends Professeur>) newValue);
			return;
		case MmPackage.UE__NB_ECTS:
			setNbECTS((Integer) newValue);
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
		case MmPackage.UE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case MmPackage.UE__SEMAINIER:
			getSemainier().clear();
			return;
		case MmPackage.UE__RESSOURCEPEDAGOGIQUE:
			getRessourcepedagogique().clear();
			return;
		case MmPackage.UE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MmPackage.UE__ENSEIGNANTS:
			getEnseignants().clear();
			return;
		case MmPackage.UE__NB_ECTS:
			setNbECTS(NB_ECTS_EDEFAULT);
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
		case MmPackage.UE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case MmPackage.UE__SEMAINIER:
			return semainier != null && !semainier.isEmpty();
		case MmPackage.UE__RESSOURCEPEDAGOGIQUE:
			return ressourcepedagogique != null && !ressourcepedagogique.isEmpty();
		case MmPackage.UE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MmPackage.UE__ENSEIGNANTS:
			return enseignants != null && !enseignants.isEmpty();
		case MmPackage.UE__NB_ECTS:
			return nbECTS != NB_ECTS_EDEFAULT;
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
		result.append(", nbECTS: ");
		result.append(nbECTS);
		result.append(')');
		return result.toString();
	}

} //UEImpl
