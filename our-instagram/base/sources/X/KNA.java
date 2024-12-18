package X;

/* loaded from: classes8.dex */
public final class KNA extends AbstractC46405KgR {
    public final String A00;
    public final InterfaceC16820sZ A01;

    public KNA(String str, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 2);
        this.A00 = str;
        this.A01 = interfaceC16820sZ;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KNA) {
                KNA kna = (KNA) obj;
                if (!C14360o3.A0K(this.A00, kna.A00) || !C14360o3.A0K(this.A01, kna.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0J(this.A00));
    }
}
