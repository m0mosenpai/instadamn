package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class ABG {
    public final UserSession A00;
    public final A8W A01;

    public final float A00(String str) {
        ConcurrentHashMap concurrentHashMap = this.A01.A02;
        if (AbstractC167007dF.A1M(concurrentHashMap.isEmpty() ? 1 : 0)) {
            return 0.0f;
        }
        return AbstractC166987dD.A09(concurrentHashMap.getOrDefault(str, Float.valueOf(0.0f)));
    }

    public ABG(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = (A8W) userSession.A01(A8W.class, new C57510Pfk(userSession, 37));
    }
}
