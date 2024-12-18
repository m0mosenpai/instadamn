package X;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.instagram.user.model.User;
import com.instagram.wonderwall.model.WallPostItem;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Cgv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28447Cgv {
    public static final void A03(C5Tl c5Tl, C25882Bci c25882Bci, int i) {
        int i2;
        C14360o3.A0B(c25882Bci, 0);
        c5Tl.Enr(-1048609212);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c25882Bci) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-306096200, "com.instagram.wonderwall.ui.compose.screens.AggregatedWallFeedScreen (AggregatedWallFeedScreen.kt:56)");
            }
            InterfaceC74963Ym A02 = C6IB.A02(c5Tl, c25882Bci.A04, 0);
            C26041BfU c26041BfU = (C26041BfU) ((C45125Jxu) A02.getValue()).A04;
            List list = (List) ((C45125Jxu) A02.getValue()).A00;
            if (c26041BfU.A05 && list.isEmpty()) {
                c5Tl.Eno(-1457887155);
                CZ5.A01(c5Tl, 0);
            } else if (c26041BfU.A02 && list.isEmpty()) {
                c5Tl.Eno(-1457799580);
                A00(c5Tl, 0);
            } else if (c26041BfU.A03 && list.isEmpty()) {
                c5Tl.Eno(-1457703325);
                A01(c5Tl, 0);
            } else {
                c5Tl.Eno(-1457648734);
                A04(c5Tl, c25882Bci, i2 & 14);
            }
            if (AbstractC25230BEn.A1Z(c5Tl, false)) {
                C0fH.A00(-2032892118);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30498Dbh.A01(ASZ, c25882Bci, i, 10);
        }
    }

    /* JADX WARN: Type inference failed for: r23v1, types: [X.DgC, java.lang.Object] */
    public static final void A04(C5Tl c5Tl, C25882Bci c25882Bci, int i) {
        int i2;
        C14360o3.A0B(c25882Bci, 0);
        c5Tl.Enr(325017972);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c25882Bci) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1890381088, "com.instagram.wonderwall.ui.compose.screens.AggregatedWallFeedStaggeredGrid (AggregatedWallFeedScreen.kt:77)");
            }
            InterfaceC74963Ym A02 = C6IB.A02(c5Tl, c25882Bci.A04, 0);
            C26041BfU c26041BfU = (C26041BfU) ((C45125Jxu) A02.getValue()).A04;
            Object obj = ((C45125Jxu) A02.getValue()).A00;
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, c26041BfU, -716116204);
            Object EEc = c5Tl.EEc();
            if (A1Y || EEc == C5UI.A00) {
                EEc = AbstractC25227BEk.A0j(c5Tl, c26041BfU.A06);
            }
            Boolean bool = (Boolean) EEc;
            boolean booleanValue = bool.booleanValue();
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            c5Tl.Eno(-716111464);
            int i3 = i2 & 14;
            boolean A1P = AbstractC167007dF.A1P(i3, 4);
            Object EEc2 = c5Tl.EEc();
            if (A1P || EEc2 == C5UI.A00) {
                EEc2 = DGU.A00(c5Tl, c25882Bci, 6);
            }
            C25246BFf A00 = BGQ.A00(null, c5Tl, AbstractC25225BEi.A1A(A0K, EEc2, false), 0.0f, 3072, 52, booleanValue);
            Modifier A0V = AbstractC25228BEl.A0V();
            Modifier A002 = BGR.A00(A0V, A00);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A003 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A002);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0b, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A003);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C119645bN c119645bN = C119645bN.A00;
            c5Tl.Eno(-478659689);
            if (!booleanValue) {
                AbstractC28448Cgw.A00(c119645bN, c5Tl, AbstractC25231BEo.A05(A00.A06) / A00.A01, 6, 0);
            }
            C117505Tk.A0L(A0K, false);
            LazyStaggeredGridState A004 = AbstractC27473CAu.A00(c5Tl);
            ?? obj2 = new Object();
            float f = 12.0f;
            if (((C45125Jxu) A02.getValue()).A02) {
                f = 0.0f;
            }
            C6ID A012 = AbstractC118255Wn.A01(f);
            float f2 = 8.0f;
            if (((C45125Jxu) A02.getValue()).A02) {
                f2 = 0.0f;
            }
            C1333560c c1333560c = new C1333560c(f2, f2, f2, f2);
            boolean A1Y2 = AbstractC25227BEk.A1Y(c5Tl, A00, -478638477);
            Object EEc3 = c5Tl.EEc();
            if (A1Y2 || EEc3 == C5UI.A00) {
                EEc3 = C30179DRk.A01(A00, 14);
                c5Tl.FBy(EEc3);
            }
            Modifier A09 = AbstractC25233BEq.A09(A0K, A0V, EEc3);
            boolean A1U = AbstractC25228BEl.A1U(c5Tl, c26041BfU, AbstractC25232BEp.A1W(c5Tl, A02, -478634369, booleanValue) | AbstractC25231BEo.A1J(i3), c5Tl.AH4(obj));
            Object EEc4 = c5Tl.EEc();
            if (A1U || EEc4 == C5UI.A00) {
                EEc4 = new DI0(4, obj, A02, c26041BfU, c25882Bci, booleanValue);
                c5Tl.FBy(EEc4);
            }
            InterfaceC16660sJ A1B = AbstractC25225BEi.A1B(A0K, EEc4, false);
            C5C7 c5c7 = LazyStaggeredGridState.A0M;
            AbstractC28011CWj.A00(null, A012, c1333560c, A004, obj2, c5Tl, A09, A1B, 12.0f, (8 << 6) | 100859904, 144, false, true);
            boolean A1W = AbstractC25227BEk.A1W(c5Tl, -478583296, booleanValue) | AbstractC25230BEn.A1R(i3);
            Object EEc5 = c5Tl.EEc();
            if (A1W || EEc5 == C5UI.A00) {
                EEc5 = AbstractC25229BEm.A0x(c5Tl, c25882Bci, 44, booleanValue);
            }
            BGP.A04(A004, c5Tl, AbstractC25225BEi.A1A(A0K, EEc5, false), 5, 56, 0);
            boolean A1X = AbstractC25226BEj.A1X(c5Tl, A004, AbstractC25227BEk.A1W(c5Tl, -478579374, booleanValue));
            Object EEc6 = c5Tl.EEc();
            if (A1X || EEc6 == C5UI.A00) {
                EEc6 = new PZK(A004, null, 18, booleanValue);
                c5Tl.FBy(EEc6);
            }
            AbstractC25228BEl.A1K(c5Tl, A0K, EEc6, bool, false);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(2068750963);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30498Dbh.A01(ASZ, c25882Bci, i, 11);
        }
    }

    public static final void A00(C5Tl c5Tl, int i) {
        c5Tl.Enr(164344021);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1632249534, "com.instagram.wonderwall.ui.compose.screens.AggregatedWallEmptyState (AggregatedWallFeedScreen.kt:242)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A08 = AbstractC118175Wb.A08(AbstractC25226BEj.A0U(c1130158n), 20.0f);
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
            AbstractC25236BEt.A0k(c5Tl, c1130158n, R.drawable.ig_illustrations_illo_boards);
            AbstractC25226BEj.A1O(c5Tl, c1130158n, 24.0f);
            AbstractC25236BEt.A0j(c5Tl, 2131976963);
            AbstractC25226BEj.A1O(c5Tl, c1130158n, 8.0f);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-267661381);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30493Dbc.A01(ASZ, i, 27);
        }
    }

    public static final void A01(C5Tl c5Tl, int i) {
        c5Tl.Enr(417352479);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-298131780, "com.instagram.wonderwall.ui.compose.screens.AggregatedWallErrorScreen (AggregatedWallFeedScreen.kt:218)");
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
                C0fH.A00(43104563);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30493Dbc.A01(ASZ, i, 28);
        }
    }

    public static final void A02(C5Tl c5Tl, C26084BgD c26084BgD, C25882Bci c25882Bci, int i) {
        int i2;
        float f;
        Float[] fArr;
        Object valueOf;
        c5Tl.Enr(-1148380724);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c26084BgD) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, c25882Bci);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(837026630, "com.instagram.wonderwall.ui.compose.screens.WallTimelineRow (AggregatedWallFeedScreen.kt:168)");
            }
            User user = (User) c26084BgD.A02;
            C1130158n A0N = AbstractC25225BEi.A0N(c5Tl, -1514227343);
            Modifier A0T = AbstractC25226BEj.A0T(A0N);
            Modifier modifier = A0T;
            List list = (List) c26084BgD.A03;
            Object A0J = AbstractC001800i.A0J(list);
            if (A0J != null) {
                boolean A1X = AbstractC25225BEi.A1X(c5Tl, A0J, AbstractC25233BEq.A1P(c5Tl, -1169138680, i2));
                Object EEc = c5Tl.EEc();
                if (A1X || EEc == C5UI.A00) {
                    EEc = C29895DGj.A00(c5Tl, c25882Bci, A0J, 23);
                }
                AbstractC25228BEl.A1O(c5Tl);
                modifier = A0T.Eq3(CY3.A01(c5Tl, A0N, (InterfaceC16820sZ) EEc));
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, modifier);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0Y, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            BI4.A05(c5Tl, AbstractC43541zP.A00(c5Tl, user.Bhu()), BI3.A04, user.getUsername(), AbstractC136736Hc.A01(c5Tl, AbstractC25228BEl.A1Y(c26084BgD.A01), 2131952538), 0, 63468);
            Modifier A0A = AbstractC118175Wb.A0A(A0T, 0.0f, 16.0f);
            InterfaceC1127857k A0a = AbstractC25226BEj.A0a(false);
            int A002 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A0A);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0a, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            Iterator A0x = AbstractC25227BEk.A0x(c5Tl, list, -676020519);
            int i3 = 0;
            while (A0x.hasNext()) {
                Object next = A0x.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                WallPostItem wallPostItem = (WallPostItem) next;
                float f2 = -4.0f;
                if (i3 == AbstractC25226BEj.A05(list)) {
                    f2 = 6.0f;
                }
                Float valueOf2 = Float.valueOf(f2);
                if (list.size() > 1) {
                    f = valueOf2.floatValue();
                } else {
                    f = 0.0f;
                }
                boolean A1X2 = AbstractC25234BEr.A1X(c5Tl, -2105464005, i2);
                Object EEc2 = c5Tl.EEc();
                if (A1X2 || EEc2 == C5UI.A00) {
                    int size = list.size();
                    if (size != 1) {
                        if (size != 2) {
                            fArr = new Float[]{Float.valueOf(-20.0f), Float.valueOf(0.0f), Float.valueOf(20.0f)};
                        } else {
                            fArr = new Float[]{Float.valueOf(-10.0f), Float.valueOf(10.0f)};
                        }
                        EEc2 = AbstractC16960so.A1Q(fArr);
                    } else {
                        EEc2 = AbstractC166987dD.A1J(Float.valueOf(0.0f));
                    }
                    c5Tl.FBy(EEc2);
                }
                List list2 = (List) EEc2;
                C117505Tk.A0L(c117505Tk, false);
                Modifier A003 = CBA.A00(AbstractC118185Wd.A0D(A0N, 165.0f), f);
                if (i3 < list2.size()) {
                    valueOf = list2.get(i3);
                } else {
                    valueOf = Float.valueOf(0.0f);
                }
                AbstractC28404CgA.A00(c5Tl, AbstractC28010CWi.A00(A003, AbstractC166987dD.A09(valueOf), 0.0f), wallPostItem, c25882Bci, null, ((i2 << 6) & 7168) | 1794432, 0, false, false, false);
                i3 = i4;
            }
            if (AbstractC25233BEq.A1S(c5Tl, c117505Tk)) {
                C0fH.A00(-853146032);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30508Dbr.A01(ASZ, c26084BgD, c25882Bci, i, 28);
        }
    }
}
