package X;

import com.instagram.video.player.common.LiveVideoDebugStatsView;
import java.util.TimerTask;

/* loaded from: classes11.dex */
public final class X29 extends TimerTask {
    public final /* synthetic */ LiveVideoDebugStatsView A00;

    public X29(LiveVideoDebugStatsView liveVideoDebugStatsView) {
        this.A00 = liveVideoDebugStatsView;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        LiveVideoDebugStatsView liveVideoDebugStatsView = this.A00;
        synchronized (liveVideoDebugStatsView) {
            C69311VlJ[] c69311VlJArr = liveVideoDebugStatsView.A0A;
            int i = liveVideoDebugStatsView.A01;
            c69311VlJArr[i] = new C69311VlJ(liveVideoDebugStatsView.A06, liveVideoDebugStatsView.A03, liveVideoDebugStatsView.A04, liveVideoDebugStatsView.A02, liveVideoDebugStatsView.A05);
            int length = c69311VlJArr.length;
            int i2 = (i + 1) % length;
            liveVideoDebugStatsView.A01 = i2;
            int i3 = liveVideoDebugStatsView.A00;
            if (i2 == i3) {
                liveVideoDebugStatsView.A00 = (i3 + 1) % length;
            }
        }
        liveVideoDebugStatsView.postInvalidate();
    }
}
