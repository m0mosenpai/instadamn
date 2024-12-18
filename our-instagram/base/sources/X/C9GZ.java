package X;

import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;

/* renamed from: X.9GZ, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9GZ {
    public static final C207479Ga A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (Systrace.A0E(1L)) {
            C0fO.A01("ReelTrayPogUserCache.getInstance", 1714652671);
        }
        try {
            C207479Ga c207479Ga = (C207479Ga) userSession.A01(C207479Ga.class, new C57527Pg1(userSession, 5));
            if (Systrace.A0E(1L)) {
                C0fO.A00(935096647);
            }
            return c207479Ga;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-2044296095);
            }
            throw th;
        }
    }
}
