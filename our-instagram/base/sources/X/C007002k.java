package X;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.02k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C007002k extends C04j {
    public static final C011504d A00;

    @Override // X.AbstractC17720u9, X.C011304b
    public final void A0C(View view) {
    }

    static {
        WindowInsets windowInsets = WindowInsets.CONSUMED;
        C011504d c011504d = C011504d.A01;
        windowInsets.getClass();
        A00 = new C011504d(windowInsets);
    }

    @Override // X.AbstractC17720u9, X.C011304b
    public final C02I A05(int i) {
        return C02I.A01(this.A04.getInsets(AbstractC011404c.A00(i)));
    }

    @Override // X.AbstractC17720u9, X.C011304b
    public final C02I A06(int i) {
        return C02I.A01(this.A04.getInsetsIgnoringVisibility(AbstractC011404c.A00(i)));
    }

    @Override // X.AbstractC17720u9, X.C011304b
    public final boolean A0I(int i) {
        return this.A04.isVisible(AbstractC011404c.A00(i));
    }

    public C007002k(C011504d c011504d, WindowInsets windowInsets) {
        super(c011504d, windowInsets);
    }
}
