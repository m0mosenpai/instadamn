package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.models.NoteAudience;

/* renamed from: X.6Db, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC135966Db {
    public static final C135976Dc A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (C135976Dc) userSession.A01(C135976Dc.class, new C206869Dr(userSession, 14));
    }

    public static final JZB A00(NoteAudience noteAudience) {
        int ordinal = noteAudience.ordinal();
        if (ordinal != 2) {
            if (ordinal != 4) {
                if (ordinal != 1) {
                    return null;
                }
                return JZB.MUTUAL_FOLLOWERS;
            }
            return JZB.ALL_FOLLOWERS;
        }
        return JZB.CLOSE_FRIENDS;
    }
}
