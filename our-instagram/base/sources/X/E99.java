package X;

/* loaded from: classes6.dex */
public final class E99 extends C0T6 implements InterfaceC37092GWb {
    public final int A00 = 2131955083;
    public final int A01 = 2131955084;
    public final String A02 = "https://help.instagram.com/477434105621119";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E99) {
                E99 e99 = (E99) obj;
                if (this.A00 != e99.A00 || this.A01 != e99.A01 || !C14360o3.A0K(this.A02, e99.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, ((this.A00 * 31) + this.A01) * 31);
    }
}
