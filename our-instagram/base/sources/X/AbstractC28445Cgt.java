package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikInternals;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Cgt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28445Cgt {
    public static final void A00(C5Tl c5Tl, ImmutableList immutableList, EnumC27396C6z enumC27396C6z, CPN cpn, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16820sZ interfaceC16820sZ5, InterfaceC16820sZ interfaceC16820sZ6, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, boolean z) {
        int i3;
        int i4;
        AbstractC167007dF.A1K(interfaceC16820sZ, interfaceC16820sZ2);
        AbstractC25234BEr.A1R(interfaceC16820sZ3, interfaceC16820sZ4, interfaceC16820sZ5, interfaceC16820sZ6, interfaceC16660sJ);
        AbstractC25229BEm.A1L(immutableList, 10, cpn);
        c5Tl.Enr(1009942569);
        int i5 = 2;
        if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i3 = i;
        }
        int i6 = 32;
        if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        int i7 = 256;
        if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ3);
        }
        if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ4);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16820sZ5);
        }
        if ((196608 & i) == 0) {
            i3 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16820sZ6);
        }
        if ((1572864 & i) == 0) {
            i3 |= AbstractC25232BEp.A0N(c5Tl, interfaceC16660sJ);
        }
        if ((12582912 & i) == 0) {
            i3 |= AbstractC25232BEp.A0Y(c5Tl, str);
        }
        if ((i & 100663296) == 0) {
            i3 |= AbstractC25232BEp.A0Z(c5Tl, str2);
        }
        if ((i & 805306368) == 0) {
            i3 |= AbstractC25232BEp.A0a(c5Tl, enumC27396C6z);
        }
        if ((i2 & 6) == 0) {
            if (c5Tl.AH4(immutableList)) {
                i5 = 4;
            }
            i4 = i5 | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (!c5Tl.AH5(z)) {
                i6 = 16;
            }
            i4 |= i6;
        }
        if ((i2 & 384) == 0) {
            if (!c5Tl.AH4(cpn)) {
                i7 = 128;
            }
            i4 |= i7;
        }
        if ((306783379 & i3) == 306783378 && (i4 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1574948175, "com.instagram.schools.management.ui.SchoolOnboardingStudentEmailContent (SchoolOnboardingStudentEmailContent.kt:57)");
            }
            C29819DDl c29819DDl = C29819DDl.A00;
            AbstractC28401Cg7.A03(c5Tl, immutableList, C75.A06, interfaceC16820sZ, c29819DDl, interfaceC16820sZ4, interfaceC16820sZ5, C5UA.A01(c5Tl, new C30580Dd1(enumC27396C6z, cpn, str, str2, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ6, interfaceC16660sJ, z), 844824292), AbstractC25229BEm.A05(i3 >> 3, 1597488 | (i3 & 14)) | (458752 & (i4 << 15)), 0);
            if (C0fH.A02()) {
                C0fH.A00(-1756150372);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30350DXz(immutableList, enumC27396C6z, cpn, str, str2, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, interfaceC16820sZ5, interfaceC16820sZ6, interfaceC16660sJ, i, i2, z);
        }
    }

    public static final void A01(C5Tl c5Tl, EnumC27396C6z enumC27396C6z, CPN cpn, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16660sJ interfaceC16660sJ, int i, boolean z) {
        int i2;
        c5Tl.Enr(-896911834);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ3);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16820sZ4);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0W(c5Tl, str);
        }
        if ((1572864 & i) == 0) {
            i2 |= AbstractC25232BEp.A0X(c5Tl, str2);
        }
        if ((12582912 & i) == 0) {
            i2 |= AbstractC25232BEp.A0Y(c5Tl, enumC27396C6z);
        }
        if ((100663296 & i) == 0) {
            i2 |= AbstractC25232BEp.A0j(c5Tl, z);
        }
        if ((805306368 & i) == 0) {
            i2 |= AbstractC25232BEp.A0a(c5Tl, cpn);
        }
        if ((306783379 & i2) == 306783378 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1311807252, "com.instagram.schools.management.ui.StudentEmailContent (SchoolOnboardingStudentEmailContent.kt:94)");
            }
            Modifier A02 = AbstractC28285CdX.A02(c5Tl, AbstractC25228BEl.A0W());
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A02);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0Y, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            A03(c5Tl, cpn, str, interfaceC16820sZ4, AbstractC25225BEi.A02(i2 >> 12) | ((i2 >> 21) & 896));
            int i3 = i2 >> 9;
            A04(interfaceC16820sZ3, c5Tl, i3 & 14);
            A02(c5Tl, enumC27396C6z, str2, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16660sJ, AbstractC25233BEq.A01(AbstractC25230BEn.A03(i2), i3 & 7168, i3), z);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1697997586);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30310DWl(enumC27396C6z, cpn, str, str2, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, interfaceC16660sJ, i, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C5Tl r41, X.EnumC27396C6z r42, java.lang.String r43, X.InterfaceC16820sZ r44, X.InterfaceC16820sZ r45, X.InterfaceC16660sJ r46, int r47, boolean r48) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28445Cgt.A02(X.5Tl, X.C6z, java.lang.String, X.0sZ, X.0sZ, X.0sJ, int, boolean):void");
    }

    public static final void A03(C5Tl c5Tl, CPN cpn, String str, InterfaceC16820sZ interfaceC16820sZ, int i) {
        int i2;
        String str2;
        c5Tl.Enr(424860065);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, str);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, cpn);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-97501208, "com.instagram.schools.management.ui.ChangeSchoolDialog (SchoolOnboardingStudentEmailContent.kt:114)");
            }
            if (AbstractC25230BEn.A1X(cpn.A00)) {
                String A00 = C5YD.A00(c5Tl, 2131956794);
                Integer num = C05F.A01;
                c5Tl.Eno(1423110534);
                int i3 = i2 & 896;
                boolean A1P = AbstractC167007dF.A1P(i2 & 14, 4) | AbstractC167007dF.A1P(i3, 256);
                Object EEc = c5Tl.EEc();
                if (A1P || EEc == C5UI.A00) {
                    EEc = AbstractC25235BEs.A19(c5Tl, interfaceC16820sZ, cpn, 44);
                }
                C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
                C26079Bg8 c26079Bg8 = new C26079Bg8(num, A00, (InterfaceC16820sZ) EEc, 12);
                String A002 = C5YD.A00(c5Tl, 2131968687);
                Integer num2 = C05F.A00;
                boolean A1U = AbstractC25232BEp.A1U(c5Tl, 1423118956, i3, 256);
                Object EEc2 = c5Tl.EEc();
                if (A1U || EEc2 == C5UI.A00) {
                    EEc2 = C29886DGa.A00(c5Tl, cpn, 24);
                }
                C26079Bg8 c26079Bg82 = new C26079Bg8(num2, A002, AbstractC25225BEi.A1A(A0K, EEc2, false), 12);
                boolean A1U2 = AbstractC25232BEp.A1U(c5Tl, 1423121548, i3, 256);
                Object EEc3 = c5Tl.EEc();
                if (A1U2 || EEc3 == C5UI.A00) {
                    EEc3 = C29886DGa.A00(c5Tl, cpn, 23);
                }
                InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(A0K, EEc3, false);
                String A003 = C5YD.A00(c5Tl, 2131975070);
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                AbstractC28433Cgh.A02(c5Tl, c26079Bg8, c26079Bg82, A003, AbstractC25228BEl.A17(c5Tl, str2, 2131975069), A1A);
            }
            if (C0fH.A02()) {
                C0fH.A00(1777872566);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DT4(cpn, interfaceC16820sZ, str, i, 15);
        }
    }

    public static final void A04(InterfaceC16820sZ interfaceC16820sZ, C5Tl c5Tl, int i) {
        int i2;
        c5Tl.Enr(1548269537);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-884791676, "com.instagram.schools.management.ui.StudentEmailHeadline (SchoolOnboardingStudentEmailContent.kt:145)");
            }
            String A00 = C5YD.A00(c5Tl, 2131965052);
            String A17 = AbstractC25228BEl.A17(c5Tl, A00, 2131968974);
            long A0C = AbstractC25226BEj.A0C(c5Tl);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 1345781328);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = AbstractC28401Cg7.A00(null, A00, A17, A0C);
                c5Tl.FBy(A0q);
            }
            C5C8 c5c8 = (C5C8) A0q;
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            String A002 = C5YD.A00(c5Tl, 2131968976);
            C26181Bi6 c26181Bi6 = new C26181Bi6(R.drawable.instagram_illustrations_product_illustration_pi_plus_schools_confirm_student_status, 96.0f);
            c5Tl.Eno(1345798452);
            boolean A1S = AbstractC25228BEl.A1S(i2);
            Object EEc = c5Tl.EEc();
            if (A1S || EEc == obj) {
                EEc = new C57753Pjg(interfaceC16820sZ, 42);
                c5Tl.FBy(EEc);
            }
            AbstractC28504Chx.A01(c5Tl, null, c26181Bi6, null, null, c5c8, null, A002, null, null, AbstractC25225BEi.A1B(c117505Tk, EEc, false), null, DalvikInternals.IOPRIO_BACKGROUND, 0, 4006, 0L);
            if (C0fH.A02()) {
                C0fH.A00(-532375513);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30497Dbg.A01(ASZ, interfaceC16820sZ, i, 43);
        }
    }
}
