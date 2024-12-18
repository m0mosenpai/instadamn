package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class E9U extends C0T6 implements InterfaceC37100GWk {
    public final List A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E9U) {
                E9U e9u = (E9U) obj;
                if (this.A01 != e9u.A01 || !C14360o3.A0K(this.A00, e9u.A00) || this.A02 != e9u.A02 || this.A03 != e9u.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, AbstractC167007dF.A0D(this.A02, AbstractC166997dE.A0J(this.A00, AbstractC25225BEi.A08(this.A01))));
    }

    public E9U(List list, boolean z, boolean z2, boolean z3) {
        this.A01 = z;
        this.A00 = list;
        this.A02 = z2;
        this.A03 = z3;
    }
}
