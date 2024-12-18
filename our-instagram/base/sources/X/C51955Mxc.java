package X;

/* renamed from: X.Mxc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51955Mxc extends C0T6 implements InterfaceC57890Plu {
    public final C22P A00;
    public final C5QE A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final String A06;

    public C51955Mxc(C22P c22p, C5QE c5qe, String str, String str2, String str3, String str4, boolean z) {
        C14360o3.A0B(str4, 5);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = c5qe;
        this.A06 = str3;
        this.A04 = str4;
        this.A00 = c22p;
        this.A05 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51955Mxc) {
                C51955Mxc c51955Mxc = (C51955Mxc) obj;
                if (!C14360o3.A0K(this.A02, c51955Mxc.A02) || !C14360o3.A0K(this.A03, c51955Mxc.A03) || !C14360o3.A0K(this.A01, c51955Mxc.A01) || !C14360o3.A0K(this.A06, c51955Mxc.A06) || !C14360o3.A0K(this.A04, c51955Mxc.A04) || this.A00 != c51955Mxc.A00 || this.A05 != c51955Mxc.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A05, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0K(this.A04, (((((AbstractC166987dD.A0J(this.A02) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC25227BEk.A07(this.A06)) * 31)));
    }
}
