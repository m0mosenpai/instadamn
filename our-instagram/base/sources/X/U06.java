package X;

import android.os.SystemClock;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class U06 {
    public static long A00 = -1;
    public static boolean A01;
    public static final U06 A03 = new Object();
    public static final long A02 = AbstractC43593JPy.A09(TimeUnit.HOURS);

    public final void A00(UserSession userSession) {
        if (!A01) {
            long j = A00;
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            if (j == -1 || currentThreadTimeMillis < j || currentThreadTimeMillis - j > U0L.A00) {
                A01 = true;
                C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
                A0M.A0B("fbsearch/recent_searches/");
                A0M.A0R(C67830Uz3.class, U0t.class);
                C1ON A0N = A0M.A0N();
                A0N.A00 = new C66081TzI(userSession, 38);
                C1GJ.A03(A0N);
            }
        }
    }
}
