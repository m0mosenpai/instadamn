package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.J1m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43046J1m implements GZV {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C692539l A01;
    public final /* synthetic */ JG9 A02;

    public C43046J1m(FragmentActivity fragmentActivity, C692539l c692539l, JG9 jg9) {
        this.A01 = c692539l;
        this.A02 = jg9;
        this.A00 = fragmentActivity;
    }

    @Override // X.GZV
    public final void Dxy(String str) {
        if (this.A01.A00.isAdded()) {
            AbstractC63248Sg4.A00(this.A00);
            JG9 jg9 = this.A02;
            if (jg9 != null) {
                jg9.DI1(false, true);
            }
        }
    }

    @Override // X.GZV
    public final void Dy0(boolean z, boolean z2) {
        Fragment fragment = this.A01.A00;
        if (fragment.isAdded()) {
            AbstractC34859FXt.A01(fragment.requireContext(), C05F.A01, z, z2);
            JG9 jg9 = this.A02;
            if (jg9 != null) {
                jg9.DI1(false, true);
            }
        }
    }
}
