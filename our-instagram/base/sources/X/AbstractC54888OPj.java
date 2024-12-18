package X;

import android.view.View;

/* renamed from: X.OPj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54888OPj {
    public static final void A00(View view, int i) {
        if (i != 0) {
            if (i != 4) {
                if (i == 8) {
                    AbstractC166997dE.A1L(view, true);
                    return;
                }
                return;
            }
            AbstractC125325le.A06(new View[]{view}, true);
            return;
        }
        AbstractC167007dF.A0y(view, true);
    }

    public static final void A01(View view, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        C14360o3.A0B(view, 0);
        PHM phm = new PHM(interfaceC16820sZ, 5);
        if (z) {
            AbstractC125325le.A04(phm, new View[]{view}, true);
        } else {
            AbstractC125325le.A03(view, phm, 8, true);
        }
    }
}
