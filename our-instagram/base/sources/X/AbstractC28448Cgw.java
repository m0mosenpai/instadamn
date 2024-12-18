package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.instagram.wonderwall.model.WallInfo;

/* renamed from: X.Cgw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28448Cgw {
    public static final void A02(C5Tl c5Tl, C25883Bcj c25883Bcj, int i) {
        int i2;
        String A0p;
        C14360o3.A0B(c25883Bcj, 0);
        c5Tl.Enr(-143189629);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c25883Bcj) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1731985303, "com.instagram.wonderwall.ui.compose.screens.WallEmptyState (WallFeedScreen.kt:163)");
            }
            InterfaceC74963Ym A02 = C6IB.A02(c5Tl, c25883Bcj.A09, 0);
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, A02.getValue(), -183607567);
            Object EEc = c5Tl.EEc();
            if (A1Y || EEc == C5UI.A00) {
                EEc = (WallInfo) ((C26059Bfm) A02.getValue()).A03;
                c5Tl.FBy(EEc);
            }
            WallInfo wallInfo = (WallInfo) EEc;
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C1130158n c1130158n = Modifier.A00;
            Modifier A01 = AbstractC118175Wb.A01(c1130158n);
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A01);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0Y, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A012);
            c5Tl.Eno(586163233);
            if (wallInfo != null && wallInfo.A02) {
                CZ4.A00(c5Tl, wallInfo, c25883Bcj, (i2 << 3) & 112);
            }
            C117505Tk.A0L(A0K, false);
            Modifier A08 = AbstractC118175Wb.A08(AbstractC25226BEj.A0U(c1130158n), 20.0f);
            InterfaceC1127857k A0O = AbstractC25235BEs.A0O(c5Tl);
            int A002 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A013 = C5X3.A01(c5Tl, A08);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0O, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            AbstractC25236BEt.A0k(c5Tl, c1130158n, R.drawable.ig_illustrations_illo_boards);
            AbstractC25226BEj.A1O(c5Tl, c1130158n, 24.0f);
            AbstractC25236BEt.A0j(c5Tl, 2131976963);
            AbstractC25226BEj.A1O(c5Tl, c1130158n, 8.0f);
            c5Tl.Eno(-1979388517);
            if (wallInfo != null && wallInfo.A02) {
                if (wallInfo.A03) {
                    c5Tl.Eno(-1979385897);
                    A0p = AbstractC136736Hc.A00(c5Tl, 2131976962);
                } else {
                    c5Tl.Eno(-1979383021);
                    A0p = AbstractC25235BEs.A0p(c5Tl, wallInfo.A00.getUsername(), 2131976972);
                }
                C117505Tk.A0L(A0K, false);
                AbstractC25235BEs.A1F(c5Tl, AbstractC25226BEj.A0g(c5Tl), A0p);
            }
            if (AbstractC25233BEq.A1S(c5Tl, A0K)) {
                C0fH.A00(499039171);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30498Dbh.A01(ASZ, c25883Bcj, i, 12);
        }
    }

    public static final void A03(C5Tl c5Tl, C25883Bcj c25883Bcj, int i) {
        int i2;
        C14360o3.A0B(c25883Bcj, 0);
        c5Tl.Enr(-754614423);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c25883Bcj) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-431189647, "com.instagram.wonderwall.ui.compose.screens.WallFeedScreen (WallFeedScreen.kt:55)");
            }
            InterfaceC74963Ym A02 = C6IB.A02(c5Tl, c25883Bcj.A09, 0);
            if (((C26059Bfm) A02.getValue()).A09) {
                c5Tl.Eno(-885680718);
                CZ5.A01(c5Tl, 0);
            } else if (((C26059Bfm) A02.getValue()).A06) {
                c5Tl.Eno(-885617850);
                A02(c5Tl, c25883Bcj, i2 & 14);
            } else if (((C26059Bfm) A02.getValue()).A07) {
                c5Tl.Eno(-885543822);
                A01(c5Tl, 0);
            } else if (AbstractC25228BEl.A1X(((C26059Bfm) A02.getValue()).A02)) {
                c5Tl.Eno(-885477761);
                A04(c5Tl, c25883Bcj, i2 & 14);
            } else {
                c5Tl.Eno(-885425743);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            C27915CSa c27915CSa = (C27915CSa) ((C26059Bfm) A02.getValue()).A01;
            if (c27915CSa != null) {
                AbstractC28470ChM.A04(c5Tl, c27915CSa, 8);
            }
            if (C0fH.A02()) {
                C0fH.A00(-309145258);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30498Dbh.A01(ASZ, c25883Bcj, i, 13);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e4, code lost:
    
        if (r10.A05.CcT() != false) goto L68;
     */
    /* JADX WARN: Type inference failed for: r25v1, types: [X.DgC, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.C5Tl r37, X.C25883Bcj r38, int r39) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28448Cgw.A04(X.5Tl, X.Bcj, int):void");
    }

    public static final void A00(InterfaceC119655bO interfaceC119655bO, C5Tl c5Tl, float f, int i, int i2) {
        int i3;
        float f2 = f;
        c5Tl.Enr(431036924);
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, interfaceC119655bO) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A04(c5Tl, f2);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                f2 = 0.0f;
            }
            if (C0fH.A02()) {
                C0fH.A01(-323325617, "com.instagram.wonderwall.ui.compose.screens.WallRefreshIndicator (WallFeedScreen.kt:223)");
            }
            BGY.A01(c5Tl, interfaceC119655bO.AB5(C118195Wf.A0C, Modifier.A00), f2, 2.0f, 0.0f, ((i3 >> 3) & 14) | 196608, 88, AbstractC25226BEj.A0F(c5Tl), 0L, false);
            if (C0fH.A02()) {
                C0fH.A00(935362488);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DSQ(interfaceC119655bO, f2, i, i2);
        }
    }

    public static final void A01(C5Tl c5Tl, int i) {
        c5Tl.Enr(1301386431);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1593404762, "com.instagram.wonderwall.ui.compose.screens.WallErrorScreen (WallFeedScreen.kt:199)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A08 = AbstractC118175Wb.A08(AbstractC25226BEj.A0U(c1130158n), 32.0f);
            InterfaceC1127857k A0O = AbstractC25235BEs.A0O(c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A08);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0O, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            AbstractC25236BEt.A0k(c5Tl, c1130158n, R.drawable.ig_illustrations_illo_warning_refresh);
            AbstractC25226BEj.A1O(c5Tl, c1130158n, 24.0f);
            AbstractC25236BEt.A0j(c5Tl, 2131976965);
            AbstractC25226BEj.A1O(c5Tl, c1130158n, 8.0f);
            AbstractC25235BEs.A1F(c5Tl, AbstractC25226BEj.A0g(c5Tl), AbstractC136736Hc.A00(c5Tl, 2131976964));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-868371653);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30493Dbc.A01(ASZ, i, 29);
        }
    }
}
