package X;

import android.view.WindowInsetsAnimation;

/* renamed from: X.04M, reason: invalid class name */
/* loaded from: classes.dex */
public final class C04M {
    public final C02I A00;
    public final C02I A01;

    public static C04M A00(WindowInsetsAnimation.Bounds bounds) {
        return new C04M(bounds);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bounds{lower=");
        sb.append(this.A00);
        sb.append(" upper=");
        sb.append(this.A01);
        sb.append("}");
        return sb.toString();
    }

    public C04M(WindowInsetsAnimation.Bounds bounds) {
        this.A00 = C17820uK.A02(bounds);
        this.A01 = C17820uK.A01(bounds);
    }

    public final WindowInsetsAnimation.Bounds A01() {
        return C17820uK.A00(this);
    }

    public C04M(C02I c02i, C02I c02i2) {
        this.A00 = c02i;
        this.A01 = c02i2;
    }
}
