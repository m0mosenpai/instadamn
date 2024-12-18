package X;

import com.meta.foa.session.FoaUserSession;

/* loaded from: classes5.dex */
public final class CW5 {
    public final int A00;
    public final InterfaceC30961DjI A01;
    public final C27987CVk A02;
    public final FoaUserSession A03;
    public final Object A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CW5) {
                CW5 cw5 = (CW5) obj;
                if (!C14360o3.A0K(this.A02, cw5.A02) || !C14360o3.A0K(this.A04, cw5.A04) || !C14360o3.A0K(this.A01, cw5.A01) || !C14360o3.A0K(this.A03, cw5.A03) || this.A00 != cw5.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A04, AbstractC166987dD.A0G(this.A02)))) + this.A00;
    }

    public CW5(InterfaceC30961DjI interfaceC30961DjI, C27987CVk c27987CVk, FoaUserSession foaUserSession, Object obj, int i) {
        this.A02 = c27987CVk;
        this.A04 = obj;
        this.A01 = interfaceC30961DjI;
        this.A03 = foaUserSession;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CdsBottomSheetOpenContainerArgsScreens(screen=");
        A1C.append(this.A02);
        A1C.append(", args=");
        A1C.append(this.A04);
        A1C.append(", dataSource=");
        A1C.append(this.A01);
        A1C.append(", foaUserSession=");
        A1C.append(this.A03);
        A1C.append(", keyboardSoftInputMode=");
        return AbstractC25236BEt.A0Z(A1C, this.A00);
    }
}
