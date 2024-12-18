package X;

/* loaded from: classes10.dex */
public final class QJX extends C0T6 implements InterfaceC65553TmW {
    public final int A00;
    public final String A01;
    public final boolean A02 = true;

    public QJX(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QJX) {
                QJX qjx = (QJX) obj;
                if (!C14360o3.A0K(this.A01, qjx.A01) || this.A02 != qjx.A02 || this.A00 != qjx.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC65553TmW
    public final String BcU() {
        return this.A01;
    }

    @Override // X.InterfaceC65553TmW
    public final int BcV() {
        return this.A00;
    }

    @Override // X.InterfaceC65553TmW
    public final boolean Cbx() {
        return this.A02;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A02, AbstractC166987dD.A0J(this.A01)) + this.A00;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcPermissionRequest(permission=");
        A1C.append(this.A01);
        A1C.append(", isRequiredPermission=");
        A1C.append(this.A02);
        A1C.append(", permissionLabel=");
        return AbstractC25236BEt.A0Z(A1C, this.A00);
    }
}
