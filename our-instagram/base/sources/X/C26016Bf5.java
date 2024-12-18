package X;

/* renamed from: X.Bf5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26016Bf5 extends C0T6 {
    public final android.net.Uri A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26016Bf5) {
                C26016Bf5 c26016Bf5 = (C26016Bf5) obj;
                if (!C14360o3.A0K(this.A03, c26016Bf5.A03) || !C14360o3.A0K(this.A0A, c26016Bf5.A0A) || !C14360o3.A0K(this.A05, c26016Bf5.A05) || !C14360o3.A0K(this.A04, c26016Bf5.A04) || !C14360o3.A0K(this.A07, c26016Bf5.A07) || !C14360o3.A0K(this.A06, c26016Bf5.A06) || !C14360o3.A0K(this.A09, c26016Bf5.A09) || !C14360o3.A0K(this.A08, c26016Bf5.A08) || !C14360o3.A0K(this.A01, c26016Bf5.A01) || !C14360o3.A0K(this.A02, c26016Bf5.A02) || !C14360o3.A0K(this.A00, c26016Bf5.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0K(this.A08, AbstractC166997dE.A0K(this.A09, AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0K(this.A07, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A0A, AbstractC166987dD.A0J(this.A03)))))))))));
    }

    public C26016Bf5(android.net.Uri uri, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.A03 = str;
        this.A0A = str2;
        this.A05 = str3;
        this.A04 = str4;
        this.A07 = str5;
        this.A06 = str6;
        this.A09 = str7;
        this.A08 = str8;
        this.A01 = str9;
        this.A02 = str10;
        this.A00 = uri;
    }
}
