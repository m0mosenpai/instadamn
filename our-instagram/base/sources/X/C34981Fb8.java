package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Fb8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34981Fb8 {
    public static final C34981Fb8 A00 = new Object();

    public final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        String str2;
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type kotlin.Number");
        String obj = A01.toString();
        InterfaceC103384lE A0G = AbstractC31175DnJ.A0G(c6fw);
        InterfaceC103384lE A0H = AbstractC31175DnJ.A0H(c6fw);
        C102884kP A0F = AbstractC31175DnJ.A0F(c6fw, 3);
        UserSession A0K = AbstractC31179DnN.A0K(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        if (A0F == null || (str = A0F.A0G()) == null) {
            str = "DIRECT_RESTRICT";
        }
        if (str.equals("DIRECT_RESTRICT")) {
            Integer num = C05F.A00;
            if (A0F == null || (str2 = A0F.A0E()) == null) {
                str2 = "";
            }
            GJB gjb = new GJB(C6BQ.A04(c6fq), AbstractC31176DnK.A0O(C6BQ.A0B(c6fq), str2), c6fq, A0G, A0H, obj);
            User A0k = AbstractC31174DnI.A0k(A0K, obj);
            if (A0k != null) {
                C28151Xt c28151Xt = C28151Xt.A02;
                if (c28151Xt != null) {
                    AbstractC31171DnF.A1O(A04);
                    c28151Xt.A03(A04, AbstractC018607g.A00(A04), A0K, gjb, A0k.getId(), str2, null, null);
                    return null;
                }
                return null;
            }
            C4LM.A02.A02(A0K, new GIO(A04, num, c6fq, gjb, A0H, A0K, str2, 0), obj);
            return null;
        }
        throw AbstractC166987dD.A12(str);
    }
}
