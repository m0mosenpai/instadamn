package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes6.dex */
public final class GJH implements InterfaceC37142GYd {
    public final int A00;
    public final Object A01;

    public GJH(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC37142GYd
    public final void Dy6(String str) {
        switch (this.A00) {
            case 0:
                GIQ giq = (GIQ) this.A01;
                FDP.A00(giq.A00, giq.A01, giq.A02, giq.A05.getUsername());
                return;
            case 1:
                C28189Cbd c28189Cbd = (C28189Cbd) this.A01;
                FragmentActivity fragmentActivity = c28189Cbd.A02;
                FDP.A00(fragmentActivity, fragmentActivity, c28189Cbd.A06, c28189Cbd.A09.getUsername());
                return;
            default:
                Fragment fragment = (Fragment) this.A01;
                if (fragment.isResumed()) {
                    C9GR.A07(fragment.getContext(), 2131952099);
                    return;
                }
                return;
        }
    }
}
