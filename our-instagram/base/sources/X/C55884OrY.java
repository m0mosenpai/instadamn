package X;

import com.instagram.user.model.User;

/* renamed from: X.OrY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55884OrY implements InterfaceC37226Gab {
    public final C41181vS A00;

    public C55884OrY(C41181vS c41181vS) {
        C14360o3.A0B(c41181vS, 1);
        this.A00 = c41181vS;
    }

    @Override // X.InterfaceC37226Gab
    public final boolean CRO() {
        return false;
    }

    @Override // X.InterfaceC37226Gab
    public final String BQR() {
        EnumC76383bi A0B = this.A00.A0B();
        C14360o3.A07(A0B);
        if (A0B != EnumC76383bi.A06) {
            return A0B.A00;
        }
        return null;
    }

    @Override // X.InterfaceC37226Gab
    public final int BRr() {
        C41181vS c41181vS = this.A00;
        if (c41181vS.A0C() != null) {
            return c41181vS.A0C().A00;
        }
        return -1;
    }

    @Override // X.InterfaceC37226Gab
    public final String CDG() {
        C41181vS c41181vS = this.A00;
        if (c41181vS.A1Z()) {
            C105814ps c105814ps = c41181vS.A0d;
            c105814ps.getClass();
            return c105814ps.A00.A3t;
        }
        return null;
    }

    @Override // X.InterfaceC37226Gab
    public final User CDj() {
        User user = this.A00.A0i;
        if (user != null) {
            return user;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC37226Gab
    public final boolean CXe() {
        return this.A00.A18();
    }

    @Override // X.InterfaceC37226Gab
    public final boolean Ccz() {
        C38321qM c38321qM;
        C41181vS c41181vS = this.A00;
        if (c41181vS.CY4() && (c38321qM = c41181vS.A0b) != null && c38321qM.A5W()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC37226Gab
    public final boolean Cdq() {
        return !this.A00.A18();
    }

    @Override // X.InterfaceC37226Gab
    public final boolean Cff() {
        return this.A00.A1o();
    }

    @Override // X.InterfaceC37226Gab
    public final String getMediaId() {
        C38321qM c38321qM;
        C41181vS c41181vS = this.A00;
        if (!c41181vS.CY4() || (c38321qM = c41181vS.A0b) == null) {
            return null;
        }
        return c38321qM.getId();
    }
}
