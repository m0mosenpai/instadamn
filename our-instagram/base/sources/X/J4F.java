package X;

import android.view.View;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* loaded from: classes7.dex */
public final class J4F implements Runnable {
    public final /* synthetic */ ReelDashboardFragment A00;

    public J4F(ReelDashboardFragment reelDashboardFragment) {
        this.A00 = reelDashboardFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        ReelDashboardFragment reelDashboardFragment = this.A00;
        if (!ReelDashboardFragment.A0F(reelDashboardFragment) && (view = reelDashboardFragment.mView) != null) {
            Runnable runnable = reelDashboardFragment.A0W;
            view.removeCallbacks(runnable);
            view.postDelayed(runnable, 0L);
        }
    }
}
