package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5x2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC131665x2 {
    public static final C62792tI A00(C6FG c6fg) {
        C1BX A02;
        UserSession userSession;
        AbstractC12990ll A0A = C6BQ.A0A(c6fg);
        if ((A0A instanceof UserSession) && (userSession = (UserSession) A0A) != null) {
            A02 = C62732tC.A00(userSession).A00;
        } else {
            A02 = C1BX.A03.A02("bloks_no_session");
        }
        C14360o3.A0A(A02);
        return C62792tI.A00(A02);
    }
}
