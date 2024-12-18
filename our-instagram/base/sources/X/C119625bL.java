package X;

/* renamed from: X.5bL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C119625bL extends C0T6 {
    public final long A02;
    public final long A03;
    public final float A01 = 6.0f;
    public final float A00 = 5.0f;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C119625bL) {
                C119625bL c119625bL = (C119625bL) obj;
                if (C119145aW.A01(this.A01, c119625bL.A01) && C119145aW.A01(this.A00, c119625bL.A00)) {
                    long j = this.A02;
                    long j2 = c119625bL.A02;
                    long j3 = C1132359l.A01;
                    if (j != j2 || this.A03 != c119625bL.A03) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public C119625bL(long j, long j2) {
        this.A02 = j;
        this.A03 = j2;
    }

    public final int hashCode() {
        int floatToIntBits = ((Float.floatToIntBits(this.A01) * 31) + Float.floatToIntBits(this.A00)) * 31;
        long j = this.A02;
        long j2 = C1132359l.A01;
        int i = (floatToIntBits + ((int) (j ^ (j >>> 32)))) * 31;
        long j3 = this.A03;
        return i + ((int) (j3 ^ (j3 >>> 32)));
    }
}
