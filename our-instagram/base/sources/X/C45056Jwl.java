package X;

/* renamed from: X.Jwl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45056Jwl extends C0T6 {
    public final int A00;
    public final C47712L4t A01;
    public final C47712L4t A02;
    public final A91 A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45056Jwl) {
                C45056Jwl c45056Jwl = (C45056Jwl) obj;
                if (!C14360o3.A0K(this.A05, c45056Jwl.A05) || !C14360o3.A0K(this.A07, c45056Jwl.A07) || !C14360o3.A0K(this.A06, c45056Jwl.A06) || this.A00 != c45056Jwl.A00 || !C14360o3.A0K(this.A01, c45056Jwl.A01) || !C14360o3.A0K(this.A02, c45056Jwl.A02) || !C14360o3.A0K(this.A03, c45056Jwl.A03) || this.A04 != c45056Jwl.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0J = AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A01, (AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0K(this.A07, AbstractC166987dD.A0J(this.A05))) + this.A00) * 31)));
        int intValue = this.A04.intValue();
        switch (intValue) {
            case 1:
                str = "LOADING";
                break;
            case 2:
                str = "SELECTED";
                break;
            default:
                str = "LOADED";
                break;
        }
        return A0J + AbstractC25226BEj.A02(str, intValue);
    }

    public C45056Jwl(C47712L4t c47712L4t, C47712L4t c47712L4t2, A91 a91, Integer num, String str, String str2, String str3, int i) {
        this.A05 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A00 = i;
        this.A01 = c47712L4t;
        this.A02 = c47712L4t2;
        this.A03 = a91;
        this.A04 = num;
    }
}
