package X;

import java.util.Locale;

/* renamed from: X.4TU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4TU {
    public static final C4TU A03 = new C4TU(1.0f, 1.0f);
    public final float A00;
    public final float A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C4TU c4tu = (C4TU) obj;
            if (this.A01 != c4tu.A01 || this.A00 != c4tu.A00) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.A01)) * 31) + Float.floatToRawIntBits(this.A00);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.A01), Float.valueOf(this.A00)};
        return String.format(Locale.US, AbstractC111324zv.A00(1716), objArr);
    }

    public C4TU(float f, float f2) {
        C4B8.A03(f > 0.0f);
        C4B8.A03(f2 > 0.0f);
        this.A01 = f;
        this.A00 = f2;
        this.A02 = Math.round(f * 1000.0f);
    }
}
