package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Nz4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54284Nz4 {
    public static final void A00(UserSession userSession, String str) {
        User A0Y;
        C14360o3.A0B(userSession, 0);
        C18A A00 = AnonymousClass189.A00(userSession);
        if (str != null) {
            A0Y = A00.A02(str);
        } else {
            A0Y = AbstractC166997dE.A0Y(userSession);
        }
        if (A0Y != null) {
            C1ON A002 = AbstractC54283Nz3.A00(userSession);
            MWM.A00(A002, A0Y, A00, 22);
            C1GJ.A03(A002);
        }
    }
}
