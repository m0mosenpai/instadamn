package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.2xx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65612xx implements C2d4 {
    public final Fragment A00;
    public final FragmentActivity A01;

    public C65612xx(Fragment fragment, FragmentActivity fragmentActivity) {
        C14360o3.A0B(fragmentActivity, 1);
        C14360o3.A0B(fragment, 2);
        this.A01 = fragmentActivity;
        this.A00 = fragment;
    }

    @Override // X.C2d4
    public final C56352iT AYT() {
        C1UC c1uc = this.A01;
        if (c1uc instanceof C2d4) {
            return ((C2d4) c1uc).AYT();
        }
        return C56352iT.A0t.A05(this.A00);
    }
}
