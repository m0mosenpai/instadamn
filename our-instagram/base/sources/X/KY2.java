package X;

/* loaded from: classes8.dex */
public final class KY2 extends AbstractC47450Kxf {
    public final C51737MtK A00;
    public final C31200Dnj A01;
    public final C38687GzS A02;
    public final C38687GzS A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KY2) {
                KY2 ky2 = (KY2) obj;
                if (!C14360o3.A0K(this.A01, ky2.A01) || !C14360o3.A0K(this.A03, ky2.A03) || !C14360o3.A0K(this.A02, ky2.A02) || !C14360o3.A0K(this.A00, ky2.A00) || !C14360o3.A0K(this.A04, ky2.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0G(this.A01)))) + AbstractC167017dG.A0O(this.A04);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KY2(C51737MtK c51737MtK, C31200Dnj c31200Dnj, C38687GzS c38687GzS, C38687GzS c38687GzS2, String str) {
        super(C05F.A00);
        AbstractC167017dG.A1R(c38687GzS, c38687GzS2);
        this.A01 = c31200Dnj;
        this.A03 = c38687GzS;
        this.A02 = c38687GzS2;
        this.A00 = c51737MtK;
        this.A04 = str;
    }
}
