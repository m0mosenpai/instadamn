package X;

import android.os.SystemClock;
import com.instagram.common.session.UserSession;

/* renamed from: X.Nwc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54140Nwc {
    public static final double A00(UserSession userSession, C141596ac c141596ac) {
        double d;
        if (C18U.A06(C06090Tz.A05, userSession, 36316383738794323L)) {
            d = c141596ac.A0O;
            if (d <= 0.0d) {
                return 0.0d;
            }
        } else {
            d = c141596ac.A0P;
            if (d == 0.0d) {
                return 0.0d;
            }
        }
        return (SystemClock.uptimeMillis() - d) / 1000.0d;
    }
}
