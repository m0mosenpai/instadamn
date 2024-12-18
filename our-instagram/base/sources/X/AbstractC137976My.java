package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.6My, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC137976My {
    public static final void A00(C6MH c6mh, C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF, int i, int i2) {
        int i3;
        Object obj = c6mh;
        Modifier modifier2 = modifier;
        c5Tl.Enr(2002163445);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            int i4 = 2;
            if (c5Tl.AH6(interfaceC16820sZ)) {
                i4 = 4;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            int i6 = 16;
            if (c5Tl.AH4(modifier)) {
                i6 = 32;
            }
            i3 |= i6;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            int i8 = 128;
            if (c5Tl.AH4(obj)) {
                i8 = 256;
            }
            i3 |= i8;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            int i9 = 1024;
            if (c5Tl.AH6(interfaceC16620sF)) {
                i9 = C3OO.FLAG_MOVED;
            }
            i3 |= i9;
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i7 != 0) {
                obj = null;
            }
            if (C0fH.A02()) {
                C0fH.A01(1055722787, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:78)");
            }
            AbstractC137986Mz.A00(c5Tl, C5UA.A01(c5Tl, new C9FZ(0, obj, modifier2, interfaceC16620sF, C5WZ.A00(c5Tl, interfaceC16820sZ)), -1488997347), 6);
            if (C0fH.A02()) {
                C0fH.A00(1301871141);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30492Dbb(obj, modifier2, interfaceC16620sF, interfaceC16820sZ, i, i2, 3);
        }
    }
}
