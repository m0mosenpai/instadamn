package X;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;
import android.os.SystemClock;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class YDR implements InterfaceC73594YMu {
    public final Context A00;
    public final PlaybackSession A01;
    public final InterfaceC73595YMv A04;
    public final C96604Vv A03 = new C96604Vv();
    public final C4WJ A02 = new C4WJ();
    public final HashMap A05 = AbstractC166987dD.A1G();
    public final HashMap A06 = AbstractC166987dD.A1G();

    public static YDR A00(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new YDR(context, mediaMetricsManager.createPlaybackSession());
    }

    public final LogSessionId A01() {
        return this.A01.getSessionId();
    }

    public YDR(Context context, PlaybackSession playbackSession) {
        this.A00 = context.getApplicationContext();
        this.A01 = playbackSession;
        SystemClock.elapsedRealtime();
        YDS yds = new YDS();
        this.A04 = yds;
        yds.A01 = this;
    }
}
