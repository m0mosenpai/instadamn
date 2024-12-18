package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public abstract class CI3 {
    public static final void A00(C5Tl c5Tl, Modifier modifier, Float f, int i, int i2) {
        int i3;
        boolean z;
        Float f2 = f;
        Modifier modifier2 = modifier;
        c5Tl.Enr(-235751703);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, modifier2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, f2);
        }
        if ((i3 & 91) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i5 != 0) {
                f2 = null;
            }
            if (C0fH.A02()) {
                C0fH.A01(102768155, "com.instagram.creator.achievements.modules.views.RefreshSpinner (RefreshSpinner.kt:14)");
            }
            if (f2 != null) {
                c5Tl.Eno(369696021);
                z = false;
                BGY.A01(c5Tl, modifier2, f2.floatValue(), 2.0f, 0.0f, 196608 | ((i3 >> 3) & 14) | ((i3 << 3) & 112), 88, AbstractC25226BEj.A0K(c5Tl), 0L, false);
            } else {
                c5Tl.Eno(369837226);
                z = false;
                BGY.A02(c5Tl, modifier2, 2.0f, (i3 & 14) | 384, 0, AbstractC25226BEj.A0K(c5Tl));
            }
            if (AbstractC25230BEn.A1Z(c5Tl, z)) {
                C0fH.A00(-1653701107);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30504Dbn.A01(modifier2, f2, i2, i, 33);
        }
    }
}
