package X;

/* renamed from: X.4ay, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98194ay {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SegmentInfo -> size: ");
        sb.append(this.A03);
        sb.append(AbstractC111324zv.A00(3373));
        sb.append(this.A00);
        sb.append(", bitrate: ");
        sb.append(this.A02);
        return sb.toString();
    }

    public C98194ay(long j, long j2, long j3, long j4) {
        this.A01 = j2;
        this.A00 = j3;
        if (j > 0) {
            this.A03 = j;
            this.A02 = (j * 8000000) / j3;
        } else {
            if (j4 > 0) {
                this.A03 = (j3 * j4) / 8000000;
            } else {
                this.A03 = j;
            }
            this.A02 = j4;
        }
    }
}
