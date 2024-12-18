package X;

import android.view.ViewTreeObserver;
import androidx.core.widget.NestedScrollView;
import com.instagram.common.ui.widget.filmstriptimeline.ScrollingTimelineView;

/* loaded from: classes11.dex */
public final class WOP implements ViewTreeObserver.OnScrollChangedListener {
    public final int A00;
    public final Object A01;

    public WOP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        if (this.A00 != 0) {
            ScrollingTimelineView scrollingTimelineView = (ScrollingTimelineView) this.A01;
            if (scrollingTimelineView.A00) {
                scrollingTimelineView.A03.getScrollX();
                return;
            }
            return;
        }
        C67726Uws c67726Uws = (C67726Uws) this.A01;
        NestedScrollView nestedScrollView = c67726Uws.A0E;
        if (nestedScrollView == null) {
            C14360o3.A0F("nestedScrollView");
            throw C00O.createAndThrow();
        }
        if (nestedScrollView.canScrollVertically(1)) {
            return;
        }
        C67726Uws.A04(c67726Uws);
    }
}
