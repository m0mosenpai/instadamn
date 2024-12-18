package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.List;

/* renamed from: X.J2o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43074J2o implements XBY {
    public final /* synthetic */ U75 A00;

    public C43074J2o(U75 u75) {
        this.A00 = u75;
    }

    @Override // X.XBY
    public final void DGP(Boolean bool, String str, List list, List list2, List list3, int i, int i2) {
        Long A00;
        if (i2 > 0 && list.isEmpty() && list3.isEmpty()) {
            U75 u75 = this.A00;
            C38274GsJ A002 = AbstractC38267GsC.A00(((ReelDashboardFragment) u75.A01).A06);
            String str2 = u75.A03;
            C14360o3.A0B(str2, 0);
            if (C38274GsJ.A01(A002) && (A00 = C38274GsJ.A00(A002, str2)) != null) {
                long longValue = A00.longValue();
                C1QT c1qt = A002.A02;
                c1qt.flowAnnotate(longValue, TraceFieldType.FailureReason, "fb_viewers_list_empty");
                c1qt.flowEndFail(longValue, "fb_viewers_list_empty", null);
            }
        }
        U75 u752 = this.A00;
        ReelDashboardFragment reelDashboardFragment = (ReelDashboardFragment) u752.A01;
        ReboundViewPager reboundViewPager = reelDashboardFragment.mImageViewPager;
        ReboundViewPager reboundViewPager2 = reelDashboardFragment.mListViewPager;
        C38262Gs5 c38262Gs5 = reelDashboardFragment.mListAdapter;
        if (reboundViewPager != null && reboundViewPager2 != null && c38262Gs5 != null && str != null) {
            String str3 = u752.A03;
            C38264Gs7 A01 = C38262Gs5.A01(c38262Gs5, str3);
            if (A01 != null) {
                C41181vS c41181vS = A01.A0G;
                c41181vS.getClass();
                c41181vS.A0F = bool;
                c41181vS.A00 = i;
                C41181vS c41181vS2 = A01.A0G;
                c41181vS2.getClass();
                c41181vS2.A0N = true;
            }
            c38262Gs5.A0C(str3, str, list, list3);
            reboundViewPager.A0H(reelDashboardFragment.mImageViewPager.A01);
            reboundViewPager2.A0H(reelDashboardFragment.mListViewPager.A01);
        }
    }
}
