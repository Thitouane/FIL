/**
 */
package idm.mm.fil.mm.provider;

import idm.mm.fil.mm.util.MmAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MmItemProviderAdapterFactory extends MmAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MmItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.mm.fil.mm.UE} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UEItemProvider ueItemProvider;

	/**
	 * This creates an adapter for a {@link idm.mm.fil.mm.UE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUEAdapter() {
		if (ueItemProvider == null) {
			ueItemProvider = new UEItemProvider(this);
		}

		return ueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.mm.fil.mm.Ressource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RessourceItemProvider ressourceItemProvider;

	/**
	 * This creates an adapter for a {@link idm.mm.fil.mm.Ressource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRessourceAdapter() {
		if (ressourceItemProvider == null) {
			ressourceItemProvider = new RessourceItemProvider(this);
		}

		return ressourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.mm.fil.mm.Semainier} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemainierItemProvider semainierItemProvider;

	/**
	 * This creates an adapter for a {@link idm.mm.fil.mm.Semainier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSemainierAdapter() {
		if (semainierItemProvider == null) {
			semainierItemProvider = new SemainierItemProvider(this);
		}

		return semainierItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.mm.fil.mm.Formation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormationItemProvider formationItemProvider;

	/**
	 * This creates an adapter for a {@link idm.mm.fil.mm.Formation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFormationAdapter() {
		if (formationItemProvider == null) {
			formationItemProvider = new FormationItemProvider(this);
		}

		return formationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.mm.fil.mm.Semestre} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemestreItemProvider semestreItemProvider;

	/**
	 * This creates an adapter for a {@link idm.mm.fil.mm.Semestre}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSemestreAdapter() {
		if (semestreItemProvider == null) {
			semestreItemProvider = new SemestreItemProvider(this);
		}

		return semestreItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.mm.fil.mm.FIL} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FILItemProvider filItemProvider;

	/**
	 * This creates an adapter for a {@link idm.mm.fil.mm.FIL}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFILAdapter() {
		if (filItemProvider == null) {
			filItemProvider = new FILItemProvider(this);
		}

		return filItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.mm.fil.mm.Mention} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MentionItemProvider mentionItemProvider;

	/**
	 * This creates an adapter for a {@link idm.mm.fil.mm.Mention}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMentionAdapter() {
		if (mentionItemProvider == null) {
			mentionItemProvider = new MentionItemProvider(this);
		}

		return mentionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.mm.fil.mm.Professeur} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfesseurItemProvider professeurItemProvider;

	/**
	 * This creates an adapter for a {@link idm.mm.fil.mm.Professeur}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProfesseurAdapter() {
		if (professeurItemProvider == null) {
			professeurItemProvider = new ProfesseurItemProvider(this);
		}

		return professeurItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.mm.fil.mm.SecretairePedagogique} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecretairePedagogiqueItemProvider secretairePedagogiqueItemProvider;

	/**
	 * This creates an adapter for a {@link idm.mm.fil.mm.SecretairePedagogique}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSecretairePedagogiqueAdapter() {
		if (secretairePedagogiqueItemProvider == null) {
			secretairePedagogiqueItemProvider = new SecretairePedagogiqueItemProvider(this);
		}

		return secretairePedagogiqueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.mm.fil.mm.Parcours} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParcoursItemProvider parcoursItemProvider;

	/**
	 * This creates an adapter for a {@link idm.mm.fil.mm.Parcours}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParcoursAdapter() {
		if (parcoursItemProvider == null) {
			parcoursItemProvider = new ParcoursItemProvider(this);
		}

		return parcoursItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.mm.fil.mm.Semaine} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemaineItemProvider semaineItemProvider;

	/**
	 * This creates an adapter for a {@link idm.mm.fil.mm.Semaine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSemaineAdapter() {
		if (semaineItemProvider == null) {
			semaineItemProvider = new SemaineItemProvider(this);
		}

		return semaineItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (ueItemProvider != null)
			ueItemProvider.dispose();
		if (ressourceItemProvider != null)
			ressourceItemProvider.dispose();
		if (semainierItemProvider != null)
			semainierItemProvider.dispose();
		if (formationItemProvider != null)
			formationItemProvider.dispose();
		if (semestreItemProvider != null)
			semestreItemProvider.dispose();
		if (filItemProvider != null)
			filItemProvider.dispose();
		if (mentionItemProvider != null)
			mentionItemProvider.dispose();
		if (professeurItemProvider != null)
			professeurItemProvider.dispose();
		if (secretairePedagogiqueItemProvider != null)
			secretairePedagogiqueItemProvider.dispose();
		if (parcoursItemProvider != null)
			parcoursItemProvider.dispose();
		if (semaineItemProvider != null)
			semaineItemProvider.dispose();
	}

}