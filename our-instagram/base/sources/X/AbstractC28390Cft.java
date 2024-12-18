package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.R;

/* renamed from: X.Cft, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28390Cft {
    public static final void A00(C5Tl c5Tl, C61 c61, C28224CcU c28224CcU, EnumC193878i8 enumC193878i8, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, int i, int i2, boolean z) {
        String str;
        InterfaceC16820sZ interfaceC16820sZ5 = interfaceC16820sZ4;
        C61 c612 = c61;
        C14360o3.A0B(interfaceC16820sZ, 2);
        AbstractC25233BEq.A0x(3, interfaceC16820sZ2, interfaceC16820sZ3, enumC193878i8);
        c5Tl.Enr(561342434);
        if ((i2 & 64) != 0) {
            c612 = null;
        }
        if ((i2 & 128) != 0) {
            interfaceC16820sZ5 = DBT.A00;
        }
        if (C0fH.A02()) {
            C0fH.A01(-1253704299, "com.instagram.creation.genai.magicmod.common.ui.MagicModGeneratedImageSelectionBar (MagicModGeneratedImageSelectionBar.kt:44)");
        }
        if (c28224CcU != null) {
            str = c28224CcU.A05;
        } else {
            str = null;
        }
        CHO.A00(c5Tl, null, C5UA.A01(c5Tl, new DS9(9, interfaceC16820sZ, z), -1210496756), C5UA.A01(c5Tl, new C30206DSl(c612, enumC193878i8, str, interfaceC16820sZ3, interfaceC16820sZ5), 669029867), C5UA.A01(c5Tl, C30481DbQ.A00(interfaceC16820sZ2, 2), -1746410806), 0.0f, 28032, 3);
        if (C0fH.A02()) {
            C0fH.A00(-1719016669);
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30316DWr(c612, interfaceC16820sZ5, interfaceC16820sZ3, interfaceC16820sZ, enumC193878i8, c28224CcU, interfaceC16820sZ2, i, i2, 1, z);
        }
    }

    public static final void A01(C5Tl c5Tl, C61 c61, EnumC193878i8 enumC193878i8, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i) {
        int i2;
        c5Tl.Enr(1402799542);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i & 7168) == 0) {
            i2 |= AbstractC25232BEp.A0U(c5Tl, c61);
        }
        if ((57344 & i) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16820sZ2);
        }
        if ((46171 & i2) == 9234 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1482761618, "com.instagram.creation.genai.magicmod.common.ui.PromptButton (MagicModGeneratedImageSelectionBar.kt:107)");
            }
            c5Tl.Eno(2021844389);
            boolean z = true;
            boolean A1P = AbstractC167007dF.A1P(i2 & 7168, C3OO.FLAG_MOVED);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = AbstractC25229BEm.A0Q(c5Tl, new DH4(c61, 35));
            }
            InterfaceC74963Ym interfaceC74963Ym = (InterfaceC74963Ym) EEc;
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            InterfaceC16820sZ interfaceC16820sZ3 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ3);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0b, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            AbstractC28388Cfr.A03(c5Tl, C72.A02, null, AbstractC136736Hc.A00(c5Tl, 2131965934), interfaceC16820sZ2, ((i2 >> 3) & 7168) | 805306752, 1520, 1000L, AbstractC25231BEo.A1U(interfaceC74963Ym));
            Alignment alignment = C118195Wf.A09;
            Modifier A06 = AbstractC118175Wb.A06(AbstractC118185Wd.A0I(c1130158n, Float.NaN, 44.0f, Float.NaN, Float.NaN));
            c5Tl.Eno(-438407650);
            if ((i2 & 112) != 32) {
                z = false;
            }
            Object EEc2 = c5Tl.EEc();
            if (z || EEc2 == C5UI.A00) {
                EEc2 = DH4.A02(c5Tl, interfaceC16820sZ, 34);
            }
            Modifier A05 = AbstractC118175Wb.A05(AbstractC25236BEt.A0G(c5Tl, AbstractC25235BEs.A0H(c5Tl, A0K, A06, EEc2)));
            InterfaceC1127857k A002 = C5XX.A00(alignment, false);
            int A003 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A05);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ3);
            C5XJ.A00(c5Tl, A002, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            InterfaceC1127857k A0d = AbstractC25228BEl.A0d(c5Tl);
            int A004 = C5X2.A00(c5Tl);
            C59P A043 = C117505Tk.A04(A0K);
            Modifier A013 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ3);
            C5XJ.A00(c5Tl, A0d, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            C5YS.A05(c5Tl, AbstractC118185Wd.A0C(AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 8.0f, 0.0f), 20.0f), C5Y7.A00(c5Tl, R.drawable.instagram_edit_pano_filled_24, 0), AbstractC25226BEj.A0L(c5Tl));
            C5WR.A0l(c5Tl, AbstractC25226BEj.A0h(c5Tl), str, 1, 2, (i2 & 14) | 100663296, 390, 11002, AbstractC25226BEj.A0H(c5Tl));
            c5Tl.ASW();
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(328529977);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUT(interfaceC16820sZ, interfaceC16820sZ2, c61, enumC193878i8, str, i, 1);
        }
    }

    public static final void A02(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        int i2;
        c5Tl.Enr(2028965358);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0b(c5Tl, z) | i;
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
                C0fH.A01(509774418, "com.instagram.creation.genai.magicmod.common.ui.RetryButton (MagicModGeneratedImageSelectionBar.kt:64)");
            }
            C2DC A00 = C5Y7.A00(c5Tl, R.drawable.instagram_arrow_cw_pano_outline_24, 0);
            String A002 = AbstractC136736Hc.A00(c5Tl, 2131965959);
            Modifier modifier = Modifier.A00;
            Modifier A08 = AbstractC118175Wb.A08(AbstractC25236BEt.A0G(c5Tl, AbstractC118175Wb.A06(modifier)), 12.0f);
            float f = 1.0f;
            if (z) {
                f = 0.5f;
            }
            Modifier A003 = CB8.A00(A08, f);
            c5Tl.Eno(-1344022060);
            if (!z) {
                c5Tl.Eno(-1344020262);
                boolean A1T = AbstractC25228BEl.A1T(i2);
                Object EEc = c5Tl.EEc();
                if (A1T || EEc == C5UI.A00) {
                    EEc = DH4.A02(c5Tl, interfaceC16820sZ, 36);
                }
                AbstractC25225BEi.A1V(c5Tl, false);
                modifier = AbstractC118635Yc.A04(c5Tl, modifier, (InterfaceC16820sZ) EEc);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            C5YS.A08(c5Tl, A003.Eq3(modifier), A00, A002, 8, AbstractC25225BEi.A0C(c5Tl));
            if (C0fH.A02()) {
                C0fH.A00(1885064153);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30502Dbl.A01(ASZ, interfaceC16820sZ, i, 8, z);
        }
    }

    public static final void A03(InterfaceC16820sZ interfaceC16820sZ, C5Tl c5Tl, int i) {
        int i2;
        c5Tl.Enr(-1853085447);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-858276451, "com.instagram.creation.genai.magicmod.common.ui.NextButton (MagicModGeneratedImageSelectionBar.kt:80)");
            }
            Alignment alignment = C118195Wf.A09;
            Modifier A06 = AbstractC118175Wb.A06(Modifier.A00);
            long A0C = AbstractC25225BEi.A0C(c5Tl);
            C5XL.A02(c5Tl);
            Modifier A0W = AbstractC25229BEm.A0W(AbstractC25226BEj.A0V(AbstractC118175Wb.A0A(C6L3.A01(A06, C5WE.A02, A0C), 24.0f, 0.0f)), "magicmod_generated_image_selection_done_button");
            boolean A1O = AbstractC25233BEq.A1O(c5Tl, 114829544, i2);
            Object EEc = c5Tl.EEc();
            if (A1O || EEc == C5UI.A00) {
                EEc = DH4.A01(c5Tl, interfaceC16820sZ, 33);
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            Modifier A0I = AbstractC25235BEs.A0I(c5Tl, c117505Tk, A0W, (InterfaceC16820sZ) EEc);
            InterfaceC1127857k A00 = C5XX.A00(alignment, false);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0I);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A00, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            if (AbstractC25236BEt.A0y(c5Tl, AbstractC136736Hc.A00(c5Tl, 2131968535), AbstractC25226BEj.A0I(c5Tl))) {
                C0fH.A00(-1886562620);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30499Dbi.A01(ASZ, interfaceC16820sZ, i, 45);
        }
    }
}
