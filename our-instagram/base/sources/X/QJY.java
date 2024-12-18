package X;

/* loaded from: classes10.dex */
public final class QJY extends C0T6 implements InterfaceC65553TmW {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final int A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QJY) {
                QJY qjy = (QJY) obj;
                if (!C14360o3.A0K(this.A03, qjy.A03) || this.A05 != qjy.A05 || this.A04 != qjy.A04 || this.A02 != qjy.A02 || this.A01 != qjy.A01 || this.A00 != qjy.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC65553TmW
    public final String BcU() {
        return this.A03;
    }

    @Override // X.InterfaceC65553TmW
    public final int BcV() {
        return this.A04;
    }

    @Override // X.InterfaceC65553TmW
    public final boolean Cbx() {
        return this.A05;
    }

    public final int hashCode() {
        return ((((((AbstractC167007dF.A0D(this.A05, AbstractC166987dD.A0J(this.A03)) + this.A04) * 31) + this.A02) * 31) + this.A01) * 31) + this.A00;
    }

    public QJY(String str, int i, int i2, int i3, int i4, boolean z) {
        this.A03 = str;
        this.A05 = z;
        this.A04 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A00 = i4;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcPermissionRequestWithOverlay(permission=");
        A1C.append(this.A03);
        A1C.append(", isRequiredPermission=");
        A1C.append(this.A05);
        A1C.append(", permissionLabel=");
        A1C.append(this.A04);
        A1C.append(", title=");
        A1C.append(this.A02);
        A1C.append(", message=");
        A1C.append(this.A01);
        A1C.append(", link=");
        return AbstractC25236BEt.A0Z(A1C, this.A00);
    }
}
