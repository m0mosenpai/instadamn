package X;

/* loaded from: classes7.dex */
public final class HLX extends AbstractC46470KhU {
    public final InterfaceC84443pn A00;
    public final InterfaceC88183wS A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HLX) {
                HLX hlx = (HLX) obj;
                if (!C14360o3.A0K(this.A01, hlx.A01) || !C14360o3.A0K(this.A00, hlx.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public HLX(InterfaceC84443pn interfaceC84443pn, InterfaceC88183wS interfaceC88183wS) {
        this.A01 = interfaceC88183wS;
        this.A00 = interfaceC84443pn;
    }
}
