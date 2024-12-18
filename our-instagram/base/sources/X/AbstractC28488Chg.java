package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.Chg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28488Chg {
    public static final void A01(C5Tl c5Tl, C50627MWo c50627MWo, L66 l66, int i) {
        int i2;
        boolean z;
        AbstractC167007dF.A1K(c50627MWo, l66);
        c5Tl.Enr(299472758);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c50627MWo) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25230BEn.A05(AbstractC25233BEq.A1U(c5Tl, l66, i) ? 1 : 0);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-920167886, "com.instagram.creation.drafts.ui.DraftList (DraftList.kt:53)");
            }
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, c50627MWo, -229130325);
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && c5Tl.AH6(l66))) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = z | A1Z;
            Object EEc = c5Tl.EEc();
            if (z2 || EEc == C5UI.A00) {
                EEc = C30183DRo.A00(c5Tl, c50627MWo, l66, 0);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            C6IS.A08(c5Tl, (InterfaceC16660sJ) EEc);
            if (C0fH.A02()) {
                C0fH.A00(-154239767);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30507Dbq.A01(ASZ, c50627MWo, l66, i, 39);
        }
    }

    public static final void A00(C6L1 c6l1, C5Tl c5Tl, L66 l66, String str, String str2, int i, boolean z) {
        int i2;
        boolean z2;
        c5Tl.Enr(2136227592);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c6l1) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, str);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, str2);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0e(c5Tl, z);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25229BEm.A04(AbstractC25233BEq.A1V(c5Tl, l66, i, Constants.LOAD_RESULT_PGO) ? 1 : 0);
        }
        if ((i2 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1209457697, "com.instagram.creation.drafts.ui.DraftListItemOverflowIcon (DraftList.kt:176)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -1538112405);
            Object obj = C5UI.A00;
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) AbstractC25234BEr.A0c(c5Tl, A0q, obj, false);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            InterfaceC74953Yl A0M = AbstractC25225BEi.A0M(A0K, AbstractC25234BEr.A0a(c5Tl, obj, -1538110005, false), false);
            Modifier AB7 = c6l1.AB7(C118195Wf.A04, Modifier.A00);
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, -1538105974);
            if (A0q2 == obj) {
                A0q2 = new C50166MDt(interfaceC74953Yl, 16);
                c5Tl.FBy(A0q2);
            }
            AbstractC25229BEm.A17(c5Tl, AbstractC25229BEm.A0T(A0K, AB7, A0q2), C5Y7.A00(c5Tl, R.drawable.instagram_more_horizontal_pano_filled_24, 0), C5YD.A00(c5Tl, 2131966888));
            boolean A1X = AbstractC25230BEn.A1X(interfaceC74953Yl);
            Object A0q3 = AbstractC25227BEk.A0q(c5Tl, -1538092597);
            if (A0q3 == obj) {
                A0q3 = new C50166MDt(interfaceC74953Yl, 17);
                c5Tl.FBy(A0q3);
            }
            InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(A0K, A0q3, false);
            int i3 = i2 >> 3;
            A03(c5Tl, l66, str, str2, A1A, (i3 & 112) | (i3 & 14) | DalvikInternals.IOPRIO_BACKGROUND | (i2 & 7168) | (458752 & (i2 << 3)), A1X, z);
            if (AbstractC25230BEn.A1X(A0M)) {
                Object A0q4 = AbstractC25227BEk.A0q(c5Tl, -1538086989);
                if (A0q4 == obj) {
                    A0q4 = new C50166MDt(A0M, 18);
                    c5Tl.FBy(A0q4);
                }
                InterfaceC16820sZ A1A2 = AbstractC25225BEi.A1A(A0K, A0q4, false);
                c5Tl.Eno(-1538084788);
                if ((57344 & i2) == 16384 || ((i2 & Constants.LOAD_RESULT_PGO) != 0 && c5Tl.AH6(l66))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean A1I = z2 | AbstractC25233BEq.A1I(i2);
                Object EEc = c5Tl.EEc();
                if (A1I || EEc == obj) {
                    EEc = AbstractC25230BEn.A14(c5Tl, l66, str, 27);
                }
                A05(c5Tl, A1A2, AbstractC25225BEi.A1A(A0K, EEc, false), 6);
            }
            if (C0fH.A02()) {
                C0fH.A00(-1580921936);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUV(c6l1, l66, str, str2, i, 0, z);
        }
    }

    public static final void A02(C5Tl c5Tl, L66 l66, C45057Jwm c45057Jwm, int i) {
        int i2;
        boolean z;
        c5Tl.Enr(-353598576);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c45057Jwm) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25230BEn.A05(AbstractC25233BEq.A1U(c5Tl, l66, i) ? 1 : 0);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(513393452, "com.instagram.creation.drafts.ui.DraftListItem (DraftList.kt:61)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A09 = AbstractC118175Wb.A09(AbstractC25226BEj.A0T(c1130158n), 4.0f);
            c5Tl.Eno(-1195411084);
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && c5Tl.AH6(l66))) {
                z = true;
            } else {
                z = false;
            }
            boolean A1X = AbstractC25226BEj.A1X(c5Tl, c45057Jwm, z);
            Object EEc = c5Tl.EEc();
            if (A1X || EEc == C5UI.A00) {
                EEc = new C57256Pbe(47, l66, c45057Jwm);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A06 = C5XR.A06(A09, (InterfaceC16820sZ) EEc);
            InterfaceC1127857k A0f = AbstractC25228BEl.A0f(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A06);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0f, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            C6L0 c6l0 = C6L0.A00;
            String str = c45057Jwm.A03;
            C7U c7u = c45057Jwm.A00;
            boolean z2 = c45057Jwm.A06;
            boolean z3 = c45057Jwm.A07;
            A04(c5Tl, c7u, str, 0, z2, z3);
            Modifier A002 = c6l0.A00(c6l0.AB7(C118195Wf.A04, AbstractC118175Wb.A06(c1130158n)));
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A003 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A002);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0Y, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            c5Tl.Eno(-246409425);
            String str2 = c45057Jwm.A05;
            if (str2.length() > 0) {
                A07(str2, c5Tl, 0);
            }
            C117505Tk.A0L(A0K, false);
            c5Tl.Eno(-246405659);
            String str3 = c45057Jwm.A04;
            if (str3.length() > 0) {
                AbstractC119685bS.A00(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 0.0f, 6.0f));
                A06(str3, c5Tl, 0);
            }
            C117505Tk.A0L(A0K, false);
            c5Tl.Eno(-246399229);
            String str4 = c45057Jwm.A01;
            if (str4.length() > 0) {
                AbstractC119685bS.A00(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 0.0f, 6.0f));
                A06(str4, c5Tl, 0);
            }
            C117505Tk.A0L(A0K, false);
            c5Tl.ASW();
            A00(c6l0, c5Tl, l66, c45057Jwm.A02, str2, (57344 & (i2 << 9)) | 6, z3);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1847619347);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30507Dbq.A01(ASZ, c45057Jwm, l66, i, 40);
        }
    }

    public static final void A03(C5Tl c5Tl, L66 l66, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z, boolean z2) {
        int i2;
        boolean z3;
        c5Tl.Enr(1181153584);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, str2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0d(c5Tl, z);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0e(c5Tl, z2);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16820sZ);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25229BEm.A02(AbstractC25233BEq.A1V(c5Tl, l66, i, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) ? 1 : 0);
        }
        if ((74899 & i2) == 74898 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1298104918, "com.instagram.creation.drafts.ui.DraftItemOverflowMenu (DraftList.kt:210)");
            }
            c5Tl.Eno(-1541130535);
            boolean z4 = true;
            boolean A1P = AbstractC167007dF.A1P(57344 & i2, Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
            if ((458752 & i2) == 131072 || ((i2 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0 && c5Tl.AH6(l66))) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean A1H = A1P | z3 | AbstractC25233BEq.A1H(i2);
            if ((i2 & 112) != 32) {
                z4 = false;
            }
            boolean z5 = A1H | z4;
            Object EEc = c5Tl.EEc();
            if (z5 || EEc == C5UI.A00) {
                EEc = new C50371MLy(interfaceC16820sZ, l66, str, str2, 23);
                c5Tl.FBy(EEc);
            }
            boolean A1W = AbstractC25228BEl.A1W(c5Tl);
            CY0.A00(null, c5Tl, null, null, interfaceC16820sZ, (InterfaceC16660sJ) EEc, new C30188DRt(z2, A1W ? 1 : 0), ((i2 >> 6) & 896) | ((i2 << 3) & 7168), 241, 0L, z, A1W);
            if (C0fH.A02()) {
                C0fH.A00(389104171);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30240DTt(l66, str, str2, interfaceC16820sZ, i, z, z2);
        }
    }

    public static final void A04(C5Tl c5Tl, C7U c7u, String str, int i, boolean z, boolean z2) {
        int i2;
        int i3;
        c5Tl.Enr(2044902655);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, c7u);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0d(c5Tl, z);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0e(c5Tl, z2);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1631743514, "com.instagram.creation.drafts.ui.DraftListItemPreviewThumbnail (DraftList.kt:106)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0C = AbstractC118185Wd.A0C(AbstractC25228BEl.A0Z(c1130158n, 4.0f, AbstractC25226BEj.A0B(c5Tl)), 80.0f);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0C);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0b, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C119645bN c119645bN = C119645bN.A00;
            c5Tl.Eno(-103721467);
            if (str != null) {
                boolean A1O = AbstractC25233BEq.A1O(c5Tl, -103719574, i2);
                Object EEc = c5Tl.EEc();
                if (A1O || EEc == C5UI.A00) {
                    Bitmap decodeFile = BitmapFactory.decodeFile(str);
                    C14360o3.A07(decodeFile);
                    EEc = new C6LZ(decodeFile);
                    c5Tl.FBy(EEc);
                }
                InterfaceC137546La interfaceC137546La = (InterfaceC137546La) EEc;
                C117505Tk.A0L(c117505Tk, false);
                C137026If c137026If = new C137026If(interfaceC137546La, AbstractC25236BEt.A08(((C6LZ) interfaceC137546La).A00));
                c137026If.A00 = 1;
                C6LQ.A08(c5Tl, AbstractC25228BEl.A0X(c1130158n, 4.0f), c137026If, C5YJ.A00);
            }
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.Eno(-103706133);
            if (z || c7u == C7U.A04 || c7u == C7U.A06) {
                Modifier A0E = AbstractC118175Wb.A0E(c119645bN.AB5(C118195Wf.A0D, AbstractC118185Wd.A0C(c1130158n, 20.0f)), 0.0f, 4.0f, 4.0f, 0.0f);
                if (z) {
                    i3 = R.drawable.instagram_shopping_bag_pano_filled_24;
                } else {
                    i3 = c7u.A00;
                }
                C5YS.A01(c5Tl, A0E, C5Y7.A00(c5Tl, i3, 0), 0, 18, C5XL.A00(c5Tl).A0U);
            }
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.Eno(-103688774);
            if (z2) {
                C5YS.A01(c5Tl, AbstractC118175Wb.A0E(c119645bN.AB5(C118195Wf.A07, AbstractC118185Wd.A0C(c1130158n, 20.0f)), 0.0f, 0.0f, 4.0f, 4.0f), C5Y7.A00(c5Tl, R.drawable.instagram_pin_pano_filled_24, 0), 0, 18, C5XL.A00(c5Tl).A0U);
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(488123322);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30204DSj(c7u, str, i, z, z2);
        }
    }

    public static final void A05(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i) {
        int i2;
        c5Tl.Enr(-1411536275);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-9573324, "com.instagram.creation.drafts.ui.DraftDeleteConfirmDialog (DraftList.kt:258)");
            }
            AbstractC28433Cgh.A03(c5Tl, new C26079Bg8(C05F.A0C, C5YD.A00(c5Tl, 2131957640), interfaceC16820sZ2, 12), CGH.A00(c5Tl, null, null, 2131954754, 30), AbstractC25235BEs.A0B(c5Tl).getQuantityString(R.plurals.story_drafts_confirmation_title, 1), null, interfaceC16820sZ, i2 & 14, 4068);
            if (C0fH.A02()) {
                C0fH.A00(1312331002);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30507Dbq(interfaceC16820sZ, interfaceC16820sZ2, i, 38);
        }
    }

    public static final void A06(String str, C5Tl c5Tl, int i) {
        int i2;
        c5Tl.Enr(-1698197052);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1324464900, "com.instagram.creation.drafts.ui.DraftListItemSubtitle (DraftList.kt:162)");
            }
            C5WR.A0q(c5Tl, AbstractC25225BEi.A0Y(c5Tl), str, i2 & 14, AbstractC25226BEj.A0M(c5Tl));
            if (C0fH.A02()) {
                C0fH.A00(214630447);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30500Dbj.A01(ASZ, str, i, 4);
        }
    }

    public static final void A07(String str, C5Tl c5Tl, int i) {
        int i2;
        c5Tl.Enr(1735081356);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(612837055, "com.instagram.creation.drafts.ui.DraftListItemTitle (DraftList.kt:153)");
            }
            C5WR.A0q(c5Tl, AbstractC25226BEj.A0c(c5Tl), str, i2 & 14, AbstractC25226BEj.A0G(c5Tl));
            if (C0fH.A02()) {
                C0fH.A00(385723569);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30500Dbj.A01(ASZ, str, i, 5);
        }
    }
}
