package X;

/* renamed from: X.NQu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52647NQu extends AbstractC53507NlY {
    public final C2Fb A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52647NQu) {
                C52647NQu c52647NQu = (C52647NQu) obj;
                if (!C14360o3.A0K(this.A01, c52647NQu.A01) || this.A00 != c52647NQu.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }

    public C52647NQu(C2Fb c2Fb, String str) {
        this.A01 = str;
        this.A00 = c2Fb;
    }
}
