package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public abstract class MUK {
    public static final JTE A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (JTE) userSession.A01(JTE.class, new C57518Pfs(userSession, 15));
    }

    public static final C36272FzP A02(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (C36272FzP) userSession.A01(C36272FzP.class, MUn.A00);
    }

    public static final Fragment A00(UserSession userSession, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Fragment c26777Bry;
        C09530e4[] c09530e4Arr;
        C06090Tz A0U = AbstractC166997dE.A0U(userSession);
        if (C18U.A06(A0U, userSession, 36316340784468246L) || ("newsfeed_you".equals(str) && C18U.A06(A0U, userSession, 36316340785123607L))) {
            c26777Bry = new C26777Bry();
            c09530e4Arr = new C09530e4[]{AbstractC166987dD.A1L("ARG_ALLOW_TRUNCATE_FOLLOW_REQUESTS", Boolean.valueOf(z)), AbstractC166987dD.A1L("ARG_HIDE_APPROVE_BUTTON", Boolean.valueOf(z3)), AbstractC166987dD.A1L("ARG_SHOW_PRIVATE_TO_PUBLIC_HEADER", Boolean.valueOf(z4)), AbstractC166987dD.A1L("ARG_SHOW_SUGGESTED_USERS", Boolean.valueOf(z2))};
        } else {
            c26777Bry = new C26872BtZ();
            c09530e4Arr = new C09530e4[]{AbstractC166987dD.A1L("ARG_ALLOW_TRUNCATE_FOLLOW_REQUESTS", Boolean.valueOf(z)), AbstractC166987dD.A1L("ARG_HIDE_APPROVE_BUTTON", Boolean.valueOf(z3)), AbstractC166987dD.A1L("ARG_SHOW_PRIVATE_TO_PUBLIC_HEADER", Boolean.valueOf(z4)), AbstractC166987dD.A1L("ARG_SHOW_SUGGESTED_USERS", Boolean.valueOf(z2)), AbstractC166987dD.A1L("ARG_SHOW_OVERFLOW_MENU", Boolean.valueOf(z5))};
        }
        AbstractC25227BEk.A1C(c26777Bry, c09530e4Arr);
        return c26777Bry;
    }
}
