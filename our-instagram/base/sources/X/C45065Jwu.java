package X;

/* renamed from: X.Jwu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45065Jwu extends C0T6 {
    public final long A00;
    public final long A01;
    public final C196948nP A02;
    public final C196948nP A03;
    public final C203248yh A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45065Jwu) {
                C45065Jwu c45065Jwu = (C45065Jwu) obj;
                if (!C14360o3.A0K(this.A07, c45065Jwu.A07) || !C14360o3.A0K(this.A08, c45065Jwu.A08) || !C14360o3.A0K(this.A05, c45065Jwu.A05) || this.A00 != c45065Jwu.A00 || this.A01 != c45065Jwu.A01 || !C14360o3.A0K(this.A02, c45065Jwu.A02) || !C14360o3.A0K(this.A03, c45065Jwu.A03) || !C14360o3.A0K(this.A04, c45065Jwu.A04) || !C14360o3.A0K(this.A06, c45065Jwu.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AbstractC167007dF.A07(this.A01, AbstractC167007dF.A07(this.A00, AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A08, AbstractC166987dD.A0J(this.A07))))) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC25227BEk.A07(this.A06);
    }

    public C45065Jwu(C196948nP c196948nP, C196948nP c196948nP2, C203248yh c203248yh, String str, String str2, String str3, String str4, long j, long j2) {
        AbstractC167027dH.A13(str, str2, str3);
        this.A07 = str;
        this.A08 = str2;
        this.A05 = str3;
        this.A00 = j;
        this.A01 = j2;
        this.A02 = c196948nP;
        this.A03 = c196948nP2;
        this.A04 = c203248yh;
        this.A06 = str4;
    }
}
