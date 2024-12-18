package X;

import com.instagram.api.schemas.AFI_TYPE;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.36E, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C36E implements InterfaceC43071ya, C36F {
    public long A00;
    public final long A01;
    public final long A02;
    public final C36L A03;
    public final UserSession A04;
    public final InterfaceC670430v A05;
    public final C64092vU A06;
    public final Map A07;
    public final Integer A08;

    public C36E(UserSession userSession, InterfaceC670430v interfaceC670430v, C64092vU c64092vU) {
        C14360o3.A0B(interfaceC670430v, 3);
        this.A06 = c64092vU;
        this.A04 = userSession;
        this.A05 = interfaceC670430v;
        this.A07 = new LinkedHashMap();
        C06090Tz c06090Tz = C06090Tz.A06;
        double A00 = C18U.A00(c06090Tz, userSession, 37159077792514140L);
        C36G c36g = C36G.A09;
        this.A01 = C36J.A03(C36H.A02(c36g, A00));
        this.A02 = C36J.A03(C36H.A02(c36g, C18U.A00(c06090Tz, userSession, 37159077792972893L)));
        Integer A002 = C36K.A00(C05F.A00, C18U.A04(C06090Tz.A05, userSession, 36889113328550731L));
        this.A08 = A002;
        this.A03 = new C36L(A002);
        this.A00 = -1L;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        long j;
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                this.A00 = -1L;
                this.A03.A00 = -1L;
                C64092vU c64092vU = this.A06;
                String id = ((C38321qM) c59062n7.A03).getId();
                if (id != null) {
                    C82383m1 A00 = c64092vU.A00(id);
                    A00.A04(interfaceC57162jr);
                    if (C18U.A06(C06090Tz.A05, this.A04, 36326163374683864L)) {
                        A00.A02();
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            A00(c59062n7, interfaceC57162jr, System.currentTimeMillis());
            C36L c36l = this.A03;
            C64092vU c64092vU2 = this.A06;
            c36l.A01(c59062n7, interfaceC57162jr, c64092vU2);
            C38321qM c38321qM = (C38321qM) c59062n7.A03;
            C75113Zb c75113Zb = (C75113Zb) c59062n7.A04;
            UserSession userSession = this.A04;
            if (C18U.A06(C06090Tz.A05, userSession, 36326163374683864L)) {
                if (c75113Zb.A2q || c75113Zb.getPosition() < 0) {
                    return;
                }
                long A002 = c36l.A00(c59062n7, interfaceC57162jr, c64092vU2);
                if (c38321qM.BRp() == EnumC40111tc.A0a) {
                    j = this.A02;
                } else {
                    j = this.A01;
                }
                if (A002 < j) {
                    return;
                }
                InterfaceC670430v interfaceC670430v = this.A05;
                Integer num = C05F.A0C;
                AFI_TYPE afi_type = AFI_TYPE.A05;
                if (!interfaceC670430v.Eiv(afi_type, c38321qM, num)) {
                    return;
                }
                interfaceC670430v.Cw2(afi_type, c38321qM, c75113Zb, num, c75113Zb.getPosition());
                return;
            }
            if (A01(c38321qM) || c75113Zb.A2q || c75113Zb.getPosition() < 0) {
                return;
            }
            InterfaceC670430v interfaceC670430v2 = this.A05;
            Integer num2 = C05F.A0C;
            AFI_TYPE afi_type2 = AFI_TYPE.A05;
            if (!interfaceC670430v2.Eiv(afi_type2, c38321qM, num2) || interfaceC57162jr.B0m(c59062n7) < this.A01) {
                return;
            }
            interfaceC670430v2.Cw2(afi_type2, c38321qM, c75113Zb, num2, c75113Zb.getPosition());
            long currentTimeMillis = System.currentTimeMillis();
            String A07 = AbstractC41071vF.A07(userSession, c38321qM);
            if (A07 != null) {
                this.A07.put(A07, Long.valueOf(currentTimeMillis));
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        A00(c59062n7, interfaceC57162jr, System.currentTimeMillis());
        C64092vU c64092vU3 = this.A06;
        String id2 = ((C38321qM) c59062n7.A03).getId();
        if (id2 != null) {
            C14360o3.A0A(c64092vU3.A00(id2));
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A00(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr, long j) {
        if (this.A00 == -1) {
            int intValue = this.A08.intValue();
            if (intValue != 0) {
                if (intValue != 1 && intValue != 2) {
                    throw new RuntimeException();
                }
                if (interfaceC57162jr.CFq(c59062n7) == C05F.A01) {
                    C64092vU c64092vU = this.A06;
                    String id = ((C38321qM) c59062n7.A03).getId();
                    if (id != null) {
                        if (c64092vU.A00(id).A01(interfaceC57162jr) <= 0) {
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    return;
                }
            } else if (interfaceC57162jr.CFq(c59062n7) != C05F.A00) {
                return;
            }
            this.A00 = j;
            this.A05.ETV(AFI_TYPE.A05, j);
        }
    }

    private final boolean A01(C38321qM c38321qM) {
        String A07 = AbstractC41071vF.A07(this.A04, c38321qM);
        if (A07 != null) {
            Number number = (Number) this.A07.get(A07);
            if (number != null && System.currentTimeMillis() < number.longValue() + 1800000) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.C36F
    public final boolean CT0(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        if (C18U.A06(C06090Tz.A05, this.A04, 36326163374683864L)) {
            return this.A05.Eiv(AFI_TYPE.A05, (C38321qM) c59062n7.A03, C05F.A0C);
        }
        C38321qM c38321qM = (C38321qM) c59062n7.A03;
        if (!A01(c38321qM)) {
            if (this.A05.Eiv(AFI_TYPE.A05, c38321qM, C05F.A0C)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
