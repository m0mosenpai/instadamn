package X;

/* loaded from: classes10.dex */
public final class Q0Y {
    public final long A00;
    public final long A01;

    public Q0Y(long j, long j2) {
        if (j2 == 0) {
            this.A01 = 0L;
            this.A00 = 1L;
        } else {
            this.A01 = j;
            this.A00 = j2;
        }
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(this.A01);
        A1C.append("/");
        A1C.append(this.A00);
        return A1C.toString();
    }
}
