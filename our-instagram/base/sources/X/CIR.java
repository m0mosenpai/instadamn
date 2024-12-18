package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;

/* loaded from: classes5.dex */
public abstract class CIR {
    public static final void A00(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        int i3;
        InterfaceC16660sJ interfaceC16660sJ2 = interfaceC16660sJ;
        boolean A1b = AbstractC25233BEq.A1b(interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3);
        c5Tl.Enr(364206397);
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
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ3);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ2);
        }
        if ((i3 & 5851) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                interfaceC16660sJ2 = null;
            }
            if (C0fH.A02()) {
                C0fH.A01(1825309459, "com.instagram.direct.aiagent.upsell.AiAgentBottomSheetNuxScreen (AiAgentBottomSheetNuxScreen.kt:35)");
            }
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A00;
            C1130158n c1130158n = Modifier.A00;
            InterfaceC118305Ws interfaceC118305Ws = AbstractC118255Wn.A07;
            InterfaceC1127857k A0Q = AbstractC25227BEk.A0Q(interfaceC118305Ws, c5Tl, interfaceC118245Wl);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            InterfaceC16820sZ interfaceC16820sZ4 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ4);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0Q, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            C6LQ.A06(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 12.0f, 0.0f, 36.0f), C5Y7.A00(c5Tl, R.drawable.instagram_illustrations_product_illustration_pi_plus_ai_studio, 0), 440);
            C5WR.A0T(c5Tl, AbstractC118175Wb.A0E(AbstractC118175Wb.A0A(c1130158n, 32.0f, 0.0f), 0.0f, 0.0f, 0.0f, 12.0f), C5XL.A01(c5Tl).A04, C5YD.A00(c5Tl, 2131952870), AbstractC25226BEj.A0G(c5Tl));
            Modifier A0A = AbstractC118175Wb.A0A(c1130158n, 12.0f, 0.0f);
            InterfaceC1127857k A02 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, C118195Wf.A02, 0);
            int A002 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A0A);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ4);
            C5XJ.A00(c5Tl, A02, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            AbstractC28474ChS.A03(c5Tl, C5Y7.A00(c5Tl, R.drawable.instagram_channels_pano_outline_24, 0), C26178Bi3.A00(c5Tl, C5YD.A00(c5Tl, 2131952864), 2131952863), 64, 4, false);
            AbstractC28474ChS.A03(c5Tl, C5Y7.A00(c5Tl, R.drawable.instagram_gen_ai_pano_outline_24, 0), C26178Bi3.A00(c5Tl, C5YD.A00(c5Tl, 2131952866), 2131952865), 64, 4, false);
            C2DC A003 = C5Y7.A00(c5Tl, R.drawable.instagram_rotate_pano_outline_24, 0);
            String A004 = C5YD.A00(c5Tl, 2131952869);
            if (AbstractC25227BEk.A1U(c5Tl, -35369219)) {
                C0fH.A01(574458170, "com.instagram.direct.aiagent.upsell.thirdBulletText (AiAgentBottomSheetNuxScreen.kt:94)");
            }
            String A17 = AbstractC25228BEl.A17(c5Tl, C5YD.A00(c5Tl, 2131952868), 2131952867);
            String A005 = C5YD.A00(c5Tl, 2131952868);
            int A08 = AbstractC001900j.A08(A17, A005, 0, false);
            int A0A2 = AbstractC167007dF.A0A(A005) + A08;
            C5W3 c5w3 = new C5W3(null, null, null, null, null, 65534, AbstractC25226BEj.A0C(c5Tl), 0L, 0L);
            C6C7 c6c7 = new C6C7(16);
            c6c7.A09(A17);
            c6c7.A06(c5w3, A08, A0A2);
            C5C8 A0R = AbstractC25227BEk.A0R(c6c7, "link", "AI at Meta link", A08, A0A2);
            if (C0fH.A02()) {
                C0fH.A00(780737618);
            }
            C117505Tk.A0L(c117505Tk, false);
            int i5 = i3 << 12;
            AbstractC25705BXp.A00(c5Tl, null, null, null, A003, A0R, null, null, A004, null, null, null, interfaceC16820sZ, 0, 0, 0, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED, i5 & 57344, 114646, 0L, false);
            c5Tl.ASW();
            AbstractC25226BEj.A1O(c5Tl, c1130158n, 12.0f);
            String A006 = C5YD.A00(c5Tl, 2131952576);
            String A007 = C5YD.A00(c5Tl, 2131952575);
            if (AbstractC25227BEk.A1U(c5Tl, 2131309359)) {
                C0fH.A01(-913146120, "com.instagram.direct.aiagent.upsell.footerAiTerms (AiAgentBottomSheetNuxScreen.kt:119)");
            }
            String A008 = C5YD.A00(c5Tl, 2131952862);
            String A172 = AbstractC25228BEl.A17(c5Tl, A008, 2131952861);
            C6C7 c6c72 = new C6C7(16);
            c6c72.A09(A172);
            c6c72.A09("\n");
            int A082 = AbstractC001900j.A08(A172, A008, 0, false);
            int A0A3 = AbstractC167007dF.A0A(A008) + A082;
            c6c72.A06(new C5W3(null, null, null, null, null, 65534, AbstractC25226BEj.A0C(c5Tl), 0L, 0L), A082, A0A3);
            C5C8 A0R2 = AbstractC25227BEk.A0R(c6c72, "Link", A008, A082, A0A3);
            if (C0fH.A02()) {
                C0fH.A00(761692451);
            }
            C117505Tk.A0L(c117505Tk, false);
            AbstractC28506Chz.A04(c5Tl, AbstractC25226BEj.A0T(c1130158n), A0R2, A006, A007, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16660sJ2, (i3 & 112) | 384 | (i5 & 3670016), ((i3 >> 6) & 112) | 3456, 17304, false, false, false, false, false, A1b, false, false);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1539305566);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30492Dbb(interfaceC16820sZ3, interfaceC16820sZ2, interfaceC16660sJ2, interfaceC16820sZ, i, i2, 18);
        }
    }
}
