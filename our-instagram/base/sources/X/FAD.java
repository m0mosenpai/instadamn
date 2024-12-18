package X;

import android.app.Activity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* loaded from: classes6.dex */
public abstract class FAD {
    public static final void A00(UserSession userSession, Activity activity, String str) {
        HashMap A11 = AbstractC31174DnI.A11(userSession, 1);
        A11.put("target_user_id", str);
        A11.put("referer_type", "ProfileUsername");
        C66277U6x A01 = C66277U6x.A01(MSV.A00(20), A11);
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        A0C.A0U = activity.getResources().getString(2131951995);
        A0C.A0R = "account_transparency_bloks";
        AbstractC31173DnH.A14(activity, A0C, A01);
    }
}
