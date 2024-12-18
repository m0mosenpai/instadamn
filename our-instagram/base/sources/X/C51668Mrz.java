package X;

/* renamed from: X.Mrz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51668Mrz extends C0T6 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C51668Mrz(String str, int i, int i2, String str2, long j, String str3) {
        C14360o3.A0B(str, 1);
        this.A05 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = j;
        this.A03 = str2;
        this.A04 = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51668Mrz) {
                C51668Mrz c51668Mrz = (C51668Mrz) obj;
                if (!C14360o3.A0K(this.A05, c51668Mrz.A05) || this.A01 != c51668Mrz.A01 || this.A00 != c51668Mrz.A00 || this.A02 != c51668Mrz.A02 || !C14360o3.A0K(this.A03, c51668Mrz.A03) || !C14360o3.A0K(this.A04, c51668Mrz.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A03, AbstractC25236BEt.A01(this.A02, (((AbstractC166987dD.A0J(this.A05) + this.A01) * 31) + this.A00) * 31)) + AbstractC167017dG.A0O(this.A04);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("DcpSubscriptionOffer(period=");
        A1C.append(this.A05);
        A1C.append(", periodValue=");
        A1C.append(this.A01);
        A1C.append(", periodCount=");
        A1C.append(this.A00);
        A1C.append(", price=");
        A1C.append(this.A02);
        A1C.append(", formattedPrice=");
        A1C.append(this.A03);
        A1C.append(", offerId=");
        return AbstractC25236BEt.A0Y(this.A04, A1C);
    }
}
