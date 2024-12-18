package X;

import android.view.WindowInsets;

/* renamed from: X.0uB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C17740uB extends AbstractC011204a {
    public final WindowInsets.Builder A00;

    @Override // X.AbstractC011204a
    public final void A02(C02I c02i) {
        this.A00.setMandatorySystemGestureInsets(c02i.A03());
    }

    @Override // X.AbstractC011204a
    public final void A03(C02I c02i) {
        this.A00.setSystemGestureInsets(c02i.A03());
    }

    @Override // X.AbstractC011204a
    public final void A04(C02I c02i) {
        this.A00.setTappableElementInsets(c02i.A03());
    }

    @Override // X.AbstractC011204a
    public final void A05(C02I c02i) {
        this.A00.setStableInsets(c02i.A03());
    }

    @Override // X.AbstractC011204a
    public final void A06(C02I c02i) {
        this.A00.setSystemWindowInsets(c02i.A03());
    }

    public C17740uB(C011504d c011504d) {
        super(c011504d);
        WindowInsets.Builder builder;
        WindowInsets A04 = c011504d.A04();
        if (A04 != null) {
            builder = new WindowInsets.Builder(A04);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.A00 = builder;
    }

    @Override // X.AbstractC011204a
    public final C011504d A00() {
        A01();
        WindowInsets build = this.A00.build();
        C011504d c011504d = C011504d.A01;
        build.getClass();
        C011504d c011504d2 = new C011504d(build);
        c011504d2.A00.A0F(super.A00);
        return c011504d2;
    }

    public C17740uB() {
        this.A00 = new WindowInsets.Builder();
    }
}
