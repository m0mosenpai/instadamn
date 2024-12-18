package X;

/* renamed from: X.5gF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122195gF {
    public static final C122195gF A02 = new C122195gF(1.0f, 0.0f);
    public final float A00;
    public final float A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C122195gF) {
                C122195gF c122195gF = (C122195gF) obj;
                if (this.A00 != c122195gF.A00 || this.A01 != c122195gF.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
    }

    public final String toString() {
        return AnonymousClass001.A0U("TextGeometricTransform(scaleX=", ", skewX=", ')', this.A00, this.A01);
    }

    public C122195gF(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    public C122195gF() {
        this(1.0f, 0.0f);
    }
}
