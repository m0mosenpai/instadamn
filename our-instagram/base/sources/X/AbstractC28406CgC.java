package X;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: X.CgC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28406CgC {
    public static final int A00(C2Z1 c2z1, C88 c88) {
        AbstractC167017dG.A1N(c2z1, c88);
        InterfaceC30923Dia A01 = AbstractC28337CeP.A01(c2z1);
        return C28351CfB.A00(A01).EKE(c88, A01.CSM());
    }

    public static final int A01(C2Z1 c2z1, Integer num) {
        return C28351CfB.A00(AbstractC28337CeP.A00(c2z1)).EKF(num);
    }

    public static long A02(C2Z1 c2z1, Integer num) {
        return Double.doubleToRawLongBits(A01(c2z1, num));
    }

    public static final Drawable A03(C2Z1 c2z1, C87 c87, C87 c872, Integer num) {
        boolean A1a = AbstractC167017dG.A1a(c2z1, c87);
        Object A06 = c2z1.ArD().A06(CWA.class);
        if (A06 != null) {
            InterfaceC31003Dk2 interfaceC31003Dk2 = ((CWA) A06).A01;
            boolean z = true;
            if (AbstractC25229BEm.A0O(c2z1).getConfiguration().getLayoutDirection() != A1a) {
                z = false;
            }
            if (c872 != null && z) {
                c87 = c872;
            }
            int BEs = interfaceC31003Dk2.BEs(c87);
            Drawable drawable = AbstractC77363dM.A00(c2z1).getDrawable(BEs);
            if (drawable != null) {
                if (num != null) {
                    Drawable mutate = drawable.mutate();
                    AbstractC25228BEl.A1H(PorterDuff.Mode.SRC_IN, mutate, num.intValue());
                    return mutate;
                }
                return drawable;
            }
            throw AbstractC166987dD.A14(AnonymousClass001.A0O("Unable to find the drawable for icon ", BEs));
        }
        throw AbstractC166997dE.A0g();
    }
}
