package X;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.04d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C011504d {
    public static final C011504d A01;
    public final C011304b A00;

    static {
        C011504d c011504d;
        if (Build.VERSION.SDK_INT >= 30) {
            c011504d = C007002k.A00;
        } else {
            c011504d = C011304b.A01;
        }
        A01 = c011504d;
    }

    public static C02I A00(C02I c02i, int i, int i2, int i3, int i4) {
        int max = Math.max(0, c02i.A01 - i);
        int max2 = Math.max(0, c02i.A03 - i2);
        int max3 = Math.max(0, c02i.A02 - i3);
        int max4 = Math.max(0, c02i.A00 - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return c02i;
        }
        return C02I.A00(max, max2, max3, max4);
    }

    @Deprecated
    public final int A02() {
        return this.A00.A03().A00;
    }

    @Deprecated
    public final int A03() {
        return this.A00.A03().A03;
    }

    public final WindowInsets A04() {
        C011304b c011304b = this.A00;
        if (c011304b instanceof AbstractC17720u9) {
            return ((AbstractC17720u9) c011304b).A04;
        }
        return null;
    }

    @Deprecated
    public final C011504d A05(int i, int i2, int i3, int i4) {
        C04Z c04z = new C04Z(this);
        C02I A00 = C02I.A00(i, i2, i3, i4);
        AbstractC011204a abstractC011204a = c04z.A00;
        abstractC011204a.A06(A00);
        return abstractC011204a.A00();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C011504d)) {
            return false;
        }
        return C02O.A00(this.A00, ((C011504d) obj).A00);
    }

    public final int hashCode() {
        C011304b c011304b = this.A00;
        if (c011304b == null) {
            return 0;
        }
        return c011304b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0u9, X.0kr] */
    public C011504d(WindowInsets windowInsets) {
        C04j c04j;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            c04j = new C007002k(this, windowInsets);
        } else if (i >= 29) {
            c04j = new C04j(this, windowInsets);
        } else {
            ?? abstractC17720u9 = new AbstractC17720u9(this, windowInsets);
            abstractC17720u9.A00 = null;
            c04j = abstractC17720u9;
        }
        this.A00 = c04j;
    }

    public static C011504d A01(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C011504d c011504d = new C011504d(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            C011504d A00 = AbstractC009003e.A00(view);
            C011304b c011304b = c011504d.A00;
            c011304b.A0E(A00);
            c011304b.A0C(view.getRootView());
        }
        return c011504d;
    }

    public C011504d() {
        this.A00 = new C011304b(this);
    }
}
