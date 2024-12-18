package X;

import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.HeaderBehavior;

/* renamed from: X.TwB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC65905TwB implements Runnable {
    public final View A00;
    public final CoordinatorLayout A01;
    public final /* synthetic */ HeaderBehavior A02;

    public RunnableC65905TwB(View view, CoordinatorLayout coordinatorLayout, HeaderBehavior headerBehavior) {
        this.A02 = headerBehavior;
        this.A01 = coordinatorLayout;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HeaderBehavior headerBehavior;
        OverScroller overScroller;
        View view = this.A00;
        if (view != null && (overScroller = (headerBehavior = this.A02).A01) != null) {
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            CoordinatorLayout coordinatorLayout = this.A01;
            if (computeScrollOffset) {
                headerBehavior.A0V(view, coordinatorLayout, headerBehavior.A01.getCurrY());
                view.postOnAnimation(this);
            } else {
                headerBehavior.A0U(view, coordinatorLayout);
            }
        }
    }
}
