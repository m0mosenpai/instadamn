package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1VN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1VN {
    public static C1VN A00;

    public final void A00(Activity activity, UserSession userSession, String str, Map map) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        ((C131345wO) userSession.A01(C131345wO.class, new C57239PbN(userSession, 4))).A01(activity, str, map, false);
    }

    public final void A01(Activity activity, UserSession userSession, String str, Map map) {
        C14360o3.A0B(activity, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        if (map == null) {
            map = new HashMap();
        }
        C70188WFr.A03(new C67946V3l(userSession, activity, str), userSession, str, map);
    }

    public final void A02(UserSession userSession, Activity activity, String str) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        A00(activity, userSession, str, null);
    }
}
