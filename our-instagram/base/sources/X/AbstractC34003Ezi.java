package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ezi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34003Ezi {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        UserSession userSession;
        String A0d = AbstractC31177DnL.A0d(c6fw);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        if ((A0B instanceof UserSession) && (userSession = (UserSession) A0B) != null) {
            InterfaceC19610xo A0c = AbstractC31173DnH.A0c(C1AT.A01(userSession), C1AV.A3X);
            A0c.EEj(A0d);
            A0c.apply();
            return null;
        }
        throw AbstractC166987dD.A12(AbstractC111324zv.A00(25));
    }
}
