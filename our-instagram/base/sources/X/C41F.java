package X;

/* renamed from: X.41F, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C41F extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Integer A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C41F) {
                C41F c41f = (C41F) obj;
                if (this.A03 != c41f.A03 || this.A01 != c41f.A01 || this.A06 != c41f.A06 || this.A05 != c41f.A05 || this.A00 != c41f.A00 || this.A02 != c41f.A02 || !C14360o3.A0K(this.A04, c41f.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = ((this.A03 * 31) + this.A01) * 31;
        int i2 = 1237;
        if (this.A06) {
            i2 = 1231;
        }
        int i3 = (i + i2) * 31;
        int i4 = 1237;
        if (this.A05) {
            i4 = 1231;
        }
        int i5 = (((((i3 + i4) * 31) + this.A00) * 31) + this.A02) * 31;
        Integer num = this.A04;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return i5 + hashCode;
    }

    public C41F(Integer num, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        this.A03 = i;
        this.A01 = i2;
        this.A06 = z;
        this.A05 = z2;
        this.A00 = i3;
        this.A02 = i4;
        this.A04 = num;
    }
}
