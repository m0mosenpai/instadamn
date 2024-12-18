package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.947, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass947 implements C3RU {
    public final long A00;
    public final long A01;
    public final long A02;
    public final InterfaceC10260gi A03;
    public final boolean A04;

    public AnonymousClass947(UserSession userSession) {
        C229419w c229419w;
        long j;
        long j2;
        C1AC A02;
        C14360o3.A0B(userSession, 1);
        C18V c18v = C18V.A01;
        if (c18v != null && (A02 = c18v.A02(userSession)) != null) {
            c229419w = A02.A01.A00;
        } else {
            c229419w = null;
        }
        this.A03 = c229419w;
        if (c229419w != null) {
            j = c229419w.BP2(36606418581591497L);
        } else {
            j = 0;
        }
        this.A00 = j;
        if (c229419w != null) {
            j2 = c229419w.BP2(36606418581525960L);
        } else {
            j2 = 0;
        }
        this.A02 = j2;
        this.A01 = c229419w != null ? c229419w.BP2(36606418581657034L) : 0L;
        this.A04 = c229419w != null && c229419w.AhA(36324943605150310L);
    }

    @Override // X.C3RU
    public final int Bjk() {
        return 424096228;
    }

    @Override // X.C3RU
    public final /* synthetic */ String CDW() {
        return AD6.A01(this);
    }

    @Override // X.C3RU
    public final boolean Ceh() {
        return false;
    }

    @Override // X.C3RU
    public final String BUO() {
        String C2k;
        InterfaceC10260gi interfaceC10260gi = this.A03;
        if (interfaceC10260gi == null || (C2k = interfaceC10260gi.C2k(36887893557838620L)) == null) {
            return "invalid";
        }
        return C2k;
    }

    @Override // X.C3RU
    public final String BUR() {
        String C2k;
        InterfaceC10260gi interfaceC10260gi = this.A03;
        if (interfaceC10260gi == null || (C2k = interfaceC10260gi.C2k(36887893557379865L)) == null) {
            return "invalid";
        }
        return C2k;
    }

    @Override // X.C3RU
    public final long BUS() {
        InterfaceC10260gi interfaceC10260gi = this.A03;
        if (interfaceC10260gi != null) {
            return interfaceC10260gi.BP2(36606418580805059L);
        }
        return 0L;
    }

    @Override // X.C3RU
    public final /* synthetic */ Integer BfO() {
        return C05F.A00;
    }

    @Override // X.C3RU
    public final long BtZ() {
        InterfaceC10260gi interfaceC10260gi = this.A03;
        if (interfaceC10260gi != null) {
            return interfaceC10260gi.BP2(36606418580936133L);
        }
        return 0L;
    }

    @Override // X.C3RU
    public final /* synthetic */ boolean Bvt() {
        return false;
    }

    @Override // X.C3RU
    public final String CDV() {
        String C2k;
        InterfaceC10260gi interfaceC10260gi = this.A03;
        if (interfaceC10260gi == null || (C2k = interfaceC10260gi.C2k(36887893557969693L)) == null) {
            return "invalid";
        }
        return C2k;
    }

    @Override // X.C3RU
    public final String CDX() {
        String C2k;
        InterfaceC10260gi interfaceC10260gi = this.A03;
        if (interfaceC10260gi == null || (C2k = interfaceC10260gi.C2k(36887893557707547L)) == null) {
            return "invalid";
        }
        return C2k;
    }

    @Override // X.C3RU
    public final String CDY() {
        String C2k;
        InterfaceC10260gi interfaceC10260gi = this.A03;
        if (interfaceC10260gi == null || (C2k = interfaceC10260gi.C2k(36887893557445402L)) == null) {
            return "invalid";
        }
        return C2k;
    }

    @Override // X.C3RU
    public final boolean CDg() {
        InterfaceC10260gi interfaceC10260gi = this.A03;
        if (interfaceC10260gi != null && interfaceC10260gi.AhA(36324943605019237L)) {
            return true;
        }
        return false;
    }

    @Override // X.C3RU
    public final /* synthetic */ boolean CUb() {
        return true;
    }

    @Override // X.C3RU
    public final boolean Car() {
        InterfaceC10260gi interfaceC10260gi = this.A03;
        if (interfaceC10260gi != null && interfaceC10260gi.AhA(36324943604494947L)) {
            return true;
        }
        return false;
    }

    @Override // X.C3RU
    public final boolean CbO() {
        InterfaceC10260gi interfaceC10260gi = this.A03;
        if (interfaceC10260gi != null && interfaceC10260gi.AhA(36324943604757092L)) {
            return true;
        }
        return false;
    }
}
