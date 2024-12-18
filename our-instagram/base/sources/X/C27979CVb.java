package X;

/* renamed from: X.CVb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27979CVb {
    public final int A00;
    public final C27980CVc A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27979CVb) {
                C27979CVb c27979CVb = (C27979CVb) obj;
                if (this.A00 != c27979CVb.A00 || !C14360o3.A0K(this.A01, c27979CVb.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, this.A00 * 31);
    }

    public C27979CVb(C27980CVc c27980CVc, int i) {
        this.A00 = i;
        this.A01 = c27980CVc;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SuggestionStream(index=");
        A1C.append(this.A00);
        A1C.append(", suggestion=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
