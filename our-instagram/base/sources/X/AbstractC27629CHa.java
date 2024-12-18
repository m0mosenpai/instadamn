package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* renamed from: X.CHa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27629CHa {
    public static final void A00(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        boolean z3 = z2;
        boolean z4 = z;
        AbstractC167007dF.A1K(interfaceC16820sZ, interfaceC16820sZ2);
        c5Tl.Enr(1279550038);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= AbstractC25232BEp.A0d(c5Tl, z4);
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= AbstractC25232BEp.A0e(c5Tl, z3);
        }
        if ((i3 & 5851) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            z4 = AbstractC25226BEj.A1U(i5, z4);
            z3 = AbstractC25226BEj.A1U(i6, z3);
            if (C0fH.A02()) {
                C0fH.A01(-714216747, "com.instagram.creation.genai.themes.ui.AiThemesHeader (AiThemesHeader.kt:37)");
            }
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            InterfaceC16820sZ interfaceC16820sZ3 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ3);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0b, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            C119645bN c119645bN = C119645bN.A00;
            C2DC A002 = C5Y7.A00(c5Tl, R.drawable.instagram_x_pano_filled_24, 0);
            String A003 = AbstractC136736Hc.A00(c5Tl, 2131956237);
            InterfaceC16660sJ interfaceC16660sJ = C5XU.A00;
            Modifier A0E = AbstractC118175Wb.A0E(C30711Df9.A00(c1130158n, interfaceC16660sJ, 3), 16.0f, 12.0f, 0.0f, 0.0f);
            boolean A1O = AbstractC25233BEq.A1O(c5Tl, 1214034373, i3);
            Object EEc = c5Tl.EEc();
            if (A1O || EEc == C5UI.A00) {
                EEc = new C57242PbQ(interfaceC16820sZ, 10);
                c5Tl.FBy(EEc);
            }
            C5YS.A08(c5Tl, AbstractC25235BEs.A0H(c5Tl, c117505Tk, A0E, EEc), A002, A003, 8, AbstractC25226BEj.A0G(c5Tl));
            Modifier A0E2 = AbstractC118175Wb.A0E(C30711Df9.A00(c119645bN.AB5(C118195Wf.A0C, AbstractC25226BEj.A0T(c1130158n)), interfaceC16660sJ, 3), 0.0f, 12.0f, 0.0f, 12.0f);
            InterfaceC1127857k A02 = AbstractC118375Wz.A02(AbstractC118255Wn.A02, c5Tl, C118195Wf.A05, 6);
            int A004 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A0E2);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ3);
            C5XJ.A00(c5Tl, A02, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            if (z3) {
                c5Tl.Eno(-932015955);
                i4 = 2131952739;
            } else {
                c5Tl.Eno(-931584342);
                i4 = 2131966561;
                C6LQ.A0C(c5Tl, AbstractC118175Wb.A0A(c1130158n, 4.0f, 2.0f), C5Y7.A00(c5Tl, R.drawable.gen_ai_assets_metaaicontextheader, 0), C5YD.A00(c5Tl, 2131966561), 392);
            }
            String A005 = C5YD.A00(c5Tl, i4);
            long A0G = AbstractC25226BEj.A0G(c5Tl);
            C5WR.A0V(c5Tl, AbstractC118175Wb.A0A(c1130158n, 0.0f, 3.0f), AbstractC25225BEi.A0X(c5Tl), A005, A0G);
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.ASW();
            String A006 = C5YD.A00(c5Tl, 2131968535);
            long A0N = AbstractC25226BEj.A0N(c5Tl);
            C118125Vw A0c = AbstractC25226BEj.A0c(c5Tl);
            Modifier A0D = AbstractC118175Wb.A0D(C30711Df9.A00(c119645bN.AB5(C118195Wf.A0D, c1130158n), interfaceC16660sJ, 3), 0.0f, 16.0f, 0.0f);
            boolean A1Y = AbstractC25234BEr.A1Y(c5Tl, 1214096835, i3);
            Object EEc2 = c5Tl.EEc();
            if (A1Y || EEc2 == C5UI.A00) {
                EEc2 = new C57242PbQ(interfaceC16820sZ2, 11);
                c5Tl.FBy(EEc2);
            }
            C5WR.A0Z(c5Tl, AbstractC118635Yc.A01(c5Tl, A0D, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc2, false), 6, z4), A0c, A006, A0N);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(846740943);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUE(interfaceC16820sZ2, interfaceC16820sZ, i, i2, 2, z3, z4);
        }
    }
}
