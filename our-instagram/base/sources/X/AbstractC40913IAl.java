package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.IAl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40913IAl {
    public static final void A00(UserSession userSession, Activity activity, String str) {
        AbstractC167017dG.A1N(activity, userSession);
        if (C1VN.A00 != null) {
            HashMap A1G = AbstractC166987dD.A1G();
            if (str.length() != 0) {
                A1G.put("delete_reason", str);
            }
            AbstractC31282Dp4.A00().A00(activity, userSession, "732098461071346", A1G);
        }
    }
}
