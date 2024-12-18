package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6l5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC147806l5 {
    public static final C142846ck A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (C142846ck) userSession.A01(C142846ck.class, new C9EW(userSession, 18));
    }

    public static final String A01(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue != 0 && intValue != 1) {
                if (intValue == 2) {
                    return "subscriber_broadcast";
                }
                return "instagram";
            }
            return "broadcast";
        }
        return "instagram";
    }
}
