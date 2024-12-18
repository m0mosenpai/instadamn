package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ipe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42377Ipe implements InterfaceC43071ya {
    public final C674932o A00;
    public final C81063jb A01;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        int min;
        C38321qM A1e;
        boolean A1R = AbstractC167007dF.A1R(0, c59062n7, interfaceC57162jr);
        C38321qM c38321qM = (C38321qM) c59062n7.A03;
        C75113Zb c75113Zb = (C75113Zb) c59062n7.A04;
        float CGk = interfaceC57162jr.CGk(c59062n7);
        Integer CFq = interfaceC57162jr.CFq(c59062n7);
        Integer num = C05F.A00;
        boolean A1X = AbstractC167007dF.A1X(CFq, num);
        C81063jb c81063jb = this.A01;
        if (c81063jb.A08(c38321qM, A1X) == A1R && c75113Zb.A3A && !c75113Zb.A2b) {
            C14360o3.A0A(c38321qM);
            C14360o3.A0B(c38321qM, 0);
            String id = c38321qM.getId();
            if (id != null) {
                c81063jb.A05 = c38321qM;
                c81063jb.A07 = id;
                c81063jb.A0N.put(id, AbstractC166987dD.A1L(c38321qM, c75113Zb));
                C38321qM c38321qM2 = c38321qM;
                if (c38321qM.Cff() || (c38321qM.A5M() && (A1e = c38321qM.A1e(0)) != null && A1e.Cff() == A1R && (c38321qM2 = c38321qM.A1e(0)) != null)) {
                    UserSession userSession = c81063jb.A0I;
                    C14360o3.A0B(userSession, 0);
                    min = Math.min((int) Math.ceil(((float) c38321qM2.A1C()) / 1000.0f), AbstractC25225BEi.A07(C06090Tz.A06, userSession, 36606251077801357L));
                } else {
                    UserSession userSession2 = c81063jb.A0I;
                    C14360o3.A0B(userSession2, 0);
                    min = AbstractC25225BEi.A07(C06090Tz.A06, userSession2, 36606251077735820L);
                }
                c81063jb.A02 = min;
            }
            if (CGk >= 0.25f) {
                String id2 = c38321qM.getId();
                if (id2 != null) {
                    EnumC39544HdG enumC39544HdG = (EnumC39544HdG) c81063jb.A0O.get(id2);
                    if (enumC39544HdG == null) {
                        enumC39544HdG = EnumC39544HdG.A02;
                    }
                    int ordinal = enumC39544HdG.ordinal();
                    if (ordinal != 3) {
                        if (ordinal == 2 || ordinal == 0) {
                            C81063jb.A01(c81063jb, id2, false);
                        }
                    } else {
                        if (c81063jb.A01 == c81063jb.A02) {
                            c81063jb.A0L.A02();
                            AbstractC39681HjD.A00 = false;
                            C81063jb.A00(c81063jb, num, "unknown");
                        }
                        c81063jb.A08 = false;
                        c81063jb.A0C = false;
                        c81063jb.A0D = false;
                        C81063jb.A01(c81063jb, id2, false);
                        c75113Zb.A2r = A1R;
                        c81063jb.A0M.A00.get(id2);
                    }
                }
            } else {
                c81063jb.A07(A1R);
            }
            C674932o c674932o = this.A00;
            if (c674932o.A00()) {
                if (CGk >= ((float) C18U.A00(C06090Tz.A06, c674932o.A00, 37169201034494444L))) {
                    c81063jb.A04();
                    return;
                }
                return;
            }
            return;
        }
        if (c38321qM == null || c38321qM.CdW() != A1R) {
            return;
        }
        c75113Zb.A2b = A1R;
    }

    public C42377Ipe(C674932o c674932o, C81063jb c81063jb) {
        this.A01 = c81063jb;
        this.A00 = c674932o;
    }
}
