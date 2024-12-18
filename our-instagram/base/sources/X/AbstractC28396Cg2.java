package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.instagram.compose.core.ui.IgClickableTextKt;

/* renamed from: X.Cg2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28396Cg2 {
    public static final void A01(C5Tl c5Tl, LLR llr, C47447Kxc c47447Kxc, C45292K2u c45292K2u, int i) {
        int i2;
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        boolean z4;
        boolean z5;
        AbstractC167007dF.A1K(c45292K2u, c47447Kxc);
        C14360o3.A0B(llr, 2);
        c5Tl.Enr(-725171295);
        if ((i & 6) == 0) {
            i2 = AbstractC25230BEn.A04(AbstractC25233BEq.A1T(c5Tl, c45292K2u, i) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25230BEn.A05(AbstractC25233BEq.A1U(c5Tl, c47447Kxc, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, llr);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-712412216, "com.instagram.friendmap.view.compose.FriendMapSettingsScreen (FriendMapSettingsScreen.kt:70)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -1023267581);
            Object obj = C5UI.A00;
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) AbstractC25234BEr.A0c(c5Tl, A0q, obj, false);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C1130158n c1130158n = Modifier.A00;
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            InterfaceC1127857k A0e = AbstractC25228BEl.A0e(c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A0T);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q2 = AbstractC25229BEm.A0q(c5Tl, A0e, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            C6GM c6gm = C6GM.A00;
            Modifier A0E = AbstractC118175Wb.A0E(A0T, C5XT.A00(c5Tl), 0.0f, C5XT.A00(c5Tl), 0.0f);
            InterfaceC1127857k A0L = AbstractC25235BEs.A0L(AbstractC118255Wn.A02, c5Tl);
            int A002 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A0E);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0L, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q2) || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            C6L0 c6l0 = C6L0.A00;
            C2DC A003 = C5Y7.A00(c5Tl, R.drawable.instagram_chevron_left_pano_outline_24, 0);
            c5Tl.Eno(1634146047);
            int i3 = i2 & 112;
            if (i3 == 32 || ((i2 & 64) != 0 && c5Tl.AH6(c47447Kxc))) {
                z = true;
            } else {
                z = false;
            }
            Object EEc = c5Tl.EEc();
            if (z || EEc == obj) {
                EEc = new C50158MDl(c47447Kxc, 27);
                c5Tl.FBy(EEc);
            }
            AbstractC28395Cg1.A00(null, c5Tl, null, A003, null, AbstractC25225BEi.A1A(A0K, EEc, false), 0.0f, 0, 125, 0L, false);
            C5WR.A0Z(c5Tl, c6l0.A00(AbstractC25236BEt.A0I(c5Tl, c1130158n, C5XT.A02(c5Tl, R.dimen.abc_action_bar_elevation_material), C5XT.A01(c5Tl))), AbstractC25226BEj.A0d(c5Tl), AbstractC136736Hc.A00(c5Tl, 2131962932), AbstractC25226BEj.A0G(c5Tl));
            c5Tl.Eno(1634170527);
            if (c45292K2u.A07) {
                C2DC A004 = C5Y7.A00(c5Tl, R.drawable.instagram_more_horizontal_pano_outline_24, 0);
                boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, llr, 1634175609);
                Object EEc2 = c5Tl.EEc();
                if (A1Z || EEc2 == obj) {
                    EEc2 = new ME1(29, interfaceC74953Yl, llr);
                    c5Tl.FBy(EEc2);
                }
                AbstractC28395Cg1.A00(null, c5Tl, null, A004, null, AbstractC25225BEi.A1A(A0K, EEc2, false), 0.0f, 0, 125, 0L, false);
                boolean A1X = AbstractC25230BEn.A1X(interfaceC74953Yl);
                long A005 = AbstractC27485CBg.A00(10.0f, 10.0f);
                c5Tl.Eno(1634183528);
                if (i3 == 32 || ((i2 & 64) != 0 && c5Tl.AH6(c47447Kxc))) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                Object EEc3 = c5Tl.EEc();
                if (z5 || EEc3 == obj) {
                    EEc3 = new C50362MLo(2, interfaceC74953Yl, c47447Kxc);
                    c5Tl.FBy(EEc3);
                }
                InterfaceC16660sJ A1B = AbstractC25225BEi.A1B(A0K, EEc3, false);
                Object A0q3 = AbstractC25227BEk.A0q(c5Tl, 1634190974);
                if (A0q3 == obj) {
                    A0q3 = new C50158MDl(interfaceC74953Yl, 28);
                    c5Tl.FBy(A0q3);
                }
                CY0.A01(c5Tl, AbstractC25225BEi.A1A(A0K, A0q3, false), A1B, C30450Dav.A00, 196992, A005, A1X);
            }
            C117505Tk.A0L(A0K, false);
            c5Tl.ASW();
            if (AbstractC25227BEk.A1U(c5Tl, -1778463105)) {
                C0fH.A01(-1482436352, "com.instagram.friendmap.view.compose.settingsSubtitle (FriendMapSettingsScreen.kt:401)");
            }
            String A006 = AbstractC136736Hc.A00(c5Tl, 2131962924);
            String A0p = AbstractC25235BEs.A0p(c5Tl, A006, 2131962927);
            int A08 = AbstractC001900j.A08(A0p, A006, 0, false);
            int A043 = AbstractC25226BEj.A04(A006, A08);
            C5W3 c5w3 = new C5W3(null, null, null, null, null, 65534, AbstractC25226BEj.A0C(c5Tl), 0L, 0L);
            C6C7 A0U = AbstractC25231BEo.A0U(A0p);
            A0U.A06(c5w3, A08, A043);
            C5C8 A0R = AbstractC25227BEk.A0R(A0U, "link", AbstractC43591JPw.A00(205), A08, A043);
            if (C0fH.A02()) {
                C0fH.A00(497939214);
            }
            C117505Tk.A0L(A0K, false);
            Modifier A0I = AbstractC25236BEt.A0I(c5Tl, c1130158n, C5XT.A01(c5Tl), 20.0f);
            long A0M = AbstractC25226BEj.A0M(c5Tl);
            C118125Vw A0c = AbstractC25226BEj.A0c(c5Tl);
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, A0R, 553630711);
            if (i3 == 32 || ((i2 & 64) != 0 && c5Tl.AH6(c47447Kxc))) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z6 = A1Y | z2;
            Object EEc4 = c5Tl.EEc();
            if (z6 || EEc4 == obj) {
                EEc4 = new C50362MLo(3, c47447Kxc, A0R);
                c5Tl.FBy(EEc4);
            }
            IgClickableTextKt.A07(c5Tl, A0I, A0R, A0c, AbstractC25225BEi.A1B(A0K, EEc4, false), A0M);
            boolean z7 = c45292K2u.A09;
            AbstractC28495Cho.A08(c6gm, c5Tl, C30713DfB.A00(c5Tl, c45292K2u, c47447Kxc, 9, 317334127), !z7);
            AbstractC28495Cho.A08(c6gm, c5Tl, C30713DfB.A00(c5Tl, c45292K2u, c47447Kxc, 10, 1435309542), c45292K2u.A04);
            int i4 = 2131962934;
            if (z7) {
                i4 = 2131962926;
            }
            String A007 = AbstractC136736Hc.A00(c5Tl, i4);
            c5Tl.Eno(553690979);
            if (z7) {
                str = AbstractC136736Hc.A00(c5Tl, 2131962916);
            } else {
                str = null;
            }
            C117505Tk.A0L(A0K, false);
            boolean z8 = c45292K2u.A0A;
            boolean z9 = c45292K2u.A0B;
            c5Tl.Eno(553700038);
            if (i3 == 32 || ((i2 & 64) != 0 && c5Tl.AH6(c47447Kxc))) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object EEc5 = c5Tl.EEc();
            if (z3 || EEc5 == obj) {
                EEc5 = new C50158MDl(c47447Kxc, 33);
                c5Tl.FBy(EEc5);
            }
            InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(A0K, EEc5, false);
            c5Tl.Eno(553702368);
            if (i3 == 32 || ((i2 & 64) != 0 && c5Tl.AH6(c47447Kxc))) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object EEc6 = c5Tl.EEc();
            if (z4 || EEc6 == obj) {
                EEc6 = new C50158MDl(c47447Kxc, 34);
                c5Tl.FBy(EEc6);
            }
            AbstractC28506Chz.A02(c5Tl, null, null, A007, str, A1A, AbstractC25225BEi.A1A(A0K, EEc6, false), 0, 0, 32644, z9, z8);
            C5WR.A0Z(c5Tl, AbstractC25236BEt.A0I(c5Tl, c1130158n, C5XT.A01(c5Tl), C5XT.A01(c5Tl)), AbstractC25226BEj.A0c(c5Tl), AbstractC136736Hc.A00(c5Tl, 2131962918), AbstractC25226BEj.A0M(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1433499293);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30219DSy(i, 2, llr, c45292K2u, c47447Kxc);
        }
    }

    public static final void A02(C5Tl c5Tl, EnumC92974Es enumC92974Es, C45292K2u c45292K2u, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        int i3;
        InterfaceC16820sZ interfaceC16820sZ2 = interfaceC16820sZ;
        AbstractC167017dG.A1N(enumC92974Es, c45292K2u);
        C14360o3.A0B(interfaceC16660sJ, 3);
        c5Tl.Enr(-1295797300);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, enumC92974Es) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25230BEn.A05(AbstractC25233BEq.A1U(c5Tl, c45292K2u, i) ? 1 : 0);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ2);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ);
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                interfaceC16820sZ2 = null;
            }
            if (C0fH.A02()) {
                C0fH.A01(-701072986, "com.instagram.friendmap.view.compose.FriendMapAudienceCell (FriendMapSettingsScreen.kt:230)");
            }
            C5XO c5xo = (C5XO) AbstractC25234BEr.A0Y(c5Tl, -406437729);
            AbstractC25225BEi.A1T(c5Tl);
            float f = 0.3f;
            if (c45292K2u.A08) {
                f = 1.0f;
            }
            AbstractC25230BEn.A17(c5Tl, AbstractC131065vu.A00.A02(Float.valueOf(f)), new DU2(c5xo, enumC92974Es, c45292K2u, interfaceC16820sZ2, interfaceC16660sJ, f, AbstractC167007dF.A1X(enumC92974Es, c45292K2u.A03)), -1352677620);
            if (C0fH.A02()) {
                C0fH.A00(-904819595);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30492Dbb(c45292K2u, interfaceC16820sZ2, interfaceC16660sJ, enumC92974Es, i, i2, 20);
        }
    }

    public static final void A03(C5Tl c5Tl, C45292K2u c45292K2u, InterfaceC16820sZ interfaceC16820sZ, int i) {
        int i2;
        AbstractC167007dF.A1K(c45292K2u, interfaceC16820sZ);
        c5Tl.Enr(-1542344534);
        if ((i & 6) == 0) {
            i2 = AbstractC25230BEn.A04(AbstractC25233BEq.A1T(c5Tl, c45292K2u, i) ? 1 : 0) | i;
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
                C0fH.A01(-249434902, "com.instagram.friendmap.view.compose.FriendMapPrivateModeCell (FriendMapSettingsScreen.kt:209)");
            }
            String A00 = AbstractC136736Hc.A00(c5Tl, 2131962923);
            boolean z = c45292K2u.A08;
            Modifier A0Y = AbstractC25228BEl.A0Y(AbstractC25227BEk.A0M(Modifier.A00, C5XT.A00(c5Tl)), 8.0f, 1.0f, AbstractC25226BEj.A0K(c5Tl));
            C2DC A002 = C5Y7.A00(c5Tl, R.drawable.instagram_eye_off_pano_outline_24, 0);
            String A003 = AbstractC136736Hc.A00(c5Tl, 2131962922);
            boolean A1X = AbstractC167007dF.A1X(c45292K2u.A03, EnumC92974Es.A09);
            boolean A1X2 = AbstractC25235BEs.A1X(c5Tl, 165116557, i2);
            Object EEc = c5Tl.EEc();
            if (A1X2 || EEc == C5UI.A00) {
                EEc = new C50355MLh(interfaceC16820sZ, 17);
                c5Tl.FBy(EEc);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            AbstractC25705BXp.A08(c5Tl, A0Y, A002, new C29199Cu4((InterfaceC16660sJ) EEc, A1X, false), A00, A003, 0, 130760, z);
            if (C0fH.A02()) {
                C0fH.A00(1687975169);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30510Dbt.A01(ASZ, c45292K2u, interfaceC16820sZ, i, 28);
        }
    }

    public static final String A00(C5Tl c5Tl, EnumC92974Es enumC92974Es) {
        int i;
        if (C0fH.A02()) {
            C0fH.A01(-1649759999, "com.instagram.friendmap.view.compose.title (FriendMapSettingsScreen.kt:346)");
        }
        int ordinal = enumC92974Es.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 6) {
                    if (ordinal != 4) {
                        i = 2131962917;
                        if (ordinal != 5) {
                            i = 2131962923;
                        }
                    } else {
                        i = 2131962920;
                    }
                } else {
                    i = 2131962921;
                }
            } else {
                i = 2131962911;
            }
        } else {
            i = 2131962925;
        }
        String A00 = AbstractC136736Hc.A00(c5Tl, i);
        if (C0fH.A02()) {
            C0fH.A00(229533080);
        }
        return A00;
    }
}
