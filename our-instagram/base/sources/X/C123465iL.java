package X;

/* renamed from: X.5iL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C123465iL extends C0T6 {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C123465iL) {
                C123465iL c123465iL = (C123465iL) obj;
                if (this.A0C != c123465iL.A0C || this.A03 != c123465iL.A03 || this.A00 != c123465iL.A00 || this.A04 != c123465iL.A04 || this.A02 != c123465iL.A02 || this.A0A != c123465iL.A0A || this.A01 != c123465iL.A01 || this.A08 != c123465iL.A08 || this.A0B != c123465iL.A0B) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IgFrameMetrics(unknownDelayDuration=");
        sb.append(this.A0C);
        sb.append(", inputHandingDuration=");
        sb.append(this.A03);
        sb.append(", animationDuration=");
        sb.append(this.A00);
        sb.append(", layoutMeasureDuration=");
        sb.append(this.A04);
        sb.append(", drawDuration=");
        sb.append(this.A02);
        sb.append(", syncDuration=");
        sb.append(this.A0A);
        sb.append(", commandIssueDuration=");
        sb.append(this.A01);
        sb.append(", swapBuffersDuration=");
        sb.append(this.A08);
        sb.append(", totalDuration=");
        sb.append(this.A0B);
        sb.append(')');
        return sb.toString();
    }

    public C123465iL(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.A0C = j;
        this.A03 = j2;
        this.A00 = j3;
        this.A04 = j4;
        this.A02 = j5;
        this.A0A = j6;
        this.A01 = j7;
        this.A08 = j8;
        this.A0B = j9;
        long j10 = (((((((j9 - j8) - j7) - j6) - j5) - j4) - j3) - j2) - j;
        this.A09 = j10;
        this.A06 = j + j2 + j3 + j4 + j5;
        this.A05 = j10 + j6;
        this.A07 = j6 + j7 + j8;
    }

    public final int hashCode() {
        long j = this.A0C;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.A03;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.A00;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.A04;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.A02;
        int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.A0A;
        int i6 = (i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.A01;
        int i7 = (i6 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.A08;
        int i8 = (i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.A0B;
        return i8 + ((int) (j9 ^ (j9 >>> 32)));
    }
}
