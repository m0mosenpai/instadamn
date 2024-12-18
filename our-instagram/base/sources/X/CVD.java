package X;

/* loaded from: classes5.dex */
public final class CVD {
    public final C5Y5 A00;
    public final InterfaceC16660sJ A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CVD) {
                CVD cvd = (CVD) obj;
                if (!C14360o3.A0K(this.A01, cvd.A01) || !C14360o3.A0K(this.A00, cvd.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0G(this.A01));
    }

    public CVD(C5Y5 c5y5, InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = interfaceC16660sJ;
        this.A00 = c5y5;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Slide(slideOffset=");
        A1C.append(this.A01);
        A1C.append(", animationSpec=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
