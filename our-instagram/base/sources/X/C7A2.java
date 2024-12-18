package X;

import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.7A2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7A2 {
    public final UserSession A00;
    public final Map A01 = new LinkedHashMap();

    public static final boolean A00(C7A2 c7a2, JUe jUe) {
        C47Z A03;
        if (!jUe.A0G) {
            return false;
        }
        UserSession userSession = c7a2.A00;
        C7Q4 c7q4 = jUe.A06.A0F;
        String str = null;
        if (c7q4 != null) {
            str = c7q4.A06;
        }
        PendingMediaStore A00 = C25A.A00(userSession);
        if (str == null || (A03 = A00.A03(str)) == null || !AbstractC210079Qv.A00(A03) || !C18U.A06(C06090Tz.A05, userSession, 36323560624696681L)) {
            return false;
        }
        return true;
    }

    public C7A2(UserSession userSession) {
        this.A00 = userSession;
    }
}
