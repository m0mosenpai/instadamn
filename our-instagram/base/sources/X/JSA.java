package X;

import java.util.List;

/* loaded from: classes8.dex */
public final class JSA extends AbstractC46441Kh1 {
    public final List A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof JSA) {
                JSA jsa = (JSA) obj;
                if (!C14360o3.A0K(this.A00, jsa.A00) || this.A03 != jsa.A03 || this.A01 != jsa.A01 || this.A02 != jsa.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC167007dF.A0D(this.A01, AbstractC167007dF.A0D(this.A03, AbstractC166987dD.A0G(this.A00))));
    }

    public JSA(List list, boolean z, boolean z2, boolean z3) {
        this.A00 = list;
        this.A03 = z;
        this.A01 = z2;
        this.A02 = z3;
    }
}
