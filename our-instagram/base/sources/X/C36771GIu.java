package X;

import android.content.Context;
import androidx.fragment.app.Fragment;

/* renamed from: X.GIu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36771GIu implements InterfaceC37268GbL {
    public final Fragment A00;

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && AbstractC167017dG.A1Z(this, obj) && C14360o3.A0K(this.A00, ((C36771GIu) obj).A00));
    }

    @Override // X.InterfaceC37268GbL
    public final AbstractC10360h2 B8S() {
        AbstractC10360h2 childFragmentManager = this.A00.getChildFragmentManager();
        C14360o3.A07(childFragmentManager);
        return childFragmentManager;
    }

    @Override // X.InterfaceC37268GbL
    public final boolean CcF(boolean z) {
        Fragment fragment = this.A00;
        if (z) {
            return fragment.isAdded();
        }
        if (fragment.isAdded() && !fragment.isStateSaved()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC37268GbL
    public final Context getContext() {
        return this.A00.requireContext();
    }

    @Override // X.InterfaceC37268GbL
    public final C07T getLifecycle() {
        C0eR c0eR = this.A00.mLifecycleRegistry;
        C14360o3.A07(c0eR);
        return c0eR;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C36771GIu(Fragment fragment) {
        this.A00 = fragment;
    }
}
