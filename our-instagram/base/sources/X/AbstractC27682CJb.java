package X;

import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.opal.impl.data.OpalProfileData;

/* renamed from: X.CJb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27682CJb {
    public static final void A00(C5Tl c5Tl, OpalProfileData opalProfileData, OpalProfileData opalProfileData2, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, boolean z, boolean z2, boolean z3) {
        int i3;
        int i4;
        c5Tl.Enr(1027226482);
        if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ);
        }
        if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ3);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16820sZ4);
        }
        if ((196608 & i) == 0) {
            i3 |= AbstractC25232BEp.A0g(c5Tl, z);
        }
        if ((i & 1572864) == 0) {
            i3 |= AbstractC25232BEp.A0h(c5Tl, z2);
        }
        if ((i & 12582912) == 0) {
            i3 |= AbstractC25232BEp.A0i(c5Tl, z3);
        }
        if ((i & 100663296) == 0) {
            i3 |= AbstractC25232BEp.A0Z(c5Tl, str);
        }
        if ((i & 805306368) == 0) {
            i3 |= AbstractC25232BEp.A0Q(c5Tl, opalProfileData);
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | AbstractC25232BEp.A0H(c5Tl, opalProfileData2);
        } else {
            i4 = i2;
        }
        if ((i3 & 306783379) == 306783378 && (i4 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1470842297, "com.instagram.opal.impl.ui.OpalNavbarSurface (OpalFragment.kt:1177)");
            }
            if (z2) {
                boolean A1X = AbstractC25234BEr.A1X(c5Tl, 135726990, i3);
                Object EEc = c5Tl.EEc();
                if (A1X || EEc == C5UI.A00) {
                    EEc = DH3.A02(c5Tl, interfaceC16820sZ, 35);
                }
                InterfaceC16820sZ interfaceC16820sZ5 = (InterfaceC16820sZ) EEc;
                C117505Tk A0J = AbstractC25225BEi.A0J(c5Tl);
                boolean A1Y = AbstractC25234BEr.A1Y(c5Tl, 135728961, i3);
                Object EEc2 = c5Tl.EEc();
                if (A1Y || EEc2 == C5UI.A00) {
                    EEc2 = DH3.A02(c5Tl, interfaceC16820sZ2, 36);
                }
                InterfaceC16820sZ interfaceC16820sZ6 = (InterfaceC16820sZ) EEc2;
                C117505Tk.A0I(A0J);
                boolean A1Z = AbstractC25234BEr.A1Z(c5Tl, 135730405, i3);
                Object EEc3 = c5Tl.EEc();
                if (A1Z || EEc3 == C5UI.A00) {
                    EEc3 = AbstractC25229BEm.A0v(c5Tl, interfaceC16660sJ, 49);
                }
                InterfaceC16660sJ interfaceC16660sJ2 = (InterfaceC16660sJ) EEc3;
                C117505Tk.A0I(A0J);
                boolean A1a = AbstractC25234BEr.A1a(c5Tl, 135732000, i3);
                Object EEc4 = c5Tl.EEc();
                if (A1a || EEc4 == C5UI.A00) {
                    EEc4 = DH3.A02(c5Tl, interfaceC16820sZ3, 37);
                }
                InterfaceC16820sZ interfaceC16820sZ7 = (InterfaceC16820sZ) EEc4;
                C117505Tk.A0I(A0J);
                c5Tl.Eno(135733669);
                boolean A1W = AbstractC25234BEr.A1W(i3);
                Object EEc5 = c5Tl.EEc();
                if (A1W || EEc5 == C5UI.A00) {
                    EEc5 = DH3.A01(c5Tl, interfaceC16820sZ4, 38);
                }
                C117505Tk.A0I(A0J);
                int i5 = i3 >> 3;
                AbstractC28061CYp.A01(c5Tl, opalProfileData, opalProfileData2, str, interfaceC16820sZ5, interfaceC16820sZ6, interfaceC16820sZ7, (InterfaceC16820sZ) EEc5, interfaceC16660sJ2, (i5 & 234881024) | (458752 & (i3 >> 6)) | ((i3 << 3) & 3670016) | (29360128 & i5) | ((i4 << 27) & 1879048192), z3, z);
            }
            if (C0fH.A02()) {
                C0fH.A00(-125699651);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DXP(opalProfileData, opalProfileData2, str, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, interfaceC16660sJ, i, i2, z, z2, z3);
        }
    }
}
