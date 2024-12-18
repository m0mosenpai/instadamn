package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.32m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C674732m {
    public C38321qM A00;
    public boolean A01;
    public final UserSession A02;
    public final C674832n A03;
    public final C675032p A04;
    public final C674932o A05;

    public C674732m(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A03 = new C674832n(userSession);
        this.A05 = new C674932o(userSession);
        this.A04 = new C675032p(userSession);
        this.A01 = true;
    }

    public final Boolean A01(C38321qM c38321qM) {
        String id = c38321qM.getId();
        UserSession userSession = this.A02;
        if (id == null) {
            return false;
        }
        C25985BeZ c25985BeZ = (C25985BeZ) CKI.A00(userSession).A00.get(id);
        if (c25985BeZ != null) {
            return c25985BeZ.A00;
        }
        return null;
    }

    public final void A02() {
        C23031Ai A00 = AbstractC23021Ah.A00(this.A03.A02);
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC19610xo ARD = A00.A01.ARD();
        ARD.E7G("delayed_skip_display_time_stamp", currentTimeMillis);
        ARD.apply();
    }

    public final boolean A03() {
        UserSession userSession = this.A02;
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C18U.A06(c06090Tz, userSession, 36324776101556685L) && C18U.A06(c06090Tz, this.A05.A00, 36324776100245962L)) {
            return true;
        }
        return false;
    }

    public final boolean A04() {
        UserSession userSession = this.A02;
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C18U.A06(c06090Tz, userSession, 36324776101556685L) && C18U.A06(c06090Tz, userSession, 36324776100311499L)) {
            return true;
        }
        return false;
    }

    public final boolean A05(C38321qM c38321qM) {
        InterfaceC39541sb injected;
        if (C18U.A06(C06090Tz.A06, this.A02, 36324776101687758L)) {
            if (c38321qM == null || (injected = c38321qM.A0C.getInjected()) == null) {
                return false;
            }
            return C14360o3.A0K(injected.CSS(), true);
        }
        if (c38321qM != null && c38321qM.CdW() && !c38321qM.A67() && !c38321qM.A5v() && !c38321qM.A5m() && !c38321qM.A5w()) {
            return true;
        }
        return false;
    }

    public final boolean A06(C38321qM c38321qM) {
        InterfaceC39541sb injected;
        String AZE;
        if (C18U.A06(C06090Tz.A06, this.A02, 36324776104702425L)) {
            return false;
        }
        UserSession userSession = this.A03.A02;
        long j = AbstractC23021Ah.A00(userSession).A01.getLong(AbstractC111324zv.A00(463), 0L);
        long j2 = AbstractC23021Ah.A00(userSession).A01.getLong("delayed_skip_display_time_stamp", 0L);
        String str = AbstractC39681HjD.A01;
        boolean z = true;
        if (str != null && (c38321qM == null || (injected = c38321qM.A0C.getInjected()) == null || (AZE = injected.AZE()) == null || !AZE.equals(str))) {
            z = false;
        }
        if (z || AbstractC39681HjD.A00 || j2 == 0 || j2 <= j) {
            return false;
        }
        return true;
    }

    public final int A00(C41181vS c41181vS) {
        if (c41181vS.A1o()) {
            C38321qM c38321qM = c41181vS.A0b;
            c38321qM.getClass();
            return Math.min((int) AbstractC130925vf.A00(c38321qM), (int) C18U.A01(C06090Tz.A06, this.A02, 36606251077801357L));
        }
        return (int) C18U.A01(C06090Tz.A06, this.A02, 36606251077735820L);
    }

    public final boolean A07(C38321qM c38321qM) {
        String str;
        InterfaceC39541sb injected;
        if (A04()) {
            if (A05(c38321qM)) {
                boolean A01 = this.A03.A01();
                boolean A06 = A06(c38321qM);
                if (!A01 && !A06) {
                    if (this.A01) {
                        AbstractC39681HjD.A02 = false;
                        AbstractC39681HjD.A03 = false;
                        this.A01 = false;
                    }
                    if (c38321qM != null && (injected = c38321qM.A0C.getInjected()) != null) {
                        str = injected.AZE();
                    } else {
                        str = null;
                    }
                    AbstractC39681HjD.A01 = str;
                    return true;
                }
                if (this.A01) {
                    AbstractC39681HjD.A02 = A01;
                    AbstractC39681HjD.A03 = A06;
                    this.A01 = false;
                    return false;
                }
            } else {
                this.A01 = true;
            }
        }
        return false;
    }
}
