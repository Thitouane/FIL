/**
 */
package idm.mm.fil.mm.impl;

import idm.mm.fil.mm.MmPackage;
import idm.mm.fil.mm.Ressource;
import idm.mm.fil.mm.Semaine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semaine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link idm.mm.fil.mm.impl.SemaineImpl#getRessourcepedagogique <em>Ressourcepedagogique</em>}</li>
 *   <li>{@link idm.mm.fil.mm.impl.SemaineImpl#getDébut <em>Début</em>}</li>
 *   <li>{@link idm.mm.fil.mm.impl.SemaineImpl#getFin <em>Fin</em>}</li>
 *   <li>{@link idm.mm.fil.mm.impl.SemaineImpl#getRemarque <em>Remarque</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemaineImpl extends MinimalEObjectImpl.Container implements Semaine {
	/**
	 * The cached value of the '{@link #getRessourcepedagogique() <em>Ressourcepedagogique</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessourcepedagogique()
	 * @generated
	 * @ordered
	 */
	protected EList<Ressource> ressourcepedagogique;

	/**
	 * The default value of the '{@link #getDébut() <em>Début</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDébut()
	 * @generated
	 * @ordered
	 */
	protected static final String DÉBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDébut() <em>Début</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDébut()
	 * @generated
	 * @ordered
	 */
	protected String début = DÉBUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFin() <em>Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFin()
	 * @generated
	 * @ordered
	 */
	protected static final String FIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFin() <em>Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFin()
	 * @generated
	 * @ordered
	 */
	protected String fin = FIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemarque() <em>Remarque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarque()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARQUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemarque() <em>Remarque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarque()
	 * @generated
	 * @ordered
	 */
	protected String remarque = REMARQUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemaineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmPackage.Literals.SEMAINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ressource> getRessourcepedagogique() {
		if (ressourcepedagogique == null) {
			ressourcepedagogique = new EObjectResolvingEList<Ressource>(Ressource.class, this,
					MmPackage.SEMAINE__RESSOURCEPEDAGOGIQUE);
		}
		return ressourcepedagogique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDébut() {
		return début;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDébut(String newDébut) {
		String oldDébut = début;
		début = newDébut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.SEMAINE__DÉBUT, oldDébut, début));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFin() {
		return fin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFin(String newFin) {
		String oldFin = fin;
		fin = newFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.SEMAINE__FIN, oldFin, fin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemarque() {
		return remarque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemarque(String newRemarque) {
		String oldRemarque = remarque;
		remarque = newRemarque;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.SEMAINE__REMARQUE, oldRemarque, remarque));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MmPackage.SEMAINE__RESSOURCEPEDAGOGIQUE:
			return getRessourcepedagogique();
		case MmPackage.SEMAINE__DÉBUT:
			return getDébut();
		case MmPackage.SEMAINE__FIN:
			return getFin();
		case MmPackage.SEMAINE__REMARQUE:
			return getRemarque();
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
		case MmPackage.SEMAINE__RESSOURCEPEDAGOGIQUE:
			getRessourcepedagogique().clear();
			getRessourcepedagogique().addAll((Collection<? extends Ressource>) newValue);
			return;
		case MmPackage.SEMAINE__DÉBUT:
			setDébut((String) newValue);
			return;
		case MmPackage.SEMAINE__FIN:
			setFin((String) newValue);
			return;
		case MmPackage.SEMAINE__REMARQUE:
			setRemarque((String) newValue);
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
		case MmPackage.SEMAINE__RESSOURCEPEDAGOGIQUE:
			getRessourcepedagogique().clear();
			return;
		case MmPackage.SEMAINE__DÉBUT:
			setDébut(DÉBUT_EDEFAULT);
			return;
		case MmPackage.SEMAINE__FIN:
			setFin(FIN_EDEFAULT);
			return;
		case MmPackage.SEMAINE__REMARQUE:
			setRemarque(REMARQUE_EDEFAULT);
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
		case MmPackage.SEMAINE__RESSOURCEPEDAGOGIQUE:
			return ressourcepedagogique != null && !ressourcepedagogique.isEmpty();
		case MmPackage.SEMAINE__DÉBUT:
			return DÉBUT_EDEFAULT == null ? début != null : !DÉBUT_EDEFAULT.equals(début);
		case MmPackage.SEMAINE__FIN:
			return FIN_EDEFAULT == null ? fin != null : !FIN_EDEFAULT.equals(fin);
		case MmPackage.SEMAINE__REMARQUE:
			return REMARQUE_EDEFAULT == null ? remarque != null : !REMARQUE_EDEFAULT.equals(remarque);
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
		result.append(" (Début: ");
		result.append(début);
		result.append(", Fin: ");
		result.append(fin);
		result.append(", Remarque: ");
		result.append(remarque);
		result.append(')');
		return result.toString();
	}

} //SemaineImpl
