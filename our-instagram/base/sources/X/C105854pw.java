package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4pw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105854pw implements C1NI, InterfaceC73233Pz {
    public final InterfaceC38621qt A00;

    @Override // X.C1NI
    public final String BzL(UserSession userSession) {
        return null;
    }

    @Override // X.C1NI
    public final boolean CW9() {
        return false;
    }

    @Override // X.C1NI
    public final boolean CZq() {
        return false;
    }

    @Override // X.C1NI
    public final boolean CdW() {
        return false;
    }

    public final String A00() {
        InterfaceC38621qt interfaceC38621qt = this.A00;
        if (interfaceC38621qt.AYk() != null) {
            return interfaceC38621qt.AYk();
        }
        return "";
    }

    public final String A01() {
        InterfaceC38621qt interfaceC38621qt = this.A00;
        if (interfaceC38621qt.B3q() != null) {
            return interfaceC38621qt.B3q();
        }
        return "";
    }

    public final String A02() {
        InterfaceC38621qt interfaceC38621qt = this.A00;
        if (interfaceC38621qt.getMessage() != null) {
            return interfaceC38621qt.getMessage();
        }
        return "";
    }

    public final String A03() {
        InterfaceC38621qt interfaceC38621qt = this.A00;
        if (interfaceC38621qt.getTitle() != null) {
            return interfaceC38621qt.getTitle();
        }
        return "";
    }

    @Override // X.InterfaceC38381qS
    public final C1XV B5n() {
        return C1XV.A0i;
    }

    @Override // X.InterfaceC38381qS
    public final Integer BA3() {
        return this.A00.BA3();
    }

    @Override // X.InterfaceC38381qS
    public final InterfaceC39571se BK1() {
        return this.A00.BJz();
    }

    @Override // X.InterfaceC73233Pz
    public final /* synthetic */ Integer BWa() {
        return null;
    }

    @Override // X.InterfaceC38381qS
    public final String CAR() {
        InterfaceC38621qt interfaceC38621qt = this.A00;
        if (interfaceC38621qt.CAR() != null) {
            return interfaceC38621qt.CAR();
        }
        return "";
    }

    @Override // X.InterfaceC38381qS
    public final Integer CCj() {
        return C05F.A0N;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CFr() {
        InterfaceC38621qt interfaceC38621qt = this.A00;
        if (interfaceC38621qt.CFs() != null) {
            return Integer.valueOf(interfaceC38621qt.CFs());
        }
        return null;
    }

    @Override // X.C1NI, X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        InterfaceC38621qt interfaceC38621qt = this.A00;
        if (interfaceC38621qt.getId() != null) {
            return interfaceC38621qt.getId();
        }
        return "";
    }

    public C105854pw(InterfaceC38621qt interfaceC38621qt) {
        this.A00 = interfaceC38621qt;
    }
}
