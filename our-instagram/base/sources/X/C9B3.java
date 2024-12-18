package X;

/* renamed from: X.9B3, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9B3 extends C0T6 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public final int A07;

    public C9B3(int i) {
        int i2;
        this.A07 = i;
        if (i != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        this.A07 = i2;
        if (i2 != 0) {
            this.A04 = 0;
            this.A01 = 0;
            this.A03 = 0;
            this.A02 = 0;
            this.A06 = 0;
            this.A05 = 0;
        } else {
            this.A06 = 0;
            this.A03 = 0;
            this.A02 = 0;
            this.A05 = 0;
            this.A04 = 0;
            this.A01 = 0;
        }
        this.A00 = 0;
    }

    public final boolean equals(Object obj) {
        if (this.A07 != 0) {
            return super.equals(obj);
        }
        if (this != obj) {
            if (obj instanceof C9B3) {
                C9B3 c9b3 = (C9B3) obj;
                if (c9b3.A07 != 0 || this.A06 != c9b3.A06 || this.A03 != c9b3.A03 || this.A02 != c9b3.A02 || this.A05 != c9b3.A05 || this.A04 != c9b3.A04 || this.A01 != c9b3.A01 || this.A00 != c9b3.A00) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.A07 != 0) {
            return super.hashCode();
        }
        return (((((((((((this.A06 * 31) + this.A03) * 31) + this.A02) * 31) + this.A05) * 31) + this.A04) * 31) + this.A01) * 31) + this.A00;
    }
}
