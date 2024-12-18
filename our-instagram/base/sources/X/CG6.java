package X;

import android.content.Context;

/* loaded from: classes5.dex */
public abstract class CG6 {
    public static final void A00(C5Tl c5Tl, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        C14360o3.A0B(interfaceC16660sJ, 0);
        c5Tl.Enr(1122247811);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16660sJ) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(465343853, "com.instagram.common.screenshot.compose.DetectScreenshots (DetectScreenshots.kt:17)");
            }
            Context A0K = AbstractC25228BEl.A0K(c5Tl);
            C3MJ A00 = C3MI.A00(AbstractC166987dD.A0O(A0K), AbstractC25229BEm.A0d(c5Tl));
            Object AJX = c5Tl.AJX(C5VN.A00);
            InterfaceC74953Yl A002 = C5WZ.A00(c5Tl, interfaceC16660sJ);
            C0eB c0eB = C0eB.A00;
            boolean A1X = AbstractC25225BEi.A1X(c5Tl, A002, AbstractC25233BEq.A1W(c5Tl, AJX, A00, -1883846602));
            Object EEc = c5Tl.EEc();
            if (A1X || EEc == C5UI.A00) {
                EEc = new MC8(AJX, A00, A002, null, 34);
                c5Tl.FBy(EEc);
            }
            AbstractC25231BEo.A10(c5Tl, EEc, c0eB);
            if (C0fH.A02()) {
                C0fH.A00(-1597709941);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30499Dbi.A01(ASZ, interfaceC16660sJ, i, 28);
        }
    }
}
