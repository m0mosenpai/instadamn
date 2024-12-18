package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.EyP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33923EyP {
    public static final String A00(C6FQ c6fq, C6FW c6fw) {
        UserSession userSession;
        String A0d = AbstractC31177DnL.A0d(c6fw);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        if ((A0B instanceof UserSession) && (userSession = (UserSession) A0B) != null) {
            return C1AT.A01(userSession).A03(C1AV.A3X).getString(A0d, null);
        }
        throw AbstractC166987dD.A12(AbstractC111324zv.A00(25));
    }
}
