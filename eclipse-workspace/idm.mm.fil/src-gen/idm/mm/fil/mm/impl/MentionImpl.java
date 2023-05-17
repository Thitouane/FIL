/**
 */
package idm.mm.fil.mm.impl;

import idm.mm.fil.mm.Mention;
import idm.mm.fil.mm.MmPackage;
import idm.mm.fil.mm.Parcours;
import idm.mm.fil.mm.Professeur;
import idm.mm.fil.mm.Ressource;
import idm.mm.fil.mm.Semestre;
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
 * An implementation of the model object '<em><b>Mention</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link idm.mm.fil.mm.impl.MentionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link idm.mm.fil.mm.impl.MentionImpl#getComposeDeSemestres <em>Compose De Semestres</em>}</li>
 *   <li>{@link idm.mm.fil.mm.impl.MentionImpl#getComposeDesParcours <em>Compose Des Parcours</em>}</li>
 *   <li>{@link idm.mm.fil.mm.impl.MentionImpl#getName <em>Name</em>}</li>
 *   <li>{@link idm.mm.fil.mm.impl.MentionImpl#getResponsableFormation <em>Responsable Formation</em>}</li>
 *   <li>{@link idm.mm.fil.mm.impl.MentionImpl#getRessourcepedagogique <em>Ressourcepedagogique</em>}</li>
 *   <li>{@link idm.mm.fil.mm.impl.MentionImpl#getRessourceadministrative <em>Ressourceadministrative</em>}</li>
 *   <li>{@link idm.mm.fil.mm.impl.MentionImpl#getUeOptionnelles <em>Ue Optionnelles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MentionImpl extends MinimalEObjectImpl.Container implements Mention {
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
	 * The cached value of the '{@link #getComposeDeSemestres() <em>Compose De Semestres</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposeDeSemestres()
	 * @generated
	 * @ordered
	 */
	protected EList<Semestre> composeDeSemestres;

	/**
	 * The cached value of the '{@link #getComposeDesParcours() <em>Compose Des Parcours</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposeDesParcours()
	 * @generated
	 * @ordered
	 */
	protected EList<Parcours> composeDesParcours;

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
	 * The cached value of the '{@link #getResponsableFormation() <em>Responsable Formation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsableFormation()
	 * @generated
	 * @ordered
	 */
	protected Professeur responsableFormation;

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
	 * The cached value of the '{@link #getRessourceadministrative() <em>Ressourceadministrative</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessourceadministrative()
	 * @generated
	 * @ordered
	 */
	protected EList<Ressource> ressourceadministrative;

	/**
	 * The cached value of the '{@link #getUeOptionnelles() <em>Ue Optionnelles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUeOptionnelles()
	 * @generated
	 * @ordered
	 */
	protected EList<UE> ueOptionnelles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MentionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmPackage.Literals.MENTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.MENTION__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semestre> getComposeDeSemestres() {
		if (composeDeSemestres == null) {
			composeDeSemestres = new EObjectContainmentEList<Semestre>(Semestre.class, this,
					MmPackage.MENTION__COMPOSE_DE_SEMESTRES);
		}
		return composeDeSemestres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parcours> getComposeDesParcours() {
		if (composeDesParcours == null) {
			composeDesParcours = new EObjectContainmentEList<Parcours>(Parcours.class, this,
					MmPackage.MENTION__COMPOSE_DES_PARCOURS);
		}
		return composeDesParcours;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.MENTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Professeur getResponsableFormation() {
		if (responsableFormation != null && responsableFormation.eIsProxy()) {
			InternalEObject oldResponsableFormation = (InternalEObject) responsableFormation;
			responsableFormation = (Professeur) eResolveProxy(oldResponsableFormation);
			if (responsableFormation != oldResponsableFormation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MmPackage.MENTION__RESPONSABLE_FORMATION,
							oldResponsableFormation, responsableFormation));
			}
		}
		return responsableFormation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Professeur basicGetResponsableFormation() {
		return responsableFormation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsableFormation(Professeur newResponsableFormation) {
		Professeur oldResponsableFormation = responsableFormation;
		responsableFormation = newResponsableFormation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.MENTION__RESPONSABLE_FORMATION,
					oldResponsableFormation, responsableFormation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ressource> getRessourcepedagogique() {
		if (ressourcepedagogique == null) {
			ressourcepedagogique = new EObjectContainmentEList<Ressource>(Ressource.class, this,
					MmPackage.MENTION__RESSOURCEPEDAGOGIQUE);
		}
		return ressourcepedagogique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ressource> getRessourceadministrative() {
		if (ressourceadministrative == null) {
			ressourceadministrative = new EObjectContainmentEList<Ressource>(Ressource.class, this,
					MmPackage.MENTION__RESSOURCEADMINISTRATIVE);
		}
		return ressourceadministrative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UE> getUeOptionnelles() {
		if (ueOptionnelles == null) {
			ueOptionnelles = new EObjectResolvingEList<UE>(UE.class, this, MmPackage.MENTION__UE_OPTIONNELLES);
		}
		return ueOptionnelles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MmPackage.MENTION__COMPOSE_DE_SEMESTRES:
			return ((InternalEList<?>) getComposeDeSemestres()).basicRemove(otherEnd, msgs);
		case MmPackage.MENTION__COMPOSE_DES_PARCOURS:
			return ((InternalEList<?>) getComposeDesParcours()).basicRemove(otherEnd, msgs);
		case MmPackage.MENTION__RESSOURCEPEDAGOGIQUE:
			return ((InternalEList<?>) getRessourcepedagogique()).basicRemove(otherEnd, msgs);
		case MmPackage.MENTION__RESSOURCEADMINISTRATIVE:
			return ((InternalEList<?>) getRessourceadministrative()).basicRemove(otherEnd, msgs);
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
		case MmPackage.MENTION__DESCRIPTION:
			return getDescription();
		case MmPackage.MENTION__COMPOSE_DE_SEMESTRES:
			return getComposeDeSemestres();
		case MmPackage.MENTION__COMPOSE_DES_PARCOURS:
			return getComposeDesParcours();
		case MmPackage.MENTION__NAME:
			return getName();
		case MmPackage.MENTION__RESPONSABLE_FORMATION:
			if (resolve)
				return getResponsableFormation();
			return basicGetResponsableFormation();
		case MmPackage.MENTION__RESSOURCEPEDAGOGIQUE:
			return getRessourcepedagogique();
		case MmPackage.MENTION__RESSOURCEADMINISTRATIVE:
			return getRessourceadministrative();
		case MmPackage.MENTION__UE_OPTIONNELLES:
			return getUeOptionnelles();
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
		case MmPackage.MENTION__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case MmPackage.MENTION__COMPOSE_DE_SEMESTRES:
			getComposeDeSemestres().clear();
			getComposeDeSemestres().addAll((Collection<? extends Semestre>) newValue);
			return;
		case MmPackage.MENTION__COMPOSE_DES_PARCOURS:
			getComposeDesParcours().clear();
			getComposeDesParcours().addAll((Collection<? extends Parcours>) newValue);
			return;
		case MmPackage.MENTION__NAME:
			setName((String) newValue);
			return;
		case MmPackage.MENTION__RESPONSABLE_FORMATION:
			setResponsableFormation((Professeur) newValue);
			return;
		case MmPackage.MENTION__RESSOURCEPEDAGOGIQUE:
			getRessourcepedagogique().clear();
			getRessourcepedagogique().addAll((Collection<? extends Ressource>) newValue);
			return;
		case MmPackage.MENTION__RESSOURCEADMINISTRATIVE:
			getRessourceadministrative().clear();
			getRessourceadministrative().addAll((Collection<? extends Ressource>) newValue);
			return;
		case MmPackage.MENTION__UE_OPTIONNELLES:
			getUeOptionnelles().clear();
			getUeOptionnelles().addAll((Collection<? extends UE>) newValue);
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
		case MmPackage.MENTION__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case MmPackage.MENTION__COMPOSE_DE_SEMESTRES:
			getComposeDeSemestres().clear();
			return;
		case MmPackage.MENTION__COMPOSE_DES_PARCOURS:
			getComposeDesParcours().clear();
			return;
		case MmPackage.MENTION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MmPackage.MENTION__RESPONSABLE_FORMATION:
			setResponsableFormation((Professeur) null);
			return;
		case MmPackage.MENTION__RESSOURCEPEDAGOGIQUE:
			getRessourcepedagogique().clear();
			return;
		case MmPackage.MENTION__RESSOURCEADMINISTRATIVE:
			getRessourceadministrative().clear();
			return;
		case MmPackage.MENTION__UE_OPTIONNELLES:
			getUeOptionnelles().clear();
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
		case MmPackage.MENTION__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case MmPackage.MENTION__COMPOSE_DE_SEMESTRES:
			return composeDeSemestres != null && !composeDeSemestres.isEmpty();
		case MmPackage.MENTION__COMPOSE_DES_PARCOURS:
			return composeDesParcours != null && !composeDesParcours.isEmpty();
		case MmPackage.MENTION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MmPackage.MENTION__RESPONSABLE_FORMATION:
			return responsableFormation != null;
		case MmPackage.MENTION__RESSOURCEPEDAGOGIQUE:
			return ressourcepedagogique != null && !ressourcepedagogique.isEmpty();
		case MmPackage.MENTION__RESSOURCEADMINISTRATIVE:
			return ressourceadministrative != null && !ressourceadministrative.isEmpty();
		case MmPackage.MENTION__UE_OPTIONNELLES:
			return ueOptionnelles != null && !ueOptionnelles.isEmpty();
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

} //MentionImpl
