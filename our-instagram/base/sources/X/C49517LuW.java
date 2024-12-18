package X;

import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.LuW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49517LuW implements InterfaceC145106gV {
    public final /* synthetic */ ReelDashboardFragment A00;

    public C49517LuW(ReelDashboardFragment reelDashboardFragment) {
        this.A00 = reelDashboardFragment;
    }

    @Override // X.InterfaceC145106gV
    public final void Dbo(C105814ps c105814ps) {
        if (c105814ps.A00.A1f == EnumC915447k.A02) {
            c105814ps.A01(this);
            this.A00.A0X.remove(c105814ps);
        }
        ReboundViewPager reboundViewPager = this.A00.mListViewPager;
        if (reboundViewPager != null) {
            reboundViewPager.post(new RunnableC49908M2b(this));
        }
    }
}
