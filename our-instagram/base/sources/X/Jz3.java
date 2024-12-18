package X;

/* loaded from: classes8.dex */
public final class Jz3 extends C0T6 implements InterfaceC50391MMt {
    public final C2Fb A00;
    public final String A01 = "https://help.instagram.com/523408036294825";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Jz3) {
                Jz3 jz3 = (Jz3) obj;
                if (!C14360o3.A0K(this.A01, jz3.A01) || this.A00 != jz3.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public Jz3(C2Fb c2Fb) {
        this.A00 = c2Fb;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }
}
