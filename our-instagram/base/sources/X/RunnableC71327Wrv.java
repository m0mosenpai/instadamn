package X;

import com.instagram.common.ui.widget.filmstriptimeline.ScrollingTimelineView;

/* renamed from: X.Wrv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71327Wrv implements Runnable {
    public final /* synthetic */ UC6 A00;

    public RunnableC71327Wrv(UC6 uc6) {
        this.A00 = uc6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UC6 uc6 = this.A00;
        if (uc6.A03) {
            int scrollX = uc6.getScrollX();
            if (uc6.A00 == scrollX) {
                uc6.A03 = false;
                X8H x8h = uc6.A01;
                if (x8h != null) {
                    ScrollingTimelineView scrollingTimelineView = ((C70820Whd) x8h).A00;
                    if (scrollingTimelineView.A00) {
                        scrollingTimelineView.A00 = false;
                    }
                }
            } else {
                uc6.A00 = scrollX;
                uc6.postDelayed(uc6.A02, 10L);
                return;
            }
        }
        uc6.removeCallbacks(uc6.A02);
    }
}
