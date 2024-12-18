package X;

/* renamed from: X.KUz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45948KUz extends AbstractC46449Kh9 {
    public final int A00;
    public final EnumC40111tc A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45948KUz) {
                C45948KUz c45948KUz = (C45948KUz) obj;
                if (!C14360o3.A0K(this.A04, c45948KUz.A04) || this.A01 != c45948KUz.A01 || !C14360o3.A0K(this.A02, c45948KUz.A02) || !C14360o3.A0K(this.A06, c45948KUz.A06) || this.A07 != c45948KUz.A07 || !C14360o3.A0K(this.A03, c45948KUz.A03) || !C14360o3.A0K(this.A05, c45948KUz.A05) || this.A00 != c45948KUz.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A03, AbstractC167007dF.A0D(this.A07, (((AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0J(this.A04)) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A06)) * 31))) + this.A00;
    }

    public C45948KUz(EnumC40111tc enumC40111tc, String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        this.A04 = str;
        this.A01 = enumC40111tc;
        this.A02 = str2;
        this.A06 = str3;
        this.A07 = z;
        this.A03 = str4;
        this.A05 = str5;
        this.A00 = i;
    }
}
