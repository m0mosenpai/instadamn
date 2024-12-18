package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.7DE, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7DE {
    public static final boolean A00(UserSession userSession, C2EE c2ee) {
        AnonymousClass177 anonymousClass177;
        List BSH = c2ee.BSH();
        if (!c2ee.CVQ() && (anonymousClass177 = (AnonymousClass177) AbstractC001800i.A0J(BSH)) != null && anonymousClass177.Cey() && C18U.A06(C06090Tz.A05, userSession, 2342153453008060524L)) {
            return true;
        }
        return false;
    }
}
