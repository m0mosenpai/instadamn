package X;

/* loaded from: classes8.dex */
public final class KY1 extends AbstractC47450Kxf {
    public final C51737MtK A00;
    public final C31200Dnj A01;
    public final C38687GzS A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KY1(C51737MtK c51737MtK, C31200Dnj c31200Dnj, C38687GzS c38687GzS, String str) {
        super(C05F.A0C);
        C14360o3.A0B(c38687GzS, 2);
        this.A01 = c31200Dnj;
        this.A02 = c38687GzS;
        this.A00 = c51737MtK;
        this.A03 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KY1) {
                KY1 ky1 = (KY1) obj;
                if (!C14360o3.A0K(this.A01, ky1.A01) || !C14360o3.A0K(this.A02, ky1.A02) || !C14360o3.A0K(this.A00, ky1.A00) || !C14360o3.A0K(this.A03, ky1.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A01))) + AbstractC167017dG.A0O(this.A03);
    }
}
