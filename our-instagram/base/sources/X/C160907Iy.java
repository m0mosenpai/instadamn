package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7Iy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160907Iy {
    public static final C160907Iy A00 = new Object();

    public final Long A00(UserSession userSession, C7TT c7tt) {
        C14360o3.A0B(c7tt, 0);
        C14360o3.A0B(userSession, 1);
        Integer num = c7tt.A0N.A03;
        boolean CPf = AbstractC160497Hj.A01(userSession, c7tt, true).CPf(userSession, c7tt);
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue <= -1 && (intValue != -1 || !CPf)) {
            return null;
        }
        long j = intValue;
        if (j >= 0) {
            j = TimeUnit.SECONDS.toMillis(j);
        }
        return Long.valueOf(j);
    }

    public final Long A01(UserSession userSession, C2EC c2ec) {
        Integer num;
        C14360o3.A0B(userSession, 1);
        C1118752z Ay9 = c2ec.Ay9();
        if (Ay9 != null) {
            num = Ay9.A03;
        } else {
            num = null;
        }
        boolean CPg = AbstractC160497Hj.A03(userSession, c2ec).CPg(userSession, c2ec);
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue <= -1 && (intValue != -1 || !CPg)) {
            return null;
        }
        long j = intValue;
        if (j >= 0) {
            j = TimeUnit.SECONDS.toMillis(j);
        }
        return Long.valueOf(j);
    }
}
