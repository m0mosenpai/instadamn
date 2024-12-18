package X;

/* renamed from: X.Czh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29529Czh implements InterfaceC30849DhO {
    public final C27980CVc A00;
    public final int A01;

    public C29529Czh(C27980CVc c27980CVc, int i) {
        C14360o3.A0B(c27980CVc, 2);
        this.A01 = i;
        this.A00 = c27980CVc;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29529Czh) {
                C29529Czh c29529Czh = (C29529Czh) obj;
                if (this.A01 != c29529Czh.A01 || !C14360o3.A0K(this.A00, c29529Czh.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, this.A01 * 31);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Populated(index=");
        A1C.append(this.A01);
        A1C.append(", suggestion=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
