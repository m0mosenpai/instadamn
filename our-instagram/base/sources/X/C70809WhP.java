package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.WhP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70809WhP implements InterfaceC13000lm {
    public final Map A00 = new HashMap();

    public static C70809WhP A00(UserSession userSession) {
        return (C70809WhP) userSession.A01(C70809WhP.class, new C65881Tvk(5));
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.clear();
    }
}
