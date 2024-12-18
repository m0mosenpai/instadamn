package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class INI {
    public final boolean A00(UserSession userSession, C38321qM c38321qM) {
        InterfaceC39541sb A0F;
        if (IBN.A00.A04(c38321qM).size() > 1) {
            return false;
        }
        if ((c38321qM.CdW() || AbstractC37301Gc2.A1Z(userSession, c38321qM)) && (A0F = AbstractC37300Gc1.A0F(c38321qM)) != null && AbstractC166997dE.A1Z(A0F.CQW(), true)) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36316512583225816L) && C18U.A06(c06090Tz, userSession, 36316512583225816L) && C18U.A06(c06090Tz, userSession, 36316512583422425L)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A01(UserSession userSession, C38321qM c38321qM) {
        InterfaceC39541sb A0F;
        if (IBN.A00.A04(c38321qM).size() > 1) {
            return false;
        }
        if ((c38321qM.CdW() || AbstractC37301Gc2.A1Z(userSession, c38321qM)) && (A0F = AbstractC37300Gc1.A0F(c38321qM)) != null && AbstractC166997dE.A1Z(A0F.CdF(), true)) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36316512583160279L) && C18U.A06(c06090Tz, userSession, 36316512583619034L)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A02(UserSession userSession, C38321qM c38321qM) {
        InterfaceC39541sb A0F;
        C14360o3.A0B(userSession, 0);
        if (c38321qM != null) {
            if (IBN.A00.A04(c38321qM).size() > 1) {
                return false;
            }
            if ((c38321qM.CdW() || AbstractC37301Gc2.A1Z(userSession, c38321qM)) && ((A0F = AbstractC37300Gc1.A0F(c38321qM)) == null || !AbstractC166997dE.A1Z(A0F.CdF(), true) || !C18U.A06(C06090Tz.A05, userSession, 36316512583160279L))) {
                InterfaceC39541sb A0F2 = AbstractC37300Gc1.A0F(c38321qM);
                if (A0F2 != null && AbstractC166997dE.A1Z(A0F2.CQW(), true) && C18U.A06(C06090Tz.A05, userSession, 36316512583225816L)) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }
}
