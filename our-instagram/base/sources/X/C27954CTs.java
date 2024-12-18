package X;

/* renamed from: X.CTs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27954CTs {
    public final long A00;
    public final String A01;
    public final String A02;

    public C27954CTs(String str, String str2, long j) {
        this.A00 = j;
        this.A02 = str;
        this.A01 = str2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("timestamp=");
        A1C.append(this.A00);
        A1C.append(AbstractC58317Pt9.A00(430));
        A1C.append("UNKNOWN");
        A1C.append(", reliabilityLabel=");
        A1C.append(this.A02);
        A1C.append(", details=");
        String A0x = AbstractC166997dE.A0x(this.A01, A1C);
        C14360o3.A07(A0x);
        return A0x;
    }
}
