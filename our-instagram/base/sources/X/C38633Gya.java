package X;

/* renamed from: X.Gya, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38633Gya extends C0T6 {
    public final InterfaceC39571se A00;
    public final C38321qM A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final Boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38633Gya) {
                C38633Gya c38633Gya = (C38633Gya) obj;
                if (!C14360o3.A0K(this.A07, c38633Gya.A07) || !C14360o3.A0K(this.A02, c38633Gya.A02) || !C14360o3.A0K(this.A04, c38633Gya.A04) || !C14360o3.A0K(this.A00, c38633Gya.A00) || !C14360o3.A0K(this.A01, c38633Gya.A01) || !C14360o3.A0K(this.A05, c38633Gya.A05) || !C14360o3.A0K(this.A06, c38633Gya.A06) || !C14360o3.A0K(this.A03, c38633Gya.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((AbstractC167017dG.A0M(this.A07) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC166997dE.A0I(this.A03);
    }

    public C38633Gya(InterfaceC39571se interfaceC39571se, C38321qM c38321qM, Boolean bool, Integer num, Integer num2, String str, String str2, String str3) {
        this.A07 = bool;
        this.A02 = num;
        this.A04 = str;
        this.A00 = interfaceC39571se;
        this.A01 = c38321qM;
        this.A05 = str2;
        this.A06 = str3;
        this.A03 = num2;
    }
}
