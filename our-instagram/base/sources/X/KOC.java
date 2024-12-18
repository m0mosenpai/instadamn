package X;

/* loaded from: classes8.dex */
public final class KOC extends KOD {
    public final int A00;
    public final long A01;
    public final String A02;

    public KOC(C1OW c1ow, String str, int i, long j, long j2) {
        super(c1ow, null, C05F.A0Y, Long.valueOf(j), null, null, null);
        this.A02 = str;
        this.A01 = j2;
        this.A00 = i;
    }

    @Override // X.KOD, X.ABN
    public final String A00() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(super.A00());
        A1C.append(" messageId=");
        A1C.append(this.A02);
        A1C.append(" errorCode=");
        A1C.append(this.A01);
        A1C.append(" messageSendStatus=");
        A1C.append(this.A00);
        return AbstractC166987dD.A19(A1C);
    }
}
