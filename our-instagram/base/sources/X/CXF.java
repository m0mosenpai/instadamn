package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public abstract class CXF {
    public static final void A00(C5Tl c5Tl, C51757Mtg c51757Mtg, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i) {
        int i2;
        C5UU ASZ;
        int i3;
        boolean A1b = AbstractC25233BEq.A1b(c51757Mtg, interfaceC16820sZ, interfaceC16820sZ2);
        c5Tl.Enr(1092243686);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c51757Mtg) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ2);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-872071035, "com.instagram.aistudio.editor.AiApprovedLandingScreen (AiApprovedLandingScreen.kt:37)");
            }
            c5Tl.Eno(-1673256087);
            if (c51757Mtg.A00 == null) {
                BIR.A01(c5Tl, AbstractC25228BEl.A0W());
                if (AbstractC25230BEn.A1Z(c5Tl, false)) {
                    C0fH.A00(-21422609);
                }
                ASZ = c5Tl.ASZ();
                if (ASZ == null) {
                    return;
                }
                i3 = 4;
                ASZ.A06 = C30509Dbs.A01(c51757Mtg, interfaceC16820sZ, interfaceC16820sZ2, i, i3);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C1130158n c1130158n = Modifier.A00;
            InterfaceC118305Ws interfaceC118305Ws = AbstractC118255Wn.A07;
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A02;
            InterfaceC1127857k A02 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, interfaceC118245Wl, 0);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            InterfaceC16820sZ interfaceC16820sZ3 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ3);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A02, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            Modifier A002 = C6GM.A00.A00(AbstractC28285CdX.A02(c5Tl, c1130158n), A1b);
            InterfaceC1127857k A022 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, interfaceC118245Wl, 0);
            int A003 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A002);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ3);
            C5XJ.A00(c5Tl, A022, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            Modifier A0E = AbstractC118175Wb.A0E(AbstractC25226BEj.A0T(c1130158n), 20.0f, 20.0f, 20.0f, 24.0f);
            InterfaceC1127857k A0Q = AbstractC25227BEk.A0Q(interfaceC118305Ws, c5Tl, C118195Wf.A00);
            int A004 = C5X2.A00(c5Tl);
            C59P A043 = C117505Tk.A04(A0K);
            Modifier A013 = C5X3.A01(c5Tl, A0E);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ3);
            C5XJ.A00(c5Tl, A0Q, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            ImageUrl imageUrl = (ImageUrl) c51757Mtg.A01;
            c5Tl.Eno(1044549952);
            if (imageUrl != null) {
                A01(c5Tl, imageUrl, 0);
            }
            C117505Tk.A0L(A0K, false);
            C5WR.A0T(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 20.0f, 0.0f, 0.0f), C5XL.A01(c5Tl).A04, C5YD.A00(c5Tl, 2131952691), AbstractC25226BEj.A0G(c5Tl));
            String str = c51757Mtg.A02;
            c5Tl.Eno(1044564990);
            if (str != null) {
                C5WR.A0T(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 12.0f, 0.0f, 0.0f), AbstractC25226BEj.A0c(c5Tl), AbstractC25228BEl.A17(c5Tl, str, 2131952690), AbstractC25226BEj.A0M(c5Tl));
            }
            C117505Tk.A0L(A0K, false);
            c5Tl.ASW();
            AbstractC28474ChS.A04(c5Tl, C5Y7.A00(c5Tl, R.drawable.instagram_users_pano_outline_24, 0), C5YD.A00(c5Tl, 2131952684), 2131952683);
            AbstractC28474ChS.A04(c5Tl, C5Y7.A00(c5Tl, R.drawable.instagram_direct_pano_outline_24, 0), C5YD.A00(c5Tl, 2131952686), 2131952685);
            AbstractC28474ChS.A04(c5Tl, C5Y7.A00(c5Tl, R.drawable.instagram_licensing_pano_outline_24, 0), C5YD.A00(c5Tl, 2131952688), 2131952687);
            c5Tl.ASW();
            String A005 = C5YD.A00(c5Tl, 2131952689);
            String A006 = C5YD.A00(c5Tl, 2131952706);
            boolean A1Y = AbstractC25234BEr.A1Y(c5Tl, -1912436539, i2);
            Object EEc = c5Tl.EEc();
            if (A1Y || EEc == C5UI.A00) {
                EEc = DGW.A00(interfaceC16820sZ, 16);
                c5Tl.FBy(EEc);
            }
            InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(A0K, EEc, false);
            boolean A1Z = AbstractC25234BEr.A1Z(c5Tl, -1912428345, i2);
            Object EEc2 = c5Tl.EEc();
            if (A1Z || EEc2 == C5UI.A00) {
                EEc2 = DGW.A00(interfaceC16820sZ2, 17);
                c5Tl.FBy(EEc2);
            }
            AbstractC28506Chz.A01(c5Tl, null, null, A005, A006, A1A, AbstractC25225BEi.A1A(A0K, EEc2, false), 0, 3072, 24476);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(783138533);
            }
        }
        ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            i3 = 5;
            ASZ.A06 = C30509Dbs.A01(c51757Mtg, interfaceC16820sZ, interfaceC16820sZ2, i, i3);
        }
    }

    public static final void A01(C5Tl c5Tl, ImageUrl imageUrl, int i) {
        int i2;
        c5Tl.Enr(520415433);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, imageUrl) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1754676549, "com.instagram.aistudio.editor.ImageWithBubble (AiApprovedLandingScreen.kt:110)");
            }
            Alignment alignment = C118195Wf.A0C;
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A00 = C5XX.A00(alignment, false);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A00, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6LQ.A03(c5Tl, AbstractC25236BEt.A0H(c5Tl, c1130158n, 188.0f), AbstractC25226BEj.A0w(c5Tl, imageUrl, i2));
            AbstractC27527CCx.A00(c5Tl, null, C5YD.A00(c5Tl, 2131952682), 0, 0, 58, AbstractC25226BEj.A06(c5Tl), 0L, false);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(234755603);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30499Dbi.A01(ASZ, imageUrl, i, 9);
        }
    }
}
