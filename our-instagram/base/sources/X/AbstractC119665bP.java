package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.5bP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC119665bP {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        c5Tl.Enr(-932836462);
        if ((i & 6) == 0) {
            int i3 = 2;
            if (c5Tl.AH4(modifier)) {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i4 = 16;
            if (c5Tl.AH6(interfaceC16660sJ)) {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1644682655, "androidx.compose.foundation.Canvas (Canvas.kt:42)");
            }
            AbstractC119685bS.A00(c5Tl, AbstractC119675bQ.A00(modifier, interfaceC16660sJ));
            if (C0fH.A02()) {
                C0fH.A00(1753276627);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30507Dbq(i, 1, interfaceC16660sJ, modifier);
        }
    }
}
