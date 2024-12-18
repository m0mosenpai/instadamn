package X;

/* renamed from: X.ABq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22991ABq {
    public int A00 = -1;
    public long A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("{userId='");
        String str2 = this.A07;
        if (str2 != null) {
            A1C.append(str2);
            A1C.append("', surfaceId='");
            String str3 = this.A06;
            if (str3 != null) {
                A1C.append(str3);
                A1C.append("', isUserPresentInClipsTogether=");
                A1C.append(this.A08);
                A1C.append(", publishTimestamp=");
                A1C.append(this.A04);
                return AbstractC167027dH.A0R(A1C);
            }
            str = "surfaceId";
        } else {
            str = "userId";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
