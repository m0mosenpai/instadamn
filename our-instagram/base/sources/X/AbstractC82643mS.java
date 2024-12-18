package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.3mS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC82643mS {
    public static final HashMap A00(UserSession userSession) {
        double d;
        C14360o3.A0B(userSession, 0);
        C70013Cl A00 = C70013Cl.A00(userSession);
        C14360o3.A07(A00);
        String A01 = A00.A01();
        String str = "";
        if (A01 == null) {
            A01 = "";
        }
        C09530e4 c09530e4 = new C09530e4("last_action", A01);
        String A02 = A00.A02();
        if (A02 != null) {
            str = A02;
        }
        C09530e4 c09530e42 = new C09530e4("last_actions", str);
        synchronized (A00) {
            d = A00.A00;
        }
        return AbstractC06930Yk.A02(c09530e4, c09530e42, new C09530e4("scroll_velocity", String.valueOf(d)));
    }
}
