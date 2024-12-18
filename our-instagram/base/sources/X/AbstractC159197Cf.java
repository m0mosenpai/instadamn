package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.7Cf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC159197Cf {
    public static final boolean A00(UserSession userSession, C2EE c2ee) {
        C32067E6t An6 = c2ee.An6();
        if (An6 != null && An6.A01()) {
            return true;
        }
        String C7I = c2ee.C7I();
        if (c2ee.BKb() instanceof DirectThreadKey) {
            DirectThreadKey A01 = JRE.A01(c2ee.BKb());
            if (C7I != null) {
                return C159227Ci.A01(userSession, A01, (String) ((C159217Ch) userSession.A01(C159217Ch.class, C159207Cg.A00)).A00.get(C7I));
            }
        }
        return false;
    }

    public static final boolean A01(C2EE c2ee) {
        C32067E6t An6 = c2ee.An6();
        if (An6 == null) {
            return true;
        }
        if (An6.A01()) {
            return false;
        }
        return !An6.A06 || An6.A05;
    }
}
