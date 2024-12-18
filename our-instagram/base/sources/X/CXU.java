package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public abstract class CXU {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, C5Hc c5Hc, int i, boolean z) {
        int i2;
        long A0O;
        long j;
        long j2;
        C14360o3.A0B(interfaceC16820sZ, 0);
        AbstractC167007dF.A1E(c5Hc, 2, modifier);
        c5Tl.Enr(441525349);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, c5Hc);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0U(c5Tl, modifier);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-679268644, "com.instagram.barcelona.common.ui.button.NewContentButton (NewContentAboveButton.kt:51)");
            }
            AbstractC12990ll A0d = AbstractC25229BEm.A0d(c5Tl);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 197009126);
            Object obj = C5UI.A00;
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) AbstractC25234BEr.A0c(c5Tl, A0q, obj, false);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            BTO A03 = AbstractC28452Ch2.A03(c5Tl, interfaceC74953Yl.getValue(), "expanded state", 48);
            C30627Ddn c30627Ddn = C30627Ddn.A00;
            InterfaceC118485Xk interfaceC118485Xk = AbstractC118445Xg.A01;
            boolean A1a = AbstractC166987dD.A1a(A03.A04());
            if (AbstractC25227BEk.A1U(c5Tl, -1076856817)) {
                C0fH.A01(-1237650629, "com.instagram.barcelona.common.ui.button.NewContentButton.<anonymous> (NewContentAboveButton.kt:57)");
            }
            float f = -40.0f;
            if (A1a) {
                f = -20.0f;
            }
            if (C0fH.A02()) {
                C0fH.A00(2026692123);
            }
            C117505Tk.A0L(A0K, false);
            C119145aW c119145aW = new C119145aW(f);
            boolean A1T = AbstractC25231BEo.A1T(A03.A07);
            if (AbstractC25227BEk.A1U(c5Tl, -1076856817)) {
                C0fH.A01(-506003782, "com.instagram.barcelona.common.ui.button.NewContentButton.<anonymous> (NewContentAboveButton.kt:57)");
            }
            int i3 = -40;
            if (A1T) {
                i3 = -20;
            }
            float f2 = i3;
            if (C0fH.A02()) {
                C0fH.A00(1273169310);
            }
            C117505Tk.A0L(A0K, false);
            C28795CnR A01 = AbstractC28452Ch2.A01((C5Y5) c30627Ddn.invoke(A03.A03(), c5Tl, 0), A03, interfaceC118485Xk, c5Tl, c119145aW, new C119145aW(f2), 196608);
            String A00 = C5YD.A00(c5Tl, 2131953692);
            C0eB c0eB = C0eB.A00;
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, 197021516);
            if (A0q2 == obj) {
                A0q2 = new MBq(interfaceC74953Yl, null, 32);
                c5Tl.FBy(A0q2);
            }
            AbstractC25228BEl.A1K(c5Tl, A0K, A0q2, c0eB, false);
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, A0d, 36319493290794460L)) {
                A0O = AbstractC25227BEk.A0g(c5Tl, 197027605).A0k;
            } else {
                A0O = AbstractC25230BEn.A0O(c5Tl, 197029007);
            }
            C117505Tk.A0L(A0K, false);
            if (C18U.A06(c06090Tz, A0d, 36319493290794460L)) {
                j = AbstractC25230BEn.A0O(c5Tl, 197033391);
            } else {
                j = AbstractC25227BEk.A0g(c5Tl, 197034613).A0k;
            }
            C117505Tk.A0L(A0K, false);
            Modifier A012 = CY3.A01(c5Tl, modifier, interfaceC16820sZ);
            C5XL.A02(c5Tl);
            C5WI c5wi = C5WE.A02;
            Modifier A013 = AbstractC28015CWn.A01(A012, c5wi, 6.0f, AbstractC1132259k.A00, AbstractC119585bG.A00(c5Tl, R.color.igds_bottom_button_shadow), true);
            if (C18U.A06(c06090Tz, A0d, 36319493290794460L)) {
                j2 = AbstractC25230BEn.A0O(c5Tl, 197053231);
            } else {
                j2 = AbstractC25227BEk.A0g(c5Tl, 197054966).A0B;
            }
            C117505Tk.A0L(A0K, false);
            C5XL.A02(c5Tl);
            Modifier A014 = C6L3.A01(A013, c5wi, j2);
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, A00, 197059363);
            Object EEc = c5Tl.EEc();
            if (A1Y || EEc == obj) {
                EEc = AbstractC25230BEn.A13(c5Tl, A00, 17);
            }
            Modifier A0J = AbstractC25236BEt.A0J(A0K, A014, EEc);
            InterfaceC1127857k A02 = AbstractC118375Wz.A02(AbstractC118255Wn.A01(((C119145aW) A01.A09.getValue()).A00), c5Tl, C118195Wf.A05, 0);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A015 = C5X3.A01(c5Tl, A0J);
            InterfaceC16820sZ interfaceC16820sZ2 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ2);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q3 = AbstractC25229BEm.A0q(c5Tl, A02, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A015);
            c5Tl.Eno(-71256060);
            if (AbstractC166987dD.A1b(c5Hc)) {
                A01(c5Tl, (ImageUrl) c5Hc.get(0), 0, j);
            }
            C117505Tk.A0L(A0K, false);
            if (AbstractC25227BEk.A04(c5Tl, c5Hc, -71252800) > 1) {
                A01(c5Tl, (ImageUrl) c5Hc.get(1), 0, j);
            }
            C117505Tk.A0L(A0K, false);
            if (AbstractC25227BEk.A04(c5Tl, c5Hc, -71249664) > 2) {
                A01(c5Tl, (ImageUrl) c5Hc.get(2), 0, j);
            }
            C1130158n A0O2 = AbstractC25225BEi.A0O(A0K);
            Modifier A0C = AbstractC118185Wd.A0C(AbstractC118175Wb.A0A(A0O2, 6.0f, 4.0f), 28.0f);
            C5WI c5wi2 = C5WF.A00;
            Modifier A016 = C6L3.A01(A0C, c5wi2, j);
            Alignment alignment = C118195Wf.A0E;
            InterfaceC1127857k A003 = C5XX.A00(alignment, false);
            int A004 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A017 = C5X3.A01(c5Tl, A016);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A003, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q3) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
            }
            C5XJ.A00(c5Tl, A017, A1K);
            C119645bN c119645bN = C119645bN.A00;
            Modifier A018 = C6L3.A01(AbstractC118175Wb.A08(c119645bN.Cng(A0O2), 2.0f), c5wi2, A0O);
            InterfaceC1127857k A005 = C5XX.A00(alignment, false);
            int A006 = C5X2.A00(c5Tl);
            C59P A043 = C117505Tk.A04(A0K);
            Modifier A019 = C5X3.A01(c5Tl, A018);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A005, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A043, A0q3) || !AbstractC25231BEo.A1O(c5Tl, A006)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A006);
            }
            C5XJ.A00(c5Tl, A019, A1K);
            C2DC A007 = C5Y7.A00(c5Tl, R.drawable.barcelona_outline_arrow_back_24, 0);
            String A008 = C5YD.A00(c5Tl, 2131953692);
            Modifier A044 = AbstractC118185Wd.A04(A0O2);
            float f3 = 270.0f;
            if (z) {
                f3 = 90.0f;
            }
            C5YS.A09(c5Tl, C6L3.A01(AbstractC25225BEi.A0P(c119645bN, AbstractC118175Wb.A08(CBA.A00(A044, f3), 4.0f)), c5wi2, A0O), A007, A008, j);
            c5Tl.ASW();
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(-201281265);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DTY(modifier, interfaceC16820sZ, c5Hc, i, 2, z);
        }
    }

    public static final void A01(C5Tl c5Tl, ImageUrl imageUrl, int i, long j) {
        int i2;
        c5Tl.Enr(1843478542);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, imageUrl) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0E(c5Tl, j);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(39940075, "com.instagram.barcelona.common.ui.button.ProfileImage (NewContentAboveButton.kt:135)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0C = AbstractC118185Wd.A0C(AbstractC118175Wb.A0A(c1130158n, 6.0f, 4.0f), 28.0f);
            C5WI c5wi = C5WF.A00;
            Modifier A01 = C6L3.A01(A0C, c5wi, j);
            InterfaceC1127857k A0Z = AbstractC25230BEn.A0Z();
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A01);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0Z, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A012);
            AbstractC136656Gu.A03(c5Tl, AbstractC25225BEi.A0P(C119645bN.A00, C6L2.A01(AbstractC118185Wd.A04(c1130158n), c5wi)), imageUrl, (i2 & 14) | 48);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1912234728);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DST(j, imageUrl, i, 0);
        }
    }
}
