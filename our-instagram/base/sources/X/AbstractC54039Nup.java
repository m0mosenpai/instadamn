package X;

import com.instagram.common.session.UserSession;
import com.instagram.inappbrowser.helper.BrowserLinkshimUrlCache;

/* renamed from: X.Nup, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54039Nup {
    public static final BrowserLinkshimUrlCache A00(UserSession userSession) {
        return (BrowserLinkshimUrlCache) userSession.A01(BrowserLinkshimUrlCache.class, new C57551PgP(userSession, 33));
    }
}
