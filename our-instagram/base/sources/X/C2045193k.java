package X;

/* renamed from: X.93k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2045193k extends C0T6 {
    public final long A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04 = true;

    public C2045193k(long j, boolean z, boolean z2, boolean z3) {
        this.A01 = z;
        this.A03 = z2;
        this.A00 = j;
        this.A02 = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2045193k) {
                C2045193k c2045193k = (C2045193k) obj;
                if (this.A01 != c2045193k.A01 || this.A04 != c2045193k.A04 || this.A03 != c2045193k.A03 || this.A00 != c2045193k.A00 || this.A02 != c2045193k.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A04) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A03) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        long j = this.A00;
        int i7 = (i6 + ((int) (j ^ (j >>> 32)))) * 31;
        int i8 = 1237;
        if (this.A02) {
            i8 = 1231;
        }
        return i7 + i8;
    }
}
