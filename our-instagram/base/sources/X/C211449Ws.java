package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.9Ws, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211449Ws extends AbstractC63223SfY implements InterfaceC65639Tq2, BCM {
    @Override // X.AbstractC63223SfY, X.InterfaceC65639Tq2
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        C3DN c3dn;
        FragmentActivity activity;
        InterfaceC172717mh interfaceC172717mh = this.A03;
        if (interfaceC172717mh != null && (activity = interfaceC172717mh.getActivity()) != null) {
            c3dn = C3DN.A00.A00(activity);
        } else {
            c3dn = null;
        }
        if (c3dn instanceof C3DP) {
            C3DP c3dp = (C3DP) c3dn;
            boolean z = true;
            if (!c3dp.A0g ? i2 != 0 : i2 != -1) {
                z = false;
            }
            ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0 = c3dp.A0D;
            if (viewOnTouchListenerC65896Tw0 != null) {
                int i5 = 2;
                if (z) {
                    i5 = 1;
                }
                viewOnTouchListenerC65896Tw0.A06 = i5;
            }
        }
    }
}
