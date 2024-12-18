package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.OrZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55885OrZ implements InterfaceC37226Gab {
    public final UserSession A00;
    public final C38321qM A01;

    @Override // X.InterfaceC37226Gab
    public final String CDG() {
        return null;
    }

    @Override // X.InterfaceC37226Gab
    public final String BQR() {
        EnumC76383bi A1x = this.A01.A1x();
        if (A1x != EnumC76383bi.A06) {
            return A1x.A00;
        }
        return null;
    }

    @Override // X.InterfaceC37226Gab
    public final int BRr() {
        return this.A01.BRp().A00;
    }

    @Override // X.InterfaceC37226Gab
    public final User CDj() {
        User A2E = this.A01.A2E(this.A00);
        if (A2E != null) {
            return A2E;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC37226Gab
    public final boolean CRO() {
        return this.A01.A5P();
    }

    @Override // X.InterfaceC37226Gab
    public final boolean CXe() {
        return false;
    }

    @Override // X.InterfaceC37226Gab
    public final boolean Ccz() {
        return false;
    }

    @Override // X.InterfaceC37226Gab
    public final boolean Cdq() {
        return this.A01.A63();
    }

    @Override // X.InterfaceC37226Gab
    public final boolean Cff() {
        return this.A01.Cff();
    }

    @Override // X.InterfaceC37226Gab
    public final String getMediaId() {
        return this.A01.getId();
    }

    public C55885OrZ(UserSession userSession, C38321qM c38321qM) {
        this.A00 = userSession;
        this.A01 = c38321qM;
    }
}
