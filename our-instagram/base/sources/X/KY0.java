package X;

/* loaded from: classes8.dex */
public final class KY0 extends AbstractC47450Kxf {
    public final C51737MtK A00;
    public final C38687GzS A01;
    public final C38687GzS A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KY0) {
                KY0 ky0 = (KY0) obj;
                if (!C14360o3.A0K(this.A02, ky0.A02) || !C14360o3.A0K(this.A01, ky0.A01) || !C14360o3.A0K(this.A00, ky0.A00) || !C14360o3.A0K(this.A03, ky0.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A02))) + AbstractC167017dG.A0O(this.A03);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KY0(C51737MtK c51737MtK, C38687GzS c38687GzS, C38687GzS c38687GzS2, String str) {
        super(C05F.A01);
        AbstractC167017dG.A1P(c38687GzS, c38687GzS2);
        this.A02 = c38687GzS;
        this.A01 = c38687GzS2;
        this.A00 = c51737MtK;
        this.A03 = str;
    }
}
