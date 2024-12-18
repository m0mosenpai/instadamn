package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikInternals;
import com.google.common.collect.ImmutableList;
import com.instagram.compose.core.ui.IgClickableTextKt;
import com.instagram.schools.management.data.SchoolAddress;
import com.instagram.schools.management.data.SchoolInfo;

/* renamed from: X.CeI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28330CeI {
    public static final void A00(C5Tl c5Tl, ImmutableList immutableList, SchoolInfo schoolInfo, Integer num, Integer num2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, int i) {
        int i2;
        C14360o3.A0B(interfaceC16820sZ, 0);
        AbstractC167027dH.A13(interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4);
        C14360o3.A0B(immutableList, 7);
        c5Tl.Enr(-177614741);
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
            i2 |= AbstractC25232BEp.A0L(c5Tl, schoolInfo);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0W(c5Tl, num);
        }
        if ((1572864 & i) == 0) {
            i2 |= AbstractC25232BEp.A0X(c5Tl, num2);
        }
        if ((12582912 & i) == 0) {
            i2 |= AbstractC25232BEp.A0Y(c5Tl, immutableList);
        }
        if ((4793491 & i2) == 4793490 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(2011416094, "com.instagram.schools.management.ui.SchoolOnboardingGradudationDateContent (SchoolOnboardingGraduationDateContent.kt:39)");
            }
            AbstractC28401Cg7.A03(c5Tl, immutableList, C75.A04, interfaceC16820sZ, C29817DDj.A00, null, null, C5UA.A01(c5Tl, new C30566Dcn(immutableList, schoolInfo, num, num2, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4), -1037255642), 1597488 | (i2 & 14) | (458752 & (i2 >> 6)), 12);
            if (C0fH.A02()) {
                C0fH.A00(-1301534583);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DWQ(interfaceC16820sZ3, interfaceC16820sZ, num2, num, immutableList, schoolInfo, interfaceC16820sZ4, interfaceC16820sZ2, i, 5);
        }
    }

    public static final void A01(C5Tl c5Tl, SchoolInfo schoolInfo, Integer num, Integer num2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, int i, boolean z) {
        int i2;
        int i3;
        Object[] objArr;
        char c;
        c5Tl.Enr(1995169110);
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
            i2 |= AbstractC25232BEp.A0K(c5Tl, schoolInfo);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0f(c5Tl, z);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0W(c5Tl, num);
        }
        if ((1572864 & i) == 0) {
            i2 |= AbstractC25232BEp.A0X(c5Tl, num2);
        }
        if ((599187 & i2) == 599186 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-674424670, "com.instagram.schools.management.ui.GraduationDateContent (SchoolOnboardingGraduationDateContent.kt:70)");
            }
            Modifier A0T = AbstractC25226BEj.A0T(Modifier.A00);
            Modifier A02 = AbstractC28285CdX.A02(c5Tl, A0T);
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
            SchoolAddress schoolAddress = schoolInfo.A00;
            String str = schoolAddress.A02;
            if (str.length() == 0) {
                c5Tl.Eno(-32094206);
                i3 = 2131972903;
                objArr = new Object[2];
                objArr[0] = schoolAddress.A00;
                str = schoolAddress.A01;
                c = 1;
            } else {
                c5Tl.Eno(-31979320);
                i3 = 2131972904;
                objArr = new Object[3];
                objArr[0] = schoolAddress.A00;
                objArr[1] = schoolAddress.A01;
                c = 2;
            }
            objArr[c] = str;
            String A012 = C5YD.A01(c5Tl, objArr, i3);
            C117505Tk.A0L(c117505Tk, false);
            if (z) {
                c5Tl.Eno(-31746262);
                AbstractC28504Chx.A01(c5Tl, A0T, new C26181Bi6(R.drawable.instagram_illustrations_product_illustration_pi_plus_schools_when_will_you_graduate, 96.0f), null, null, A012, null, schoolInfo.A02, C5YD.A00(c5Tl, 2131961561), interfaceC16820sZ, null, null, 48, (i2 << 3) & 112, 1508, 0L);
            } else {
                c5Tl.Eno(-31169166);
                AbstractC28504Chx.A02(c5Tl, A0T, new C26181Bi6(R.drawable.instagram_illustrations_product_illustration_pi_plus_schools_when_will_you_graduate, 96.0f), A012, schoolInfo.A02, 48, 4068);
            }
            C117505Tk.A0L(c117505Tk, false);
            A02(c5Tl, num, num2, interfaceC16820sZ3, interfaceC16820sZ2, AbstractC25229BEm.A05(i2 >> 9, ((i2 >> 6) & 14) | (i2 & 112)));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-701494503);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30288DVp(num, schoolInfo, num2, interfaceC16820sZ, interfaceC16820sZ3, interfaceC16820sZ2, i, 2, z);
        }
    }

    public static final void A02(C5Tl c5Tl, Integer num, Integer num2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i) {
        int i2;
        c5Tl.Enr(188767171);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, num);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0U(c5Tl, num2);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-478715301, "com.instagram.schools.management.ui.DatePicker (SchoolOnboardingGraduationDateContent.kt:123)");
            }
            String A00 = C5YD.A00(c5Tl, 2131965052);
            String A17 = AbstractC25228BEl.A17(c5Tl, A00, 2131968979);
            long A0C = AbstractC25226BEj.A0C(c5Tl);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -1565994633);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = AbstractC28401Cg7.A00(null, A00, A17, A0C);
                c5Tl.FBy(A0q);
            }
            C5C8 c5c8 = (C5C8) A0q;
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0Y, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C5WR.A05(c5Tl, AbstractC118175Wb.A09(c1130158n, 14.0f), AbstractC25225BEi.A0X(c5Tl), C5YD.A00(c5Tl, 2131968980));
            boolean A1X = AbstractC25234BEr.A1X(c5Tl, -1610844236, i2);
            Object EEc = c5Tl.EEc();
            if (A1X || EEc == obj) {
                EEc = C29886DGa.A00(c5Tl, interfaceC16820sZ, 16);
            }
            Modifier A05 = C5XR.A05(c1130158n, null, null, AbstractC25225BEi.A1A(A0K, EEc, false), true);
            int i3 = i2 >> 3;
            AbstractC28328CeG.A02(c5Tl, A05, num, num2, (i3 & 112) | (i3 & 896), 0);
            Modifier A09 = AbstractC118175Wb.A09(c1130158n, 8.0f);
            C118125Vw A0Y2 = AbstractC25225BEi.A0Y(c5Tl);
            long A0M = AbstractC25226BEj.A0M(c5Tl);
            c5Tl.Eno(-1610833448);
            boolean A1L = AbstractC25231BEo.A1L(i2);
            Object EEc2 = c5Tl.EEc();
            if (A1L || EEc2 == obj) {
                EEc2 = new C57753Pjg(interfaceC16820sZ2, 38);
                c5Tl.FBy(EEc2);
            }
            IgClickableTextKt.A03(c5Tl, A09, c5c8, A0Y2, AbstractC25225BEi.A1B(A0K, EEc2, false), 54, 112632, A0M);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-66163086);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30491Dba(num2, num, interfaceC16820sZ2, interfaceC16820sZ, i, 21);
        }
    }
}
