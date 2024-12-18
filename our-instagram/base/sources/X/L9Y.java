package X;

/* loaded from: classes8.dex */
public final class L9Y {
    public final String A00;
    public final InterfaceC16660sJ A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof L9Y) {
                L9Y l9y = (L9Y) obj;
                if (!C14360o3.A0K(this.A00, l9y.A00) || !C14360o3.A0K(this.A01, l9y.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0J(this.A00));
    }

    public L9Y(String str, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = str;
        this.A01 = interfaceC16660sJ;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FieldExtractionDefinition(id=");
        A1C.append(this.A00);
        A1C.append(", extractor=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
