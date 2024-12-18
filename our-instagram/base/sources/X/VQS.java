package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public abstract class VQS {
    public static final Float A00(C6FQ c6fq, C6FW c6fw) {
        UserSession userSession;
        String A0d = AbstractC31177DnL.A0d(c6fw);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        if ((A0B instanceof UserSession) && (userSession = (UserSession) A0B) != null) {
            return Float.valueOf(C1AT.A01(userSession).A03(C1AV.A3X).getFloat(A0d, 0.0f));
        }
        throw new IllegalArgumentException(AbstractC111324zv.A00(25));
    }
}
