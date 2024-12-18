package X;

/* renamed from: X.5HY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5HY extends C0T6 {
    public final int A00;
    public final C5Hc A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public static final C5HY A00(C5Hc c5Hc, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(c5Hc, 5);
        return new C5HY(c5Hc, i, z, z2, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5HY) {
                C5HY c5hy = (C5HY) obj;
                if (this.A04 != c5hy.A04 || this.A05 != c5hy.A05 || this.A03 != c5hy.A03 || this.A02 != c5hy.A02 || this.A00 != c5hy.A00 || !C14360o3.A0K(this.A01, c5hy.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A05) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A03) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A02) {
            i7 = 1231;
        }
        return ((((i6 + i7) * 31) + this.A00) * 31) + this.A01.hashCode();
    }

    public C5HY(C5Hc c5Hc, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A04 = z;
        this.A05 = z2;
        this.A03 = z3;
        this.A02 = z4;
        this.A00 = i;
        this.A01 = c5Hc;
    }

    public C5HY() {
        this(C5HZ.A01, 0, false, false, false, false);
    }
}
