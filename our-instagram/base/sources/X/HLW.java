package X;

/* loaded from: classes7.dex */
public final class HLW extends AbstractC46470KhU {
    public final InterfaceC84443pn A00;
    public final InterfaceC88183wS A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HLW) {
                HLW hlw = (HLW) obj;
                if (!C14360o3.A0K(this.A01, hlw.A01) || !C14360o3.A0K(this.A00, hlw.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC166997dE.A0I(this.A00)) * 31) + AbstractC53644Nnp.A00();
    }

    public HLW(InterfaceC84443pn interfaceC84443pn, InterfaceC88183wS interfaceC88183wS) {
        this.A01 = interfaceC88183wS;
        this.A00 = interfaceC84443pn;
    }
}
