package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;
import com.google.common.collect.ImmutableList;

/* renamed from: X.CeJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28331CeJ {
    public static final void A00(C5Tl c5Tl, ImmutableList immutableList, ImmutableList immutableList2, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, int i) {
        int i2;
        C14360o3.A0B(interfaceC16820sZ, 0);
        AbstractC167027dH.A0a(1, interfaceC16660sJ, interfaceC16820sZ2, interfaceC16660sJ2, immutableList);
        AbstractC167007dF.A1H(immutableList2, 5, str2);
        c5Tl.Enr(-279550723);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ2);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ2);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0V(c5Tl, immutableList);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0M(c5Tl, immutableList2);
        }
        if ((1572864 & i) == 0) {
            i2 |= AbstractC25232BEp.A0X(c5Tl, str);
        }
        if ((12582912 & i) == 0) {
            i2 |= AbstractC25232BEp.A0Y(c5Tl, str2);
        }
        if ((4793491 & i2) == 4793490 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-34978544, "com.instagram.schools.management.ui.SchoolOnboardingSchoolSelectionContent (SchoolOnboardingSchoolSelectionContent.kt:40)");
            }
            AbstractC28401Cg7.A03(c5Tl, immutableList, C75.A05, interfaceC16820sZ, C29818DDk.A00, null, null, C5UA.A01(c5Tl, new C30554Dcb(immutableList2, str, str2, interfaceC16820sZ2, interfaceC16660sJ, interfaceC16660sJ2), -457301256), 1597488 | (i2 & 14) | (458752 & (i2 << 3)), 12);
            if (C0fH.A02()) {
                C0fH.A00(-1334071148);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30278DVf(immutableList, immutableList2, str, str2, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16660sJ, interfaceC16660sJ2, i);
        }
    }

    public static final void A01(C5Tl c5Tl, ImmutableList immutableList, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, int i) {
        int i2;
        c5Tl.Enr(1799975662);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16660sJ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, immutableList);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0V(c5Tl, str);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0W(c5Tl, str2);
        }
        if ((74899 & i2) == 74898 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1495237597, "com.instagram.schools.management.ui.SchoolSelectionContent (SchoolOnboardingSchoolSelectionContent.kt:66)");
            }
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A02 = AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A02, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A02, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 1798796366);
            Object obj = C5UI.A00;
            C5XO c5xo = (C5XO) AbstractC25232BEp.A1C(c5Tl, A0q, obj);
            C117505Tk.A0L(c117505Tk, false);
            C19L c19l = ((C137536Kz) AbstractC25234BEr.A0b(c5Tl, c5Tl.EEc(), obj)).A00;
            BY5.A00(c5xo, c5Tl, AbstractC118175Wb.A05(c1130158n), null, str2, null, interfaceC16660sJ2, 196992 | ((i2 >> 15) & 14) | (i2 & 112), 24);
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, c19l, 1798806910) | AbstractC25233BEq.A1J(i2);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == obj) {
                EEc = new C57166PZk(c5xo, c19l, interfaceC16820sZ, null, 0);
                c5Tl.FBy(EEc);
            }
            int A05 = AbstractC25235BEs.A05(c5Tl, c117505Tk, EEc, c5xo);
            String A002 = C5YD.A00(c5Tl, 2131973242);
            C5WR.A06(c5Tl, AbstractC118175Wb.A09(c1130158n, 14.0f), AbstractC25225BEi.A0X(c5Tl), A002);
            int i3 = i2 & 14;
            int i4 = i2 >> A05;
            A02(c5Tl, immutableList, str, interfaceC16660sJ, i3 | (i4 & 112) | (i4 & 896));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1329824534);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DVI(interfaceC16820sZ, interfaceC16660sJ, interfaceC16660sJ2, immutableList, str, str2, i, 2);
        }
    }

    public static final void A02(C5Tl c5Tl, ImmutableList immutableList, String str, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        c5Tl.Enr(-596046983);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16660sJ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, immutableList);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, str);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1663284702, "com.instagram.schools.management.ui.SchoolList (SchoolOnboardingSchoolSelectionContent.kt:101)");
            }
            LazyListState A00 = C6IE.A00(c5Tl, 0, 0, 0, 3);
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, immutableList, -1565048422) | AbstractC167007dF.A1P(i2 & 896, 256) | AbstractC25228BEl.A1R(i2);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == C5UI.A00) {
                EEc = AbstractC25229BEm.A11(c5Tl, immutableList, interfaceC16660sJ, str, 36);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            C6IS.A05(A00, c5Tl, (InterfaceC16660sJ) EEc);
            if (C0fH.A02()) {
                C0fH.A00(1639806233);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DT4(immutableList, interfaceC16660sJ, str, i, 14);
        }
    }
}
