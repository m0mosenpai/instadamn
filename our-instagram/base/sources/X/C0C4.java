package X;

/* renamed from: X.0C4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0C4 {
    public long A00 = 0;
    public long A02 = 0;
    public long A01 = 0;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0C4 c0c4 = (C0C4) obj;
            if (this.A00 != c0c4.A00 || this.A02 != c0c4.A02 || this.A01 != c0c4.A01) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.A02;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.A01;
        return i2 + ((int) (j3 ^ (j3 >>> 32)));
    }
}
