package X;

/* renamed from: X.0ty, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17630ty {
    public float A00;
    public long A01;
    public long A02;

    public final long A00(long j) {
        long j2 = this.A02;
        if (j2 != -1) {
            return (this.A01 + j) - j2;
        }
        return this.A01;
    }

    public final boolean A01(float f, long j) {
        float f2 = this.A00;
        if (f >= f2 && this.A02 == -1) {
            this.A02 = j;
            return true;
        }
        if (f < f2) {
            long j2 = this.A02;
            if (j2 != -1) {
                this.A01 += j - j2;
                this.A02 = -1L;
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A02(long j) {
        long j2 = this.A02;
        if (j2 != -1) {
            this.A01 += j - j2;
            this.A02 = -1L;
            return true;
        }
        return false;
    }

    public C17630ty(C17630ty c17630ty) {
        this.A02 = -1L;
        this.A02 = c17630ty.A02;
        this.A00 = c17630ty.A00;
        this.A01 = c17630ty.A01;
    }
}
