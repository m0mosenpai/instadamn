package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ezl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34006Ezl {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        UserSession userSession;
        Object A01 = c6fw.A01();
        String A0f = AbstractC31171DnF.A0f(A01);
        String str = (String) A01;
        String A0Z = AbstractC31175DnJ.A0Z(c6fw, A0f);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        if ((A0B instanceof UserSession) && (userSession = (UserSession) A0B) != null) {
            AbstractC31176DnK.A1X(C1AT.A01(userSession).A03(C1AV.A3X), str, A0Z);
            return null;
        }
        throw AbstractC166987dD.A12(AbstractC111324zv.A00(25));
    }
}
