package X;

import com.instagram.common.session.UserSession;
import java.io.File;

/* loaded from: classes9.dex */
public final class OK1 {
    public final File A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        File A0w = MSW.A0w(AbstractC23881Ey.A00().AXd(null, 861573803), AnonymousClass001.A0R(C18U.A04(C06090Tz.A05, userSession, 36878509054099647L), "_shared"));
        if (!A0w.exists()) {
            A0w.mkdirs();
        }
        return A0w;
    }

    public final File A00(UserSession userSession) {
        File A0w = MSW.A0w(AbstractC23881Ey.A00().AXd(null, 861573803), AnonymousClass001.A0T(C18U.A04(C06090Tz.A06, userSession, 36878509054099647L), userSession.userId, '_'));
        if (!A0w.exists()) {
            A0w.mkdirs();
        }
        return A0w;
    }
}
