package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public abstract class CEJ {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i, int i2, boolean z) {
        int i3;
        long A02;
        Modifier modifier2 = modifier;
        AbstractC167007dF.A1K(interfaceC16820sZ, interfaceC16820sZ2);
        c5Tl.Enr(524625757);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0d(c5Tl, z);
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if ((i2 & 8) != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1135171025, "com.instagram.barcelona.feed.post.ui.PostHushControl (PostHushControl.kt:29)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A00 = C6HP.A00(AbstractC25226BEj.A0T(c1130158n), 0.0f, z);
            A02 = C5AC.A02(AbstractC1132459m.A0K[(int) (r2 & 63)], C1132359l.A03(r2), C1132359l.A02(r2), C1132359l.A01(AbstractC25226BEj.A09(c5Tl)), 0.7f);
            Modifier A0X = AbstractC25226BEj.A0X(A00, A02);
            InterfaceC1127857k A0f = AbstractC25228BEl.A0f(c5Tl, 0);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0X);
            InterfaceC16820sZ interfaceC16820sZ3 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ3);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0f, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            C6L0 c6l0 = C6L0.A00;
            Modifier A03 = AbstractC118175Wb.A03(c6l0.A00(c1130158n));
            long A0M = AbstractC25226BEj.A0M(c5Tl);
            C5XL.A02(c5Tl);
            C5WI c5wi = C5WE.A01;
            Modifier A032 = C6L7.A03(A03, c5wi, 0.0f, A0M);
            boolean A1Y = AbstractC25234BEr.A1Y(c5Tl, 1348794178, i3);
            Object EEc = c5Tl.EEc();
            if (A1Y || EEc == C5UI.A00) {
                EEc = AbstractC25230BEn.A0y(c5Tl, interfaceC16820sZ2, 5);
            }
            Modifier A0H = AbstractC25235BEs.A0H(c5Tl, c117505Tk, A032, EEc);
            Alignment alignment = C118195Wf.A0E;
            InterfaceC1127857k A003 = C5XX.A00(alignment, false);
            int A004 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A0H);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ3);
            C5XJ.A00(c5Tl, A003, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            String A005 = C5YD.A00(c5Tl, 2131953736);
            C118125Vw A0h = AbstractC25226BEj.A0h(c5Tl);
            Modifier A0U = AbstractC25226BEj.A0U(c1130158n);
            C5WR.A04(c5Tl, AbstractC118175Wb.A03(A0U), A0h, A005);
            c5Tl.ASW();
            Modifier A033 = AbstractC118175Wb.A03(c6l0.A00(c1130158n));
            long A0M2 = AbstractC25226BEj.A0M(c5Tl);
            C5XL.A02(c5Tl);
            Modifier A034 = C6L7.A03(A033, c5wi, 0.0f, A0M2);
            boolean A1X = AbstractC25234BEr.A1X(c5Tl, 1348816704, i3);
            Object EEc2 = c5Tl.EEc();
            if (A1X || EEc2 == C5UI.A00) {
                EEc2 = new C50155MDi(interfaceC16820sZ, 6);
                c5Tl.FBy(EEc2);
            }
            Modifier A0H2 = AbstractC25235BEs.A0H(c5Tl, c117505Tk, A034, EEc2);
            InterfaceC1127857k A006 = C5XX.A00(alignment, false);
            int A007 = C5X2.A00(c5Tl);
            C59P A043 = C117505Tk.A04(c117505Tk);
            Modifier A013 = C5X3.A01(c5Tl, A0H2);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ3);
            C5XJ.A00(c5Tl, A006, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A007)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A007);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            String A008 = C5YD.A00(c5Tl, 2131953737);
            C5WR.A04(c5Tl, AbstractC118175Wb.A03(A0U), AbstractC25226BEj.A0h(c5Tl), A008);
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(1134649420);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUI(interfaceC16820sZ2, interfaceC16820sZ, modifier2, i, i2, 3, z);
        }
    }
}
