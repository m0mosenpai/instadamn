package X;

import com.instagram.api.schemas.AFI_TYPE;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ipv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42394Ipv implements InterfaceC43071ya, C36F {
    public final long A00;
    public final InterfaceC670430v A01;
    public final UserSession A02;
    public final C64092vU A03;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        boolean A1R = AbstractC167007dF.A1R(0, c59062n7, interfaceC57162jr);
        int A01 = AbstractC37301Gc2.A01(c59062n7, interfaceC57162jr);
        if (A01 != 0) {
            if (A01 != A1R) {
                C64092vU c64092vU = this.A03;
                String A0V = AbstractC37300Gc1.A0V(c59062n7.A03);
                if (A0V != null) {
                    c64092vU.A00(A0V).A04(interfaceC57162jr);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            if (interfaceC57162jr.B0m(c59062n7) < this.A00) {
                return;
            }
            C38321qM c38321qM = (C38321qM) c59062n7.A03;
            C75113Zb c75113Zb = (C75113Zb) c59062n7.A04;
            InterfaceC670430v interfaceC670430v = this.A01;
            Integer num = C05F.A0C;
            AFI_TYPE afi_type = AFI_TYPE.A04;
            if (!interfaceC670430v.Eiv(afi_type, c38321qM, num)) {
                return;
            }
            C14360o3.A0A(c75113Zb);
            interfaceC670430v.Cw2(afi_type, c38321qM, c75113Zb, num, c75113Zb.getPosition());
            return;
        }
        C64092vU c64092vU2 = this.A03;
        String A0V2 = AbstractC37300Gc1.A0V(c59062n7.A03);
        if (A0V2 != null) {
            c64092vU2.A00(A0V2);
            this.A01.ETV(AFI_TYPE.A04, System.currentTimeMillis());
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.C36F
    public final boolean CT0(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        return this.A01.Eiv(AFI_TYPE.A04, (C38321qM) c59062n7.A03, C05F.A0C);
    }

    public C42394Ipv(UserSession userSession, InterfaceC670430v interfaceC670430v, C64092vU c64092vU) {
        this.A03 = c64092vU;
        this.A02 = userSession;
        this.A01 = interfaceC670430v;
        this.A00 = (long) (C18U.A00(C06090Tz.A06, userSession, 37173062205964882L) * 1000.0d);
    }
}
