package X;

/* renamed from: X.3dA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C77243dA extends C0T6 {
    public final long A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C77243dA) {
                C77243dA c77243dA = (C77243dA) obj;
                if (this.A02 != c77243dA.A02 || this.A01 != c77243dA.A01 || this.A00 != c77243dA.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A01) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        long j = this.A00;
        return i4 + ((int) (j ^ (j >>> 32)));
    }

    public C77243dA(long j, boolean z, boolean z2) {
        this.A02 = z;
        this.A01 = z2;
        this.A00 = j;
    }
}
