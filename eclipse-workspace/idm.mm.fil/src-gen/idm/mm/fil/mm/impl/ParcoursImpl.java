/**
 */
package idm.mm.fil.mm.impl;

import idm.mm.fil.mm.MmPackage;
import idm.mm.fil.mm.Parcours;
import idm.mm.fil.mm.Professeur;
import idm.mm.fil.mm.Semestre;
import idm.mm.fil.mm.UE;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parcours</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link idm.mm.fil.mm.impl.ParcoursImpl#getSemestres <em>Semestres</em>}</li>
 *   <li>{@link idm.mm.fil.mm.impl.ParcoursImpl#getUeObligatoires <em>Ue Obligatoires</em>}</li>
 *   <li>{@link idm.mm.fil.mm.impl.ParcoursImpl#getUeOptionelles <em>Ue Optionelles</em>}</li>
 *   <li>{@link idm.mm.fil.mm.impl.ParcoursImpl#getName <em>Name</em>}</li>
 *   <li>{@link idm.mm.fil.mm.impl.ParcoursImpl#getResponsableParcours <em>Responsable Parcours</em>}</li>
 *   <li>{@link idm.mm.fil.mm.impl.ParcoursImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParcoursImpl extends MinimalEObjectImpl.Container implements Parcours {
	/**
	 * The cached value of the '{@link #getSemestres() <em>Semestres</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemestres()
	 * @generated
	 * @ordered
	 */
	protected EList<Semestre> semestres;

	/**
	 * The cached value of the '{@link #getUeObligatoires() <em>Ue Obligatoires</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUeObligatoires()
	 * @generated
	 * @ordered
	 */
	protected EList<UE> ueObligatoires;

	/**
	 * The cached value of the '{@link #getUeOptionelles() <em>Ue Optionelles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUeOptionelles()
	 * @generated
	 * @ordered
	 */
	protected EList<UE> ueOptionelles;

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
	 * The cached value of the '{@link #getResponsableParcours() <em>Responsable Parcours</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsableParcours()
	 * @generated
	 * @ordered
	 */
	protected Professeur responsableParcours;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParcoursImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmPackage.Literals.PARCOURS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semestre> getSemestres() {
		if (semestres == null) {
			semestres = new EObjectResolvingEList<Semestre>(Semestre.class, this, MmPackage.PARCOURS__SEMESTRES);
		}
		return semestres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UE> getUeObligatoires() {
		if (ueObligatoires == null) {
			ueObligatoires = new EObjectResolvingEList<UE>(UE.class, this, MmPackage.PARCOURS__UE_OBLIGATOIRES);
		}
		return ueObligatoires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UE> getUeOptionelles() {
		if (ueOptionelles == null) {
			ueOptionelles = new EObjectResolvingEList<UE>(UE.class, this, MmPackage.PARCOURS__UE_OPTIONELLES);
		}
		return ueOptionelles;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.PARCOURS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Professeur getResponsableParcours() {
		if (responsableParcours != null && responsableParcours.eIsProxy()) {
			InternalEObject oldResponsableParcours = (InternalEObject) responsableParcours;
			responsableParcours = (Professeur) eResolveProxy(oldResponsableParcours);
			if (responsableParcours != oldResponsableParcours) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MmPackage.PARCOURS__RESPONSABLE_PARCOURS,
							oldResponsableParcours, responsableParcours));
			}
		}
		return responsableParcours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Professeur basicGetResponsableParcours() {
		return responsableParcours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsableParcours(Professeur newResponsableParcours) {
		Professeur oldResponsableParcours = responsableParcours;
		responsableParcours = newResponsableParcours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.PARCOURS__RESPONSABLE_PARCOURS,
					oldResponsableParcours, responsableParcours));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.PARCOURS__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MmPackage.PARCOURS__SEMESTRES:
			return getSemestres();
		case MmPackage.PARCOURS__UE_OBLIGATOIRES:
			return getUeObligatoires();
		case MmPackage.PARCOURS__UE_OPTIONELLES:
			return getUeOptionelles();
		case MmPackage.PARCOURS__NAME:
			return getName();
		case MmPackage.PARCOURS__RESPONSABLE_PARCOURS:
			if (resolve)
				return getResponsableParcours();
			return basicGetResponsableParcours();
		case MmPackage.PARCOURS__DESCRIPTION:
			return getDescription();
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
		case MmPackage.PARCOURS__SEMESTRES:
			getSemestres().clear();
			getSemestres().addAll((Collection<? extends Semestre>) newValue);
			return;
		case MmPackage.PARCOURS__UE_OBLIGATOIRES:
			getUeObligatoires().clear();
			getUeObligatoires().addAll((Collection<? extends UE>) newValue);
			return;
		case MmPackage.PARCOURS__UE_OPTIONELLES:
			getUeOptionelles().clear();
			getUeOptionelles().addAll((Collection<? extends UE>) newValue);
			return;
		case MmPackage.PARCOURS__NAME:
			setName((String) newValue);
			return;
		case MmPackage.PARCOURS__RESPONSABLE_PARCOURS:
			setResponsableParcours((Professeur) newValue);
			return;
		case MmPackage.PARCOURS__DESCRIPTION:
			setDescription((String) newValue);
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
		case MmPackage.PARCOURS__SEMESTRES:
			getSemestres().clear();
			return;
		case MmPackage.PARCOURS__UE_OBLIGATOIRES:
			getUeObligatoires().clear();
			return;
		case MmPackage.PARCOURS__UE_OPTIONELLES:
			getUeOptionelles().clear();
			return;
		case MmPackage.PARCOURS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MmPackage.PARCOURS__RESPONSABLE_PARCOURS:
			setResponsableParcours((Professeur) null);
			return;
		case MmPackage.PARCOURS__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
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
		case MmPackage.PARCOURS__SEMESTRES:
			return semestres != null && !semestres.isEmpty();
		case MmPackage.PARCOURS__UE_OBLIGATOIRES:
			return ueObligatoires != null && !ueObligatoires.isEmpty();
		case MmPackage.PARCOURS__UE_OPTIONELLES:
			return ueOptionelles != null && !ueOptionelles.isEmpty();
		case MmPackage.PARCOURS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MmPackage.PARCOURS__RESPONSABLE_PARCOURS:
			return responsableParcours != null;
		case MmPackage.PARCOURS__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ParcoursImpl
