package X;

/* renamed from: X.BIj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25314BIj extends C0T6 {
    public final int A00;
    public final int A01;

    public C25314BIj(int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this != obj) {
                i = 1;
            } else {
                return true;
            }
        } else if (this != obj) {
            i = 0;
        } else {
            return true;
        }
        if (obj instanceof C25314BIj) {
            C25314BIj c25314BIj = (C25314BIj) obj;
            if (c25314BIj.A00 != i || this.A01 != c25314BIj.A01) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A01;
    }
}
