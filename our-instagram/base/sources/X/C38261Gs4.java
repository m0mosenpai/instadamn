package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.Gs4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38261Gs4 implements InterfaceC58124Ppn {
    public final /* synthetic */ RectF A00;
    public final /* synthetic */ J4E A01;

    @Override // X.InterfaceC58124Ppn
    public final void Da6(int i, String str, boolean z) {
    }

    public C38261Gs4(RectF rectF, J4E j4e) {
        this.A01 = j4e;
        this.A00 = rectF;
    }

    @Override // X.InterfaceC58124Ppn
    public final void DKY(boolean z, String str) {
        int count;
        View A0D;
        ReelDashboardFragment reelDashboardFragment = this.A01.A00;
        C44251Jgv c44251Jgv = reelDashboardFragment.mPagerAdapter;
        if (c44251Jgv != null && (count = c44251Jgv.getCount() - 1) == 1 && reelDashboardFragment.mPagerAdapter.getItemViewType(count) == 1 && AbstractC166987dD.A0x(reelDashboardFragment.A06).getInt("reel_dashboard_add_to_story_nux_seen_count", 0) < 3 && (A0D = reelDashboardFragment.mImageViewPager.A0D(count)) != null) {
            Context context = A0D.getContext();
            int A0E = AbstractC167017dG.A0E(context);
            C5SU c5su = new C5SU(reelDashboardFragment.requireActivity(), new C149686oL(context.getString(2131971659)));
            c5su.A04(A0D, 0, (int) ((A0D.getHeight() / 2.0f) + A0E), true);
            c5su.A01();
            c5su.A0F = true;
            c5su.A0B = true;
            c5su.A0A = false;
            c5su.A04 = new KYR(reelDashboardFragment, 16);
            c5su.A00().A07(reelDashboardFragment.A06);
        }
    }

    @Override // X.InterfaceC58124Ppn
    public final void Dbk(float f) {
        ReelDashboardFragment.A04(this.A00, this.A01.A00, f);
    }
}
