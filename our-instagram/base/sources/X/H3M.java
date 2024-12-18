package X;

/* loaded from: classes7.dex */
public final class H3M extends C0T6 implements InterfaceC43467JIf {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H3M) {
                H3M h3m = (H3M) obj;
                if (!C14360o3.A0K(this.A00, h3m.A00) || !C14360o3.A0K(this.A01, h3m.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0J(this.A00));
    }

    public H3M(String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
