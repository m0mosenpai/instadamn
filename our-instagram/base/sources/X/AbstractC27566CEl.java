package X;

import androidx.compose.foundation.lazy.LazyListState;

/* renamed from: X.CEl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27566CEl {
    public static final void A00(LazyListState lazyListState, C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, int i) {
        int i2;
        AbstractC167017dG.A1N(lazyListState, interfaceC16820sZ);
        c5Tl.Enr(-1471007431);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, lazyListState) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 91) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(269758433, "com.instagram.barcelona.permalink.ui.component.DetectScrollUp (DetectScrollUp.kt:10)");
            }
            c5Tl.Eno(-941056251);
            boolean z = true;
            boolean A1P = AbstractC167007dF.A1P(i2 & 14, 4);
            if ((i2 & 112) != 32) {
                z = false;
            }
            boolean z2 = A1P | z;
            Object EEc = c5Tl.EEc();
            if (z2 || EEc == C5UI.A00) {
                EEc = new MCJ(interfaceC16820sZ, lazyListState, null, 30);
                c5Tl.FBy(EEc);
            }
            AbstractC25231BEo.A11(c5Tl, EEc, lazyListState);
            if (C0fH.A02()) {
                C0fH.A00(-119318325);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30507Dbq.A01(ASZ, lazyListState, interfaceC16820sZ, i, 24);
        }
    }
}
