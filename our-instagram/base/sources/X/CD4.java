package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* loaded from: classes5.dex */
public abstract class CD4 {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, boolean z) {
        int i3;
        boolean z2 = z;
        Modifier modifier2 = modifier;
        C14360o3.A0B(interfaceC16820sZ, 0);
        c5Tl.Enr(1263336045);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, modifier2);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0d(c5Tl, z2);
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            z2 = AbstractC25226BEj.A1U(i5, z2);
            if (C0fH.A02()) {
                C0fH.A01(-1296042861, "com.instagram.aistudio.home.view.section.AiHomeLargeCreateCardSection (AiHomeLargeCreateCardSection.kt:35)");
            }
            C5WI A00 = C5WF.A00();
            boolean A1O = AbstractC25230BEn.A1O(12.0f);
            long j = AbstractC1132259k.A00;
            Modifier A01 = AbstractC28015CWn.A01(modifier2, A00, 12.0f, j, j, A1O);
            if (!z2) {
                A01 = A01.Eq3(AbstractC27468CAo.A00(Modifier.A00, 1.0f, false));
            }
            Modifier A08 = AbstractC118175Wb.A08(AbstractC25232BEp.A0x(c5Tl, AbstractC25235BEs.A0J(A01)), 24.0f);
            c5Tl.Eno(-291126617);
            int i6 = i3 & 14;
            boolean A1P = AbstractC167007dF.A1P(i6, 4);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = new C50157MDk(interfaceC16820sZ, 8);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A06 = C5XR.A06(A08, (InterfaceC16820sZ) EEc);
            InterfaceC1127857k A0e = AbstractC25228BEl.A0e(c5Tl);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A06);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0e, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A012);
            C2DC A003 = C5Y7.A00(c5Tl, R.drawable.instagram_illustrations_product_illustration_pi_plus_ai_home, 0);
            C1130158n c1130158n = Modifier.A00;
            C6LQ.A05(c5Tl, AbstractC118185Wd.A08(c1130158n, 160.0f), A003);
            C5WR.A07(c5Tl, AbstractC118185Wd.A08(AbstractC118175Wb.A0E(c1130158n, 0.0f, 12.0f, 0.0f, 8.0f), 28.0f), AbstractC25226BEj.A0d(c5Tl), C5YD.A00(c5Tl, 2131952650));
            AbstractC25235BEs.A1F(c5Tl, AbstractC25226BEj.A0c(c5Tl), C5YD.A00(c5Tl, 2131952649));
            c5Tl.Eno(1998465668);
            if (z2) {
                C6GE.A05(c5Tl, AbstractC118175Wb.A0E(AbstractC25226BEj.A0T(c1130158n), 0.0f, 24.0f, 0.0f, 0.0f), AbstractC25225BEi.A0u(c5Tl), C5YD.A00(c5Tl, 2131952632), interfaceC16820sZ, i6 | 1573248);
            }
            if (AbstractC25230BEn.A1U(c5Tl, A0K, false)) {
                C0fH.A00(835819811);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DTV(i, i2, 0, modifier2, interfaceC16820sZ, z2);
        }
    }
}
