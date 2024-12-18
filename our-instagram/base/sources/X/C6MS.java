package X;

import android.view.ViewConfiguration;

/* renamed from: X.6MS, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6MS {
    public static final float A00 = ViewConfiguration.getScrollFriction();

    public static final C6MY A00(C5Tl c5Tl) {
        if (C0fH.A02()) {
            C0fH.A01(-848194722, "androidx.compose.animation.rememberSplineBasedDecay (SplineBasedFloatDecayAnimationSpec.android.kt:40)");
        }
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        InterfaceC1128957x interfaceC1128957x = (InterfaceC1128957x) C5UT.A01(C5V2.A01, C117505Tk.A04(c117505Tk));
        boolean AH1 = c5Tl.AH1(interfaceC1128957x.Awk());
        Object EEc = c5Tl.EEc();
        if (AH1 || EEc == C5UI.A00) {
            EEc = new C6MX(new C6MT(interfaceC1128957x));
            c117505Tk.A0Q(EEc);
        }
        C6MY c6my = (C6MY) EEc;
        if (C0fH.A02()) {
            C0fH.A00(1167683991);
        }
        return c6my;
    }
}
