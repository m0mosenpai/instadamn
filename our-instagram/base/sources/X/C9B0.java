package X;

/* renamed from: X.9B0, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9B0 extends C0T6 {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public C9B0(int i, long j, long j2, long j3, long j4) {
        this.A00 = i;
        this.A04 = j;
        if (i != 0) {
            this.A02 = j2;
            this.A03 = j3;
        } else {
            this.A03 = j2;
            this.A02 = j3;
        }
        this.A01 = j4;
    }

    public final boolean equals(Object obj) {
        C9B0 c9b0;
        long j;
        long j2;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C9B0) {
                    c9b0 = (C9B0) obj;
                    if (c9b0.A00 == 1 && this.A04 == c9b0.A04 && this.A02 == c9b0.A02) {
                        j = this.A03;
                        j2 = c9b0.A03;
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
            if (!(obj instanceof C9B0)) {
                return false;
            }
            c9b0 = (C9B0) obj;
            if (c9b0.A00 != 0 || this.A04 != c9b0.A04 || this.A03 != c9b0.A03) {
                return false;
            }
            j = this.A02;
            j2 = c9b0.A02;
        } else {
            return true;
        }
        if (j != j2 || this.A01 != c9b0.A01) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        char c;
        int i;
        long j;
        if (this.A00 != 0) {
            long j2 = this.A04;
            c = ' ';
            int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
            long j3 = this.A02;
            i = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            j = this.A03;
        } else {
            long j4 = this.A04;
            c = ' ';
            int i3 = ((int) (j4 ^ (j4 >>> 32))) * 31;
            long j5 = this.A03;
            i = (i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
            j = this.A02;
        }
        int i4 = (i + ((int) (j ^ (j >>> c)))) * 31;
        long j6 = this.A01;
        return i4 + ((int) (j6 ^ (j6 >>> c)));
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        if (this.A00 != 0) {
            sb = new StringBuilder();
            sb.append("Interval(startTime=");
            sb.append(this.A04);
            sb.append(AbstractC58317Pt9.A00(152));
            sb.append(this.A02);
            sb.append(", startMtime=");
            sb.append(this.A03);
            str = ", endMtime=";
        } else {
            sb = new StringBuilder();
            sb.append("CurrentInterval(startTime=");
            sb.append(this.A04);
            sb.append(", startMtime=");
            sb.append(this.A03);
            sb.append(", lastActiveTime=");
            sb.append(this.A02);
            str = ", lastActiveMTime=";
        }
        sb.append(str);
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }
}
