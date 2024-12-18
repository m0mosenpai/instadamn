package X;

/* renamed from: X.8x2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202228x2 {
    public final long A00;
    public final long A01;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        sb.append("/");
        sb.append(this.A00);
        return sb.toString();
    }

    public C202228x2(long j, long j2) {
        if (j2 == 0) {
            this.A00 = 1L;
        } else {
            this.A01 = j;
            this.A00 = j2;
        }
    }
}
