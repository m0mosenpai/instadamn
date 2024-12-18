package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.5bK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC119615bK {
    public static final void A00(C5Tl c5Tl, Modifier modifier, C206209Bd c206209Bd, int i, int i2) {
        int i3;
        long j;
        long j2;
        Modifier modifier2 = modifier;
        C14360o3.A0B(c206209Bd, 0);
        c5Tl.Enr(1262085229);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            int i4 = 2;
            if (c5Tl.AH4(c206209Bd)) {
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
            if (c5Tl.AH4(modifier2)) {
                i6 = 32;
            }
            i3 |= i6;
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1391489086, "com.instagram.feed.adapter.row.ufi.compose.ComposeMediaCarouselIndicatorComponent (ComposeMediaCarouselIndicatorComponent.kt:19)");
            }
            C119565bE c119565bE = (C119565bE) c206209Bd.A01;
            C1132359l c1132359l = (C1132359l) c206209Bd.A00;
            c5Tl.Eno(-826865342);
            if (c1132359l == null) {
                j = C5XL.A00(c5Tl).A0l;
            } else {
                j = c1132359l.A00;
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            C1132359l c1132359l2 = (C1132359l) c206209Bd.A02;
            c5Tl.Eno(-826862592);
            if (c1132359l2 == null) {
                j2 = C5XL.A00(c5Tl).A0w;
            } else {
                j2 = c1132359l2.A00;
            }
            C117505Tk.A0L(c117505Tk, false);
            AbstractC119635bM.A00(c5Tl, modifier2, new C119625bL(j, j2), c119565bE, 0.0f, (i3 & 112) | 8, 8);
            if (C0fH.A02()) {
                C0fH.A00(-365730772);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30504Dbn(modifier2, i2, c206209Bd, i, 35);
        }
    }
}
