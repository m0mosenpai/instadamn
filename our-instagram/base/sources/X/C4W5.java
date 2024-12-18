package X;

/* renamed from: X.4W5, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4W5 {
    public final float A00;
    public final float A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public C4W5(float f, float f2, long j, long j2, long j3) {
        this.A04 = j3;
        this.A03 = j2;
        this.A02 = j;
        this.A01 = f2;
        this.A00 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4W5)) {
            return false;
        }
        C4W5 c4w5 = (C4W5) obj;
        return this.A04 == c4w5.A04 && this.A03 == c4w5.A03 && this.A02 == c4w5.A02 && this.A01 == c4w5.A01 && this.A00 == c4w5.A00;
    }

    public C4W5(C96644Vz c96644Vz) {
        long j = c96644Vz.A04;
        long j2 = c96644Vz.A03;
        long j3 = c96644Vz.A02;
        float f = c96644Vz.A01;
        float f2 = c96644Vz.A00;
        this.A04 = j;
        this.A03 = j2;
        this.A02 = j3;
        this.A01 = f;
        this.A00 = f2;
    }

    public final int hashCode() {
        int i;
        long j = this.A04;
        int i2 = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.A03;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.A02;
        int i4 = (i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        float f = this.A01;
        int i5 = 0;
        if (f != 0.0f) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        int i6 = (i4 + i) * 31;
        float f2 = this.A00;
        if (f2 != 0.0f) {
            i5 = Float.floatToIntBits(f2);
        }
        return i6 + i5;
    }
}
