package X;

import androidx.compose.foundation.gestures.ScrollableKt;

/* loaded from: classes5.dex */
public abstract class BGV {
    public static final C6NW A00(C5Tl c5Tl) {
        if (C0fH.A02()) {
            C0fH.A01(659813409, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:570)");
        }
        C6MY A00 = C6MS.A00(c5Tl);
        boolean AH4 = c5Tl.AH4(A00);
        Object EEc = c5Tl.EEc();
        if (AH4 || EEc == C5UI.A00) {
            EEc = new C6NW(A00, ScrollableKt.A02);
            c5Tl.FBy(EEc);
        }
        C6NW c6nw = (C6NW) EEc;
        if (C0fH.A02()) {
            C0fH.A00(387730893);
        }
        return c6nw;
    }
}
