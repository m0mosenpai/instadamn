package X;

import androidx.fragment.app.Fragment;

/* loaded from: classes11.dex */
public final class WbL implements InterfaceC58271PsP {
    public final C07T A00;
    public final InterfaceC52932ba A01;
    public final C018307d A02;
    public final /* synthetic */ Fragment A03;

    public WbL(Fragment fragment) {
        this.A03 = fragment;
        this.A02 = fragment.getViewModelStore();
        InterfaceC52932ba defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        C14360o3.A07(defaultViewModelProviderFactory);
        this.A01 = defaultViewModelProviderFactory;
        C0eR c0eR = fragment.mLifecycleRegistry;
        C14360o3.A07(c0eR);
        this.A00 = c0eR;
    }

    @Override // X.C07N
    public final /* synthetic */ AbstractC52972be getDefaultViewModelCreationExtras() {
        return C52962bd.A00;
    }

    @Override // X.C07N
    public final InterfaceC52932ba getDefaultViewModelProviderFactory() {
        return this.A01;
    }

    @Override // X.C07X
    public final C07T getLifecycle() {
        return this.A00;
    }

    @Override // X.InterfaceC08430c6
    public final C08U getSavedStateRegistry() {
        C08U c08u = this.A03.mSavedStateRegistryController.A01;
        C14360o3.A07(c08u);
        return c08u;
    }

    @Override // X.InterfaceC018407e
    public final C018307d getViewModelStore() {
        return this.A02;
    }
}
