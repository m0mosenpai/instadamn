package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class JSE {
    public static final C93384Gr A00(UserSession userSession, C2EC c2ec) {
        C14360o3.A0B(c2ec, 1);
        C93384Gr c93384Gr = new C93384Gr(userSession.userId, AbstractC09440dt.A01(new MHI(c2ec, 29)));
        C80993jT c80993jT = null;
        C80993jT c80993jT2 = null;
        for (Map.Entry entry : c2ec.CDu().entrySet()) {
            Object key = entry.getKey();
            C80993jT c80993jT3 = (C80993jT) entry.getValue();
            if (C14360o3.A0K(userSession.userId, key)) {
                c80993jT = c80993jT3;
            } else {
                c80993jT2 = c80993jT3;
            }
        }
        c93384Gr.A00 = c80993jT;
        c93384Gr.A01 = c80993jT2;
        return c93384Gr;
    }
}
