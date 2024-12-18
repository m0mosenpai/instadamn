package X;

import android.os.SystemClock;

/* renamed from: X.PvB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58432PvB {
    public static void A00(C58428Pv7 c58428Pv7, long j) {
        Object obj = c58428Pv7.A03;
        synchronized (obj) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            for (long j2 = 0; !c58428Pv7.A02 && j2 >= 0 && j2 < j; j2 = SystemClock.elapsedRealtime() - elapsedRealtime) {
                obj.wait(j - j2);
            }
        }
    }
}
