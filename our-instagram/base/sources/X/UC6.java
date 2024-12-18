package X;

import android.widget.HorizontalScrollView;
import com.instagram.common.ui.widget.filmstriptimeline.ScrollingTimelineView;

/* loaded from: classes11.dex */
public final class UC6 extends HorizontalScrollView {
    public int A00;
    public X8H A01;
    public Runnable A02;
    public boolean A03;

    @Override // android.widget.HorizontalScrollView
    public final void fling(int i) {
        super.fling(i);
        if (!this.A03) {
            this.A03 = true;
            X8H x8h = this.A01;
            if (x8h != null) {
                ScrollingTimelineView scrollingTimelineView = ((C70820Whd) x8h).A00;
                if (!scrollingTimelineView.A00) {
                    scrollingTimelineView.A00 = true;
                }
            }
            post(this.A02);
        }
    }

    public final void setFlingListener(X8H x8h) {
        this.A01 = x8h;
    }
}
