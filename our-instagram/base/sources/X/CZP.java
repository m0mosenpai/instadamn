package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;

/* loaded from: classes5.dex */
public abstract class CZP {
    public static final C28836Co6 A00;

    static {
        C28834Co4 c28834Co4 = new C28834Co4(0);
        C16930sl c16930sl = C16930sl.A00;
        A00 = new C28836Co6(C6M3.Vertical, null, c28834Co4, new AnonymousClass582(1.0f, 1.0f), c16930sl, DJF.A00, AnonymousClass194.A02(AnonymousClass191.A00), 0.0f, 0, 0, 0, 0, 0, 0, 0, false, false);
    }

    public static final LazyGridState A00(C5Tl c5Tl) {
        if (C0fH.A02()) {
            C0fH.A01(-358002254, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:71)");
        }
        Object[] objArr = new Object[0];
        C5C7 c5c7 = LazyGridState.A0L;
        boolean A1Q = AbstractC25230BEn.A1Q(c5Tl.AH2(0) ? 1 : 0) | (c5Tl.AH2(0));
        Object EEc = c5Tl.EEc();
        if (A1Q || EEc == C5UI.A00) {
            EEc = new D6E(0);
            c5Tl.FBy(EEc);
        }
        LazyGridState lazyGridState = (LazyGridState) C6M6.A00(c5Tl, c5c7, (InterfaceC16820sZ) EEc, objArr, 0, 4);
        if (C0fH.A02()) {
            C0fH.A00(-1183934452);
        }
        return lazyGridState;
    }
}
