package X;

import android.os.SystemClock;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gm3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37906Gm3 {
    public static final C37906Gm3 A00 = new Object();

    public static final boolean A00(UserSession userSession, C37648Ghh c37648Ghh) {
        return c37648Ghh != null && SystemClock.elapsedRealtime() - c37648Ghh.A00 >= C18U.A01(C06090Tz.A05, userSession, 36601676937761085L);
    }
}
