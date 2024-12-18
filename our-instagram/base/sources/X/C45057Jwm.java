package X;

/* renamed from: X.Jwm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45057Jwm extends C0T6 {
    public final C7U A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45057Jwm) {
                C45057Jwm c45057Jwm = (C45057Jwm) obj;
                if (!C14360o3.A0K(this.A02, c45057Jwm.A02) || !C14360o3.A0K(this.A05, c45057Jwm.A05) || !C14360o3.A0K(this.A04, c45057Jwm.A04) || !C14360o3.A0K(this.A01, c45057Jwm.A01) || this.A00 != c45057Jwm.A00 || this.A06 != c45057Jwm.A06 || !C14360o3.A0K(this.A03, c45057Jwm.A03) || this.A07 != c45057Jwm.A07) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A07, (AbstractC167007dF.A0D(this.A06, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A05, AbstractC166987dD.A0J(this.A02)))))) + AbstractC167017dG.A0O(this.A03)) * 31);
    }

    public C45057Jwm(C7U c7u, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        AbstractC167017dG.A1P(str, str2);
        this.A02 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A01 = str4;
        this.A00 = c7u;
        this.A06 = z;
        this.A03 = str5;
        this.A07 = z2;
    }
}
