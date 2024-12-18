package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* loaded from: classes6.dex */
public abstract class FTf {
    public static HashMap A01(UserSession userSession, String str) {
        return A00(C07950bF.A04.A01(userSession, str));
    }

    public static final HashMap A00(C16L c16l) {
        HashMap hashMap = null;
        if (c16l.A11() == C16R.A0D) {
            hashMap = AbstractC166987dD.A1G();
            while (c16l.A1J() != C16R.A09) {
                AbstractC31179DnN.A1F(c16l, hashMap);
            }
        }
        return hashMap;
    }
}
