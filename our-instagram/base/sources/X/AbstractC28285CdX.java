package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.CdX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28285CdX {
    public static final C28729CmL A00(C5Tl c5Tl) {
        if (C0fH.A02()) {
            C0fH.A01(1839438786, "androidx.compose.foundation.rememberScrollState (Scroll.kt:69)");
        }
        Object[] objArr = new Object[0];
        C5C7 c5c7 = C28729CmL.A08;
        boolean z = c5Tl.AH2(0);
        Object EEc = c5Tl.EEc();
        if (z || EEc == C5UI.A00) {
            EEc = new C58472Pvx(0, 0);
            c5Tl.FBy(EEc);
        }
        C28729CmL c28729CmL = (C28729CmL) C6M6.A00(c5Tl, c5c7, (InterfaceC16820sZ) EEc, objArr, 0, 4);
        if (C0fH.A02()) {
            C0fH.A00(794391905);
        }
        return c28729CmL;
    }

    public static final Modifier A01(C28729CmL c28729CmL, Modifier modifier) {
        return C5X3.A02(modifier, C5XU.A00, new C30511Dbu(c28729CmL, true));
    }

    public static Modifier A02(C5Tl c5Tl, Modifier modifier) {
        return A01(A00(c5Tl), modifier);
    }
}
