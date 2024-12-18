package X;

import android.widget.Scroller;
import com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout;

/* renamed from: X.Wup, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71489Wup implements Runnable {
    public final /* synthetic */ Scroller A00;
    public final /* synthetic */ RefreshableRecyclerViewLayout A01;

    public RunnableC71489Wup(Scroller scroller, RefreshableRecyclerViewLayout refreshableRecyclerViewLayout) {
        this.A00 = scroller;
        this.A01 = refreshableRecyclerViewLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Scroller scroller = this.A00;
        scroller.computeScrollOffset();
        RefreshableRecyclerViewLayout refreshableRecyclerViewLayout = this.A01;
        RefreshableRecyclerViewLayout.A06(refreshableRecyclerViewLayout);
        if (!scroller.isFinished()) {
            refreshableRecyclerViewLayout.postOnAnimation(this);
        }
        RefreshableRecyclerViewLayout.A05(refreshableRecyclerViewLayout);
    }
}
