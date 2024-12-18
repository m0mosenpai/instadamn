package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public abstract class CJX {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, int i) {
        int i2;
        AbstractC167007dF.A1K(interfaceC16820sZ, modifier);
        c5Tl.Enr(-1419332918);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, modifier);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(256535391, "com.instagram.opal.impl.ui.OpalDelightAnimationContent (OpalDelightAnimationContent.kt:21)");
            }
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) C6M6.A00(c5Tl, null, DDT.A00, new Object[0], 3072, 6);
            if (AbstractC25230BEn.A1X(interfaceC74953Yl)) {
                C30107DOp c30107DOp = C30107DOp.A00;
                boolean A1S = AbstractC25228BEl.A1S(i2) | AbstractC25227BEk.A1Y(c5Tl, interfaceC74953Yl, -1945777938);
                Object EEc = c5Tl.EEc();
                if (A1S || EEc == C5UI.A00) {
                    EEc = new C50362MLo(48, interfaceC16820sZ, interfaceC74953Yl);
                    c5Tl.FBy(EEc);
                }
                AbstractC25225BEi.A1V(c5Tl, false);
                AbstractC28450Cgz.A02(c5Tl, modifier, c30107DOp, (InterfaceC16660sJ) EEc, (i2 & 112) | 6, 0);
            }
            if (C0fH.A02()) {
                C0fH.A00(-54208761);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30510Dbt.A01(ASZ, interfaceC16820sZ, modifier, i, 38);
        }
    }
}
