package X;

/* loaded from: classes6.dex */
public final class E9G extends C0T6 implements InterfaceC37094GWd {
    public final String A00;
    public final String A01;

    public E9G(String str, String str2) {
        C14360o3.A0B(str2, 2);
        this.A00 = str;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E9G) {
                E9G e9g = (E9G) obj;
                if (!C14360o3.A0K(this.A00, e9g.A00) || !C14360o3.A0K(this.A01, e9g.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0J(this.A00));
    }
}
