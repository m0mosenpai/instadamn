package X;

/* loaded from: classes6.dex */
public final class E9L extends C0T6 implements InterfaceC37096GWf {
    public int A00;
    public String A01;
    public String A02;
    public String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E9L) {
                E9L e9l = (E9L) obj;
                if (!C14360o3.A0K(this.A03, e9l.A03) || !C14360o3.A0K(this.A01, e9l.A01) || !C14360o3.A0K(this.A02, e9l.A02) || this.A00 != e9l.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0J(this.A03))) + this.A00;
    }
}
