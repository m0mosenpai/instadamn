package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikConstants;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.schools.management.data.SchoolAddress;

/* renamed from: X.ChL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28469ChL {
    public static final void A03(C5Tl c5Tl, EnumC39642HiX enumC39642HiX, C29138Ct5 c29138Ct5, C26014Bf2 c26014Bf2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16820sZ interfaceC16820sZ5, InterfaceC16820sZ interfaceC16820sZ6, int i, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        boolean A1R = AbstractC167007dF.A1R(0, interfaceC16820sZ, interfaceC16820sZ2);
        AbstractC25234BEr.A0j(2, interfaceC16820sZ3, interfaceC16820sZ4, interfaceC16820sZ5, interfaceC16820sZ6);
        AbstractC25229BEm.A1J(c29138Ct5, 9, enumC39642HiX);
        c5Tl.Enr(-338412363);
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
            i3 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16820sZ5);
        }
        if ((196608 & i) == 0) {
            i3 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16820sZ6);
        }
        if ((1572864 & i) == 0) {
            i3 |= AbstractC25232BEp.A0h(c5Tl, z);
        }
        if ((12582912 & i) == 0) {
            i3 |= AbstractC25232BEp.A0i(c5Tl, z2);
        }
        if ((i & 100663296) == 0) {
            i3 |= AbstractC25232BEp.A0P(c5Tl, c26014Bf2);
        }
        if ((i & 805306368) == 0) {
            i3 |= AbstractC25232BEp.A0Q(c5Tl, c29138Ct5);
        }
        if ((i2 & 6) == 0) {
            if (!c5Tl.AH4(enumC39642HiX)) {
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
                C0fH.A01(1404270882, "com.instagram.schools.management.ui.SchoolSettingsComposeView (SchoolSettingsComposeView.kt:42)");
            }
            if (AbstractC25235BEs.A1Z(c5Tl, new DXK(interfaceC16820sZ2, c26014Bf2, interfaceC16820sZ5, c29138Ct5, interfaceC16820sZ6, enumC39642HiX, interfaceC16820sZ3, interfaceC16820sZ, interfaceC16820sZ4, A1R ? 1 : 0, z, z2), -1977208077)) {
                C0fH.A00(1681178201);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30341DXq(enumC39642HiX, c29138Ct5, c26014Bf2, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, interfaceC16820sZ5, interfaceC16820sZ6, i, i2, 0, z, z2);
        }
    }

    public static final void A00(C5Tl c5Tl, int i) {
        c5Tl.Enr(-194942983);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(258343100, "com.instagram.schools.management.ui.EmptyView (SchoolSettingsComposeView.kt:63)");
            }
            if (C0fH.A02()) {
                C0fH.A00(1504098401);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30493Dbc.A01(ASZ, i, 17);
        }
    }

    public static final void A01(C5Tl c5Tl, int i) {
        c5Tl.Enr(-633079981);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-2127912371, "com.instagram.schools.management.ui.SeparatorLineWide (SchoolSettingsComposeView.kt:202)");
            }
            AbstractC25229BEm.A16(c5Tl, AbstractC118185Wd.A08(AbstractC25228BEl.A0W(), 6.0f), AbstractC25226BEj.A0B(c5Tl));
            if (C0fH.A02()) {
                C0fH.A00(-627372096);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30493Dbc.A01(ASZ, i, 18);
        }
    }

    public static final void A02(C5Tl c5Tl, EnumC39642HiX enumC39642HiX, C29138Ct5 c29138Ct5, C26014Bf2 c26014Bf2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, int i, boolean z) {
        int i2;
        int i3;
        Object[] objArr;
        c5Tl.Enr(-723915523);
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
            i2 |= AbstractC25232BEp.A0f(c5Tl, z);
        }
        if ((i & 196608) == 0) {
            i2 |= AbstractC25232BEp.A0M(c5Tl, c26014Bf2);
        }
        if ((i & 1572864) == 0) {
            i2 |= AbstractC25232BEp.A0N(c5Tl, c29138Ct5);
        }
        if ((i & 12582912) == 0) {
            i2 |= AbstractC25232BEp.A0Y(c5Tl, enumC39642HiX);
        }
        if ((i2 & 4793491) == 4793490 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-832169699, "com.instagram.schools.management.ui.UpperSettingsSection (SchoolSettingsComposeView.kt:110)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 646912833);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = new CPM();
                c5Tl.FBy(A0q);
            }
            CPM cpm = (CPM) A0q;
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            SchoolAddress schoolAddress = c26014Bf2.A02;
            String str = schoolAddress.A02;
            boolean z2 = true;
            if (str.length() == 0) {
                c5Tl.Eno(-1420453064);
                i3 = 2131972903;
                objArr = new Object[]{schoolAddress.A00, schoolAddress.A01};
            } else {
                c5Tl.Eno(-1420346424);
                i3 = 2131972904;
                objArr = new Object[]{schoolAddress.A00, schoolAddress.A01, str};
            }
            String A01 = C5YD.A01(c5Tl, objArr, i3);
            C117505Tk.A0L(c117505Tk, false);
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0Y, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A012);
            CKB.A00(C5YD.A00(c5Tl, 2131972915), c5Tl, 0);
            int i4 = i2 & 29360128;
            boolean A1X = AbstractC25233BEq.A1X(c5Tl, cpm, c29138Ct5, AbstractC25234BEr.A1X(c5Tl, 2140732516, i2), AbstractC25234BEr.A1W(i2)) | AbstractC167007dF.A1P(i4, DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE);
            Object EEc = c5Tl.EEc();
            if (A1X || EEc == obj) {
                EEc = new BUO(5, cpm, c29138Ct5, interfaceC16820sZ, enumC39642HiX, z);
                c5Tl.FBy(EEc);
            }
            AbstractC25705BXp.A0L(c5Tl, C5XR.A05(c1130158n, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc, false), true), C29198Cu3.A00, c26014Bf2.A04, A01);
            boolean A1Q = AbstractC25233BEq.A1Q(c5Tl, 2140748131, i2);
            Object EEc2 = c5Tl.EEc();
            if (A1Q || EEc2 == obj) {
                EEc2 = C29886DGa.A00(c5Tl, interfaceC16820sZ3, 40);
            }
            AbstractC28328CeG.A01(c5Tl, C5XR.A05(c1130158n, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc2, false), true), c26014Bf2.A00, c26014Bf2.A01, 0, 0);
            boolean A1P = AbstractC25233BEq.A1P(c5Tl, 2140753596, i2);
            Object EEc3 = c5Tl.EEc();
            if (A1P || EEc3 == obj) {
                EEc3 = C29886DGa.A00(c5Tl, interfaceC16820sZ2, 41);
            }
            AbstractC25705BXp.A0I(c5Tl, C5XR.A05(c1130158n, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc3, false), true), null, C5YD.A00(c5Tl, 2131972320), 130044, AbstractC25226BEj.A07(c5Tl));
            c5Tl.ASW();
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, c29138Ct5, 646958455) | AbstractC167007dF.A1P(i4, DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE);
            Object EEc4 = c5Tl.EEc();
            if (A1Z || EEc4 == obj) {
                EEc4 = AbstractC25235BEs.A19(c5Tl, c29138Ct5, enumC39642HiX, 45);
            }
            InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(c117505Tk, EEc4, false);
            boolean A1Z2 = AbstractC25227BEk.A1Z(c5Tl, c29138Ct5, 646964724);
            if (i4 != 8388608) {
                z2 = false;
            }
            boolean z3 = A1Z2 | z2;
            Object EEc5 = c5Tl.EEc();
            if (z3 || EEc5 == obj) {
                EEc5 = AbstractC25235BEs.A19(c5Tl, c29138Ct5, enumC39642HiX, 46);
            }
            CK9.A00(c5Tl, cpm, interfaceC16820sZ4, A1A, AbstractC25225BEi.A1A(c117505Tk, EEc5, false), (i2 >> 9) & 14);
            if (C0fH.A02()) {
                C0fH.A00(-1086587382);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DWP(interfaceC16820sZ4, interfaceC16820sZ2, enumC39642HiX, interfaceC16820sZ3, c26014Bf2, c29138Ct5, interfaceC16820sZ, i, 1, z);
        }
    }

    public static final void A04(C5Tl c5Tl, EnumC39642HiX enumC39642HiX, C29138Ct5 c29138Ct5, C26014Bf2 c26014Bf2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16820sZ interfaceC16820sZ5, InterfaceC16820sZ interfaceC16820sZ6, int i, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        c5Tl.Enr(442223513);
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
            i3 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16820sZ5);
        }
        if ((196608 & i) == 0) {
            i3 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16820sZ6);
        }
        if ((1572864 & i) == 0) {
            i3 |= AbstractC25232BEp.A0h(c5Tl, z);
        }
        if ((12582912 & i) == 0) {
            i3 |= AbstractC25232BEp.A0i(c5Tl, z2);
        }
        if ((100663296 & i) == 0) {
            i3 |= AbstractC25232BEp.A0P(c5Tl, c26014Bf2);
        }
        if ((805306368 & i) == 0) {
            i3 |= AbstractC25232BEp.A0Q(c5Tl, c29138Ct5);
        }
        if ((i2 & 6) == 0) {
            if (!c5Tl.AH4(enumC39642HiX)) {
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
                C0fH.A01(1661243185, "com.instagram.schools.management.ui.SettingsView (SchoolSettingsComposeView.kt:78)");
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
            int i6 = i3 >> 9;
            A02(c5Tl, enumC39642HiX, c29138Ct5, c26014Bf2, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ6, AbstractC25229BEm.A06(AbstractC25231BEo.A06(i3 >> 6, AbstractC25230BEn.A03(i3)), 458752 & i6, i6) | ((i4 << 21) & 29360128), z);
            A01(c5Tl, 0);
            A05(c5Tl, c26014Bf2, interfaceC16820sZ4, interfaceC16820sZ5, AbstractC25229BEm.A05(i3 >> 15, AbstractC25225BEi.A01(i6)), z2);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-518326);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30341DXq(enumC39642HiX, c29138Ct5, c26014Bf2, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, interfaceC16820sZ5, interfaceC16820sZ6, i, i2, 1, z, z2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
    
        if (r0.size() <= 1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(X.C5Tl r14, X.C26014Bf2 r15, X.InterfaceC16820sZ r16, X.InterfaceC16820sZ r17, int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28469ChL.A05(X.5Tl, X.Bf2, X.0sZ, X.0sZ, int, boolean):void");
    }
}
