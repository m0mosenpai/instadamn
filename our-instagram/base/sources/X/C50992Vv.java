package X;

/* renamed from: X.2Vv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50992Vv extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C50992Vv) {
                C50992Vv c50992Vv = (C50992Vv) obj;
                if (this.A05 != c50992Vv.A05 || this.A01 != c50992Vv.A01 || this.A02 != c50992Vv.A02 || this.A04 != c50992Vv.A04 || this.A03 != c50992Vv.A03 || this.A00 != c50992Vv.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A05) {
            i = 1231;
        }
        return (((((((((i * 31) + this.A01) * 31) + this.A02) * 31) + this.A04) * 31) + this.A03) * 31) + this.A00;
    }

    public C50992Vv(int i, int i2, int i3, boolean z, int i4, int i5) {
        this.A05 = z;
        this.A01 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A03 = i4;
        this.A00 = i5;
    }

    public C50992Vv() {
        this(0, 0, 0, false, 0, 0);
    }
}
