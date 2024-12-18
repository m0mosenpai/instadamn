package X;

import com.instagram.feed.ui.rows.mediaheader.layout.CyclicSubtitleLayout;
import java.util.TimerTask;

/* loaded from: classes8.dex */
public final class JWA extends TimerTask {
    public final /* synthetic */ CyclicSubtitleLayout A00;

    public JWA(CyclicSubtitleLayout cyclicSubtitleLayout) {
        this.A00 = cyclicSubtitleLayout;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        CyclicSubtitleLayout cyclicSubtitleLayout = this.A00;
        cyclicSubtitleLayout.setVisibleIndex(cyclicSubtitleLayout.A00 + 1);
    }
}
