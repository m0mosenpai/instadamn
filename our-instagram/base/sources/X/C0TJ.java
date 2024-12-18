package X;

/* renamed from: X.0TJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0TJ {
    public final long A00;
    public final long A01;
    public final C0TP A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0TJ c0tj = (C0TJ) obj;
            if (this.A01 != c0tj.A01 || this.A00 != c0tj.A00 || !this.A02.equals(c0tj.A02)) {
                return false;
            }
        }
        return true;
    }

    public C0TJ(C0TP c0tp, long j) {
        this(c0tp, -1L, j);
    }

    public static C0TJ A00(C0TJ c0tj, C0TJ c0tj2) {
        C0TP c0tp = c0tj.A02;
        C0TP c0tp2 = c0tj2.A02;
        if (c0tp.equals(c0tp2)) {
            Integer num = c0tp.A00;
            Integer num2 = C05F.A00;
            long j = c0tj.A00;
            long j2 = c0tj2.A00;
            if (num == num2) {
                if (j >= j2) {
                    return c0tj;
                }
            } else if (j <= j2) {
                return c0tj;
            }
            return c0tj2;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0u("Cannot compare datapoints from different metrics: ", c0tp.A01(), " vs. ", c0tp2.A01()));
    }

    public final int hashCode() {
        return (int) (this.A02.hashCode() + (this.A01 * 31) + this.A00);
    }

    public final String toString() {
        C0TP c0tp = this.A02;
        return AnonymousClass001.A0g(AnonymousClass001.A11("cur", ":", c0tp.A01(), ":", C0TO.A00(c0tp.A01)), " ", String.valueOf(this.A00));
    }

    public C0TJ(C0TP c0tp, long j, long j2) {
        this.A02 = c0tp;
        this.A01 = j;
        this.A00 = j2;
    }
}
