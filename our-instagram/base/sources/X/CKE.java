package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikInternals;

/* loaded from: classes5.dex */
public abstract class CKE {
    public static final void A00(C5Tl c5Tl, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, int i) {
        int i2;
        C14360o3.A0B(interfaceC16820sZ, 0);
        AbstractC167027dH.A13(interfaceC16820sZ2, interfaceC16820sZ3, str);
        c5Tl.Enr(187209338);
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
            i2 |= AbstractC25232BEp.A0U(c5Tl, str);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-841384543, "com.instagram.schools.management.ui.SchoolOnboardingAddCompletionBottomSheetContent (SchoolOnboardingAddCompletionBottomSheetContent.kt:27)");
            }
            String A00 = C5YD.A00(c5Tl, 2131965052);
            String A01 = C5YD.A01(c5Tl, new Object[]{str, A00}, 2131972902);
            long A0C = AbstractC25226BEj.A0C(c5Tl);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -2049960004);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                C6C7 A0U = AbstractC25231BEo.A0U(A01);
                int length = A01.length() - 1;
                int A07 = AbstractC001900j.A07(A01, str, length);
                int A04 = AbstractC25226BEj.A04(str, A07);
                A0U.A06(new C5W3(null, null, null, C5W5.A01, null, 65531, 0L, 0L, 0L), A07, A04);
                A0U.A0A("tag_span", A01, A07, A04);
                int A072 = AbstractC001900j.A07(A01, A00, length);
                int A0A = AbstractC167007dF.A0A(A00) + A072;
                A0U.A06(new C5W3(null, null, null, null, null, 65530, A0C, 0L, 0L), A072, A0A);
                A0q = AbstractC25227BEk.A0R(A0U, "tag_span", A01, A072, A0A);
                c5Tl.FBy(A0q);
            }
            C5C8 c5c8 = (C5C8) A0q;
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A002 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0Y, A042);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A012);
            String A003 = C5YD.A00(c5Tl, 2131977199);
            C26181Bi6 c26181Bi6 = new C26181Bi6(R.drawable.instagram_illustrations_product_illustration_pi_plus_schools_youre_in, 156.0f);
            boolean A1Z = AbstractC25234BEr.A1Z(c5Tl, 973928161, i2);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == obj) {
                EEc = new C57753Pjg(interfaceC16820sZ3, 36);
                c5Tl.FBy(EEc);
            }
            AbstractC28504Chx.A01(c5Tl, null, c26181Bi6, null, null, c5c8, null, A003, null, null, AbstractC25225BEi.A1B(A0K, EEc, false), null, DalvikInternals.IOPRIO_BACKGROUND, 0, 4006, 0L);
            AbstractC28506Chz.A09(c5Tl, C5YD.A00(c5Tl, 2131973208), C5YD.A00(c5Tl, 2131968687), interfaceC16820sZ, interfaceC16820sZ2, ((i2 << 3) & 112) | ((i2 << 15) & 3670016));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(738785390);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30224DTd(interfaceC16820sZ2, interfaceC16820sZ, interfaceC16820sZ3, str, i, 6);
        }
    }
}
