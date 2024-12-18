package X;

import com.facebook.common.dextricks.DalvikInternals;
import com.google.common.collect.ImmutableList;

/* loaded from: classes5.dex */
public abstract class CYy {
    public static final void A00(C5Tl c5Tl, ImmutableList immutableList, EnumC27395C6y enumC27395C6y, EnumC27383C6m enumC27383C6m, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, boolean z) {
        int i3;
        int i4;
        boolean A1a = AbstractC167017dG.A1a(interfaceC16820sZ, interfaceC16820sZ2);
        AbstractC25234BEr.A0j(2, interfaceC16820sZ3, interfaceC16820sZ4, interfaceC16660sJ, str);
        AbstractC25229BEm.A1J(enumC27383C6m, 9, immutableList);
        c5Tl.Enr(-1406523795);
        int i5 = 4;
        if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ3);
        }
        if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ4);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16660sJ);
        }
        if ((196608 & i) == 0) {
            i3 |= AbstractC25232BEp.A0W(c5Tl, str);
        }
        if ((1572864 & i) == 0) {
            i3 |= AbstractC25232BEp.A0X(c5Tl, str2);
        }
        if ((12582912 & i) == 0) {
            i3 |= AbstractC25232BEp.A0i(c5Tl, z);
        }
        if ((i & 100663296) == 0) {
            i3 |= AbstractC25232BEp.A0Z(c5Tl, enumC27395C6y);
        }
        if ((i & 805306368) == 0) {
            i3 |= AbstractC25232BEp.A0a(c5Tl, enumC27383C6m);
        }
        if ((i2 & 6) == 0) {
            if (!c5Tl.AH4(immutableList)) {
                i5 = 2;
            }
            i4 = i2 | i5;
        } else {
            i4 = i2;
        }
        if ((i3 & 306783379) == 306783378 && (i4 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(792298625, "com.instagram.schools.management.ui.SchoolOnboardingConfirmSchoolContent (SchoolOnboardingConfirmSchoolContent.kt:52)");
            }
            AbstractC28401Cg7.A03(c5Tl, immutableList, C75.A03, interfaceC16820sZ, interfaceC16820sZ2, null, null, C5UA.A01(c5Tl, new C30578Dcz(enumC27395C6y, enumC27383C6m, interfaceC16820sZ4, interfaceC16820sZ3, interfaceC16660sJ, str2, str, A1a ? 1 : 0, z), -815432920), 1597440 | (i3 & 14) | (i3 & 112) | (458752 & (i4 << 15)), 12);
            if (C0fH.A02()) {
                C0fH.A00(268548570);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DXQ(immutableList, enumC27395C6y, enumC27383C6m, str, str2, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, interfaceC16660sJ, i, i2, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x023a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0261  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C5Tl r41, X.EnumC27395C6y r42, X.EnumC27383C6m r43, java.lang.String r44, java.lang.String r45, X.InterfaceC16820sZ r46, X.InterfaceC16820sZ r47, X.InterfaceC16660sJ r48, int r49, boolean r50) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CYy.A01(X.5Tl, X.C6y, X.C6m, java.lang.String, java.lang.String, X.0sZ, X.0sZ, X.0sJ, int, boolean):void");
    }
}
