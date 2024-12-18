package X;

/* renamed from: X.ABr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22992ABr {
    public long A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("{userId='");
        String str2 = this.A06;
        if (str2 != null) {
            A1C.append(str2);
            A1C.append("', threadFbid='");
            String str3 = this.A05;
            if (str3 != null) {
                A1C.append(str3);
                A1C.append("', presentInThread=");
                A1C.append(this.A08);
                A1C.append(", presentInClipsTogether=");
                A1C.append(this.A07);
                A1C.append(", mutationId=");
                A1C.append(this.A02);
                A1C.append(", realtimeUpdateId=");
                A1C.append(this.A04);
                A1C.append(", publishTimestamp=");
                A1C.append(this.A03);
                A1C.append(", igThreadId=");
                A1C.append(this.A01);
                return AbstractC167027dH.A0R(A1C);
            }
            str = "threadFbid";
        } else {
            str = "userId";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
