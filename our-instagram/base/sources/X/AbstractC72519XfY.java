package X;

import android.content.Context;
import android.media.metrics.LogSessionId;

/* renamed from: X.XfY, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72519XfY {
    public static C73316Y4i A00(Context context, Y8T y8t) {
        LogSessionId A02;
        C73337Y8s A00 = C73337Y8s.A00(context);
        if (A00 == null) {
            AbstractC63374Sil.A04("ExoPlayerImpl", "MediaMetricsService unavailable.");
            A02 = LogSessionId.LOG_SESSION_ID_NONE;
        } else {
            ((C73336Y8r) y8t.A0X).A02.A03(A00);
            C73316Y4i c73316Y4i = C73316Y4i.A02;
            A02 = A00.A02();
        }
        return new C73316Y4i(A02);
    }
}
