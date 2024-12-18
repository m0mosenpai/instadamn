package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public abstract class CHK {
    public static final void A00(C5Tl c5Tl, EnumC193878i8 enumC193878i8, InterfaceC16820sZ interfaceC16820sZ, int i) {
        int i2;
        boolean A1R = AbstractC167007dF.A1R(0, enumC193878i8, interfaceC16820sZ);
        c5Tl.Enr(972484889);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, enumC193878i8) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 91) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-663135468, "com.instagram.creation.genai.magicmod.common.ui.MagicModToolNuxOverlay (MagicModToolNuxOverlay.kt:23)");
            }
            Alignment alignment = C118195Wf.A09;
            C1130158n c1130158n = Modifier.A00;
            Modifier A0U = AbstractC25226BEj.A0U(c1130158n);
            boolean A1P = AbstractC25233BEq.A1P(c5Tl, -487779634, i2);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = DH4.A01(c5Tl, interfaceC16820sZ, 41);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A05 = C5XR.A05(A0U, null, null, (InterfaceC16820sZ) EEc, A1R);
            InterfaceC1127857k A00 = C5XX.A00(alignment, false);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A05);
            InterfaceC16820sZ interfaceC16820sZ2 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ2);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A00, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            InterfaceC118335Wv interfaceC118335Wv = AbstractC118255Wn.A02;
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A00;
            Modifier A07 = AbstractC118185Wd.A07(c1130158n.Eq3(AbstractC118185Wd.A00), 0.5f);
            InterfaceC1127857k A012 = AbstractC119595bH.A01(interfaceC118335Wv, c5Tl, interfaceC118245Wl);
            int A003 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A013 = C5X3.A01(c5Tl, A07);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A012, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            C5WR.A0T(c5Tl, AbstractC25227BEk.A0H(c1130158n, 6.0f), AbstractC25226BEj.A0e(c5Tl), AbstractC136736Hc.A00(c5Tl, enumC193878i8.A04), AbstractC25226BEj.A08(c5Tl));
            C5WR.A0x(c5Tl, AbstractC25226BEj.A0g(c5Tl), AbstractC136736Hc.A00(c5Tl, enumC193878i8.A03), AbstractC25226BEj.A08(c5Tl));
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(926706444);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30507Dbq.A01(ASZ, enumC193878i8, interfaceC16820sZ, i, 43);
        }
    }
}
