package X;

/* renamed from: X.59p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1132759p {
    public final float A00;
    public final float A01;

    public final float[] A00() {
        float f = this.A00;
        float f2 = this.A01;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1132759p) {
                C1132759p c1132759p = (C1132759p) obj;
                if (Float.compare(this.A00, c1132759p.A00) != 0 || Float.compare(this.A01, c1132759p.A01) != 0) {
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
        return AnonymousClass001.A0U("WhitePoint(x=", ", y=", ')', this.A00, this.A01);
    }

    public C1132759p(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }
}
