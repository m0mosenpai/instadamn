package X;

/* renamed from: X.BeX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25983BeX extends C0T6 {
    public final C38321qM A00;
    public final String A01;

    public C25983BeX(C38321qM c38321qM, String str) {
        C14360o3.A0B(c38321qM, 1);
        this.A00 = c38321qM;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25983BeX) {
                C25983BeX c25983BeX = (C25983BeX) obj;
                if (!C14360o3.A0K(this.A00, c25983BeX.A00) || !C14360o3.A0K(this.A01, c25983BeX.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0O(this.A01);
    }
}
