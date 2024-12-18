package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.compose.core.ui.IgClickableTextKt;

/* renamed from: X.Cht, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28500Cht {
    public static final void A08(C5Tl c5Tl, C45994KXi c45994KXi, int i) {
        int i2;
        C14360o3.A0B(c45994KXi, 0);
        c5Tl.Enr(260711102);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c45994KXi) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1931958700, "com.instagram.friendmap.view.compose.FriendMapHidePlacesBottomSheet (FriendMapHidePlacesBottomSheet.kt:63)");
            }
            InterfaceC74963Ym A02 = C6IB.A02(c5Tl, c45994KXi.A02, 0);
            C5Hc c5Hc = ((C26218Bii) A02.getValue()).A05;
            int size = c5Hc.size();
            boolean A1V = AbstractC25227BEk.A1V(c5Tl, -1019739300, size);
            Object EEc = c5Tl.EEc();
            if (A1V || EEc == C5UI.A00) {
                EEc = new C58472Pvx(size, 4);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            BVY A01 = AbstractC25656BVs.A01(c5Tl, (InterfaceC16820sZ) EEc, 0, 54, 0);
            C19L c19l = ((C137536Kz) AbstractC25234BEr.A0b(c5Tl, c5Tl.EEc(), C5UI.A00)).A00;
            Modifier A0W = AbstractC25228BEl.A0W();
            InterfaceC1127857k A00 = C5XX.A00(C118195Wf.A0C, false);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A0W);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A00, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A012);
            InterfaceC1127857k A022 = AbstractC119595bH.A02(AbstractC118255Wn.A06, c5Tl, C118195Wf.A00, 54);
            int A003 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A013 = C5X3.A01(c5Tl, A0W);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A022, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            AbstractC25663BVz.A01(new C1333560c(0.0f, 0.0f, 0.0f, 0.0f), A01, C25652BVo.A00, c5Tl, null, A0W, null, C5UA.A01(c5Tl, new C30731DfT(2, A01, A02, c45994KXi, c5Hc, c19l), 1004574688), 100666800, 7920);
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(881334857);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30497Dbg.A01(ASZ, c45994KXi, i, 20);
        }
    }

    public static final void A09(C5C8 c5c8, C45994KXi c45994KXi, int i) {
        C127015of A0Q = AbstractC25235BEs.A0Q(c5c8, "link", i);
        if (A0Q != null) {
            Object obj = A0Q.A02;
            if (C14360o3.A0K(obj, AbstractC43591JPw.A00(205))) {
                c45994KXi.A0M(C49421Lsv.A00);
            } else {
                if (!C14360o3.A0K(obj, "location_settings_annotation")) {
                    return;
                }
                c45994KXi.A01.A0U(null, false, false);
            }
        }
    }

    public static final C5C8 A00(C5Tl c5Tl, C6V c6v, boolean z) {
        int i;
        C6C7 A0U;
        if (AbstractC25227BEk.A1U(c5Tl, 167149202)) {
            C0fH.A01(1723894929, "com.instagram.friendmap.view.compose.hidePlacesHeaderSubtitle (FriendMapHidePlacesBottomSheet.kt:266)");
        }
        int ordinal = c6v.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                c5Tl.Eno(-2031229069);
                A0U = AbstractC25228BEl.A0g();
                A0U.A09(AbstractC136736Hc.A00(c5Tl, 2131962854));
            } else {
                throw AbstractC25233BEq.A0r(c5Tl, 1458462078);
            }
        } else {
            c5Tl.Eno(-2032210746);
            String A00 = AbstractC136736Hc.A00(c5Tl, 2131962924);
            if (z && c6v == C6V.A02) {
                i = 2131962856;
            } else {
                i = 2131962852;
                if (c6v == C6V.A04) {
                    i = 2131962860;
                }
            }
            String A0p = AbstractC25235BEs.A0p(c5Tl, A00, i);
            int A08 = AbstractC001900j.A08(A0p, A00, 0, false);
            int A04 = AbstractC25226BEj.A04(A00, A08);
            A0U = AbstractC25231BEo.A0U(A0p);
            A0U.A06(AbstractC25233BEq.A0E(AbstractC25226BEj.A0C(c5Tl)), A08, A04);
            A0U.A0A("link", AbstractC43591JPw.A00(205), A08, A04);
        }
        C5C8 A02 = A0U.A02();
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        if (AbstractC25227BEk.A1b(c117505Tk, false)) {
            C0fH.A00(1863808809);
        }
        C117505Tk.A0L(c117505Tk, false);
        return A02;
    }

    public static final InterfaceC16820sZ A01(BVY bvy, C5Tl c5Tl, C6V c6v, C45994KXi c45994KXi, C19L c19l) {
        if (C0fH.A02()) {
            C0fH.A01(-1488722957, "com.instagram.friendmap.view.compose.onBackButtonClicked (FriendMapHidePlacesBottomSheet.kt:143)");
        }
        c5Tl.Eno(-1930070793);
        boolean z = false;
        boolean A1X = AbstractC25226BEj.A1X(c5Tl, c19l, AbstractC25230BEn.A1Q(c5Tl.AH4(bvy) ? 1 : 0)) | AbstractC25230BEn.A1Q(c5Tl.AH4(c45994KXi) ? 1 : 0);
        if (c5Tl.AH4(c6v)) {
            z = true;
        }
        boolean z2 = A1X | z;
        Object EEc = c5Tl.EEc();
        if (z2 || EEc == C5UI.A00) {
            EEc = C29901DGp.A00(c19l, bvy, c45994KXi, c6v, 9);
            c5Tl.FBy(EEc);
        }
        InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) EEc;
        if (AbstractC25230BEn.A1Y(c5Tl)) {
            C0fH.A00(-512461721);
        }
        return interfaceC16820sZ;
    }

    public static final InterfaceC16820sZ A02(BVY bvy, C5Tl c5Tl, C6V c6v, C45994KXi c45994KXi, C19L c19l) {
        if (C0fH.A02()) {
            C0fH.A01(-1335257275, "com.instagram.friendmap.view.compose.onNextButtonClicked (FriendMapHidePlacesBottomSheet.kt:125)");
        }
        c5Tl.Eno(-817278775);
        boolean z = false;
        boolean A1X = AbstractC25226BEj.A1X(c5Tl, c19l, AbstractC25230BEn.A1Q(c5Tl.AH4(bvy) ? 1 : 0)) | AbstractC25230BEn.A1Q(c5Tl.AH4(c6v) ? 1 : 0);
        if (c5Tl.AH4(c45994KXi)) {
            z = true;
        }
        boolean z2 = A1X | z;
        Object EEc = c5Tl.EEc();
        if (z2 || EEc == C5UI.A00) {
            EEc = C29901DGp.A00(c19l, bvy, c45994KXi, c6v, 10);
            c5Tl.FBy(EEc);
        }
        InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) EEc;
        if (AbstractC25230BEn.A1Y(c5Tl)) {
            C0fH.A00(424631876);
        }
        return interfaceC16820sZ;
    }

    public static final void A03(BVY bvy, C5Tl c5Tl, C45044JwZ c45044JwZ, C26218Bii c26218Bii, C45994KXi c45994KXi, C19L c19l, int i) {
        int i2;
        c5Tl.Enr(1826116025);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c45044JwZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25230BEn.A05(AbstractC25233BEq.A1U(c5Tl, c26218Bii, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, c45994KXi);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, c19l);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0V(c5Tl, bvy);
        }
        if ((i2 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-595460203, "com.instagram.friendmap.view.compose.HiddenPlaceCell (FriendMapHidePlacesBottomSheet.kt:439)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 53549754);
            Object obj = C5UI.A00;
            C5XO c5xo = (C5XO) AbstractC25232BEp.A1C(c5Tl, A0q, obj);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C1130158n A0O = AbstractC25225BEi.A0O(c117505Tk);
            Modifier A0E = AbstractC118175Wb.A0E(AbstractC25226BEj.A0T(A0O), C5XT.A00(c5Tl), C5XT.A02(c5Tl, R.dimen.account_discovery_bottom_gap), C5XT.A00(c5Tl), C5XT.A02(c5Tl, R.dimen.account_discovery_bottom_gap));
            c5Tl.Eno(53565257);
            int i3 = i2 & 14;
            int i4 = i2 & 896;
            int i5 = 57344 & i2;
            boolean A1U = AbstractC25228BEl.A1U(c5Tl, c19l, AbstractC167007dF.A1P(i3, 4), AbstractC25232BEp.A1S(i4)) | AbstractC25232BEp.A1R(i5);
            Object EEc = c5Tl.EEc();
            if (A1U || EEc == obj) {
                EEc = C29901DGp.A00(bvy, c19l, c45994KXi, c45044JwZ, 7);
                c5Tl.FBy(EEc);
            }
            Modifier A04 = C5XR.A04(c5xo, A0E, AbstractC25225BEi.A1A(c117505Tk, EEc, false));
            InterfaceC1127857k A0L = AbstractC25235BEs.A0L(AbstractC118255Wn.A02, c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A04);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0L, A042);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6L0 c6l0 = C6L0.A00;
            String str = c45044JwZ.A04;
            boolean z = true;
            boolean z2 = false;
            boolean z3 = false;
            C5WR.A0X(c5Tl, c6l0.A00(A0O), AbstractC25226BEj.A0c(c5Tl), str, AbstractC25226BEj.A0G(c5Tl));
            Modifier A0I = AbstractC25227BEk.A0I(A0O, C5XT.A02(c5Tl, R.dimen.account_discovery_bottom_gap));
            C2DC A002 = C5Y7.A00(c5Tl, R.drawable.instagram_delete_pano_outline_24, 0);
            long A07 = AbstractC25226BEj.A07(c5Tl);
            boolean z4 = c26218Bii.A07;
            c5Tl.Eno(-303932424);
            if (i4 == 256) {
                z2 = true;
            }
            if (i3 == 4) {
                z3 = true;
            }
            boolean z5 = z2 | z3;
            Object EEc2 = c5Tl.EEc();
            if (z5 || EEc2 == obj) {
                EEc2 = new ME1(25, c45044JwZ, c45994KXi);
                c5Tl.FBy(EEc2);
            }
            AbstractC28395Cg1.A00(c5xo, c5Tl, A0I, A002, null, AbstractC25225BEi.A1A(c117505Tk, EEc2, false), 16.0f, 221184, 4, A07, z4);
            C2DC A003 = C5Y7.A00(c5Tl, R.drawable.instagram_edit_pano_outline_24, 0);
            long A0L2 = AbstractC25226BEj.A0L(c5Tl);
            boolean A1U2 = AbstractC25228BEl.A1U(c5Tl, c19l, AbstractC25232BEp.A1U(c5Tl, -303922744, i3, 4), AbstractC167007dF.A1P(i4, 256));
            if (i5 != 16384) {
                z = false;
            }
            boolean z6 = A1U2 | z;
            Object EEc3 = c5Tl.EEc();
            if (z6 || EEc3 == obj) {
                EEc3 = C29901DGp.A00(bvy, c19l, c45994KXi, c45044JwZ, 8);
                c5Tl.FBy(EEc3);
            }
            AbstractC28395Cg1.A00(c5xo, c5Tl, null, A003, null, AbstractC25225BEi.A1A(c117505Tk, EEc3, false), 16.0f, 221184, 69, A0L2, false);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1491774456);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUL(i, 6, c45994KXi, bvy, c45044JwZ, c19l, c26218Bii);
        }
    }

    public static final void A04(BVY bvy, C5Tl c5Tl, C6V c6v, C26218Bii c26218Bii, C45994KXi c45994KXi, C19L c19l, int i) {
        int i2;
        C117505Tk A0K;
        int i3;
        c5Tl.Enr(696143054);
        boolean z = true;
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c6v) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25230BEn.A05(AbstractC25233BEq.A1U(c5Tl, c26218Bii, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, c45994KXi);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, c19l);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0V(c5Tl, bvy);
        }
        if ((i2 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-722999087, "com.instagram.friendmap.view.compose.HidePlacesContent (FriendMapHidePlacesBottomSheet.kt:366)");
            }
            int ordinal = c6v.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        c5Tl.Eno(-102398868);
                        String str = c26218Bii.A03;
                        String A00 = AbstractC136736Hc.A00(c5Tl, 2131962858);
                        C1130158n c1130158n = Modifier.A00;
                        Modifier A0E = AbstractC118175Wb.A0E(AbstractC25226BEj.A0T(c1130158n), C5XT.A00(c5Tl), 0.0f, C5XT.A00(c5Tl), 0.0f);
                        c5Tl.Eno(-696038213);
                        int i4 = i2 & 896;
                        boolean A1P = AbstractC167007dF.A1P(i4, 256);
                        Object EEc = c5Tl.EEc();
                        if (A1P || EEc == C5UI.A00) {
                            EEc = AbstractC25235BEs.A11(c5Tl, c45994KXi, 16);
                        }
                        A0K = (C117505Tk) c5Tl;
                        AbstractC28505Chy.A04(c5Tl, A0E, null, AbstractC25227BEk.A0k(A0K, true), 64, str, A00, (InterfaceC16660sJ) EEc, 0, 0, 0, 432, 59376);
                        if (c26218Bii.A08) {
                            c5Tl.Eno(-696020350);
                            i3 = 2131962848;
                        } else {
                            c5Tl.Eno(-696017602);
                            i3 = 2131954754;
                        }
                        String A002 = AbstractC136736Hc.A00(c5Tl, i3);
                        C117505Tk.A0L(A0K, false);
                        if (C0fH.A02()) {
                            C0fH.A01(-1922631209, "com.instagram.compose.igds.components.button.IgdsButtonStyles.destructiveLink (IgdsButton.kt:339)");
                        }
                        C6GB c6gb = new C6GB(AbstractC25226BEj.A07(c5Tl));
                        if (C0fH.A02()) {
                            C0fH.A00(188385137);
                        }
                        C6GD c6gd = C6GD.A02;
                        boolean z2 = c26218Bii.A07;
                        Modifier A0E2 = AbstractC118175Wb.A0E(c1130158n, 0.0f, C5XT.A02(c5Tl, R.dimen.abc_dialog_padding_material), 0.0f, C5XT.A02(c5Tl, R.dimen.abc_dialog_padding_material));
                        boolean A1U = AbstractC25232BEp.A1U(c5Tl, -696012928, i4, 256);
                        Object EEc2 = c5Tl.EEc();
                        if (A1U || EEc2 == C5UI.A00) {
                            EEc2 = new C50158MDl(c45994KXi, 24);
                            c5Tl.FBy(EEc2);
                        }
                        C6GE.A00(null, c5Tl, A0E2, null, c6gd, c6gb, A002, AbstractC25225BEi.A1A(A0K, EEc2, false), 1572864, 392, z2, false);
                    } else {
                        throw AbstractC25233BEq.A0r(c5Tl, -696087214);
                    }
                } else {
                    c5Tl.Eno(-103664071);
                    String A003 = AbstractC136736Hc.A00(c5Tl, 2131962853);
                    C118125Vw A0h = AbstractC25226BEj.A0h(c5Tl);
                    long A0G = AbstractC25226BEj.A0G(c5Tl);
                    Modifier A0W = AbstractC25228BEl.A0W();
                    C5WR.A0X(c5Tl, AbstractC25236BEt.A0I(c5Tl, A0W, C5XT.A02(c5Tl, R.dimen.abc_action_bar_elevation_material), C5XT.A00(c5Tl)), A0h, A003, A0G);
                    float f = c26218Bii.A00;
                    boolean A1Q = AbstractC25233BEq.A1Q(c5Tl, -696059053, i2);
                    Object EEc3 = c5Tl.EEc();
                    if (A1Q || EEc3 == C5UI.A00) {
                        EEc3 = AbstractC25235BEs.A11(c5Tl, c45994KXi, 15);
                    }
                    A0K = AbstractC25225BEi.A0K(c5Tl, false);
                    AbstractC28395Cg1.A01(c5Tl, AbstractC25236BEt.A0I(c5Tl, A0W, C5XT.A00(c5Tl), C5XT.A00(c5Tl)), (InterfaceC16660sJ) EEc3, f, 50.0f, 500.0f, 3456, 0);
                }
            } else {
                boolean z3 = false;
                c5Tl.Eno(-103882466);
                c5Tl.Eno(-696087125);
                if ((i2 & 112) != 32 && ((i2 & 64) == 0 || !c5Tl.AH6(c26218Bii))) {
                    z = false;
                }
                boolean A1U2 = AbstractC25228BEl.A1U(c5Tl, c19l, z, AbstractC167007dF.A1P(i2 & 896, 256));
                if ((i2 & 57344) == 16384) {
                    z3 = true;
                }
                boolean z4 = A1U2 | z3;
                Object EEc4 = c5Tl.EEc();
                if (z4 || EEc4 == C5UI.A00) {
                    EEc4 = new C30177DRh(6, c45994KXi, bvy, c19l, c26218Bii);
                    c5Tl.FBy(EEc4);
                }
                A0K = AbstractC25225BEi.A0K(c5Tl, false);
                C6IS.A08(c5Tl, (InterfaceC16660sJ) EEc4);
            }
            if (AbstractC25227BEk.A1b(A0K, false)) {
                C0fH.A00(1361076629);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUL(i, 7, c45994KXi, bvy, c19l, c6v, c26218Bii);
        }
    }

    public static final void A05(C5Tl c5Tl, C6V c6v, C26218Bii c26218Bii, C45994KXi c45994KXi, int i) {
        int i2;
        C45044JwZ c45044JwZ;
        c5Tl.Enr(1257414726);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c6v) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25230BEn.A05(AbstractC25233BEq.A1U(c5Tl, c26218Bii, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, c45994KXi);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1388818162, "com.instagram.friendmap.view.compose.HidePlacesFooter (FriendMapHidePlacesBottomSheet.kt:217)");
            }
            if (AbstractC25227BEk.A1U(c5Tl, 981928586)) {
                C0fH.A01(-143374950, "com.instagram.friendmap.view.compose.hidePlacesFooterText (FriendMapHidePlacesBottomSheet.kt:302)");
            }
            C5C8 c5c8 = null;
            if (c6v == C6V.A02 && (c45044JwZ = c26218Bii.A02) != null) {
                String A00 = AbstractC136736Hc.A00(c5Tl, 2131962867);
                String A01 = AbstractC136736Hc.A01(c5Tl, new Object[]{c45044JwZ.A04, A00}, 2131962851);
                int A08 = AbstractC001900j.A08(A01, A00, 0, false);
                int A04 = AbstractC25226BEj.A04(A00, A08);
                C5W3 c5w3 = new C5W3(null, null, null, null, null, 65534, AbstractC25226BEj.A0C(c5Tl), 0L, 0L);
                C6C7 A0U = AbstractC25231BEo.A0U(A01);
                A0U.A06(c5w3, A08, A04);
                c5c8 = AbstractC25227BEk.A0R(A0U, "link", "location_settings_annotation", A08, A04);
            }
            if (C0fH.A02()) {
                C0fH.A00(-888583745);
            }
            C117505Tk A0J = AbstractC25225BEi.A0J(c5Tl);
            if (c5c8 != null) {
                C118125Vw A0Y = AbstractC25225BEi.A0Y(c5Tl);
                long A0M = AbstractC25226BEj.A0M(c5Tl);
                boolean z = false;
                Modifier A0I = AbstractC25236BEt.A0I(c5Tl, Modifier.A00, C5XT.A01(c5Tl), C5XT.A00(c5Tl));
                boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, c5c8, 1217036885);
                if ((i2 & 896) == 256) {
                    z = true;
                }
                boolean z2 = A1Y | z;
                Object EEc = c5Tl.EEc();
                if (z2 || EEc == C5UI.A00) {
                    EEc = new C50268MHx(48, c5c8, c45994KXi);
                    c5Tl.FBy(EEc);
                }
                IgClickableTextKt.A07(c5Tl, A0I, c5c8, A0Y, AbstractC25225BEi.A1B(A0J, EEc, false), A0M);
            }
            if (C0fH.A02()) {
                C0fH.A00(583224787);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30219DSy(i, 1, c26218Bii, c45994KXi, c6v);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x01fd, code lost:
    
        if (r7.length() <= 64) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x027f, code lost:
    
        if (r33.A04.size() < 3) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(X.C5Tl r31, X.C6V r32, X.C26218Bii r33, X.C45994KXi r34, X.InterfaceC16820sZ r35, X.InterfaceC16820sZ r36, int r37) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28500Cht.A06(X.5Tl, X.C6V, X.Bii, X.KXi, X.0sZ, X.0sZ, int):void");
    }

    public static final void A07(C5Tl c5Tl, C6V c6v, C45994KXi c45994KXi, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i) {
        int i2;
        c5Tl.Enr(1336774743);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c6v) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ2);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0U(c5Tl, c45994KXi);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-133434592, "com.instagram.friendmap.view.compose.HidePlacesIntroNux (FriendMapHidePlacesBottomSheet.kt:497)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0E = AbstractC118175Wb.A0E(AbstractC25226BEj.A0T(c1130158n), 0.0f, C5XT.A00(c5Tl), 0.0f, 0.0f);
            InterfaceC1127857k A01 = AbstractC119595bH.A01(AbstractC118255Wn.A06, c5Tl, C118195Wf.A00);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A0E);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A01, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A012);
            String A002 = AbstractC136736Hc.A00(c5Tl, 2131962857);
            C5WR.A0Z(c5Tl, AbstractC118175Wb.A0E(c1130158n, C5XT.A02(c5Tl, R.dimen.abc_dropdownitem_icon_width), C5XT.A02(c5Tl, R.dimen.abc_action_bar_elevation_material), C5XT.A02(c5Tl, R.dimen.abc_dropdownitem_icon_width), 0.0f), AbstractC28417CgO.A00(c5Tl), A002, AbstractC25226BEj.A0G(c5Tl));
            C5C8 A003 = A00(c5Tl, c6v, true);
            C118125Vw A0c = AbstractC25226BEj.A0c(c5Tl);
            long A0M = AbstractC25226BEj.A0M(c5Tl);
            Modifier A0A = AbstractC118175Wb.A0A(c1130158n, C5XT.A00(c5Tl), C5XT.A00(c5Tl));
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, A003, 1860657699) | AbstractC25233BEq.A1K(i2);
            Object EEc = c5Tl.EEc();
            if (A1Y || EEc == C5UI.A00) {
                EEc = new C50362MLo(0, A003, c45994KXi);
                c5Tl.FBy(EEc);
            }
            IgClickableTextKt.A07(c5Tl, A0A, A003, A0c, AbstractC25225BEi.A1B(c117505Tk, EEc, false), A0M);
            AbstractC28506Chz.A01(c5Tl, null, null, AbstractC136736Hc.A00(c5Tl, 2131962855), AbstractC136736Hc.A00(c5Tl, 2131954754), interfaceC16820sZ2, interfaceC16820sZ, ((i2 >> 3) & 112) | ((i2 << 15) & 3670016), 3072, 24476);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1935167871);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30491Dba(c45994KXi, c6v, interfaceC16820sZ, interfaceC16820sZ2, i, 14);
        }
    }
}
