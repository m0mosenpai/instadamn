package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Cdd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28291Cdd {
    public static final void A01(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, C5Hc c5Hc, int i, boolean z) {
        int i2;
        C5UU ASZ;
        int A06 = AbstractC167007dF.A06(0, c5Hc, interfaceC16820sZ);
        c5Tl.Enr(1962495726);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c5Hc) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1181963172, "com.instagram.aistudio.editor.AiNuxScreen (AiNuxScreen.kt:62)");
            }
            Object A11 = AbstractC25225BEi.A11(c5Tl);
            Object A19 = AbstractC25226BEj.A19(c5Tl);
            if (c5Hc.isEmpty()) {
                if (C0fH.A02()) {
                    C0fH.A00(-261241958);
                }
                ASZ = c5Tl.ASZ();
                if (ASZ == null) {
                    return;
                }
                ASZ.A06 = new C30488DbX(i, A06, interfaceC16820sZ, c5Hc, z);
            }
            C1130158n c1130158n = Modifier.A00;
            InterfaceC118305Ws interfaceC118305Ws = AbstractC118255Wn.A07;
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A02;
            InterfaceC1127857k A02 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, interfaceC118245Wl, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            InterfaceC16820sZ interfaceC16820sZ2 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A02, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            Modifier A002 = C6GM.A00.A00(AbstractC28285CdX.A02(c5Tl, AbstractC25226BEj.A0U(c1130158n)), true);
            InterfaceC1127857k A022 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, interfaceC118245Wl, 0);
            int A003 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A002);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A022, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            Modifier A0E = AbstractC118175Wb.A0E(c1130158n, 32.0f, 20.0f, 32.0f, 24.0f);
            InterfaceC1127857k A023 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, C118195Wf.A00, 48);
            int A004 = C5X2.A00(c5Tl);
            C59P A043 = C117505Tk.A04(c117505Tk);
            Modifier A013 = C5X3.A01(c5Tl, A0E);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A023, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            A02(c5Tl, c5Hc, 0, i2 & 14, A06);
            C5WR.A0T(c5Tl, AbstractC25227BEk.A0J(c1130158n, 20.0f), AbstractC25226BEj.A0c(c5Tl), C5YD.A00(c5Tl, 2131952755), AbstractC25226BEj.A0M(c5Tl));
            c5Tl.ASW();
            boolean z2 = false;
            C2DC A005 = C5Y7.A00(c5Tl, R.drawable.instagram_bulb_pano_outline_24, 0);
            int i3 = 2131952748;
            if (z) {
                i3 = 2131952746;
            }
            String A006 = C5YD.A00(c5Tl, i3);
            int i4 = 2131952747;
            if (z) {
                i4 = 2131952745;
            }
            AbstractC28474ChS.A04(c5Tl, A005, A006, i4);
            AbstractC28474ChS.A04(c5Tl, C5Y7.A00(c5Tl, R.drawable.instagram_channels_social_pano_outline_24, 0), C5YD.A00(c5Tl, 2131952750), 2131952749);
            C2DC A007 = C5Y7.A00(c5Tl, R.drawable.instagram_licensing_pano_outline_24, 0);
            String A008 = C5YD.A00(c5Tl, 2131952752);
            if (C0fH.A02()) {
                C0fH.A01(-618095796, "com.instagram.aistudio.editor.buildAnnotatedString (AiNuxScreen.kt:156)");
            }
            C6C7 c6c7 = new C6C7(16);
            String A009 = C5YD.A00(c5Tl, 2131952743);
            String A17 = AbstractC25228BEl.A17(c5Tl, A009, 2131952751);
            int length = A17.length();
            int A07 = AbstractC001900j.A07(A17, A009, length - 1);
            int A0A = AbstractC167007dF.A0A(A009) + A07;
            c6c7.A09(A17);
            c6c7.A06(new C5W3(null, null, null, AbstractC25226BEj.A0c(c5Tl).A02.A08, null, 65531, 0L, 0L, 0L), 0, length);
            c6c7.A06(new C5W3(null, null, null, null, null, 65534, AbstractC25226BEj.A0N(c5Tl), 0L, 0L), A07, A0A);
            C5C8 A0R = AbstractC25227BEk.A0R(c6c7, "privacy_policies", "clickable link", A07, A0A);
            if (C0fH.A02()) {
                C0fH.A00(-1344583201);
            }
            boolean A1W = AbstractC25233BEq.A1W(c5Tl, A19, A11, -874760132);
            Object EEc = c5Tl.EEc();
            if (A1W || EEc == C5UI.A00) {
                EEc = AbstractC25230BEn.A12(c5Tl, A19, A11, 19);
            }
            AbstractC28474ChS.A02(c5Tl, A007, new C26176Bi1(A0R, A008, AbstractC25225BEi.A1B(c117505Tk, EEc, false)));
            c5Tl.ASW();
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, 721447608);
            Object obj = C5UI.A00;
            if (A0q2 == obj) {
                A0q2 = AbstractC25232BEp.A0w(c5Tl, 0);
            }
            InterfaceC74953Yl A0M = AbstractC25225BEi.A0M(c117505Tk, A0q2, false);
            String A0010 = C5YD.A00(c5Tl, 2131952741);
            if (C0fH.A02()) {
                C0fH.A01(1148863478, "com.instagram.aistudio.editor.buildAnnotatedStringWithTwoLinks (AiNuxScreen.kt:188)");
            }
            C6C7 c6c72 = new C6C7(16);
            String A0011 = C5YD.A00(c5Tl, 2131952744);
            String A0012 = C5YD.A00(c5Tl, 2131952742);
            String A014 = C5YD.A01(c5Tl, new Object[]{A0011, A0012}, 2131952754);
            int length2 = A014.length();
            int i5 = length2 - 1;
            int A072 = AbstractC001900j.A07(A014, A0011, i5);
            int A0A2 = AbstractC167007dF.A0A(A0011) + A072;
            int A073 = AbstractC001900j.A07(A014, A0012, i5);
            int A0A3 = AbstractC167007dF.A0A(A0012) + A073;
            c6c72.A09(A014);
            c6c72.A06(new C5W3(null, null, null, AbstractC25226BEj.A0c(c5Tl).A02.A08, null, 65531, 0L, 0L, 0L), 0, length2);
            c6c72.A06(new C5W3(null, null, null, null, null, 65534, AbstractC25226BEj.A0N(c5Tl), 0L, 0L), A072, A0A2);
            c6c72.A0A("first clickable link", "first clickable link", A072, A0A2);
            c6c72.A06(new C5W3(null, null, null, null, null, 65534, AbstractC25226BEj.A0N(c5Tl), 0L, 0L), A073, A0A3);
            c6c72.A0A("second clickable link", "second clickable link", A073, A0A3);
            AbstractC25227BEk.A19(A0M, A0A2);
            C5C8 A024 = c6c72.A02();
            if (C0fH.A02()) {
                C0fH.A00(-202396986);
            }
            c5Tl.Eno(721450292);
            if ((i2 & 896) == 256) {
                z2 = true;
            }
            Object EEc2 = c5Tl.EEc();
            if (z2 || EEc2 == obj) {
                EEc2 = C29907DGv.A01(interfaceC16820sZ, 13);
                c5Tl.FBy(EEc2);
            }
            InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(c117505Tk, EEc2, false);
            boolean A1W2 = AbstractC25233BEq.A1W(c5Tl, A11, A19, 721466230);
            Object EEc3 = c5Tl.EEc();
            if (A1W2 || EEc3 == obj) {
                EEc3 = new DHZ(48, A19, A11, A0M);
                c5Tl.FBy(EEc3);
            }
            AbstractC28506Chz.A04(c5Tl, null, A024, A0010, null, A1A, null, AbstractC25225BEi.A1B(c117505Tk, EEc3, false), 0, 3456, 17404, false, false, false, false, false, true, false, false);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1633809710);
            }
        }
        ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            A06 = 3;
            ASZ.A06 = new C30488DbX(i, A06, interfaceC16820sZ, c5Hc, z);
        }
    }

    public static final void A00(C5Tl c5Tl, Modifier modifier, ImageUrl imageUrl, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C14360o3.A0B(imageUrl, 1);
        c5Tl.Enr(1532860140);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, modifier2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, imageUrl);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1296228315, "com.instagram.aistudio.editor.BouncingImage (AiNuxScreen.kt:256)");
            }
            AbstractC12990ll A0d = AbstractC25229BEm.A0d(c5Tl);
            float A00 = AbstractC25225BEi.A00(AbstractC25225BEi.A0j(A0d, 0), A0d, 37168436527497685L);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 36020695);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = AbstractC118385Xa.A00(1.0f);
                c5Tl.FBy(A0q);
            }
            C5Y1 c5y1 = (C5Y1) A0q;
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, c5y1, 36023030) | c5Tl.AH1(A00);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == obj) {
                EEc = new PYa(c5y1, null, A00, 1);
                c5Tl.FBy(EEc);
            }
            C5UX.A04(c5Tl, imageUrl, AbstractC25225BEi.A1C(A0K, EEc));
            C2DB A02 = AbstractC43541zP.A02(c5Tl, imageUrl, null, null, null, ((i3 >> 3) & 14) | 196608, 94, 0L, true, false);
            Modifier A0H = AbstractC25236BEt.A0H(c5Tl, modifier2, 188.0f);
            float A01 = AbstractC25232BEp.A01(c5y1);
            C6LQ.A03(c5Tl, CBB.A00(A0H, A01, A01), A02);
            if (C0fH.A02()) {
                C0fH.A00(2069358467);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30504Dbn.A01(imageUrl, modifier2, i2, i, 6);
        }
    }

    public static final void A02(C5Tl c5Tl, C5Hc c5Hc, int i, int i2, int i3) {
        int i4;
        ImageUrl imageUrl;
        String str;
        int i5 = i;
        C14360o3.A0B(c5Hc, 0);
        c5Tl.Enr(-632351433);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = AbstractC25232BEp.A0R(c5Tl, c5Hc) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= AbstractC25232BEp.A09(c5Tl, i5);
        }
        if ((i4 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i6 != 0) {
                i5 = 3000;
            }
            if (C0fH.A02()) {
                C0fH.A01(1355568497, "com.instagram.aistudio.editor.ImageFlash (AiNuxScreen.kt:228)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -766862483);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = AbstractC25232BEp.A0w(c5Tl, 0);
            }
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) A0q;
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Integer valueOf = Integer.valueOf(AbstractC25231BEo.A0E(interfaceC74953Yl));
            c5Tl.Eno(-766860276);
            boolean A1P = AbstractC167007dF.A1P(i4 & 112, 32) | AbstractC25228BEl.A1R(i4);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == obj) {
                EEc = new C50530MSj(interfaceC74953Yl, c5Hc, null, i5, 1);
                c5Tl.FBy(EEc);
            }
            AbstractC25228BEl.A1K(c5Tl, A0K, EEc, valueOf, false);
            C99 c99 = (C99) c5Hc.get(AbstractC25231BEo.A0E(interfaceC74953Yl));
            c5Tl.Eno(-766855232);
            boolean z = c99 instanceof C26681BqO;
            if (z) {
                imageUrl = AbstractC25234BEr.A0U(c5Tl);
            } else if (c99 instanceof C26680BqN) {
                imageUrl = ((C26680BqN) c99).A00;
            } else {
                throw B4Z.A00();
            }
            C117505Tk.A0L(A0K, false);
            c5Tl.Eno(-766847794);
            if (z) {
                str = AbstractC136736Hc.A00(c5Tl, 2131952753);
            } else if (c99 instanceof C26680BqN) {
                str = ((C26680BqN) c99).A01;
            } else {
                throw B4Z.A00();
            }
            C117505Tk.A0L(A0K, false);
            Alignment alignment = C118195Wf.A0C;
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A00 = C5XX.A00(alignment, false);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A00, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            A00(c5Tl, AbstractC25227BEk.A0J(c1130158n, 18.0f), imageUrl, 6, 0);
            AbstractC27527CCx.A00(c5Tl, null, str, 0, 0, 58, AbstractC25226BEj.A06(c5Tl), 0L, false);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1585268596);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30214DSt(c5Hc, i3, i5, i2, 0);
        }
    }
}
