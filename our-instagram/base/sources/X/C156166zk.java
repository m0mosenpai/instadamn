package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6zk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156166zk implements InterfaceC13000lm {
    public static final C156176zl A02 = new Object();
    public final UserSession A00;
    public final Map A01 = new LinkedHashMap();

    public static final Integer A00(C156166zk c156166zk) {
        UserSession userSession = c156166zk.A00;
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36319978622754691L)) {
            return Integer.valueOf((int) C18U.A01(c06090Tz, userSession, 36601453599199450L));
        }
        return null;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.clear();
    }

    public C156166zk(UserSession userSession) {
        this.A00 = userSession;
    }
}
