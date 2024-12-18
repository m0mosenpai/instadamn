package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.944, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass944 implements C3RU {
    public final Double A00;
    public final Double A01;
    public final boolean A02;
    public final InterfaceC10260gi A03;

    public AnonymousClass944(UserSession userSession) {
        C229419w c229419w;
        Double d;
        C1AC A02;
        C14360o3.A0B(userSession, 1);
        C18V c18v = C18V.A01;
        if (c18v != null && (A02 = c18v.A02(userSession)) != null) {
            c229419w = A02.A01.A00;
        } else {
            c229419w = null;
        }
        this.A03 = c229419w;
        this.A02 = c229419w != null && c229419w.AhA(36318685837531549L);
        if (c229419w != null) {
            d = Double.valueOf(c229419w.Az2(37163110767853825L));
        } else {
            d = null;
        }
        this.A01 = d;
        this.A00 = c229419w != null ? Double.valueOf(c229419w.Az2(37163110767919362L)) : null;
    }

    @Override // X.C3RU
    public final int Bjk() {
        return 424096228;
    }

    @Override // X.C3RU
    public final long BtZ() {
        return 4320L;
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
        if (interfaceC10260gi == null || (C2k = interfaceC10260gi.C2k(36881635790422413L)) == null) {
            return "invalid";
        }
        return C2k;
    }

    @Override // X.C3RU
    public final String BUR() {
        String C2k;
        InterfaceC10260gi interfaceC10260gi = this.A03;
        if (interfaceC10260gi == null || (C2k = interfaceC10260gi.C2k(36881635790291340L)) == null) {
            return "invalid";
        }
        return C2k;
    }

    @Override // X.C3RU
    public final long BUS() {
        InterfaceC10260gi interfaceC10260gi = this.A03;
        if (interfaceC10260gi != null) {
            return interfaceC10260gi.BP2(36600160813649657L);
        }
        return 1L;
    }

    @Override // X.C3RU
    public final /* synthetic */ Integer BfO() {
        return C05F.A00;
    }

    @Override // X.C3RU
    public final /* synthetic */ boolean Bvt() {
        return false;
    }

    @Override // X.C3RU
    public final String CDV() {
        String C2k;
        InterfaceC10260gi interfaceC10260gi = this.A03;
        if (interfaceC10260gi == null || (C2k = interfaceC10260gi.C2k(36881635790094729L)) == null) {
            return "invalid";
        }
        return C2k;
    }

    @Override // X.C3RU
    public final String CDX() {
        String C2k;
        InterfaceC10260gi interfaceC10260gi = this.A03;
        if (interfaceC10260gi == null || (C2k = interfaceC10260gi.C2k(36881635790225803L)) == null) {
            return "invalid";
        }
        return C2k;
    }

    @Override // X.C3RU
    public final String CDY() {
        String C2k;
        InterfaceC10260gi interfaceC10260gi = this.A03;
        if (interfaceC10260gi == null || (C2k = interfaceC10260gi.C2k(36881635790160266L)) == null) {
            return "invalid";
        }
        return C2k;
    }

    @Override // X.C3RU
    public final /* synthetic */ boolean CDg() {
        return true;
    }

    @Override // X.C3RU
    public final /* synthetic */ boolean CUb() {
        return true;
    }

    @Override // X.C3RU
    public final boolean Car() {
        InterfaceC10260gi interfaceC10260gi = this.A03;
        if (interfaceC10260gi != null && interfaceC10260gi.AhA(36318685836614041L)) {
            return true;
        }
        return false;
    }

    @Override // X.C3RU
    public final boolean CbO() {
        InterfaceC10260gi interfaceC10260gi = this.A03;
        if (interfaceC10260gi != null && interfaceC10260gi.AhA(36318685837400475L)) {
            return true;
        }
        return false;
    }
}
