package X;

import android.graphics.Insets;

/* renamed from: X.02I, reason: invalid class name */
/* loaded from: classes.dex */
public final class C02I {
    public static final C02I A04 = new C02I(0, 0, 0, 0);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C02I c02i = (C02I) obj;
                if (this.A00 != c02i.A00 || this.A01 != c02i.A01 || this.A02 != c02i.A02 || this.A03 != c02i.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public static C02I A00(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return A04;
        }
        return new C02I(i, i2, i3, i4);
    }

    public static C02I A01(Insets insets) {
        return A00(insets.left, insets.top, insets.right, insets.bottom);
    }

    public static C02I A02(C02I c02i, C02I c02i2) {
        return A00(Math.max(c02i.A01, c02i2.A01), Math.max(c02i.A03, c02i2.A03), Math.max(c02i.A02, c02i2.A02), Math.max(c02i.A00, c02i2.A00));
    }

    public final Insets A03() {
        return C02H.A00(this.A01, this.A03, this.A02, this.A00);
    }

    public final int hashCode() {
        return (((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31) + this.A00;
    }

    public final String toString() {
        return AnonymousClass001.A0w("Insets{left=", ", top=", ", right=", ", bottom=", '}', this.A01, this.A03, this.A02, this.A00);
    }

    public C02I(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }
}
