package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikInternals;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ci2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28508Ci2 {
    public static final void A09(C5Tl c5Tl, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i, boolean z) {
        int i2;
        String str3;
        C14360o3.A0B(interfaceC16820sZ, 0);
        AbstractC25233BEq.A0w(1, interfaceC16820sZ2, str, str2);
        c5Tl.Enr(-13213900);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0d(c5Tl, z);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0U(c5Tl, str);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0V(c5Tl, str2);
        }
        if ((i2 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1593071598, "com.instagram.schools.tab.ui.EmptyState (SchoolDirectoryComposeComponents.kt:423)");
            }
            interfaceC16820sZ2.invoke();
            C1130158n c1130158n = Modifier.A00;
            Modifier A0U = AbstractC25226BEj.A0U(c1130158n);
            InterfaceC1127857k A0M = AbstractC25235BEs.A0M(c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0U);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0M, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C26180Bi5 c26180Bi5 = new C26180Bi5(96.0f, R.drawable.instagram_user_outline_96);
            EnumC27362C5r enumC27362C5r = EnumC27362C5r.A03;
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            c5Tl.Eno(-1157871924);
            if (z) {
                str3 = C5YD.A00(c5Tl, 2131964649);
            } else {
                str3 = null;
            }
            C117505Tk.A0L(c117505Tk, false);
            InterfaceC16820sZ interfaceC16820sZ3 = null;
            if (z) {
                interfaceC16820sZ3 = interfaceC16820sZ;
            }
            AbstractC28504Chx.A01(c5Tl, A0T, c26180Bi5, enumC27362C5r, null, str2, null, str, str3, interfaceC16820sZ3, null, null, ((i2 >> 9) & 14) | 432 | (i2 & 57344), 0, 1504, 0L);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(150454676);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUV(interfaceC16820sZ, interfaceC16820sZ2, str2, str, i, 2, z);
        }
    }

    public static final void A0B(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        int i2;
        C14360o3.A0B(interfaceC16820sZ, 0);
        c5Tl.Enr(-604731816);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1186948032, "com.instagram.schools.tab.ui.SearchEmptyState (SchoolDirectoryComposeComponents.kt:457)");
            }
            if (z) {
                Modifier A09 = AbstractC118175Wb.A09(AbstractC25226BEj.A0T(AbstractC25225BEi.A0N(c5Tl, 1941191786)), 8.0f);
                InterfaceC1127857k A00 = AbstractC118375Wz.A00(AbstractC118255Wn.A04, c5Tl, C118195Wf.A04);
                int A002 = C5X2.A00(c5Tl);
                C117505Tk c117505Tk = (C117505Tk) c5Tl;
                C59P A04 = C117505Tk.A04(c117505Tk);
                Modifier A01 = C5X3.A01(c5Tl, A09);
                AbstractC25233BEq.A11(c5Tl, c117505Tk);
                AbstractC25231BEo.A12(c5Tl, A00, A04);
                InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
                }
                AbstractC25225BEi.A1K(c5Tl, A01);
                C5WR.A0c(c5Tl, null, C5YD.A00(c5Tl, 2131968594), 32766);
                C6GE.A09(c5Tl, AbstractC25225BEi.A0u(c5Tl), C5YD.A00(c5Tl, 2131964649), interfaceC16820sZ, i2 & 14);
                c5Tl.ASW();
            } else {
                c5Tl.Eno(1941664226);
                AbstractC25705BXp.A0S(c5Tl, C5YD.A00(c5Tl, 2131968594));
            }
            if (AbstractC25230BEn.A1Z(c5Tl, false)) {
                C0fH.A00(-1805128587);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30502Dbl.A01(ASZ, interfaceC16820sZ, i, 16, z);
        }
    }

    public static final void A0F(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, InterfaceC16660sJ interfaceC16660sJ4, InterfaceC16620sF interfaceC16620sF, C5Hc c5Hc, int i, boolean z) {
        int i2;
        AbstractC167007dF.A1K(interfaceC16660sJ, interfaceC16660sJ2);
        C14360o3.A0B(interfaceC16660sJ3, 2);
        int A08 = AbstractC25230BEn.A08(3, interfaceC16660sJ4, interfaceC16620sF);
        AbstractC167017dG.A1T(interfaceC16820sZ, c5Hc);
        c5Tl.Enr(-887226959);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16660sJ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ3);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ4);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16620sF);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16820sZ);
        }
        if ((1572864 & i) == 0) {
            i2 |= AbstractC25232BEp.A0N(c5Tl, c5Hc);
        }
        if ((12582912 & i) == 0) {
            i2 |= AbstractC25232BEp.A0i(c5Tl, z);
        }
        if ((i2 & 4793491) == 4793490 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1011788427, "com.instagram.schools.tab.ui.StudentList (SchoolDirectoryComposeComponents.kt:283)");
            }
            LazyListState A00 = C6IE.A00(c5Tl, 0, 0, 0, 3);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 266664177);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = AbstractC25232BEp.A0w(c5Tl, null);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, c5Hc, 266667852) | AbstractC167007dF.A1P(i2 & 14, A08) | AbstractC25233BEq.A1I(i2) | AbstractC25233BEq.A1J(i2) | AbstractC25233BEq.A1K(i2) | AbstractC25234BEr.A1W(i2) | AbstractC25234BEr.A1V(i2);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == obj) {
                EEc = new DIK(A0q, interfaceC16660sJ, interfaceC16660sJ3, interfaceC16660sJ2, interfaceC16660sJ4, interfaceC16620sF, c5Hc, 3, z);
                c5Tl.FBy(EEc);
            }
            C6IS.A05(A00, c5Tl, AbstractC25225BEi.A1B(A0K, EEc, false));
            c5Tl.Eno(266692385);
            boolean A1U = AbstractC25234BEr.A1U(i2);
            Object EEc2 = c5Tl.EEc();
            if (A1U || EEc2 == obj) {
                EEc2 = new X30(interfaceC16820sZ, 3);
                c5Tl.FBy(EEc2);
            }
            BGP.A00(A00, c5Tl, AbstractC25225BEi.A1A(A0K, EEc2, false));
            if (C0fH.A02()) {
                C0fH.A00(-321163233);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DWP(interfaceC16620sF, c5Hc, interfaceC16660sJ2, interfaceC16660sJ3, interfaceC16820sZ, interfaceC16660sJ4, interfaceC16660sJ, i, 2, z);
        }
    }

    public static final void A0C(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i) {
        int i2;
        AbstractC167017dG.A1N(interfaceC16820sZ, interfaceC16820sZ2);
        c5Tl.Enr(-1583465021);
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
                C0fH.A01(2138118025, "com.instagram.schools.tab.ui.RetryView (SchoolDirectoryComposeComponents.kt:479)");
            }
            interfaceC16820sZ2.invoke();
            C1130158n c1130158n = Modifier.A00;
            Modifier A0U = AbstractC25226BEj.A0U(c1130158n);
            InterfaceC1127857k A0M = AbstractC25235BEs.A0M(c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0U);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0M, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            String A002 = AbstractC136736Hc.A00(c5Tl, 2131974295);
            String A003 = AbstractC136736Hc.A00(c5Tl, 2131972916);
            AbstractC28504Chx.A01(c5Tl, AbstractC25226BEj.A0T(c1130158n), new C26181Bi6(R.drawable.instagram_error_outline_96, 96.0f), EnumC27362C5r.A03, null, A003, null, A002, AbstractC136736Hc.A00(c5Tl, 2131972101), interfaceC16820sZ, null, null, 432, (i2 << 3) & 112, 1504, 0L);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(817685739);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30508Dbr.A01(ASZ, interfaceC16820sZ, interfaceC16820sZ2, i, 16);
        }
    }

    public static final void A00(C5Tl c5Tl, int i) {
        c5Tl.Enr(222678173);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1951706012, "com.instagram.schools.tab.ui.SchoolBannerIcon (SchoolDirectoryComposeComponents.kt:229)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0Y = AbstractC25228BEl.A0Y(AbstractC118185Wd.A0C(c1130158n, 44.0f), 44.0f / 2.0f, 1.0f, AbstractC25226BEj.A0B(c5Tl));
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0Y);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0b, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C119645bN c119645bN = C119645bN.A00;
            C5YS.A00(c5Tl, AbstractC25225BEi.A0P(c119645bN, AbstractC118185Wd.A04(c1130158n)), C5Y7.A00(c5Tl, R.drawable.instagram_cap_pano_outline_24, 0));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1806912406);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30493Dbc.A01(ASZ, i, 19);
        }
    }

    public static final void A01(C5Tl c5Tl, int i) {
        c5Tl.Enr(289735170);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-332112103, "com.instagram.schools.tab.ui.ShimmerPill (SchoolDirectoryComposeComponents.kt:392)");
            }
            AbstractC28487Chf.A05(c5Tl, AbstractC25228BEl.A0X(AbstractC118185Wd.A0G(Modifier.A00, 80.0f, 26.0f), 8.0f));
            if (C0fH.A02()) {
                C0fH.A00(246614169);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30493Dbc.A01(ASZ, i, 20);
        }
    }

    public static final void A02(C5Tl c5Tl, int i) {
        c5Tl.Enr(1458242404);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1458030948, "com.instagram.schools.tab.ui.ShimmerPillRow (SchoolDirectoryComposeComponents.kt:397)");
            }
            Modifier A04 = AbstractC118175Wb.A04(AbstractC25228BEl.A0W());
            InterfaceC1127857k A02 = AbstractC118375Wz.A02(AbstractC118255Wn.A00(), c5Tl, C118195Wf.A05, 6);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A04);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A02, A042);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            c5Tl.Eno(58834171);
            int i2 = 0;
            do {
                A01(c5Tl, 0);
                i2++;
            } while (i2 < 6);
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(2076692750);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30493Dbc.A01(ASZ, i, 21);
        }
    }

    public static final void A03(C5Tl c5Tl, int i) {
        c5Tl.Enr(1439980668);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1119188840, "com.instagram.schools.tab.ui.ShimmerStudentList (SchoolDirectoryComposeComponents.kt:408)");
            }
            Modifier A05 = AbstractC118175Wb.A05(AbstractC25228BEl.A0W());
            InterfaceC1127857k A02 = AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A02, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A05);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A02, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            c5Tl.Eno(347680053);
            int i2 = 0;
            do {
                AbstractC28332CeK.A00(c5Tl, 0);
                i2++;
            } while (i2 < 13);
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(-490066880);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30493Dbc.A01(ASZ, i, 22);
        }
    }

    public static final void A04(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        int i3;
        c5Tl.Enr(-1658900513);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, modifier);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1806388388, "com.instagram.schools.tab.ui.StudentRowMoreButton (SchoolDirectoryComposeComponents.kt:382)");
            }
            C6LQ.A02(c5Tl, C5XR.A06(modifier, interfaceC16820sZ), AbstractC25228BEl.A0a(AbstractC25226BEj.A0F(c5Tl)), AbstractC25227BEk.A0P(c5Tl, R.drawable.instagram_more_vertical_pano_outline_24), 48);
            if (C0fH.A02()) {
                C0fH.A00(-71633652);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30504Dbn.A01(modifier, interfaceC16820sZ, i2, i, 40);
        }
    }

    public static final void A06(C5Tl c5Tl, C38687GzS c38687GzS, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        c5Tl.Enr(1103794313);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16660sJ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, c38687GzS);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1345165480, "com.instagram.schools.tab.ui.HeaderPills (SchoolDirectoryComposeComponents.kt:260)");
            }
            if (c38687GzS != null) {
                List<String> list = (List) c38687GzS.A00;
                ArrayList A0q = AbstractC167017dG.A0q(list);
                for (String str : list) {
                    A0q.add(new C26186BiB(str, str, true));
                }
                C5Hc A00 = AbstractC133095zb.A00(A0q);
                String str2 = c38687GzS.A01;
                C26186BiB c26186BiB = new C26186BiB(str2, str2, true);
                Modifier A0L = AbstractC25227BEk.A0L(AbstractC25226BEj.A0T(Modifier.A00), 12.0f);
                c5Tl.Eno(-366991680);
                boolean A1R = AbstractC25228BEl.A1R(i2);
                Object EEc = c5Tl.EEc();
                if (A1R || EEc == C5UI.A00) {
                    EEc = new C57753Pjg(interfaceC16660sJ, 46);
                    c5Tl.FBy(EEc);
                }
                AbstractC25225BEi.A1T(c5Tl);
                AbstractC28434Cgi.A01(null, c5Tl, A0L, c26186BiB, (InterfaceC16660sJ) EEc, null, A00, 384, 48);
            }
            if (C0fH.A02()) {
                C0fH.A00(-1941975362);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30508Dbr.A01(ASZ, c38687GzS, interfaceC16660sJ, i, 15);
        }
    }

    public static final void A07(C5Tl c5Tl, C51635MrS c51635MrS, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, int i) {
        int i2;
        c5Tl.Enr(-1445530435);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ3);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, c51635MrS);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-540099897, "com.instagram.schools.tab.ui.StudentRowExtraContent (SchoolDirectoryComposeComponents.kt:358)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier Eq3 = c1130158n.Eq3(AbstractC118185Wd.A00).Eq3(AbstractC118175Wb.A0E(c1130158n, 9.0f, 0.0f, 0.0f, 0.0f));
            InterfaceC1127857k A0d = AbstractC25228BEl.A0d(c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, Eq3);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0d, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            BJ3 bj3 = c51635MrS.A01;
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, c51635MrS, 1045767499) | AbstractC167007dF.A1P(i2 & 896, 256) | AbstractC25233BEq.A1I(i2);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == C5UI.A00) {
                EEc = new C43210J8h(10, c51635MrS, interfaceC16820sZ3, interfaceC16820sZ2);
                c5Tl.FBy(EEc);
            }
            AbstractC25276BGq.A00(c5Tl, null, bj3, null, AbstractC25225BEi.A1A(c117505Tk, EEc, false), 0, 6);
            A04(c5Tl, AbstractC118175Wb.A0E(c1130158n, 9.0f, 0.0f, 0.0f, 0.0f), interfaceC16820sZ, (i2 & 14) | 48, 0);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1103598850);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30491Dba(c51635MrS, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, i, 23);
        }
    }

    public static final void A08(C5Tl c5Tl, C51635MrS c51635MrS, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16620sF interfaceC16620sF, int i, boolean z) {
        int i2;
        c5Tl.Enr(-627038789);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ3);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ4);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16620sF);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0M(c5Tl, c51635MrS);
        }
        if ((1572864 & i) == 0) {
            i2 |= AbstractC25232BEp.A0h(c5Tl, z);
        }
        if ((599187 & i2) == 599186 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-2069235933, "com.instagram.schools.tab.ui.StudentUserRow (SchoolDirectoryComposeComponents.kt:324)");
            }
            boolean A1W = AbstractC167007dF.A1W(c51635MrS.A02);
            C2DB A00 = AbstractC43541zP.A00(c5Tl, c51635MrS.A00);
            String str = c51635MrS.A05;
            String str2 = c51635MrS.A03;
            Modifier A0W = AbstractC25228BEl.A0W();
            boolean A1U = AbstractC25228BEl.A1U(c5Tl, c51635MrS, AbstractC25227BEk.A1W(c5Tl, -916243584, A1W), AbstractC25231BEo.A1N(57344, i2, Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET)) | AbstractC25233BEq.A1H(i2);
            Object EEc = c5Tl.EEc();
            if (A1U || EEc == C5UI.A00) {
                EEc = new MIF(20, interfaceC16620sF, interfaceC16820sZ, c51635MrS, A1W);
                c5Tl.FBy(EEc);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            BI4.A01(c5Tl, A0W, A00, null, str, str2, null, interfaceC16820sZ, (InterfaceC16660sJ) EEc, C5UA.A01(c5Tl, new C30714DfC(14, interfaceC16820sZ4, c51635MrS, interfaceC16820sZ2, interfaceC16820sZ3), -1402523430), (29360128 & (i2 << 3)) | 384, ((i2 << 9) & 7168) | 196608, 7976, A1W, z, false, false);
            if (C0fH.A02()) {
                C0fH.A00(531204755);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30288DVp(interfaceC16820sZ, interfaceC16620sF, c51635MrS, interfaceC16820sZ4, interfaceC16820sZ2, interfaceC16820sZ3, i, 3, z);
        }
    }

    public static final void A0A(C5Tl c5Tl, String str, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        c5Tl.Enr(-1687352025);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16660sJ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, str);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1053393014, "com.instagram.schools.tab.ui.SearchBox (SchoolDirectoryComposeComponents.kt:248)");
            }
            boolean A1O = AbstractC25233BEq.A1O(c5Tl, -238149514, i2);
            Object EEc = c5Tl.EEc();
            if (A1O || EEc == C5UI.A00) {
                EEc = new C57753Pjg(interfaceC16660sJ, 47);
                c5Tl.FBy(EEc);
            }
            AbstractC25225BEi.A1T(c5Tl);
            BY5.A00(null, c5Tl, AbstractC118175Wb.A09(AbstractC25226BEj.A0T(Modifier.A00), 8.0f), null, str, null, (InterfaceC16660sJ) EEc, ((i2 >> 3) & 14) | 384, 56);
            if (C0fH.A02()) {
                C0fH.A00(-656383373);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30503Dbm.A01(ASZ, interfaceC16660sJ, str, i, 13);
        }
    }

    public static final void A0D(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i, boolean z) {
        int i2;
        String str;
        c5Tl.Enr(-1836117514);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0d(c5Tl, z);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(580597452, "com.instagram.schools.tab.ui.InviteUpsellBanner (SchoolDirectoryComposeComponents.kt:211)");
            }
            Modifier A03 = AbstractC118175Wb.A03(Modifier.A00);
            String A00 = C5YD.A00(c5Tl, 2131964667);
            c5Tl.Eno(1408506543);
            if (z) {
                str = C5YD.A00(c5Tl, 2131964649);
            } else {
                str = null;
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            AbstractC28047CXz.A00(c5Tl, A03, C5Y7.A00(c5Tl, R.drawable.instagram_illustrations_product_illustration_pi_plus_schools_graduation_cap, 0), EnumC27360C5p.A02, null, A00, str, interfaceC16820sZ2, interfaceC16820sZ, 14155830 | (458752 & (i2 << 12)) | ((i2 << 24) & 234881024), 0, true);
            if (C0fH.A02()) {
                C0fH.A00(-1786937702);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30488DbX(i, 16, interfaceC16820sZ2, interfaceC16820sZ, z);
        }
    }

    public static final void A0E(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, int i, boolean z, boolean z2) {
        int i2;
        c5Tl.Enr(-1833438945);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ3);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0e(c5Tl, z);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0f(c5Tl, z2);
        }
        if ((i2 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(358778705, "com.instagram.schools.tab.ui.HeaderRow (SchoolDirectoryComposeComponents.kt:168)");
            }
            interfaceC16820sZ.invoke();
            if (z) {
                c5Tl.Eno(-746635538);
                A0D(c5Tl, interfaceC16820sZ2, interfaceC16820sZ3, AbstractC25228BEl.A01(i2) | ((i2 >> 6) & 896), z2);
            } else {
                c5Tl.Eno(-746551311);
                A0G(interfaceC16820sZ2, c5Tl, (i2 >> 3) & 14);
            }
            if (AbstractC25230BEn.A1Y(c5Tl)) {
                C0fH.A00(1194783502);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUJ(interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, i, 2, z, z2);
        }
    }

    public static final void A0G(InterfaceC16820sZ interfaceC16820sZ, C5Tl c5Tl, int i) {
        int i2;
        c5Tl.Enr(590806180);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(42067722, "com.instagram.schools.tab.ui.IntroBanner (SchoolDirectoryComposeComponents.kt:184)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A04 = AbstractC118175Wb.A04(c1130158n);
            InterfaceC1127857k A02 = AbstractC118375Wz.A02(AbstractC118255Wn.A01, c5Tl, C118195Wf.A05, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A04);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A02, A042);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6L0 c6l0 = C6L0.A00;
            A00(c5Tl, 0);
            C5WR.A06(c5Tl, AbstractC118175Wb.A06(c6l0.A00(c1130158n)), AbstractC25225BEi.A0Y(c5Tl), AbstractC136736Hc.A00(c5Tl, 2131960905));
            C2DC A002 = C5Y7.A00(c5Tl, R.drawable.instagram_x_pano_filled_12, 0);
            Modifier A0E = AbstractC118175Wb.A0E(c1130158n, 4.0f, 4.0f, 0.0f, 0.0f);
            boolean A1O = AbstractC25233BEq.A1O(c5Tl, -761091318, i2);
            Object EEc = c5Tl.EEc();
            if (A1O || EEc == C5UI.A00) {
                EEc = new X30(interfaceC16820sZ, 2);
                c5Tl.FBy(EEc);
            }
            C5YS.A06(c5Tl, C5XR.A05(A0E, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc, false), true), A002, AbstractC25226BEj.A0L(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1547417555);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30497Dbg.A01(ASZ, interfaceC16820sZ, i, 46);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(X.C5Tl r45, X.C38687GzS r46, X.UQE r47, X.EnumC53155NfA r48, java.lang.String r49, X.InterfaceC16820sZ r50, X.InterfaceC16820sZ r51, X.InterfaceC16820sZ r52, X.InterfaceC16820sZ r53, X.InterfaceC16820sZ r54, X.InterfaceC16820sZ r55, X.InterfaceC16820sZ r56, X.InterfaceC16660sJ r57, X.InterfaceC16660sJ r58, X.InterfaceC16660sJ r59, X.InterfaceC16660sJ r60, X.InterfaceC16660sJ r61, X.InterfaceC16660sJ r62, X.InterfaceC16620sF r63, X.C5Hc r64, int r65, int r66, int r67, boolean r68, boolean r69, boolean r70, boolean r71) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28508Ci2.A05(X.5Tl, X.GzS, X.UQE, X.NfA, java.lang.String, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sJ, X.0sJ, X.0sJ, X.0sJ, X.0sJ, X.0sJ, X.0sF, X.5Hc, int, int, int, boolean, boolean, boolean, boolean):void");
    }
}
