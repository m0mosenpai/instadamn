package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* loaded from: classes10.dex */
public abstract class S4U {
    public static Object A00(C6FQ c6fq) {
        UserSession userSession = (UserSession) C6BQ.A0B(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        HashMap A1G = AbstractC166987dD.A1G();
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ig_activity_center_");
        String A0v = AbstractC166997dE.A0v(C0HM.A00(), A1C);
        A1G.put(AbstractC31581Du9.A00(), A0v);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
        String A00 = MSV.A00(409);
        igBloksScreenConfig.A0R = A00;
        igBloksScreenConfig.A0i = true;
        igBloksScreenConfig.A0j = false;
        C66277U6x.A01(A00, A1G).A04(A04, igBloksScreenConfig);
        SZ2.A00(new SZ2(userSession, A0v, "in_app_browser_v2", true), "view_link_history_entry_clicked", null);
        return null;
    }
}
