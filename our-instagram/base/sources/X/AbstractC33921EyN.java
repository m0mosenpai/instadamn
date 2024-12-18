package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.EyN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33921EyN {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        if (!(A0B instanceof UserSession)) {
            return null;
        }
        UserSession userSession = (UserSession) A0B;
        FragmentActivity A04 = C6BQ.A04(c6fq);
        String obj = c6fw.A01().toString();
        C31456Ds0 c31456Ds0 = new C31456Ds0(2, c6fq, AbstractC31175DnJ.A0G(c6fw));
        User A0k = AbstractC31174DnI.A0k(userSession, obj);
        if (A0k != null) {
            AbstractC35271Fh6.A00(A04, null, c31456Ds0, userSession, null, null, A0k);
            return null;
        }
        C4LM.A02.A02(userSession, new GIM(A04, c31456Ds0, userSession), obj);
        return null;
    }
}
