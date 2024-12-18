package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;

/* loaded from: classes5.dex */
public abstract class CGM {
    public static final void A00(C5Tl c5Tl, Modifier modifier, C6N c6n, String str, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, boolean z) {
        int i3;
        long A0O;
        long A02;
        boolean z2 = z;
        C6N c6n2 = c6n;
        Modifier modifier2 = modifier;
        boolean A1R = AbstractC167007dF.A1R(0, interfaceC16820sZ, str);
        c5Tl.Enr(-1353057148);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, str);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, modifier2);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0U(c5Tl, c6n2);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0f(c5Tl, z2);
        }
        if ((i3 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i5 != 0) {
                c6n2 = C6N.A02;
            }
            z2 = AbstractC25226BEj.A1V(i6, z2);
            if (C0fH.A02()) {
                C0fH.A01(742981306, "com.instagram.compose.igds.components.textcell.IgdsActionCell (IgdsActionCell.kt:37)");
            }
            float f = 0.3f;
            if (z2) {
                f = 1.0f;
            }
            int ordinal = c6n2.ordinal();
            if (ordinal != 0) {
                if (ordinal != A1R) {
                    if (ordinal == 2) {
                        A0O = AbstractC25227BEk.A0g(c5Tl, -760914150).A0E;
                    } else {
                        throw AbstractC25233BEq.A0r(c5Tl, -760920528);
                    }
                } else {
                    A0O = AbstractC25227BEk.A0g(c5Tl, -760916427).A0l;
                }
            } else {
                A0O = AbstractC25230BEn.A0O(c5Tl, -760918605);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            Modifier A0A = AbstractC118175Wb.A0A(C5XR.A05(modifier2, AbstractC25225BEi.A0W(0), null, interfaceC16820sZ, z2), C5XT.A00(c5Tl), 14.0f);
            A02 = C5AC.A02(AbstractC1132459m.A0K[(int) (A0O & 63)], C1132359l.A03(A0O), C1132359l.A02(A0O), C1132359l.A01(A0O), f);
            C5WR.A0N(c5Tl, A0A, AbstractC25226BEj.A0g(c5Tl), str, (i3 >> 3) & 14, A02);
            if (C0fH.A02()) {
                C0fH.A00(-1953148548);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DVD(c6n2, modifier2, interfaceC16820sZ, str, i, i2, 2, z2);
        }
    }
}
