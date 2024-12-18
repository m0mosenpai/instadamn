package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.GIt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36770GIt implements InterfaceC37268GbL {
    public final FragmentActivity A00;

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (C14360o3.A0K(cls2, cls)) {
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.userblock.ui.BlockMutationActivityHost");
                if (!C14360o3.A0K(this.A00, ((C36770GIt) obj).A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC37268GbL
    public final AbstractC10360h2 B8S() {
        return AbstractC31172DnG.A0D(this.A00);
    }

    @Override // X.InterfaceC37268GbL
    public final boolean CcF(boolean z) {
        return !this.A00.getSupportFragmentManager().A11();
    }

    @Override // X.InterfaceC37268GbL
    public final C07T getLifecycle() {
        return this.A00.getLifecycle();
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C36770GIt(FragmentActivity fragmentActivity) {
        this.A00 = fragmentActivity;
    }

    @Override // X.InterfaceC37268GbL
    public final Context getContext() {
        return this.A00;
    }
}
