package X;

/* renamed from: X.SLn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62675SLn {
    public boolean A00;
    public final long A01;
    public final long A02;

    public C62675SLn(long j, long j2) {
        this.A02 = j;
        this.A01 = j2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("WifiScanOperationParams{timeoutMs=");
        A1C.append(this.A02);
        A1C.append(", ageLimitMs=");
        A1C.append(this.A01);
        A1C.append(", returnAllResults=");
        A1C.append(false);
        return AbstractC167027dH.A0R(A1C);
    }
}
