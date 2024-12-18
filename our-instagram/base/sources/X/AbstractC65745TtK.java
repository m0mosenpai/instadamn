package X;

import android.media.metrics.LogSessionId;

/* renamed from: X.TtK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC65745TtK {
    public static void A00(C4WZ c4wz, C5TH c5th) {
        LogSessionId A00 = c4wz.A00();
        if (!A00.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            c5th.A01.setString("log-session-id", A00.getStringId());
        }
    }
}
