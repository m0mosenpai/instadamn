package X;

/* renamed from: X.80d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1807580d extends C0T6 {
    public final long A00;
    public final C191258dU A01;
    public final Integer A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C1807580d(C191258dU c191258dU, Integer num, String str, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C14360o3.A0B(c191258dU, 1);
        this.A01 = c191258dU;
        this.A00 = j;
        this.A03 = str;
        this.A02 = num;
        this.A04 = z;
        this.A08 = z2;
        this.A06 = z3;
        this.A05 = z4;
        this.A07 = z5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1807580d) {
                C1807580d c1807580d = (C1807580d) obj;
                if (!C14360o3.A0K(this.A01, c1807580d.A01) || this.A00 != c1807580d.A00 || !C14360o3.A0K(this.A03, c1807580d.A03) || !C14360o3.A0K(this.A02, c1807580d.A02) || this.A04 != c1807580d.A04 || this.A08 != c1807580d.A08 || this.A06 != c1807580d.A06 || this.A05 != c1807580d.A05 || this.A07 != c1807580d.A07) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.A01.hashCode() * 31;
        long j = this.A00;
        int i = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.A03;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        Integer num = this.A02;
        if (num != null) {
            i2 = num.hashCode();
        }
        int i4 = (i3 + i2) * 31;
        int i5 = 1237;
        if (this.A04) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A08) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A06) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A05) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        int i13 = 1237;
        if (this.A07) {
            i13 = 1231;
        }
        return i12 + i13;
    }
}
