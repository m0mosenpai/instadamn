package X;

/* renamed from: X.K8o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45401K8o extends AbstractC46606Kjj {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45401K8o) {
                C45401K8o c45401K8o = (C45401K8o) obj;
                if (this.A02 != c45401K8o.A02 || this.A01 != c45401K8o.A01 || this.A03 != c45401K8o.A03 || this.A00 != c45401K8o.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A00, AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A01, AbstractC25225BEi.A08(this.A02))));
    }

    public C45401K8o(boolean z, boolean z2, boolean z3, boolean z4) {
        this.A02 = z;
        this.A01 = z2;
        this.A03 = z3;
        this.A00 = z4;
    }
}
