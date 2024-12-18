package X;

/* loaded from: classes5.dex */
public final class CVC {
    public final float A00;
    public final C5Y5 A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CVC) {
                CVC cvc = (CVC) obj;
                if (Float.compare(this.A00, cvc.A00) != 0 || !C14360o3.A0K(this.A01, cvc.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC25235BEs.A02(this.A00));
    }

    public CVC(C5Y5 c5y5, float f) {
        this.A00 = f;
        this.A01 = c5y5;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Fade(alpha=");
        A1C.append(this.A00);
        A1C.append(", animationSpec=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
