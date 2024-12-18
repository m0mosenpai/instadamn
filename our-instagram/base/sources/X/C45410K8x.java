package X;

/* renamed from: X.K8x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45410K8x extends AbstractC46366Kfo {
    public final int A00;
    public final int A01;
    public final C51745MtU A02;
    public final C50627MWo A03;
    public final C50679MYx A04;
    public final C5QE A05;
    public final C5QE A06;
    public final C5QE A07;
    public final C5QE A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45410K8x) {
                C45410K8x c45410K8x = (C45410K8x) obj;
                if (!C14360o3.A0K(this.A0A, c45410K8x.A0A) || !C14360o3.A0K(this.A08, c45410K8x.A08) || !C14360o3.A0K(this.A06, c45410K8x.A06) || !C14360o3.A0K(this.A07, c45410K8x.A07) || !C14360o3.A0K(this.A05, c45410K8x.A05) || !C14360o3.A0K(this.A04, c45410K8x.A04) || this.A0B != c45410K8x.A0B || this.A00 != c45410K8x.A00 || this.A01 != c45410K8x.A01 || !C14360o3.A0K(this.A09, c45410K8x.A09) || !C14360o3.A0K(this.A03, c45410K8x.A03) || !C14360o3.A0K(this.A02, c45410K8x.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0K(this.A09, (((AbstractC167007dF.A0D(this.A0B, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0J(this.A06, AbstractC166997dE.A0J(this.A08, AbstractC166987dD.A0J(this.A0A))))))) + this.A00) * 31) + this.A01) * 31)));
    }

    public C45410K8x(C51745MtU c51745MtU, C50627MWo c50627MWo, C50679MYx c50679MYx, C5QE c5qe, C5QE c5qe2, C5QE c5qe3, C5QE c5qe4, String str, String str2, int i, int i2, boolean z) {
        this.A0A = str;
        this.A08 = c5qe;
        this.A06 = c5qe2;
        this.A07 = c5qe3;
        this.A05 = c5qe4;
        this.A04 = c50679MYx;
        this.A0B = z;
        this.A00 = i;
        this.A01 = i2;
        this.A09 = str2;
        this.A03 = c50627MWo;
        this.A02 = c51745MtU;
    }
}
