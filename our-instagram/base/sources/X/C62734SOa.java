package X;

/* renamed from: X.SOa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62734SOa {
    public final C63152Se0 A00;
    public final SXG A01;

    public C62734SOa(C63152Se0 c63152Se0, SXG sxg) {
        C14360o3.A0B(sxg, 2);
        this.A00 = c63152Se0;
        this.A01 = sxg;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62734SOa) {
                C62734SOa c62734SOa = (C62734SOa) obj;
                if (!C14360o3.A0K(this.A00, c62734SOa.A00) || !C14360o3.A0K(this.A01, c62734SOa.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC167017dG.A0M(this.A00) * 31);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CardPttRequest(authTicket=");
        A1C.append(this.A00);
        A1C.append(", pttRequestParam=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
