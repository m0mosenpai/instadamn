package X;

import android.graphics.RectF;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* loaded from: classes7.dex */
public final class J4E implements Runnable {
    public final /* synthetic */ ReelDashboardFragment A00;

    public J4E(ReelDashboardFragment reelDashboardFragment) {
        this.A00 = reelDashboardFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ReelDashboardFragment reelDashboardFragment = this.A00;
        if (reelDashboardFragment.isVisible()) {
            RectF A00 = ReelDashboardFragment.A00(reelDashboardFragment);
            C1OU.A06(reelDashboardFragment.requireActivity(), reelDashboardFragment.A06).A0X(null, A00, reelDashboardFragment, new C38261Gs4(A00, this));
        }
    }
}
