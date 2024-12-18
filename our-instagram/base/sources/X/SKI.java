package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes10.dex */
public final class SKI {
    public final UserSession A00;

    public SKI(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final C09530e4 A00(EnumC61108RfO enumC61108RfO) {
        UserSession userSession;
        C06090Tz c06090Tz;
        String A04;
        long j;
        C14360o3.A0B(enumC61108RfO, 0);
        int ordinal = enumC61108RfO.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    userSession = this.A00;
                    c06090Tz = C06090Tz.A05;
                    A04 = C18U.A04(c06090Tz, userSession, 36887584319931146L);
                    j = 36887584320258831L;
                } else {
                    throw B4Z.A00();
                }
            } else {
                userSession = this.A00;
                c06090Tz = C06090Tz.A05;
                A04 = C18U.A04(c06090Tz, userSession, 36887584319996683L);
                j = 36887584320193294L;
            }
        } else {
            userSession = this.A00;
            c06090Tz = C06090Tz.A05;
            A04 = C18U.A04(c06090Tz, userSession, 36887584319865609L);
            j = 36887584320127757L;
        }
        return AbstractC166987dD.A1L(A04, C18U.A04(c06090Tz, userSession, j));
    }
}
