package X;

import com.instagram.api.schemas.AFI_TYPE;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.30y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C670730y implements InterfaceC669530m, InterfaceC670430v {
    public InterfaceC670130s A00;
    public final long A01;
    public final C670830z A02;
    public final AnonymousClass311 A03;
    public final AnonymousClass312 A04;
    public final UserSession A05;
    public final Map A06 = new LinkedHashMap();

    @Override // X.InterfaceC669530m
    public final boolean A7S(AnonymousClass320 anonymousClass320, InterfaceC669830p interfaceC669830p, InterfaceC670130s interfaceC670130s) {
        C14360o3.A0B(interfaceC670130s, 0);
        this.A00 = interfaceC670130s;
        this.A02.A00 = interfaceC670130s;
        this.A03.A01 = interfaceC670130s;
        this.A04.A01 = interfaceC670130s;
        return true;
    }

    @Override // X.InterfaceC669530m
    public final int BX5() {
        return 0;
    }

    @Override // X.InterfaceC669530m
    public final int Bg5() {
        return 0;
    }

    @Override // X.InterfaceC669630n
    public final /* synthetic */ void CKM(C206209Bd c206209Bd, List list) {
    }

    @Override // X.InterfaceC669530m
    public final boolean CUl() {
        return false;
    }

    @Override // X.InterfaceC669530m
    public final void Co5() {
    }

    @Override // X.InterfaceC669530m
    public final void CoL(AnonymousClass320 anonymousClass320, EnumC37671p4 enumC37671p4, boolean z) {
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ void CoM(C9C3 c9c3, AnonymousClass320 anonymousClass320, EnumC37671p4 enumC37671p4, String str, String str2, double d, boolean z) {
        C14360o3.A0B(anonymousClass320, 1);
        C14360o3.A0B(enumC37671p4, 3);
    }

    @Override // X.InterfaceC669530m
    public final void CoN(int i) {
    }

    @Override // X.InterfaceC670430v
    public final void Cw2(AFI_TYPE afi_type, C38321qM c38321qM, C75113Zb c75113Zb, Integer num, int i) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(num, 3);
        int ordinal = afi_type.ordinal();
        if (ordinal != 2) {
            if (ordinal != 1) {
                if (ordinal == 10) {
                    this.A02.COU(c38321qM, num, i);
                }
            } else {
                this.A04.COU(c38321qM, num, i);
            }
        } else {
            this.A03.COU(c38321qM, num, i);
        }
        this.A06.put(afi_type, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // X.InterfaceC669530m
    public final boolean D7a(int i, int i2) {
        return false;
    }

    @Override // X.InterfaceC669530m
    public final void Dtv(int i) {
    }

    @Override // X.InterfaceC670430v
    public final void ETV(AFI_TYPE afi_type, long j) {
        int ordinal = afi_type.ordinal();
        if (ordinal != 2) {
            if (ordinal == 1) {
                this.A04.A00 = j;
                return;
            }
            return;
        }
        this.A03.A00 = j;
    }

    @Override // X.InterfaceC670430v
    public final boolean Eiv(AFI_TYPE afi_type, C38321qM c38321qM, Integer num) {
        Number number;
        if (c38321qM != null && c38321qM.CdW() && ((number = (Number) AbstractC001800i.A04(this.A06.values())) == null || System.currentTimeMillis() >= number.longValue() + this.A01)) {
            if (C18U.A06(C06090Tz.A05, this.A05, 36314652862319355L)) {
                int ordinal = afi_type.ordinal();
                if (ordinal != 2) {
                    if (ordinal != 1) {
                        if (ordinal == 10) {
                            return this.A02.Eio(c38321qM);
                        }
                    } else {
                        return this.A04.Eio(c38321qM);
                    }
                } else {
                    return this.A03.Eio(c38321qM);
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC669530m
    public final void deactivate() {
        this.A00 = null;
        this.A02.A00 = null;
        this.A03.A01 = null;
        this.A04.A01 = null;
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ boolean AFs() {
        return false;
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ C51G AND() {
        return new C43000Izq();
    }

    @Override // X.InterfaceC669630n
    public final /* synthetic */ String B5L() {
        return "";
    }

    @Override // X.InterfaceC669630n
    public final /* synthetic */ java.util.Set Bts() {
        return new HashSet();
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ void Cnx(boolean z) {
        throw new UnsupportedOperationException(AbstractC111324zv.A00(53));
    }

    public C670730y(UserSession userSession) {
        this.A05 = userSession;
        this.A02 = new C670830z(userSession);
        this.A03 = new AnonymousClass311(userSession);
        this.A04 = new AnonymousClass312(userSession);
        this.A01 = C18U.A01(C06090Tz.A06, userSession, 36607638351517319L);
    }
}
