package X;

/* renamed from: X.Mql, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51593Mql extends C0T6 {
    public final int A00;
    public final int A01;
    public final long A02;

    public C51593Mql(int i, long j, int i2) {
        this.A00 = i2;
        this.A01 = i;
        this.A02 = j;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    if (!(obj instanceof C51593Mql)) {
                        return false;
                    }
                    C51593Mql c51593Mql = (C51593Mql) obj;
                    if (c51593Mql.A00 != 1 || this.A01 != c51593Mql.A01 || this.A02 != c51593Mql.A02) {
                        return false;
                    }
                    return true;
                }
                return true;
            default:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
        }
        if (obj instanceof C51593Mql) {
            C51593Mql c51593Mql2 = (C51593Mql) obj;
            if (c51593Mql2.A00 != i || this.A02 != c51593Mql2.A02 || this.A01 != c51593Mql2.A01) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        if (1 - this.A00 != 0) {
            i = AbstractC25235BEs.A03(this.A02);
            i2 = this.A01;
        } else {
            i = this.A01 * 31;
            long j = this.A02;
            i2 = (int) (j ^ (j >>> 32));
        }
        return i + i2;
    }
}
