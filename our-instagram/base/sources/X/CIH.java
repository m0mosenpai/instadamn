package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public abstract class CIH {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, int i3, int i4) {
        int i5;
        InterfaceC16820sZ interfaceC16820sZ2 = interfaceC16820sZ;
        Modifier modifier2 = modifier;
        c5Tl.Enr(1700712600);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = AbstractC25232BEp.A08(c5Tl, i) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= AbstractC25232BEp.A09(c5Tl, i2);
        }
        int i6 = i4 & 4;
        if (i6 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i5 |= AbstractC25232BEp.A0T(c5Tl, modifier2);
        }
        int i7 = i4 & 8;
        if (i7 != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i5 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ2);
        }
        if ((i5 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i7 != 0) {
                interfaceC16820sZ2 = C29770DBo.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1540638160, "com.instagram.creator.agent.settings.improveai.ImproveAiCard (ImproveAiCard.kt:32)");
            }
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            Modifier A0Q = AbstractC25225BEi.A0Q(AbstractC118185Wd.A01(interfaceC118225Wj, modifier2));
            C5WI A01 = C5WF.A01(16.0f);
            long j = AbstractC1132259k.A00;
            Modifier A08 = AbstractC118175Wb.A08(AbstractC25228BEl.A0Z(AbstractC28015CWn.A01(A0Q, A01, 4.0f, j, j, true), 16.0f, AbstractC25226BEj.A06(c5Tl)), 16.0f);
            boolean A1R = AbstractC25233BEq.A1R(c5Tl, 2141999576, i5);
            Object EEc = c5Tl.EEc();
            if (A1R || EEc == C5UI.A00) {
                EEc = C29908DGw.A01(c5Tl, interfaceC16820sZ2, 46);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A05 = C5XR.A05(A08, null, null, (InterfaceC16820sZ) EEc, true);
            InterfaceC1127857k A0V = AbstractC25225BEi.A0V(c5Tl, interfaceC118225Wj);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A05);
            InterfaceC16820sZ interfaceC16820sZ3 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ3);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0V, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A012);
            C6L0 c6l0 = C6L0.A00;
            C1130158n c1130158n = Modifier.A00;
            Modifier A002 = c6l0.A00(c1130158n);
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A003 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A013 = C5X3.A01(c5Tl, A002);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ3);
            C5XJ.A00(c5Tl, A0Y, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            C5WR.A0s(c5Tl, AbstractC25225BEi.A0X(c5Tl), C5YD.A00(c5Tl, 2131964355), 16370, AbstractC25226BEj.A0G(c5Tl), AbstractC118155Vz.A01(16));
            C5WR.A0L(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 4.0f, 0.0f, 0.0f), AbstractC25225BEi.A0Y(c5Tl), C5YD.A00(c5Tl, 2131964354), 3120, 16368, AbstractC25226BEj.A0M(c5Tl), AbstractC118155Vz.A01(12));
            c5Tl.ASW();
            CGW.A00(c5Tl, AbstractC118185Wd.A0C(c1130158n, 70.0f), null, C5YD.A01(c5Tl, AbstractC25228BEl.A1Z(Integer.valueOf(i), i2), 2131964357), C5YD.A00(c5Tl, 2131964356), i / i2, 0.0f, 6.0f, 918749232, 12, 0L, AbstractC118155Vz.A01(14), AbstractC118155Vz.A01(8));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1889082272);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUC(modifier2, interfaceC16820sZ2, i, i2, i3, i4, 1);
        }
    }
}
