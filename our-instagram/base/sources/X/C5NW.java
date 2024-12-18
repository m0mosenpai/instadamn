package X;

/* renamed from: X.5NW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5NW {
    public String A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final long A00() {
        long j;
        long j2;
        int i = this.A06;
        int i2 = this.A02;
        int i3 = this.A05;
        int i4 = this.A07;
        int i5 = this.A08;
        boolean z = this.A0A;
        boolean z2 = this.A0B;
        int i6 = (i2 << 16) + i3;
        long j3 = i5 << 54;
        if (z) {
            j = 1152921504606846976L;
        } else {
            j = 0;
        }
        long j4 = i << 48;
        if (z2) {
            j2 = 1;
        } else {
            j2 = 0;
        }
        return j3 | (0 << 62) | (j2 << 61) | j | j4 | ((i6 & 4294967295L) << 16) | i4;
    }

    public C5NW(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3) {
        this.A00 = str;
        this.A01 = str2;
        this.A04 = i;
        this.A02 = i2;
        this.A05 = i3;
        this.A07 = i4;
        this.A06 = i5;
        this.A08 = i6;
        this.A0A = z;
        this.A0B = z2;
        this.A03 = i7;
        this.A09 = z3;
    }
}
