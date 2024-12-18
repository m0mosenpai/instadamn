package X;

import android.view.View;
import android.view.Window;

/* loaded from: classes5.dex */
public class BZK extends BZL {
    @Override // X.BZM, X.InterfaceC30897DiA
    public final void EgP(View view, Window window, CS1 cs1, CS1 cs12, boolean z, boolean z2) {
        int i;
        int i2;
        AbstractC167007dF.A1K(cs1, cs12);
        boolean z3 = false;
        C04L.A00(window, false);
        if (cs1.A02 == 0) {
            i = 0;
        } else if (z) {
            i = cs1.A00;
        } else {
            i = cs1.A01;
        }
        window.setStatusBarColor(i);
        int i3 = cs12.A02;
        if (i3 == 0) {
            i2 = 0;
        } else if (z2) {
            i2 = cs12.A00;
        } else {
            i2 = cs12.A01;
        }
        window.setNavigationBarColor(i2);
        window.setStatusBarContrastEnforced(false);
        if (i3 == 0) {
            z3 = true;
        }
        window.setNavigationBarContrastEnforced(z3);
        AbstractC011704f abstractC011704f = new C011904h(view, window).A00;
        abstractC011704f.A05(!z);
        abstractC011704f.A04(!z2);
    }
}
