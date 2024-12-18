package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public abstract class CXW {
    public static final void A00(C5Tl c5Tl, Modifier modifier, C27958CUc c27958CUc, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C14360o3.A0B(c27958CUc, 0);
        c5Tl.Enr(918800866);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, c27958CUc) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, modifier);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-262558864, "com.instagram.barcelona.common.ui.toast.BdsToastHost (BdsToastHost.kt:26)");
            }
            Modifier A09 = AbstractC118175Wb.A09(modifier2, 16.0f);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A09);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0b, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C119645bN c119645bN = C119645bN.A00;
            C5Hc A002 = AbstractC133095zb.A00(c27958CUc.A01);
            c5Tl.Eno(271629923);
            int i5 = i3 & 14;
            boolean A1P = AbstractC167007dF.A1P(i5, 4);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = C30480DbP.A00(c27958CUc, 26);
                c5Tl.FBy(EEc);
            }
            InterfaceC16620sF A1C = AbstractC25225BEi.A1C(c117505Tk, EEc);
            boolean A1U = AbstractC25232BEp.A1U(c5Tl, 271632748, i5, 4);
            Object EEc2 = c5Tl.EEc();
            if (A1U || EEc2 == C5UI.A00) {
                EEc2 = AbstractC25229BEm.A0w(c5Tl, c27958CUc, 23);
            }
            InterfaceC16660sJ A1B = AbstractC25225BEi.A1B(c117505Tk, EEc2, false);
            C1130158n c1130158n = Modifier.A00;
            A01(c5Tl, AbstractC25225BEi.A0P(c119645bN, c1130158n), A1B, A1C, A002, 0, 0);
            C5Hc A003 = AbstractC133095zb.A00(c27958CUc.A00);
            boolean A1U2 = AbstractC25232BEp.A1U(c5Tl, 271640003, i5, 4);
            Object EEc3 = c5Tl.EEc();
            if (A1U2 || EEc3 == C5UI.A00) {
                EEc3 = C30480DbP.A00(c27958CUc, 27);
                c5Tl.FBy(EEc3);
            }
            InterfaceC16620sF A1C2 = AbstractC25225BEi.A1C(c117505Tk, EEc3);
            boolean A1U3 = AbstractC25232BEp.A1U(c5Tl, 271642828, i5, 4);
            Object EEc4 = c5Tl.EEc();
            if (A1U3 || EEc4 == C5UI.A00) {
                EEc4 = AbstractC25235BEs.A14(c5Tl, c27958CUc, 24);
            }
            A01(c5Tl, c119645bN.AB5(C118195Wf.A06, c1130158n), AbstractC25225BEi.A1B(c117505Tk, EEc4, false), A1C2, A003, 0, 0);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-2062596721);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30504Dbn.A01(modifier2, c27958CUc, i2, i, 13);
        }
    }

    public static final void A01(C5Tl c5Tl, Modifier modifier, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF, C5Hc c5Hc, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        c5Tl.Enr(1720887062);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, c5Hc) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16620sF);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0U(c5Tl, modifier2);
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-296302136, "com.instagram.barcelona.common.ui.toast.BdsToastMessages (BdsToastHost.kt:49)");
            }
            InterfaceC1127857k A02 = AbstractC119595bH.A02(AbstractC118255Wn.A00(), c5Tl, C118195Wf.A00, AbstractC25228BEl.A01(((i3 >> 9) & 14) | 432));
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, modifier2);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A02, A04);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            c5Tl.Eno(1277576340);
            for (CS5 cs5 : AbstractC001800i.A0Y(c5Hc)) {
                c5Tl.EnY(-1762786990, cs5);
                c5Tl.Eno(-1762785109);
                boolean z = true;
                boolean A1X = AbstractC25226BEj.A1X(c5Tl, cs5, AbstractC167007dF.A1P(i3 & 112, 32));
                Object EEc = c5Tl.EEc();
                if (A1X || EEc == C5UI.A00) {
                    EEc = AbstractC25230BEn.A12(c5Tl, cs5, interfaceC16620sF, 40);
                }
                InterfaceC16660sJ A1B = AbstractC25225BEi.A1B(c117505Tk, EEc, false);
                c5Tl.Eno(-1762783258);
                if ((i3 & 896) != 256) {
                    z = false;
                }
                boolean AH6 = c5Tl.AH6(cs5) | z;
                Object EEc2 = c5Tl.EEc();
                if (AH6 || EEc2 == C5UI.A00) {
                    EEc2 = new MHV(43, cs5, interfaceC16660sJ);
                    c5Tl.FBy(EEc2);
                }
                AbstractC27549CDu.A00(c5Tl, cs5, AbstractC25225BEi.A1A(c117505Tk, EEc2, false), A1B, 0);
                C117505Tk.A0L(c117505Tk, false);
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(-1632181526);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30492Dbb(interfaceC16660sJ, interfaceC16620sF, modifier2, c5Hc, i, i2, 7);
        }
    }
}
