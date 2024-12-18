package X;

import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.M2b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49908M2b implements Runnable {
    public final /* synthetic */ C49517LuW A00;

    public RunnableC49908M2b(C49517LuW c49517LuW) {
        this.A00 = c49517LuW;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ReelDashboardFragment reelDashboardFragment = this.A00.A00;
        ReboundViewPager reboundViewPager = reelDashboardFragment.mListViewPager;
        if (reboundViewPager != null) {
            reboundViewPager.A0H(reboundViewPager.A01);
            ReboundViewPager reboundViewPager2 = reelDashboardFragment.mImageViewPager;
            reboundViewPager2.A0H(reboundViewPager2.A01);
        }
    }
}
