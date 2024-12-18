package X;

/* renamed from: X.4RV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4RV {
    public static final C4RV A0D = new C4RV(null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false);
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4RV)) {
            return false;
        }
        C4RV c4rv = (C4RV) obj;
        return c4rv.A03 == this.A03 && c4rv.A00 == this.A00 && c4rv.A07 == this.A07 && c4rv.A06 == this.A06 && c4rv.A08 == this.A08 && c4rv.A02 == this.A02 && c4rv.A09 == this.A09 && c4rv.A01 == this.A01 && c4rv.A0B == this.A0B && c4rv.A04 == this.A04 && c4rv.A05 == this.A05 && c4rv.A0C == this.A0C;
    }

    public final int hashCode() {
        long j;
        long j2 = this.A03;
        int i = ((int) (j2 ^ (j2 >>> 32))) * 31;
        long j3 = this.A00;
        int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.A07;
        int i3 = (i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.A06;
        int i4 = (i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.A08;
        int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.A02;
        int i6 = (i5 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.A09;
        int i7 = (i6 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.A01;
        int i8 = (i7 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = 1;
        if (this.A0B) {
            j = 1;
        } else {
            j = 0;
        }
        int i9 = (i8 + ((int) (j ^ (j >>> 32)))) * 31;
        long j11 = this.A04;
        int i10 = (i9 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.A05;
        int i11 = (i10 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        if (!this.A0C) {
            j10 = 0;
        }
        return i11 + ((int) (j10 ^ (j10 >>> 32)));
    }

    public C4RV(String str, int i, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, boolean z, boolean z2) {
        this.A03 = j;
        this.A00 = i;
        this.A07 = j2;
        this.A06 = j3;
        this.A08 = j4;
        this.A02 = j5;
        this.A09 = j6;
        this.A01 = j7;
        this.A0B = z;
        this.A04 = j8;
        this.A05 = j9;
        this.A0C = z2;
        this.A0A = str;
    }
}
