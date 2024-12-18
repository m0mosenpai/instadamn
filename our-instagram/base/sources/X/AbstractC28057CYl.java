package X;

import com.instagram.common.session.UserSession;
import com.instagram.foa.session.IgMetaSessionImpl;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.CYl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28057CYl {
    public static final UserSession A00(FoaUserSession foaUserSession) {
        C14360o3.A0B(foaUserSession, 0);
        AbstractC12990ll abstractC12990ll = ((IgMetaSessionImpl) foaUserSession).A00;
        if (abstractC12990ll instanceof UserSession) {
            return (UserSession) abstractC12990ll;
        }
        throw AbstractC166987dD.A14("Requesting logged in session, when a user is logged out");
    }

    public static final IgMetaSessionImpl A01(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 0);
        return new IgMetaSessionImpl(abstractC12990ll);
    }
}
