package X;

/* loaded from: classes8.dex */
public final class L9Z {
    public final Object A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof L9Z) {
                L9Z l9z = (L9Z) obj;
                if (!C14360o3.A0K(this.A01, l9z.A01) || !C14360o3.A0K(this.A00, l9z.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0M(this.A00);
    }

    public L9Z(String str, Object obj) {
        this.A01 = str;
        this.A00 = obj;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FieldState(id=");
        A1C.append(this.A01);
        A1C.append(", value=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
