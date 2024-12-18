package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.ChH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28465ChH {
    public static final void A02(C5Tl c5Tl, C45997KXl c45997KXl, int i) {
        int i2;
        C14360o3.A0B(c45997KXl, 0);
        c5Tl.Enr(-1965438205);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c45997KXl) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1222015333, "com.instagram.friendmap.view.compose.AudienceListSearchBar (FriendMapAudienceListScreen.kt:78)");
            }
            InterfaceC74963Ym A02 = C6IB.A02(c5Tl, c45997KXl.A02, 0);
            String str = ((C45291K2t) A02.getValue()).A00;
            boolean A1O = AbstractC25233BEq.A1O(c5Tl, 735250967, i2);
            Object EEc = c5Tl.EEc();
            if (A1O || EEc == C5UI.A00) {
                EEc = AbstractC25235BEs.A11(c5Tl, c45997KXl, 13);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            AbstractC28411CgH.A02(c5Tl, null, null, AbstractC25226BEj.A0g(c5Tl), str, (InterfaceC16660sJ) EEc, C30713DfB.A00(c5Tl, c45997KXl, A02, 5, -1893689562), 1, 0, 805306368, 196608, 32220, false);
            if (C0fH.A02()) {
                C0fH.A00(1472888670);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30497Dbg.A01(ASZ, c45997KXl, i, 18);
        }
    }

    public static final void A03(C5Tl c5Tl, C45997KXl c45997KXl, int i) {
        int i2;
        C14360o3.A0B(c45997KXl, 0);
        c5Tl.Enr(928514880);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c45997KXl) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(172477154, "com.instagram.friendmap.view.compose.FriendMapAudienceListScreen (FriendMapAudienceListScreen.kt:52)");
            }
            InterfaceC74963Ym A02 = C6IB.A02(c5Tl, c45997KXl.A02, 0);
            Modifier A0U = AbstractC25226BEj.A0U(Modifier.A00);
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0U);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0Y, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            int i3 = i2 & 14;
            A02(c5Tl, c45997KXl, i3);
            if (((C45291K2t) A02.getValue()).A08) {
                c5Tl.Eno(632429620);
                A00(c5Tl, 0);
            } else if (((C45291K2t) A02.getValue()).A07) {
                c5Tl.Eno(632431318);
                A01(c5Tl, 0);
            } else {
                C5Hc A002 = AbstractC133095zb.A00(((C45291K2t) AbstractC25227BEk.A0r(c5Tl, A02, -1869408611)).A01);
                boolean z = ((C45291K2t) A02.getValue()).A09;
                boolean z2 = ((C45291K2t) A02.getValue()).A02;
                boolean A1U = AbstractC25232BEp.A1U(c5Tl, 632438525, i3, 4);
                Object EEc = c5Tl.EEc();
                if (A1U || EEc == C5UI.A00) {
                    EEc = AbstractC25235BEs.A11(c5Tl, c45997KXl, 14);
                }
                InterfaceC16660sJ A1B = AbstractC25225BEi.A1B(c117505Tk, EEc, false);
                boolean A1S = AbstractC25229BEm.A1S(c5Tl, 632442103, i3, 4);
                Object EEc2 = c5Tl.EEc();
                if (A1S || EEc2 == C5UI.A00) {
                    EEc2 = new C50158MDl(c45997KXl, 22);
                    c5Tl.FBy(EEc2);
                }
                A04(c5Tl, AbstractC25225BEi.A1A(c117505Tk, EEc2, false), A1B, A002, 8, z, z2);
            }
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.ASW();
            if (((C45291K2t) A02.getValue()).A03) {
                CGQ.A00(c5Tl, AbstractC136736Hc.A00(c5Tl, 2131962915), 0, 0);
            }
            if (C0fH.A02()) {
                C0fH.A00(1864403713);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30497Dbg.A01(ASZ, c45997KXl, i, 19);
        }
    }

    public static final void A04(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, C5Hc c5Hc, int i, boolean z, boolean z2) {
        int i2;
        boolean z3;
        C14360o3.A0B(c5Hc, 0);
        int A08 = AbstractC25230BEn.A08(3, interfaceC16660sJ, interfaceC16820sZ);
        c5Tl.Enr(1179096487);
        if ((i & 6) == 0) {
            i2 = AbstractC25230BEn.A04(AbstractC25233BEq.A1T(c5Tl, c5Hc, i) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0d(c5Tl, z2);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1060924011, "com.instagram.friendmap.view.compose.CustomAudienceUserList (FriendMapAudienceListScreen.kt:172)");
            }
            LazyListState A00 = C6IE.A00(c5Tl, 0, 0, 0, 3);
            Modifier A0W = AbstractC25228BEl.A0W();
            c5Tl.Eno(-1554540548);
            if ((i2 & 14) == A08 || ((i2 & 8) != 0 && c5Tl.AH6(c5Hc))) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean A1P = z3 | AbstractC167007dF.A1P(i2 & 7168, C3OO.FLAG_MOVED) | AbstractC25231BEo.A1K(i2);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = new BQB(15, c5Hc, interfaceC16660sJ, z);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            boolean z4 = false;
            C6IS.A04(A00, c5Tl, A0W, (InterfaceC16660sJ) EEc, 12582918, 124, true);
            boolean A1Z = AbstractC25234BEr.A1Z(c5Tl, -1554498294, i2);
            if ((i2 & 57344) == 16384) {
                z4 = true;
            }
            boolean z5 = A1Z | z4;
            Object EEc2 = c5Tl.EEc();
            if (z5 || EEc2 == C5UI.A00) {
                EEc2 = AbstractC25229BEm.A0x(c5Tl, interfaceC16820sZ, 32, z2);
            }
            BGP.A00(A00, c5Tl, AbstractC25225BEi.A1A(A0K, EEc2, false));
            if (C0fH.A02()) {
                C0fH.A00(1779416922);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUJ(interfaceC16660sJ, interfaceC16820sZ, c5Hc, i, 1, z, z2);
        }
    }

    public static final void A05(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF, int i, boolean z, boolean z2) {
        int i2;
        AbstractC167017dG.A1R(interfaceC16620sF, interfaceC16820sZ);
        c5Tl.Enr(-1863690303);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0b(c5Tl, z) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16620sF);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-2128357207, "com.instagram.friendmap.view.compose.AudienceListSearchDecoration (FriendMapAudienceListScreen.kt:99)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            Modifier A0A = AbstractC118175Wb.A0A(AbstractC25228BEl.A0Z(AbstractC118185Wd.A08(AbstractC118175Wb.A0E(AbstractC118175Wb.A0A(A0T, C5XT.A00(c5Tl), 0.0f), 0.0f, C5XT.A00(c5Tl), 0.0f, 0.0f), 36.0f), 10.0f, C5XL.A00(c5Tl).A0C), C5XT.A01(c5Tl), 0.0f);
            InterfaceC1127857k A0S = AbstractC25231BEo.A0S(c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0A);
            InterfaceC16820sZ interfaceC16820sZ2 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0S, A04, interfaceC16620sF2);
            InterfaceC16620sF interfaceC16620sF3 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            C6L0 c6l0 = C6L0.A00;
            AbstractC25230BEn.A18(c5Tl, AbstractC118185Wd.A03(c1130158n), C5Y7.A00(c5Tl, R.drawable.instagram_search_pano_outline_24, 0));
            Modifier A0A2 = AbstractC118175Wb.A0A(c6l0.A00(A0T), C5XT.A02(c5Tl, R.dimen.account_discovery_bottom_gap), 0.0f);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A002 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A0A2);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A0b, interfaceC16620sF2);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A002);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            C119645bN c119645bN = C119645bN.A00;
            c5Tl.Eno(95784121);
            if (z) {
                String A003 = AbstractC136736Hc.A00(c5Tl, 2131962913);
                C5WR.A0X(c5Tl, c119645bN.AB5(C118195Wf.A0B, c1130158n), AbstractC25226BEj.A0g(c5Tl), A003, AbstractC25226BEj.A0M(c5Tl));
            }
            C117505Tk.A0L(c117505Tk, false);
            AbstractC25231BEo.A14(c5Tl, interfaceC16620sF, i2 >> 6);
            c5Tl.Eno(2068763456);
            if (z2) {
                C2DC A004 = C5Y7.A00(c5Tl, R.drawable.instagram_x_pano_outline_24, 0);
                Modifier A03 = AbstractC118185Wd.A03(c1130158n);
                boolean A1a = AbstractC25234BEr.A1a(c5Tl, 2068770233, i2);
                Object EEc = c5Tl.EEc();
                if (A1a || EEc == C5UI.A00) {
                    EEc = new C50158MDl(interfaceC16820sZ, 21);
                    c5Tl.FBy(EEc);
                }
                C5YS.A06(c5Tl, C5XR.A05(A03, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc, false), true), A004, AbstractC25226BEj.A0L(c5Tl));
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(107031615);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DTW(interfaceC16620sF, interfaceC16820sZ, i, 0, z2, z);
        }
    }

    public static final void A00(C5Tl c5Tl, int i) {
        c5Tl.Enr(-99326098);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1300438875, "com.instagram.friendmap.view.compose.AudienceListLoading (FriendMapAudienceListScreen.kt:144)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A08 = AbstractC118175Wb.A08(AbstractC25226BEj.A0U(c1130158n), 24.0f);
            InterfaceC1127857k A00 = C5XX.A00(C118195Wf.A0C, false);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A08);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A00, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            BIR.A02(c5Tl, AbstractC118185Wd.A0C(c1130158n, 36.0f), BIX.A00(c5Tl), 70, 0, AbstractC25226BEj.A0M(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1034993762);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30493Dbc.A01(ASZ, i, 3);
        }
    }

    public static final void A01(C5Tl c5Tl, int i) {
        c5Tl.Enr(2063105301);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1393247954, "com.instagram.friendmap.view.compose.AudienceListNoResults (FriendMapAudienceListScreen.kt:154)");
            }
            Modifier A08 = AbstractC118175Wb.A08(AbstractC25228BEl.A0V(), 24.0f);
            InterfaceC1127857k A00 = C5XX.A00(C118195Wf.A0C, false);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A08);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A00, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C5WR.A0x(c5Tl, AbstractC25226BEj.A0g(c5Tl), AbstractC136736Hc.A00(c5Tl, 2131968593), AbstractC25226BEj.A0M(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(99343973);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30493Dbc.A01(ASZ, i, 4);
        }
    }
}
