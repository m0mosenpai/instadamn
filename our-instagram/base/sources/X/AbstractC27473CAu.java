package X;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;

/* renamed from: X.CAu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27473CAu {
    public static final LazyStaggeredGridState A00(C5Tl c5Tl) {
        if (C0fH.A02()) {
            C0fH.A01(199409511, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState (LazyStaggeredGridState.kt:73)");
        }
        Object[] objArr = new Object[0];
        C5C7 c5c7 = LazyStaggeredGridState.A0M;
        boolean A1Q = AbstractC25230BEn.A1Q(c5Tl.AH2(0) ? 1 : 0) | (c5Tl.AH2(0));
        Object EEc = c5Tl.EEc();
        if (A1Q || EEc == C5UI.A00) {
            EEc = new D6E(1);
            c5Tl.FBy(EEc);
        }
        LazyStaggeredGridState lazyStaggeredGridState = (LazyStaggeredGridState) C6M6.A00(c5Tl, c5c7, (InterfaceC16820sZ) EEc, objArr, 0, 4);
        if (C0fH.A02()) {
            C0fH.A00(1974391397);
        }
        return lazyStaggeredGridState;
    }
}
