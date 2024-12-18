package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1AR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1AR {
    public static C1AS A00;
    public static final C1AR A01 = new Object();

    public static final C1AS A01(UserSession userSession) {
        return (C1AS) userSession.A01(C1AS.class, new C9EO(userSession, 2));
    }

    public static final C1AS A00() {
        C1AS c1as = A00;
        if (c1as == null) {
            C1AS c1as2 = new C1AS(new C1AZ(AbstractC19750y3.A01("mobile_config_device_scoped_test_cache")));
            A00 = c1as2;
            return c1as2;
        }
        return c1as;
    }
}
