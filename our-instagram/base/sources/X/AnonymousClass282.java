package X;

import com.google.gson.Gson;
import com.instagram.api.schemas.ScreenTimeScreenType;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.282, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass282 {
    public static final C5F2 A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        InterfaceC223716s C45 = C08730cb.A00(userSession).A00().A03.C45();
        if (C45 == null) {
            return null;
        }
        return C45.BMG();
    }

    public static final boolean A02(UserSession userSession) {
        Boolean CbT;
        InterfaceC223716s C45 = C17060sy.A01.A01(userSession).A03.C45();
        if (C45 == null || (CbT = C45.CbT()) == null) {
            return false;
        }
        return CbT.booleanValue();
    }

    public final synchronized InterfaceC19630xq A06(UserSession userSession) {
        return ((AnonymousClass280) userSession.A01(AnonymousClass280.class, new C9EQ(userSession, 22))).A00;
    }

    public final String A08(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        String string = A06(userSession).getString("TAB_REMINDER_TYPE", "");
        if (string == null) {
            return "";
        }
        return string;
    }

    public final void A09(UserSession userSession, long j) {
        C14360o3.A0B(userSession, 0);
        InterfaceC19610xo ARD = A06(userSession).ARD();
        List list = AnonymousClass280.A02;
        ARD.E7G("DAILY_LIMIT_REMIND_AGAIN_NEXT_START_TIME_IN_SECONDS", j);
        ARD.apply();
    }

    public final void A0A(UserSession userSession, EnumC456327x enumC456327x, long j) {
        C14360o3.A0B(userSession, 0);
        InterfaceC19610xo ARD = A06(userSession).ARD();
        StringBuilder sb = new StringBuilder();
        sb.append("TIME_SPENT_REMINDER_LAST_SEEN_TIMESTAMP_IN_SECONDS_");
        sb.append(enumC456327x);
        ARD.E7G(sb.toString(), j);
        ARD.apply();
    }

    public final void A0B(UserSession userSession, C35148Feq c35148Feq, String str) {
        C14360o3.A0B(str, 1);
        String A0B = new Gson().A0B(c35148Feq);
        InterfaceC19610xo ARD = A06(userSession).ARD();
        ARD.E7K(AnonymousClass001.A0R("SCREEN_TIME_BY_SCREEN_", str), A0B);
        ARD.apply();
    }

    public final boolean A0C(UserSession userSession) {
        Integer Bqo;
        int intValue;
        C14360o3.A0B(userSession, 0);
        InterfaceC223716s C45 = C08730cb.A00(userSession).A00().A03.C45();
        if (C45 != null && (Bqo = C45.Bqo()) != null && (intValue = Bqo.intValue()) >= 0 && intValue > 0) {
            return true;
        }
        return false;
    }

    public static final List A01(UserSession userSession) {
        List Bjn;
        InterfaceC223716s C45 = C17060sy.A01.A01(userSession).A03.C45();
        if (C45 == null || (Bjn = C45.Bjn()) == null || Bjn.isEmpty()) {
            return null;
        }
        return Bjn;
    }

    public final long A04(UserSession userSession) {
        long j = 0;
        for (ScreenTimeScreenType screenTimeScreenType : AnonymousClass280.A02) {
            String obj = screenTimeScreenType.toString();
            C14360o3.A0B(obj, 1);
            j = j + A06(userSession).getLong(AnonymousClass001.A0R("AGGREGATED_SCREEN_TIME_BY_SCREEN_", obj), 0L) + A03(screenTimeScreenType, userSession);
        }
        return j;
    }

    public final C35148Feq A07(UserSession userSession, String str) {
        C14360o3.A0B(str, 1);
        C35148Feq c35148Feq = new C35148Feq(str, 0L, 0L);
        String string = A06(userSession).getString(AnonymousClass001.A0R("SCREEN_TIME_BY_SCREEN_", str), "");
        if (string != null && string.length() != 0) {
            try {
                return (C35148Feq) new Gson().A08(string, c35148Feq.getClass());
            } catch (C90063zm | IllegalStateException unused) {
                C0w9.A03("TimeSpentPreferences", "Corrupted Time Spent By Screen Data");
            }
        }
        return null;
    }

    public final long A03(ScreenTimeScreenType screenTimeScreenType, UserSession userSession) {
        long j;
        long j2;
        C35148Feq A07 = A07(userSession, screenTimeScreenType.toString());
        if (A07 == null) {
            return 0L;
        }
        if (C14360o3.A0K(A07.A03, C35148Feq.A00().getTime())) {
            j = A07.A00;
        } else {
            j = 0;
        }
        long A02 = j - A07.A02();
        if (C14360o3.A0K(A07.A04, C35148Feq.A00().getTime())) {
            j2 = A07.A02;
        } else {
            j2 = 0;
        }
        return j2 + A02;
    }

    public final long A05(UserSession userSession, EnumC456327x enumC456327x) {
        InterfaceC19630xq A06 = A06(userSession);
        StringBuilder sb = new StringBuilder();
        sb.append("TIME_SPENT_REMINDER_LAST_SEEN_TIMESTAMP_IN_SECONDS_");
        sb.append(enumC456327x);
        long j = A06.getLong(sb.toString(), 0L);
        if (j < 0) {
            return 0L;
        }
        return j;
    }
}
