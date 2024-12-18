package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Kjx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46620Kjx {
    public static final LA9 A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        LA9 la9 = (LA9) userSession.A00(LA9.class);
        if (la9 == null) {
            LA9 la92 = new LA9(AbstractC12220kQ.A02(userSession));
            userSession.A04(LA9.class, la92);
            return la92;
        }
        return la9;
    }
}
