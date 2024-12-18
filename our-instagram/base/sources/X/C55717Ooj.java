package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ooj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55717Ooj implements C3RU {
    public final InterfaceC10260gi A00;

    @Override // X.C3RU
    public final int Bjk() {
        return 122954760;
    }

    @Override // X.C3RU
    public final long BtZ() {
        return 0L;
    }

    @Override // X.C3RU
    public final /* synthetic */ String CDW() {
        return AD6.A01(this);
    }

    @Override // X.C3RU
    public final String CDX() {
        return "invalid";
    }

    @Override // X.C3RU
    public final boolean CbO() {
        return true;
    }

    @Override // X.C3RU
    public final boolean Ceh() {
        return false;
    }

    @Override // X.C3RU
    public final String BUO() {
        String C2k;
        InterfaceC10260gi interfaceC10260gi = this.A00;
        if (interfaceC10260gi == null || (C2k = interfaceC10260gi.C2k(36889379616457561L)) == null) {
            return "invalid";
        }
        return C2k;
    }

    @Override // X.C3RU
    public final String BUR() {
        String C2k;
        InterfaceC10260gi interfaceC10260gi = this.A00;
        if (interfaceC10260gi == null || (C2k = interfaceC10260gi.C2k(36889379616064343L)) == null) {
            return "invalid";
        }
        return C2k;
    }

    @Override // X.C3RU
    public final long BUS() {
        InterfaceC10260gi interfaceC10260gi = this.A00;
        if (interfaceC10260gi != null) {
            return interfaceC10260gi.BP2(36607904639424163L);
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
        InterfaceC10260gi interfaceC10260gi = this.A00;
        if (interfaceC10260gi == null || (C2k = interfaceC10260gi.C2k(36889379616195416L)) == null) {
            return "invalid";
        }
        return C2k;
    }

    @Override // X.C3RU
    public final String CDY() {
        String C2k;
        InterfaceC10260gi interfaceC10260gi = this.A00;
        if (interfaceC10260gi == null || (C2k = interfaceC10260gi.C2k(36889379616523098L)) == null) {
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
        InterfaceC10260gi interfaceC10260gi = this.A00;
        if (interfaceC10260gi != null && interfaceC10260gi.AhA(36326429663246197L)) {
            return true;
        }
        return false;
    }

    public C55717Ooj(UserSession userSession) {
        C229419w c229419w;
        C1AC A02;
        C18V c18v = C18V.A01;
        if (c18v != null && (A02 = c18v.A02(userSession)) != null) {
            c229419w = A02.A01.A00;
        } else {
            c229419w = null;
        }
        this.A00 = c229419w;
    }
}
