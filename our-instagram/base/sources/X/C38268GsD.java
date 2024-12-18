package X;

import android.view.View;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.GsD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38268GsD implements InterfaceC62892tS, C42J {
    public final /* synthetic */ ReelDashboardFragment A00;

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DXb(int i, int i2, boolean z) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DrZ(int i, int i2) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DyE(int i, float f) {
    }

    @Override // X.InterfaceC62892tS
    public final void E0r(View view) {
    }

    public C38268GsD(ReelDashboardFragment reelDashboardFragment) {
        this.A00 = reelDashboardFragment;
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ boolean CtU() {
        return false;
    }

    @Override // X.InterfaceC62892tS
    public final void DXP(int i, int i2) {
        Long A00;
        ReelDashboardFragment reelDashboardFragment = this.A00;
        ReelDashboardFragment.A0D(reelDashboardFragment, i);
        if (i != i2) {
            ReelDashboardFragment.A0C(reelDashboardFragment, i);
            if (reelDashboardFragment.A08 != null) {
                C38274GsJ A002 = AbstractC38267GsC.A00(reelDashboardFragment.A06);
                if (i2 < reelDashboardFragment.A08.A02(reelDashboardFragment.A06)) {
                    A002.A04(reelDashboardFragment.A08.A0A(reelDashboardFragment.A06, i2).A0j, "navigation");
                }
                if (i < reelDashboardFragment.A08.A02(reelDashboardFragment.A06)) {
                    String str = reelDashboardFragment.A08.A0A(reelDashboardFragment.A06, i).A0j;
                    A002.A02(reelDashboardFragment.A08.A0A(reelDashboardFragment.A06, i), "dashboard_navigation");
                    if (reelDashboardFragment.A0Y.contains(str)) {
                        A002.A03(str);
                        C14360o3.A0B(str, 0);
                        if (C38274GsJ.A01(A002) && (A00 = C38274GsJ.A00(A002, str)) != null) {
                            A002.A02.flowEndSuccess(A00.longValue());
                        }
                    }
                }
            }
        }
    }

    @Override // X.C42J
    public final void DXR(int i) {
        this.A00.mListAdapter.A09(i, true);
    }

    @Override // X.C42J
    public final void DXS(int i) {
        this.A00.mListAdapter.A09(i, false);
    }

    @Override // X.InterfaceC62892tS
    public final void Diq(C3VZ c3vz, float f, float f2) {
        ReelDashboardFragment reelDashboardFragment = this.A00;
        if (reelDashboardFragment.mListViewPager == reelDashboardFragment.mScrollOwner) {
            reelDashboardFragment.A03.A06(f);
        }
    }

    @Override // X.InterfaceC62892tS
    public final void Diy(C3VZ c3vz, C3VZ c3vz2) {
        ReelDashboardFragment reelDashboardFragment;
        ReboundViewPager reboundViewPager;
        C3VZ c3vz3 = C3VZ.A03;
        if ((c3vz == c3vz3 || this.A00.mScrollOwner != null) && c3vz != C3VZ.A02) {
            if (c3vz == c3vz3) {
                reelDashboardFragment = this.A00;
                if (reelDashboardFragment.mListViewPager == reelDashboardFragment.mScrollOwner) {
                    reboundViewPager = null;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            reelDashboardFragment = this.A00;
            reboundViewPager = reelDashboardFragment.mListViewPager;
        }
        reelDashboardFragment.mScrollOwner = reboundViewPager;
    }
}
