package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;

/* renamed from: X.Exa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33872Exa {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object obj;
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        if (!AbstractC1565371b.A01(A0W) || AbstractC1565371b.A00(A0W)) {
            return null;
        }
        Object A03 = c6fw.A03(0);
        if (!(A03 instanceof String) || AbstractC31171DnF.A1V(A0W, A03)) {
            return null;
        }
        InterfaceC02900Bo A00 = C0BQ.A00(A0W);
        Iterator it = A00.BOe().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (A03.equals(AbstractC31171DnF.A0g(obj))) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        User user = (User) obj;
        if (user == null || ((C17110t6) A00).A02.A03.keySet().contains(A03)) {
            return null;
        }
        C35158Ff0.A00(new C26069Bfx("bloks_action", "", "", null, 14), A0W, "log_out_account", "deeplink", null, null);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        C14360o3.A0B(A04, 1);
        C17320tT A002 = AbstractC19750y3.A00(A04, "invite_prefs");
        String str = A0W.userId;
        InterfaceC19610xo ARD = A002.ARD();
        ARD.E7K("invite_initiation_user_id", str);
        ARD.apply();
        C023409i.A0A.A03(new C36697GFs(1));
        UserSession A01 = C09Y.A00().A01(null, user);
        U7K u7k = U7H.A04;
        new EV5(A04, null, A04, AbstractC31172DnG.A0D(A04), C6BQ.A08(c6fq), A01, EnumC33353Eom.A05, AbstractC166987dD.A1E(), false).A02(new Void[0]);
        return null;
    }
}
