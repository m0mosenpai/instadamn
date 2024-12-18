package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.CDk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27540CDk {
    public static final void A00(C5Tl c5Tl, Modifier modifier, EnumC27359C5o enumC27359C5o, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        int i3;
        int i4;
        Modifier modifier2 = modifier;
        boolean A1R = AbstractC167007dF.A1R(0, interfaceC16820sZ, enumC27359C5o);
        c5Tl.Enr(1252042179);
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
            i3 |= AbstractC25232BEp.A0S(c5Tl, enumC27359C5o);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, modifier);
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1690058886, "com.instagram.barcelona.accessibility.alttext.AltTextButton (AltTextButton.kt:16)");
            }
            String A00 = C5YD.A00(c5Tl, 2131953641);
            int ordinal = enumC27359C5o.ordinal();
            if (ordinal != 0) {
                if (ordinal == A1R) {
                    c5Tl.Eno(-1465212195);
                    i4 = 2131953643;
                } else {
                    throw AbstractC25233BEq.A0r(c5Tl, -1465216523);
                }
            } else {
                c5Tl.Eno(-1465215043);
                i4 = 2131953642;
            }
            String A002 = C5YD.A00(c5Tl, i4);
            AbstractC25225BEi.A1V(c5Tl, false);
            AbstractC27546CDq.A00(c5Tl, modifier2, A00, A002, interfaceC16820sZ, (i3 & 14) | ((i3 << 3) & 7168), 0);
            if (C0fH.A02()) {
                C0fH.A00(-2061261710);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30490DbZ(i, i2, 9, enumC27359C5o, interfaceC16820sZ, modifier2);
        }
    }
}
