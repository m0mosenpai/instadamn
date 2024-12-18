package X;

/* renamed from: X.6MG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6MG {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6MG) {
                C6MG c6mg = (C6MG) obj;
                if (this.A01 != c6mg.A01 || this.A00 != c6mg.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public final String toString() {
        return AnonymousClass001.A0X("Interval(start=", ", end=", ')', this.A01, this.A00);
    }

    public C6MG(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        if (i >= 0) {
            if (i2 >= i) {
                return;
            } else {
                throw new IllegalArgumentException("end index greater than start");
            }
        }
        throw new IllegalArgumentException("negative start index");
    }
}
