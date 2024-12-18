package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public abstract class CD7 {
    public static final void A00(C5Tl c5Tl, C28370CfW c28370CfW, String str, InterfaceC16820sZ interfaceC16820sZ, int i) {
        int i2;
        C14360o3.A0B(str, 0);
        AbstractC167017dG.A1P(c28370CfW, interfaceC16820sZ);
        c5Tl.Enr(336922696);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, c28370CfW);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(73438518, "com.instagram.aistudio.home.view.section.AiHomeSearchBarSection (AiHomeSearchBarSection.kt:27)");
            }
            boolean A06 = C18U.A06(C06090Tz.A05, AbstractC25229BEm.A0d(c5Tl), 36325081046266584L);
            CXP.A01(c5Tl, c28370CfW, "home", AbstractC25225BEi.A03(i2));
            Modifier A0Q = AbstractC25225BEi.A0Q(AbstractC25232BEp.A0y(c5Tl, Modifier.A00));
            float f = 12.0f;
            if (A06) {
                f = 0.0f;
            }
            Modifier A0E = AbstractC118175Wb.A0E(A0Q, 0.0f, 12.0f, 0.0f, f);
            boolean A1Q = AbstractC25233BEq.A1Q(c5Tl, 108145475, i2);
            Object EEc = c5Tl.EEc();
            if (A1Q || EEc == C5UI.A00) {
                EEc = new C50157MDk(interfaceC16820sZ, 9);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A062 = C5XR.A06(A0E, (InterfaceC16820sZ) EEc);
            c5Tl.Eno(108147094);
            boolean A1R = AbstractC25228BEl.A1R(i2);
            Object EEc2 = c5Tl.EEc();
            if (A1R || EEc2 == C5UI.A00) {
                EEc2 = new C50361MLn(str, 11);
                c5Tl.FBy(EEc2);
            }
            AbstractC28450Cgz.A02(c5Tl, A062, AbstractC25225BEi.A1B(A0K, EEc2, false), DKP.A00, 384, 0);
            if (C0fH.A02()) {
                C0fH.A00(676320013);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DT4(interfaceC16820sZ, c28370CfW, str, i, 0);
        }
    }
}
