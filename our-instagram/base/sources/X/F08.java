package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public abstract class F08 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type kotlin.Number");
        String A19 = AbstractC166987dD.A19(A01);
        InterfaceC103384lE A0G = AbstractC31175DnJ.A0G(c6fw);
        InterfaceC103384lE A0H = AbstractC31175DnJ.A0H(c6fw);
        String A0e = AbstractC31177DnL.A0e(c6fw, 3);
        UserSession A0K = AbstractC31179DnN.A0K(c6fq);
        C33281Enc c33281Enc = new C33281Enc(c6fq, A0G, A0H);
        User A0k = AbstractC31174DnI.A0k(A0K, A19);
        if (A0k != null) {
            AbstractC35261Fgv.A06(C6BQ.A04(c6fq), A0K, AbstractC70200WGp.A06(C6BQ.A09(c6fq)), A0k, c33281Enc, A0e);
            return null;
        }
        C4LM.A02.A02(A0K, new GIN(c33281Enc, A0H, c6fq, A0K, A0e, 0), A19);
        return null;
    }
}
