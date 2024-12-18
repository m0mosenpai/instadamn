package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.36M, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C36M implements InterfaceC43071ya, C36F {
    public final long A00;
    public final C36L A01;
    public final UserSession A02;
    public final C64092vU A03;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                this.A01.A00 = -1L;
                C64092vU c64092vU = this.A03;
                String id = ((C38321qM) c59062n7.A03).getId();
                if (id != null) {
                    c64092vU.A00(id).A04(interfaceC57162jr);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            C36L c36l = this.A01;
            C64092vU c64092vU2 = this.A03;
            c36l.A01(c59062n7, interfaceC57162jr, c64092vU2);
            long j = this.A00;
            if (j <= 0 || c36l.A00(c59062n7, interfaceC57162jr, c64092vU2) < j) {
                return;
            }
        } else {
            C64092vU c64092vU3 = this.A03;
            String id2 = ((C38321qM) c59062n7.A03).getId();
            if (id2 != null) {
                c64092vU3.A00(id2);
                if (this.A00 > 0) {
                    return;
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        C75113Zb c75113Zb = (C75113Zb) c59062n7.A04;
        if (c75113Zb.A2q || c75113Zb.getPosition() < 0) {
            return;
        }
        C38321qM c38321qM = (C38321qM) c59062n7.A03;
        AnonymousClass310 A00 = CCV.A00(this.A02);
        if (!A00.Eio(c38321qM)) {
            return;
        }
        A00.COU(c38321qM, C05F.A0C, c75113Zb.getPosition());
    }

    @Override // X.C36F
    public final boolean CT0(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        UserSession userSession = this.A02;
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36323457545284885L);
        C14360o3.A0A(Boolean.valueOf(A06));
        if (A06 && CCV.A00(userSession).Eio((C38321qM) c59062n7.A03)) {
            return true;
        }
        return false;
    }

    public C36M(UserSession userSession, C64092vU c64092vU) {
        this.A03 = c64092vU;
        this.A02 = userSession;
        this.A00 = C36J.A03(C36H.A02(C36G.A09, C18U.A00(C06090Tz.A06, userSession, 37167882475733450L)));
        this.A01 = new C36L(C36K.A00(C05F.A00, C18U.A04(C06090Tz.A05, userSession, 36889113328550731L)));
    }
}
