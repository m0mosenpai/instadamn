package X;

/* renamed from: X.U0i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66125U0i extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final boolean A07;
    public final int A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66125U0i) {
                C66125U0i c66125U0i = (C66125U0i) obj;
                if (this.A00 != c66125U0i.A00 || this.A01 != c66125U0i.A01 || this.A02 != c66125U0i.A02 || this.A03 != c66125U0i.A03 || this.A04 != c66125U0i.A04 || this.A05 != c66125U0i.A05 || this.A08 != c66125U0i.A08 || this.A06 != c66125U0i.A06 || this.A07 != c66125U0i.A07) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((((((((((((((this.A00 * 31) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31) + this.A04) * 31) + this.A05) * 31) + this.A08) * 31) + this.A06) * 31;
        int i2 = 1237;
        if (this.A07) {
            i2 = 1231;
        }
        return i + i2;
    }

    public C66125U0i(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A04 = i5;
        this.A05 = i6;
        this.A08 = i7;
        this.A06 = i8;
        this.A07 = z;
    }
}
