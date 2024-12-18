package X;

import android.view.WindowInsets;

/* renamed from: X.0kr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12480kr extends AbstractC17720u9 {
    public C02I A00;

    @Override // X.C011304b
    public final C02I A01() {
        C02I c02i = this.A00;
        if (c02i == null) {
            WindowInsets windowInsets = this.A04;
            C02I A00 = C02I.A00(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            this.A00 = A00;
            return A00;
        }
        return c02i;
    }

    @Override // X.C011304b
    public final C011504d A09() {
        WindowInsets consumeStableInsets = this.A04.consumeStableInsets();
        C011504d c011504d = C011504d.A01;
        consumeStableInsets.getClass();
        return new C011504d(consumeStableInsets);
    }

    @Override // X.C011304b
    public final C011504d A0A() {
        WindowInsets consumeSystemWindowInsets = this.A04.consumeSystemWindowInsets();
        C011504d c011504d = C011504d.A01;
        consumeSystemWindowInsets.getClass();
        return new C011504d(consumeSystemWindowInsets);
    }

    @Override // X.C011304b
    public void A0D(C02I c02i) {
        this.A00 = c02i;
    }

    @Override // X.C011304b
    public final boolean A0G() {
        return this.A04.isConsumed();
    }
}
