package X;

/* renamed from: X.6OA, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6OA {
    public static final void A00(C6O2 c6o2, C5Tl c5Tl, Object obj, Object obj2, int i, int i2) {
        int i3;
        c5Tl.Enr(1439843069);
        if ((i2 & 6) == 0) {
            int i4 = 2;
            if (c5Tl.AH4(c6o2)) {
                i4 = 4;
            }
            i3 = i4 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            int i5 = 16;
            if (c5Tl.AH4(obj)) {
                i5 = 32;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            int i6 = 128;
            if (c5Tl.AH2(i)) {
                i6 = 256;
            }
            i3 |= i6;
        }
        if ((i2 & 3072) == 0) {
            int i7 = 1024;
            if (c5Tl.AH4(obj2)) {
                i7 = C3OO.FLAG_MOVED;
            }
            i3 |= i7;
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1793582144, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:133)");
            }
            ((C6N2) obj).A6z(c5Tl, obj2, C5UA.A01(c5Tl, new C9FD(i, 0, c6o2, obj2), 980966366), 48);
            if (C0fH.A02()) {
                C0fH.A00(-2077600726);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30490DbZ(i2, i, 1, c6o2, obj, obj2);
        }
    }
}
