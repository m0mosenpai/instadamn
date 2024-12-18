package X;

/* renamed from: X.GyV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38628GyV extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public C38628GyV(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.A00 = i7;
        switch (i7) {
            case 0:
                this.A02 = i;
                this.A05 = i2;
                this.A06 = i3;
                this.A01 = i4;
                this.A03 = i5;
                this.A04 = i6;
                return;
            case 1:
                this.A06 = i;
                this.A04 = i2;
                this.A02 = i3;
                this.A05 = i4;
                this.A03 = i5;
                this.A01 = i6;
                return;
            default:
                this.A06 = i;
                this.A02 = i2;
                this.A04 = i3;
                this.A03 = i4;
                this.A05 = i5;
                this.A01 = i6;
                return;
        }
    }

    public final boolean equals(Object obj) {
        if (1 - this.A00 != 0) {
            return super.equals(obj);
        }
        if (this != obj) {
            if (obj instanceof C38628GyV) {
                C38628GyV c38628GyV = (C38628GyV) obj;
                if (c38628GyV.A00 != 1 || this.A06 != c38628GyV.A06 || this.A04 != c38628GyV.A04 || this.A02 != c38628GyV.A02 || this.A05 != c38628GyV.A05 || this.A03 != c38628GyV.A03 || this.A01 != c38628GyV.A01) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (1 - this.A00 != 0) {
            return super.hashCode();
        }
        return (((((((((this.A06 * 31) + this.A04) * 31) + this.A02) * 31) + this.A05) * 31) + this.A03) * 31) + this.A01;
    }
}
