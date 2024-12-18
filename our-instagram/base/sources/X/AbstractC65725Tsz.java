package X;

import android.animation.AnimatorSet;

/* renamed from: X.Tsz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC65725Tsz {
    public static final void A03(XEX xex, Integer num) {
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 2) {
                A00(xex);
                return;
            }
        } else {
            C141596ac Blc = xex.Blc();
            if (Blc != null && !Blc.A0j) {
                xex.start();
                return;
            }
        }
        xex.EkX();
    }

    public static final void A00(XEX xex) {
        AnimatorSet Ac0 = xex.Ac0();
        if (Ac0 != null) {
            Ac0.cancel();
        }
        C141596ac Blc = xex.Blc();
        if (Blc != null) {
            Blc.A0j = false;
        }
    }

    public static final void A01(XEX xex) {
        AnimatorSet Ac0 = xex.Ac0();
        if (Ac0 != null) {
            Ac0.cancel();
        }
        xex.EhB();
        C141596ac Blc = xex.Blc();
        if (Blc != null) {
            Blc.A0j = true;
        }
    }

    public static final void A02(XEX xex) {
        AnimatorSet Ac0 = xex.Ac0();
        if (Ac0 == null) {
            xex.EPk();
            Ac0 = xex.Ac0();
        } else {
            Ac0.cancel();
        }
        xex.EK3();
        if (Ac0 != null) {
            Ac0.start();
        }
    }
}
