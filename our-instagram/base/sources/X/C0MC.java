package X;

/* renamed from: X.0MC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0MC {
    public final long A00;
    public final long A01;
    public final long A02;
    public final boolean A03;
    public final boolean A04;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[Rel And Abs Timestamp ");
        if (this.A04) {
            str = "was not set";
        } else {
            if (!this.A03) {
                sb.append("was not valid with error code ");
                sb.append(this.A01);
                sb.append("]");
                return sb.toString();
            }
            sb.append("rel time ");
            sb.append(this.A02);
            str = " ms";
            sb.append(" ms");
            sb.append(" and ");
            sb.append("abs time ");
            sb.append(this.A00);
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    public C0MC(long j) {
        this.A02 = 0L;
        this.A00 = 0L;
        this.A01 = j;
        this.A03 = false;
        this.A04 = j == -758;
    }

    public C0MC(long j, long j2) {
        this.A02 = j;
        this.A00 = j2;
        this.A01 = 0L;
        this.A03 = true;
        this.A04 = false;
    }
}
