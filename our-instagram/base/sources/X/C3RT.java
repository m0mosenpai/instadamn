package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3RT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3RT implements C3RU {
    public final InterfaceC10260gi A00;

    public C3RT(UserSession userSession) {
        C229419w c229419w;
        C1AC A02;
        C14360o3.A0B(userSession, 1);
        C18V c18v = C18V.A01;
        if (c18v != null && (A02 = c18v.A02(userSession)) != null) {
            c229419w = A02.A01.A00;
        } else {
            c229419w = null;
        }
        this.A00 = c229419w;
    }

    @Override // X.C3RU
    public final int Bjk() {
        return 424096228;
    }

    @Override // X.C3RU
    public final long BtZ() {
        return 720L;
    }

    @Override // X.C3RU
    public final /* synthetic */ String CDW() {
        return AD6.A01(this);
    }

    @Override // X.C3RU
    public final boolean CDg() {
        return false;
    }

    @Override // X.C3RU
    public final boolean CbO() {
        return true;
    }

    public final long A00() {
        InterfaceC10260gi interfaceC10260gi = this.A00;
        if (interfaceC10260gi != null) {
            return interfaceC10260gi.BP2(36599228808760807L);
        }
        return 0L;
    }

    @Override // X.C3RU
    public final String BUO() {
        String C2k;
        InterfaceC10260gi interfaceC10260gi = this.A00;
        if (interfaceC10260gi == null || (C2k = interfaceC10260gi.C2k(36880703782781281L)) == null) {
            return "invalid";
        }
        return C2k;
    }

    @Override // X.C3RU
    public final String BUR() {
        String C2k;
        InterfaceC10260gi interfaceC10260gi = this.A00;
        if (interfaceC10260gi == null || (C2k = interfaceC10260gi.C2k(36880703782256989L)) == null) {
            return "invalid";
        }
        return C2k;
    }

    @Override // X.C3RU
    public final long BUS() {
        InterfaceC10260gi interfaceC10260gi = this.A00;
        if (interfaceC10260gi != null) {
            return interfaceC10260gi.BP2(36599228805680606L);
        }
        return 1L;
    }

    @Override // X.C3RU
    public final Integer BfO() {
        InterfaceC10260gi interfaceC10260gi = this.A00;
        if (interfaceC10260gi != null) {
            long BP2 = interfaceC10260gi.BP2(36599228807319014L);
            if (BP2 != 1) {
                if (BP2 == 2) {
                    return C05F.A01;
                }
                if (BP2 == 3) {
                    return C05F.A0C;
                }
                if (BP2 == 4) {
                    return C05F.A0N;
                }
            }
        }
        return C05F.A00;
    }

    @Override // X.C3RU
    public final boolean Bvt() {
        InterfaceC10260gi interfaceC10260gi = this.A00;
        if (interfaceC10260gi != null && interfaceC10260gi.AhA(36317753829824016L)) {
            return true;
        }
        return false;
    }

    @Override // X.C3RU
    public final String CDV() {
        String C2k;
        InterfaceC10260gi interfaceC10260gi = this.A00;
        if (interfaceC10260gi == null || (C2k = interfaceC10260gi.C2k(36880703782715744L)) == null) {
            return "invalid";
        }
        return C2k;
    }

    @Override // X.C3RU
    public final String CDX() {
        String C2k;
        InterfaceC10260gi interfaceC10260gi = this.A00;
        if (interfaceC10260gi == null || (C2k = interfaceC10260gi.C2k(36880703782584671L)) == null) {
            return "invalid";
        }
        return C2k;
    }

    @Override // X.C3RU
    public final String CDY() {
        String C2k;
        InterfaceC10260gi interfaceC10260gi = this.A00;
        if (interfaceC10260gi == null || (C2k = interfaceC10260gi.C2k(36880703782322526L)) == null) {
            return "invalid";
        }
        return C2k;
    }

    @Override // X.C3RU
    public final boolean CUb() {
        InterfaceC10260gi interfaceC10260gi = this.A00;
        if (interfaceC10260gi != null && interfaceC10260gi.AhA(36317753830807063L)) {
            return true;
        }
        return false;
    }

    @Override // X.C3RU
    public final boolean Car() {
        InterfaceC10260gi interfaceC10260gi = this.A00;
        if (interfaceC10260gi != null && interfaceC10260gi.AhA(36317753828775435L)) {
            return true;
        }
        return false;
    }

    @Override // X.C3RU
    public final boolean Ceh() {
        InterfaceC10260gi interfaceC10260gi = this.A00;
        if (interfaceC10260gi != null && interfaceC10260gi.AhA(36317753829758479L)) {
            return true;
        }
        return false;
    }
}
