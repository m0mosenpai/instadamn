package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform;

/* renamed from: X.Cgl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28437Cgl {
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0223  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C5Tl r42, X.InterfaceC137546La r43, X.InterfaceC137546La r44, com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform r45, X.C26196BiM r46, X.C27866CQd r47, X.InterfaceC16820sZ r48, X.InterfaceC16820sZ r49, X.InterfaceC16660sJ r50, X.InterfaceC16660sJ r51, X.InterfaceC16620sF r52, X.C5Hc r53, int r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28437Cgl.A00(X.5Tl, X.6La, X.6La, com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform, X.BiM, X.CQd, X.0sZ, X.0sZ, X.0sJ, X.0sJ, X.0sF, X.5Hc, int, int, int):void");
    }

    public static final void A02(C5Tl c5Tl, C28224CcU c28224CcU, MagicModPostCaptureTransform magicModPostCaptureTransform, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16620sF interfaceC16620sF, int i, int i2) {
        int i3;
        InterfaceC16660sJ interfaceC16660sJ3 = interfaceC16660sJ2;
        c5Tl.Enr(1878770760);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, c28224CcU) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16620sF);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ3);
        }
        if ((i2 & 16) != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0L(c5Tl, magicModPostCaptureTransform);
        }
        if ((i3 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                interfaceC16660sJ3 = DNK.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1292852055, "com.instagram.creation.genai.magicmod.tools.backdrop.ui.MagicModBackdropVariantImageThumbnail (MagicModBackdropGeneratedImageVariants.kt:208)");
            }
            if (c28224CcU.A00 != null) {
                c5Tl.Eno(-1504821408);
                boolean A1X = AbstractC25226BEj.A1X(c5Tl, c28224CcU, AbstractC167007dF.A1P(i3 & 7168, C3OO.FLAG_MOVED));
                Object EEc = c5Tl.EEc();
                if (A1X || EEc == C5UI.A00) {
                    EEc = new PZV(c28224CcU, interfaceC16660sJ3, null, 13);
                    c5Tl.FBy(EEc);
                }
                C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
                int i5 = i3 & 14;
                C5UX.A04(c5Tl, c28224CcU, (InterfaceC16620sF) EEc);
                Alignment alignment = C118195Wf.A09;
                C1130158n c1130158n = Modifier.A00;
                String A00 = AbstractC136736Hc.A00(c5Tl, 2131973234);
                boolean A1X2 = AbstractC25226BEj.A1X(c5Tl, c28224CcU, AbstractC25233BEq.A1P(c5Tl, -1504812333, i3));
                Object EEc2 = c5Tl.EEc();
                if (A1X2 || EEc2 == C5UI.A00) {
                    EEc2 = DH0.A01(c5Tl, c28224CcU, interfaceC16660sJ, 19);
                }
                Modifier A0J = AbstractC25235BEs.A0J(AbstractC27468CAo.A00(AbstractC25227BEk.A0M(AbstractC118635Yc.A03(c5Tl, c1130158n, A00, AbstractC25225BEi.A1A(A0K, EEc2, false)), 4.0f), 0.5625f, false));
                InterfaceC1127857k A002 = C5XX.A00(alignment, false);
                int A003 = C5X2.A00(c5Tl);
                C59P A04 = C117505Tk.A04(A0K);
                Modifier A01 = C5X3.A01(c5Tl, A0J);
                InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
                AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
                InterfaceC16620sF interfaceC16620sF2 = C5X8.A03;
                InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A002, A04, interfaceC16620sF2);
                InterfaceC16620sF interfaceC16620sF3 = C5X8.A02;
                if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A003);
                }
                InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
                C119645bN c119645bN = C119645bN.A00;
                CYG.A01(c5Tl, null, c28224CcU, magicModPostCaptureTransform, null, null, i5 | ((i3 >> 9) & 112), 28);
                Modifier AB5 = c119645bN.AB5(C118195Wf.A0D, c1130158n);
                InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
                int A004 = C5X2.A00(c5Tl);
                C59P A042 = C117505Tk.A04(A0K);
                Modifier A012 = C5X3.A01(c5Tl, AB5);
                AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
                C5XJ.A00(c5Tl, A0b, interfaceC16620sF2);
                if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A004);
                }
                C5XJ.A00(c5Tl, A012, A1K);
                Modifier A06 = AbstractC118175Wb.A06(c1130158n);
                boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, c28224CcU, -668498709) | AbstractC25231BEo.A1M(i3);
                Object EEc3 = c5Tl.EEc();
                if (A1Z || EEc3 == C5UI.A00) {
                    EEc3 = C30183DRo.A00(c5Tl, interfaceC16620sF, c28224CcU, 15);
                }
                CHD.A00(c5Tl, A06, null, C29758DBc.A00, AbstractC25225BEi.A1B(A0K, EEc3, false), 3504, 0);
                c5Tl.ASW();
                c5Tl.ASW();
            } else {
                AbstractC166987dD.A1T(C18950wb.A01, "image_bitmap_null", 851001060);
            }
            if (C0fH.A02()) {
                C0fH.A00(255087471);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DV5(interfaceC16660sJ3, interfaceC16620sF, c28224CcU, interfaceC16660sJ, magicModPostCaptureTransform, i, i2, 11);
        }
    }

    public static final void A01(C5Tl c5Tl, InterfaceC137546La interfaceC137546La, InterfaceC137546La interfaceC137546La2, C27866CQd c27866CQd, int i, boolean z) {
        int i2;
        c5Tl.Enr(2097764974);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC137546La) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC137546La2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, c27866CQd);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0e(c5Tl, z);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(86499581, "com.instagram.creation.genai.magicmod.tools.backdrop.ui.MagicModBackdropVariantPlaceholder (MagicModBackdropGeneratedImageVariants.kt:158)");
            }
            Alignment alignment = C118195Wf.A09;
            Modifier A0U = AbstractC25226BEj.A0U(Modifier.A00);
            Modifier A0J = AbstractC25235BEs.A0J(AbstractC27468CAo.A00(AbstractC118175Wb.A0A(A0U, 4.0f, 0.0f), 0.5625f, false));
            InterfaceC1127857k A00 = C5XX.A00(alignment, false);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0J);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A00, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C119645bN c119645bN = C119645bN.A00;
            C6LQ.A0A(c5Tl, A0U, new C25768Ba7(CBV.A00(c5Tl, R.drawable.magicmod__beta_backdrop_grid)), C5YJ.A01, 25016, 104);
            c5Tl.Eno(1334751504);
            if (z) {
                C5XX.A02(c5Tl, AbstractC28487Chf.A01(c5Tl, CB8.A00(A0U, 0.2f), AbstractC28487Chf.A03(c5Tl, null, 0.0f, 0.0f, 0, 1572870, 62, C1132359l.A04), 6), 0);
            }
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.Eno(1334765355);
            if (interfaceC137546La != null) {
                int i3 = i2 << 3;
                CYF.A00(c119645bN, c5Tl, null, interfaceC137546La, interfaceC137546La2, c27866CQd, null, null, AbstractC25229BEm.A05(i3, 12607494 | (i3 & 112)), 176, true, false);
            } else {
                AbstractC166987dD.A1T(C18950wb.A01, "no_image_for_placeholder", 851001060);
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(-1246996080);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DTY(interfaceC137546La, interfaceC137546La2, c27866CQd, i, 5, z);
        }
    }

    public static final void A03(InterfaceC16820sZ interfaceC16820sZ, String str, C5Tl c5Tl, int i) {
        int i2;
        c5Tl.Enr(-1982962571);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(129712607, "com.instagram.creation.genai.magicmod.tools.backdrop.ui.MagicModBackdropVariantsEditPromptButton (MagicModBackdropGeneratedImageVariants.kt:269)");
            }
            Alignment alignment = C118195Wf.A09;
            C1130158n c1130158n = Modifier.A00;
            Modifier A0V = AbstractC25226BEj.A0V(AbstractC118175Wb.A05(AbstractC25236BEt.A0G(c5Tl, AbstractC118175Wb.A0B(c1130158n, 0.0f, 0.0f, 0.0f))));
            boolean A1P = AbstractC25233BEq.A1P(c5Tl, -2118696518, i2);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = DGV.A00(c5Tl, interfaceC16820sZ, 18);
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            Modifier A0I = AbstractC25235BEs.A0I(c5Tl, c117505Tk, A0V, (InterfaceC16820sZ) EEc);
            InterfaceC1127857k A00 = C5XX.A00(alignment, false);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0I);
            InterfaceC16820sZ interfaceC16820sZ2 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A00, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            InterfaceC1127857k A0d = AbstractC25228BEl.A0d(c5Tl);
            int A003 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A0d, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            C5YS.A04(c5Tl, AbstractC118185Wd.A0C(c1130158n, 20.0f), C5Y7.A00(c5Tl, R.drawable.instagram_edit_pano_filled_24, 0), C5XL.A00(c5Tl).A0U);
            AbstractC25227BEk.A16(c5Tl, c1130158n, 10.0f);
            C5WR.A0q(c5Tl, AbstractC25226BEj.A0h(c5Tl), str, i2 & 14, AbstractC25226BEj.A0H(c5Tl));
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(1737166920);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30503Dbm.A01(ASZ, interfaceC16820sZ, str, i, 6);
        }
    }

    public static final void A04(InterfaceC16820sZ interfaceC16820sZ, String str, C5Tl c5Tl, int i) {
        int i2;
        c5Tl.Enr(-952237590);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-745038669, "com.instagram.creation.genai.magicmod.tools.backdrop.ui.MagicModBackdropVariantsTextOnlyButton (MagicModBackdropGeneratedImageVariants.kt:246)");
            }
            Alignment alignment = C118195Wf.A09;
            Modifier A0V = AbstractC25226BEj.A0V(AbstractC118175Wb.A05(AbstractC25236BEt.A0G(c5Tl, AbstractC118175Wb.A0B(Modifier.A00, 0.0f, 0.0f, 0.0f))));
            boolean A1P = AbstractC25233BEq.A1P(c5Tl, 52055653, i2);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = DGV.A00(c5Tl, interfaceC16820sZ, 19);
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            Modifier A0I = AbstractC25235BEs.A0I(c5Tl, c117505Tk, A0V, (InterfaceC16820sZ) EEc);
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
            C5WR.A0q(c5Tl, AbstractC25226BEj.A0h(c5Tl), str, i2 & 14, AbstractC25226BEj.A0H(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(847562206);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30503Dbm.A01(ASZ, interfaceC16820sZ, str, i, 7);
        }
    }
}
