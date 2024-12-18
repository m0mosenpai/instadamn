package X;

/* loaded from: classes6.dex */
public final class E68 extends C0T6 {
    public final E6Y A00;
    public final boolean A01;

    public E68(E6Y e6y, boolean z) {
        C14360o3.A0B(e6y, 1);
        this.A00 = e6y;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E68) {
                E68 e68 = (E68) obj;
                if (!C14360o3.A0K(this.A00, e68.A00) || this.A01 != e68.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC166987dD.A0G(this.A00));
    }
}
