package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class FYZ {
    public static void A00(Activity activity, InterfaceC11380iw interfaceC11380iw, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2, UserSession userSession, C189478aR c189478aR, C189448aO c189448aO, User user, String str, String str2, JSONObject jSONObject) {
        C189448aO c189448aO2 = c189448aO;
        String moduleName = interfaceC11380iw.getModuleName();
        C36764GIn c36764GIn = new C36764GIn(activity, interfaceC11380iw, c6fq, interfaceC103384lE2, interfaceC103384lE, userSession, user, str2);
        String username = user.getUsername();
        if (c189448aO == null) {
            c189448aO2 = AbstractC25225BEi.A0y(userSession);
            AbstractC25225BEi.A1Q(c189448aO2, true);
            c189448aO2.A0x = true;
        }
        C14360o3.A0B(moduleName, 2);
        C1Yn.A00(activity, null, userSession, c189478aR, c189448aO2, user, c36764GIn, moduleName, str, username, jSONObject);
    }

    public static void A01(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C189478aR c189478aR, User user, String str, String str2, JSONObject jSONObject) {
        A00(activity, interfaceC11380iw, null, null, null, userSession, c189478aR, null, user, str, str2, jSONObject);
    }
}
