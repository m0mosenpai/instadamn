package X;

/* renamed from: X.1S0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1S0 extends C0T6 {
    public final byte A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1S0) {
                C1S0 c1s0 = (C1S0) obj;
                if (this.A00 != c1s0.A00 || this.A01 != c1s0.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00 * 31;
        int i2 = 1237;
        if (this.A01) {
            i2 = 1231;
        }
        return i + i2;
    }

    public C1S0(byte b, boolean z) {
        this.A00 = b;
        this.A01 = z;
    }

    public C1S0() {
        this((byte) 3, true);
    }
}
