package X;

import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.video.heroplayer.ipc.HeroScrollSetting;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* renamed from: X.GgC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37556GgC extends AbstractC65392xb {
    public ViewPager2 A00;
    public C120985dq A01;
    public C37629GhO A02;
    public C65848Tv9 A03;
    public C37558GgE A04;
    public Integer A05;
    public final HeroScrollSetting A06;
    public final ClipsViewerConfig A07;
    public final UserSession A08;
    public final C37546Gg2 A09;
    public final C37557GgD A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final AbstractC37552Gg8 A0E;

    public C37556GgC(HeroScrollSetting heroScrollSetting, ClipsViewerConfig clipsViewerConfig, UserSession userSession, AbstractC37552Gg8 abstractC37552Gg8, C37546Gg2 c37546Gg2, boolean z, boolean z2, boolean z3) {
        AbstractC167007dF.A1F(userSession, 1, abstractC37552Gg8);
        C14360o3.A0B(clipsViewerConfig, 8);
        this.A08 = userSession;
        this.A09 = c37546Gg2;
        this.A0B = z;
        this.A0E = abstractC37552Gg8;
        this.A0D = z2;
        this.A06 = heroScrollSetting;
        this.A0C = z3;
        this.A07 = clipsViewerConfig;
        this.A0A = new C37557GgD(this);
        this.A04 = new C37558GgE();
    }

    public final View A07(int i) {
        AbstractC70663Fe abstractC70663Fe;
        View view = null;
        try {
            RecyclerView A00 = A00(this);
            if (A00 != null) {
                abstractC70663Fe = A00.A0D;
            } else {
                abstractC70663Fe = null;
            }
            if (abstractC70663Fe != null) {
                view = abstractC70663Fe.A0d(i);
                return view;
            }
        } catch (NullPointerException e) {
            C0w9.A05("ClipsViewPagerImpl_getViewAtIndex", AnonymousClass001.A0c("View at index ", " is null.", i), 1, e);
        }
        return view;
    }

    public final void A0G(C38Y c38y) {
        java.util.Set set;
        C14360o3.A0B(c38y, 0);
        C37558GgE c37558GgE = this.A04;
        if (c37558GgE != null && (set = c37558GgE.A03) != null) {
            set.add(c38y);
        }
    }

    public final void A0H(C38Y c38y) {
        java.util.Set set;
        C14360o3.A0B(c38y, 0);
        C37558GgE c37558GgE = this.A04;
        if (c37558GgE != null && (set = c37558GgE.A03) != null) {
            set.remove(c38y);
        }
    }

    public static final RecyclerView A00(C37556GgC c37556GgC) {
        View view;
        ViewPager2 viewPager2 = c37556GgC.A00;
        if (viewPager2 != null) {
            view = viewPager2.getChildAt(0);
        } else {
            view = null;
        }
        if (!(view instanceof RecyclerView)) {
            return null;
        }
        return (RecyclerView) view;
    }

    public static final void A02(C37556GgC c37556GgC, int i, boolean z) {
        ViewPager2 viewPager2 = c37556GgC.A00;
        if (viewPager2 != null && viewPager2.A06.A06.A07) {
            c37556GgC.A0D();
            C37558GgE c37558GgE = c37556GgC.A04;
            if (c37558GgE != null) {
                Iterator it = c37558GgE.A03.iterator();
                while (it.hasNext()) {
                    ((C38Y) it.next()).DY0();
                }
            }
        }
        ViewPager2 viewPager22 = c37556GgC.A00;
        if (viewPager22 != null) {
            viewPager22.A03(i, z);
        }
    }

    public final int A03() {
        ViewPager2 viewPager2 = this.A00;
        if (viewPager2 != null) {
            return viewPager2.A00;
        }
        return 0;
    }

    public final int A05() {
        int A0B = this.A09.A0A.A0B() - 1;
        if (A0B < 0) {
            return 0;
        }
        return A0B;
    }

    public final C120985dq A09(int i) {
        if (i >= 0) {
            AbstractC37552Gg8 abstractC37552Gg8 = this.A09.A0A;
            if (i < abstractC37552Gg8.A0B()) {
                return abstractC37552Gg8.A0F(i);
            }
            return null;
        }
        return null;
    }

    public final Integer A0A() {
        ViewPager2 viewPager2 = this.A00;
        if (viewPager2 != null) {
            int i = viewPager2.A08.A02;
            if (Integer.valueOf(i) != null) {
                if (i == 1) {
                    return C05F.A01;
                }
                if (i == 2) {
                    return C05F.A0C;
                }
            }
        }
        return C05F.A00;
    }

    public final void A0B() {
        ViewPager2 viewPager2 = this.A00;
        if (viewPager2 != null) {
            viewPager2.setUserInputEnabled(false);
        }
    }

    public final void A0C() {
        ViewPager2 viewPager2 = this.A00;
        if (viewPager2 != null) {
            viewPager2.setUserInputEnabled(true);
        }
    }

    public final void A0D() {
        AbstractC65852TvD abstractC65852TvD;
        ViewPager2 viewPager2 = this.A00;
        if (viewPager2 != null) {
            C43741JWa c43741JWa = viewPager2.A06;
            C65842Tv3 c65842Tv3 = c43741JWa.A06;
            if (c65842Tv3.A07) {
                c65842Tv3.A07 = false;
                C65842Tv3.A01(c65842Tv3);
                C69044Vgl c69044Vgl = c65842Tv3.A04;
                if (c69044Vgl.A01 == 0) {
                    int i = c69044Vgl.A02;
                    if (i != c65842Tv3.A01 && (abstractC65852TvD = c65842Tv3.A05) != null) {
                        abstractC65852TvD.A01(i);
                    }
                    C65842Tv3.A02(c65842Tv3, 0);
                    C65842Tv3.A00(c65842Tv3);
                } else {
                    C65842Tv3.A02(c65842Tv3, 2);
                }
                VelocityTracker velocityTracker = c43741JWa.A04;
                velocityTracker.computeCurrentVelocity(1000, c43741JWa.A02);
                if (!c43741JWa.A05.A1E((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
                    ViewPager2 viewPager22 = c43741JWa.A07;
                    View A03 = viewPager22.mPagerSnapHelper.A03(viewPager22.A02);
                    if (A03 != null) {
                        int[] A09 = viewPager22.mPagerSnapHelper.A09(A03, viewPager22.A02);
                        int i2 = A09[0];
                        if (i2 != 0 || A09[1] != 0) {
                            viewPager22.A04.A0t(i2, A09[1]);
                        }
                    }
                }
            }
        }
    }

    public final void A0E(int i) {
        ViewPager2 viewPager2 = this.A00;
        if (viewPager2 != null) {
            viewPager2.post(new J5A(this, i));
        }
    }

    public final void A0F(int i, boolean z) {
        if (!this.A0E.A01 && !this.A09.A02) {
            A02(this, i, z);
            return;
        }
        this.A05 = Integer.valueOf(i);
        C37546Gg2 c37546Gg2 = this.A09;
        c37546Gg2.A0E.add(new C57260Pbi(this, i, 3, z));
    }

    @Override // X.AbstractC65392xb
    public final void onItemRangeInserted(int i, int i2) {
        Integer num;
        ViewPager2 viewPager2;
        ViewPager2 viewPager22 = this.A00;
        boolean z = true;
        if (viewPager22 == null || i != viewPager22.A00 || this.A05 != null) {
            z = false;
        }
        ClipsViewerConfig clipsViewerConfig = this.A07;
        if (clipsViewerConfig.A1Y) {
            if (AbstractC25225BEi.A07(C06090Tz.A05, this.A08, 36608737864455963L) == 0 && z && (viewPager2 = this.A00) != null) {
                viewPager2.post(new J59(this, i2));
                return;
            }
            return;
        }
        if (clipsViewerConfig.A1i) {
            return;
        }
        if ((!z && ((num = this.A05) == null || i != num.intValue())) || viewPager22 == null) {
            return;
        }
        viewPager22.post(new RunnableC37823Gkd(this, i));
    }

    public static C120985dq A01(C37556GgC c37556GgC) {
        return c37556GgC.A09(c37556GgC.A03());
    }

    public final int A04() {
        AbstractC70663Fe abstractC70663Fe;
        RecyclerView A00 = A00(this);
        if (A00 != null) {
            abstractC70663Fe = A00.A0D;
        } else {
            abstractC70663Fe = null;
        }
        if (abstractC70663Fe instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) abstractC70663Fe).A1a();
        }
        return -1;
    }

    public final int A06() {
        AbstractC70663Fe abstractC70663Fe;
        RecyclerView A00 = A00(this);
        if (A00 != null) {
            abstractC70663Fe = A00.A0D;
        } else {
            abstractC70663Fe = null;
        }
        if (abstractC70663Fe instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) abstractC70663Fe).A1b();
        }
        return -1;
    }

    public final C120985dq A08() {
        return A01(this);
    }

    public final void A0I(boolean z) {
        if (A03() < A05()) {
            A0F(A03() + 1, z);
        }
    }
}
