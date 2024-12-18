package X;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.0jz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12000jz implements InterfaceC018407e, C07N, InterfaceC08430c6 {
    public C0eR A00 = null;
    public C08W A01 = null;
    public InterfaceC52932ba A02;
    public final Fragment A03;
    public final C018307d A04;
    public final Runnable A05;

    public final void A00() {
        if (this.A00 == null) {
            this.A00 = new C0eR(this, true);
            C08W c08w = new C08W(this);
            this.A01 = c08w;
            c08w.A00();
            this.A05.run();
        }
    }

    @Override // X.C07N
    public final AbstractC52972be getDefaultViewModelCreationExtras() {
        Fragment fragment = this.A03;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                applicationContext = null;
                break;
            }
        }
        C52992bg c52992bg = new C52992bg();
        if (applicationContext != null) {
            c52992bg.A01(C53432cR.A02, applicationContext);
        }
        c52992bg.A01(AbstractC51872Zl.A01, fragment);
        c52992bg.A01(AbstractC51872Zl.A02, this);
        Bundle bundle = fragment.mArguments;
        if (bundle != null) {
            c52992bg.A01(AbstractC51872Zl.A00, bundle);
        }
        return c52992bg;
    }

    @Override // X.C07N
    public final InterfaceC52932ba getDefaultViewModelProviderFactory() {
        Fragment fragment = this.A03;
        InterfaceC52932ba defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (defaultViewModelProviderFactory.equals(fragment.mDefaultFactory)) {
            defaultViewModelProviderFactory = this.A02;
            if (defaultViewModelProviderFactory == null) {
                Application application = null;
                Context applicationContext = fragment.requireContext().getApplicationContext();
                while (true) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        break;
                    }
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    }
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                }
                defaultViewModelProviderFactory = new C152386tO(application, fragment.mArguments, fragment);
            }
            return defaultViewModelProviderFactory;
        }
        this.A02 = defaultViewModelProviderFactory;
        return defaultViewModelProviderFactory;
    }

    public C12000jz(Fragment fragment, C018307d c018307d, Runnable runnable) {
        this.A03 = fragment;
        this.A04 = c018307d;
        this.A05 = runnable;
    }

    @Override // X.C07X
    public final C07T getLifecycle() {
        A00();
        return this.A00;
    }

    @Override // X.InterfaceC08430c6
    public final C08U getSavedStateRegistry() {
        A00();
        return this.A01.A01;
    }

    @Override // X.InterfaceC018407e
    public final C018307d getViewModelStore() {
        A00();
        return this.A04;
    }
}
