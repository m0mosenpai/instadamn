package X;

/* renamed from: X.9ZS, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9ZS extends C0T6 {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;

    public C9ZS(long j, long j2, long j3, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A02 = j;
            this.A01 = j2;
        } else {
            this.A01 = j;
            this.A02 = j2;
        }
        this.A03 = j3;
    }

    public final boolean equals(Object obj) {
        C9ZS c9zs;
        long j;
        long j2;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C9ZS) {
                    c9zs = (C9ZS) obj;
                    if (c9zs.A00 == 1 && this.A02 == c9zs.A02) {
                        j = this.A01;
                        j2 = c9zs.A01;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else if (this != obj) {
            if (!(obj instanceof C9ZS)) {
                return false;
            }
            c9zs = (C9ZS) obj;
            if (c9zs.A00 != 0 || this.A01 != c9zs.A01) {
                return false;
            }
            j = this.A02;
            j2 = c9zs.A02;
        } else {
            return true;
        }
        if (j != j2 || this.A03 != c9zs.A03) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        char c;
        int i;
        long j;
        if (this.A00 != 0) {
            long j2 = this.A02;
            c = ' ';
            i = ((int) (j2 ^ (j2 >>> 32))) * 31;
            j = this.A01;
        } else {
            long j3 = this.A01;
            c = ' ';
            i = ((int) (j3 ^ (j3 >>> 32))) * 31;
            j = this.A02;
        }
        int A07 = AbstractC167007dF.A07(j, i);
        long j4 = this.A03;
        return A07 + ((int) (j4 ^ (j4 >>> c)));
    }

    public final String toString() {
        if (this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SchedStats(timeOnCpu=");
        A1C.append(this.A01);
        A1C.append(", timeWaiting=");
        A1C.append(this.A02);
        A1C.append(", timeslicesCount=");
        A1C.append(this.A03);
        return AbstractC167017dG.A0p(A1C);
    }
}
