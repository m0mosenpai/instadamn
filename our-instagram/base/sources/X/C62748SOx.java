package X;

/* renamed from: X.SOx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62748SOx {
    public final C2JO A00;
    public final C63152Se0 A01;
    public final SXG A02;

    public C62748SOx(C2JO c2jo, C63152Se0 c63152Se0, SXG sxg) {
        C14360o3.A0B(sxg, 3);
        this.A00 = c2jo;
        this.A01 = c63152Se0;
        this.A02 = sxg;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62748SOx) {
                C62748SOx c62748SOx = (C62748SOx) obj;
                if (!C14360o3.A0K(this.A00, c62748SOx.A00) || !C14360o3.A0K(this.A01, c62748SOx.A01) || !C14360o3.A0K(this.A02, c62748SOx.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, (AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0M(this.A01)) * 31);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PaymentComponentPttRequest(saveCredentialInput=");
        A1C.append(this.A00);
        A1C.append(", authTicket=");
        A1C.append(this.A01);
        A1C.append(", pttRequestParam=");
        return AbstractC167017dG.A0o(this.A02, A1C);
    }
}
