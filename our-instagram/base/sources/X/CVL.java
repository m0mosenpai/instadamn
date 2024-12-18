package X;

/* loaded from: classes5.dex */
public final class CVL {
    public final Object A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CVL) {
                CVL cvl = (CVL) obj;
                if (!C14360o3.A0K(this.A01, cvl.A01) || !C14360o3.A0K(this.A00, cvl.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }

    public CVL(String str, Object obj) {
        this.A01 = str;
        this.A00 = obj;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ScreenKey(name=");
        A1C.append(this.A01);
        A1C.append(", args=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
