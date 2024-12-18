package X;

import android.content.Context;
import android.media.metrics.LogSessionId;

/* renamed from: X.XhM, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72583XhM {
    public static C4WZ A00(Context context, String str) {
        LogSessionId A01;
        YDR A00 = YDR.A00(context);
        if (A00 == null) {
            AbstractC46512Bo.A04("ExoPlayerImpl", "MediaMetricsService unavailable.");
            A01 = LogSessionId.LOG_SESSION_ID_NONE;
        } else {
            C4WZ c4wz = C4WZ.A03;
            A01 = A00.A01();
        }
        return new C4WZ(A01, str);
    }
}
