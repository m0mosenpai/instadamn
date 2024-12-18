package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public abstract class CIZ {
    public static final void A00(C5Tl c5Tl, Modifier modifier, C7BZ c7bz, int i) {
        int i2;
        AbstractC167007dF.A1K(modifier, c7bz);
        c5Tl.Enr(-146602879);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, c7bz);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-519881358, "com.instagram.direct.messagethread.compose.BulkSelector (BulkSelector.kt:14)");
            }
            if (c7bz.A00 == 0) {
                Object AJX = c5Tl.AJX(COE.A00);
                boolean A1K = AbstractC25231BEo.A1K(i2) | AbstractC25227BEk.A1Z(c5Tl, AJX, -924961917);
                Object EEc = c5Tl.EEc();
                if (A1K || EEc == C5UI.A00) {
                    EEc = new C50363MLp(30, AJX, c7bz);
                    c5Tl.FBy(EEc);
                }
                AbstractC25225BEi.A1V(c5Tl, false);
                boolean z = c7bz.A02;
                CGE.A00(c5Tl, AbstractC25227BEk.A0M(modifier, 10.0f), null, (InterfaceC16660sJ) EEc, 0, 24, z, false);
            }
            if (C0fH.A02()) {
                C0fH.A00(819927161);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30510Dbt.A01(ASZ, modifier, c7bz, i, 14);
        }
    }
}
