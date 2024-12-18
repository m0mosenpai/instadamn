package X;

import android.view.WindowInsets;

/* renamed from: X.04j, reason: invalid class name */
/* loaded from: classes.dex */
public class C04j extends C0SQ {
    public C02I A00;
    public C02I A01;
    public C02I A02;

    @Override // X.AbstractC12480kr, X.C011304b
    public final void A0D(C02I c02i) {
    }

    @Override // X.C011304b
    public final C02I A00() {
        C02I c02i = this.A00;
        if (c02i == null) {
            C02I A01 = C02I.A01(this.A04.getMandatorySystemGestureInsets());
            this.A00 = A01;
            return A01;
        }
        return c02i;
    }

    @Override // X.C011304b
    public final C02I A02() {
        C02I c02i = this.A01;
        if (c02i == null) {
            C02I A01 = C02I.A01(this.A04.getSystemGestureInsets());
            this.A01 = A01;
            return A01;
        }
        return c02i;
    }

    @Override // X.C011304b
    public final C02I A04() {
        C02I c02i = this.A02;
        if (c02i == null) {
            C02I A01 = C02I.A01(this.A04.getTappableElementInsets());
            this.A02 = A01;
            return A01;
        }
        return c02i;
    }

    @Override // X.AbstractC17720u9, X.C011304b
    public final C011504d A0B(int i, int i2, int i3, int i4) {
        WindowInsets inset = this.A04.inset(i, i2, i3, i4);
        C011504d c011504d = C011504d.A01;
        inset.getClass();
        return new C011504d(inset);
    }

    public C04j(C011504d c011504d, WindowInsets windowInsets) {
        super(c011504d, windowInsets);
        ((AbstractC12480kr) this).A00 = null;
        this.A01 = null;
        this.A00 = null;
        this.A02 = null;
    }
}
