package X;

import com.facebook.common.dextricks.DexOptimizationMessageHandler;

/* loaded from: classes5.dex */
public abstract class BGQ {
    public static final C25246BFf A00(C25245BFe c25245BFe, C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, float f, int i, int i2, boolean z) {
        C25245BFe c25245BFe2 = c25245BFe;
        float f2 = f;
        C14360o3.A0B(interfaceC16820sZ, 1);
        c5Tl.Eno(1025810032);
        if ((i2 & 4) != 0) {
            f2 = 80.0f;
        }
        float f3 = 0.0f;
        if ((i2 & 8) != 0) {
            f3 = 56.0f;
        }
        if ((i2 & 16) != 0) {
            c25245BFe2 = C25245BFe.A00(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD, 0);
        }
        if (C0fH.A02()) {
            C0fH.A01(1638028379, "com.instagram.compose.ui.pulltorefresh.rememberPullRefreshState (PullRefreshState.kt:61)");
        }
        boolean z2 = true;
        if (Float.compare(f2, 0.0f) > 0) {
            Object EEc = c5Tl.EEc();
            Object obj = C5UI.A00;
            C19L c19l = ((C137536Kz) AbstractC25234BEr.A0b(c5Tl, EEc, obj)).A00;
            InterfaceC74953Yl A00 = C5WZ.A00(c5Tl, interfaceC16820sZ);
            InterfaceC1128957x A0h = AbstractC25228BEl.A0h(c5Tl);
            float EqT = A0h.EqT(f2);
            float EqT2 = A0h.EqT(f3);
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, c19l, 1298277815);
            Object EEc2 = c5Tl.EEc();
            if (A1Y || EEc2 == obj) {
                EEc2 = new C25246BFf(c25245BFe2, A00, c19l, EqT2, EqT);
                c5Tl.FBy(EEc2);
            }
            C25246BFf c25246BFf = (C25246BFf) EEc2;
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Object AJX = c5Tl.AJX(C6LG.A00);
            c5Tl.Eno(1298286132);
            if (AJX != null) {
                boolean A1Y2 = AbstractC25232BEp.A1Y(c5Tl, c25246BFf, AJX, 1298287678);
                Object EEc3 = c5Tl.EEc();
                if (A1Y2 || EEc3 == obj) {
                    EEc3 = new MC7(c25246BFf, AJX, (InterfaceC23621Ds) null, 23);
                    c5Tl.FBy(EEc3);
                }
                AbstractC25228BEl.A1K(c5Tl, A0K, EEc3, c25246BFf, false);
            }
            C117505Tk.A0L(A0K, false);
            c5Tl.Eno(1298311527);
            C117505Tk.A0L(A0K, false);
            boolean A1Y3 = AbstractC25227BEk.A1Y(c5Tl, c25246BFf, 1298323635);
            if ((((i & 14) ^ 6) <= 4 || !c5Tl.AH5(z)) && (i & 6) != 4) {
                z2 = false;
            }
            boolean z3 = A1Y3 | z2;
            Object EEc4 = c5Tl.EEc();
            if (z3 || EEc4 == obj) {
                EEc4 = AbstractC25229BEm.A0x(c5Tl, c25246BFf, 19, z);
            }
            C5UX.A05(c5Tl, AbstractC25225BEi.A1A(A0K, EEc4, false));
            if (C0fH.A02()) {
                C0fH.A00(636028625);
            }
            C117505Tk.A0L(A0K, false);
            return c25246BFf;
        }
        throw AbstractC166987dD.A12("The refresh trigger must be greater than zero!");
    }
}
