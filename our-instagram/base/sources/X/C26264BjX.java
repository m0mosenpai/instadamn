package X;

/* renamed from: X.BjX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26264BjX extends C0T6 implements InterfaceC30895Di8 {
    public final C5QE A00;
    public final String A01;

    public C26264BjX(C5QE c5qe, String str) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = c5qe;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26264BjX) {
                C26264BjX c26264BjX = (C26264BjX) obj;
                if (!C14360o3.A0K(this.A01, c26264BjX.A01) || !C14360o3.A0K(this.A00, c26264BjX.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0M(this.A00);
    }
}
