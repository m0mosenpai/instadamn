package X;

/* renamed from: X.Gyj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38642Gyj extends C0T6 {
    public final long A00;
    public final C9C2 A01;
    public final C26087BgG A02;
    public final C128215qq A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final long A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38642Gyj) {
                C38642Gyj c38642Gyj = (C38642Gyj) obj;
                if (!C14360o3.A0K(this.A05, c38642Gyj.A05) || this.A00 != c38642Gyj.A00 || this.A07 != c38642Gyj.A07 || !C14360o3.A0K(this.A06, c38642Gyj.A06) || !C14360o3.A0K(this.A08, c38642Gyj.A08) || !C14360o3.A0K(this.A01, c38642Gyj.A01) || !C14360o3.A0K(this.A04, c38642Gyj.A04) || !C14360o3.A0K(this.A03, c38642Gyj.A03) || !C14360o3.A0K(this.A02, c38642Gyj.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((AbstractC167007dF.A07(this.A07, AbstractC167007dF.A07(this.A00, AbstractC166987dD.A0J(this.A05))) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31;
    }

    public C38642Gyj(C9C2 c9c2, C26087BgG c26087BgG, C128215qq c128215qq, String str, String str2, String str3, String str4, long j, long j2) {
        this.A05 = str;
        this.A00 = j;
        this.A07 = j2;
        this.A06 = str2;
        this.A08 = str3;
        this.A01 = c9c2;
        this.A04 = str4;
        this.A03 = c128215qq;
        this.A02 = c26087BgG;
    }
}
