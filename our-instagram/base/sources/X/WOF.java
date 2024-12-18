package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class WOF implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;

    public WOF(Activity activity, View view) {
        this.A00 = activity;
        this.A01 = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Activity activity = this.A00;
        SlidingPaneLayout slidingPaneLayout = (SlidingPaneLayout) activity.findViewById(R.id.layout_direct_sliding_pane);
        if (slidingPaneLayout != null) {
            SlidingPaneLayout.A00(slidingPaneLayout);
        }
        View findViewById = activity.findViewById(R.id.direct_inbox_null_state);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        AbstractC166997dE.A1K(this.A01, this);
    }
}
