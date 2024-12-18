package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public abstract class F0A {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type kotlin.Number");
        String A19 = AbstractC166987dD.A19(A01);
        InterfaceC103384lE A0G = AbstractC31175DnJ.A0G(c6fw);
        InterfaceC103384lE A0H = AbstractC31175DnJ.A0H(c6fw);
        String A0i = AbstractC31180DnO.A0i(c6fw, 3);
        UserSession A0K = AbstractC31179DnN.A0K(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        C33276EnX c33276EnX = new C33276EnX(0);
        User A0k = AbstractC31174DnI.A0k(A0K, A19);
        if (A0k != null) {
            AbstractC167017dG.A1N(A04, A0K);
            C14360o3.A0B(c33276EnX, 3);
            AbstractC35271Fh6.A07(A04, null, new C32540EUq(16, c6fq, A0H, A0G), A0K, null, null, null, null, c33276EnX, null, A0k, null, null, null, A0i, null, A0i, null, null, null, null, null);
            return null;
        }
        C4LM.A02.A02(A0K, new GIO(A04, c33276EnX, c6fq, A0H, A0G, A0K, A0i, 3), A19);
        return null;
    }
}
