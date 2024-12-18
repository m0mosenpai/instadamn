package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public abstract class F09 {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        String obj = c6fw.A01().toString();
        InterfaceC103384lE A0G = AbstractC31175DnJ.A0G(c6fw);
        InterfaceC103384lE A0H = AbstractC31175DnJ.A0H(c6fw);
        String A0i = AbstractC31180DnO.A0i(c6fw, 3);
        if (A0i == null) {
            A0i = C6BQ.A08(c6fq).getModuleName();
        }
        UserSession A0K = AbstractC31179DnN.A0K(c6fq);
        User A0k = AbstractC31174DnI.A0k(A0K, obj);
        if (A0k != null) {
            AbstractC35261Fgv.A05(C6BQ.A04(c6fq), c6fq, A0G, A0H, A0K, AbstractC70200WGp.A06(C6BQ.A09(c6fq)), A0k, EnumC33371Ep4.A08, A0i);
            return null;
        }
        C4LM.A02.A02(A0K, new GIN(c6fq, A0G, A0H, A0K, A0i, 1), obj);
        return null;
    }
}
