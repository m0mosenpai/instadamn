package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5MN, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5MN {
    public static String A00(UserSession userSession, C38321qM c38321qM) {
        String A2W;
        if ((C18U.A06(C06090Tz.A05, userSession, 36312866155922778L) || AbstractC61652rS.A08(userSession, AbstractC23021Ah.A00(userSession))) && c38321qM.A2W() != null) {
            A2W = c38321qM.A2W();
        } else {
            A2W = c38321qM.getId();
        }
        if (A2W != null) {
            return A2W;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
