package X;

/* loaded from: classes5.dex */
public final class BG3 {
    public long A00;
    public final long A01;
    public final long A02;

    public BG3(long j, long j2, long j3) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = 0L;
        this.A00 = j3;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("HistoricalChange(uptimeMillis=");
        A1C.append(this.A02);
        A1C.append(", position=");
        return AbstractC167017dG.A0o(C119365at.A08(this.A01), A1C);
    }
}
