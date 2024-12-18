package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8M3, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8M3 {
    public final UserSession A00;

    public C8M3(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final C81663kb A00(String str) {
        if (str != null) {
            return ((C2DU) C2JD.A00(this.A00)).A0N(str);
        }
        return null;
    }

    public final Long A01(String str) {
        C1118752z Ay9;
        Integer num;
        C81663kb A00 = A00(str);
        if (A00 == null || (Ay9 = A00.Ay9()) == null || !Ay9.A08 || (num = Ay9.A02) == null) {
            return null;
        }
        return Long.valueOf(TimeUnit.SECONDS.toMillis(num.intValue()));
    }
}
