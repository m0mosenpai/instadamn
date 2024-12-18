package X;

/* loaded from: classes7.dex */
public final class H5N extends C0T6 implements XFR {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H5N) {
                H5N h5n = (H5N) obj;
                if (!C14360o3.A0K(this.A01, h5n.A01) || !C14360o3.A0K(this.A00, h5n.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A00, AbstractC166987dD.A0J(this.A01));
    }

    public H5N(String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.A01 = str;
        this.A00 = str2;
    }
}
