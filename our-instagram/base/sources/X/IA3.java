package X;

import androidx.fragment.app.FragmentActivity;

/* loaded from: classes7.dex */
public abstract class IA3 {
    public static final void A00(FragmentActivity fragmentActivity, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(fragmentActivity, 0);
        C3DN A0r = AbstractC31172DnG.A0r(fragmentActivity);
        if (A0r != null) {
            C3DP c3dp = (C3DP) A0r;
            if (c3dp.A0h) {
                c3dp.A0H = new GHK(13, fragmentActivity, interfaceC16660sJ);
                A0r.A0B();
                return;
            }
        }
        interfaceC16660sJ.invoke(fragmentActivity);
    }
}
