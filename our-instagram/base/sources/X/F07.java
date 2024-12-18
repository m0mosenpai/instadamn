package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class F07 {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        String obj = c6fw.A01().toString();
        InterfaceC103384lE A0G = AbstractC31175DnJ.A0G(c6fw);
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 2);
        List list = c6fw.A00;
        String A0s = AbstractC31173DnH.A0s(list, 3);
        String A0s2 = AbstractC31173DnH.A0s(list, 4);
        C35979Fud c35979Fud = new C35979Fud(A0s);
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        User A0k = AbstractC31174DnI.A0k(A0W, obj);
        if (A0k != null) {
            C14360o3.A0B(A04, 1);
            C14360o3.A0B(A0W, 2);
            C189478aR A06 = AbstractC70200WGp.A06(C6BQ.A09(c6fq));
            C189448aO A0X = AbstractC31177DnL.A0X(A0W, true);
            A0X.A19 = true;
            FYZ.A00(A04, c35979Fud, c6fq, A0I, A0G, A0W, A06, A0X, A0k, null, A0s2, null);
            return null;
        }
        C4LM.A02.A02(A0W, new GIO(A04, c35979Fud, c6fq, A0I, A0G, A0W, A0s2, 2), obj);
        return null;
    }
}
