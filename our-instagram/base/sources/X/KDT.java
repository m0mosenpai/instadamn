package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.facebook.R;
import com.google.android.material.tabs.TabLayout;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KDT extends AbstractC59962oe implements C51E, C51D {
    public static final String __redex_internal_original_name = "GreenscreenMiniGalleryFragment";
    public C44446JlD A00;
    public ViewPager A01;
    public C3DN A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final int A05;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51E
    public final boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ig_camera_greenscreen_gallery";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewPager viewPager = (ViewPager) view.requireViewById(R.id.greenscreen_category_view_pager);
        viewPager.setAdapter(this.A00);
        viewPager.A0J(new C48113LRn(this, 0));
        this.A01 = viewPager;
        if (C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(this.A03, 0), 36327533469383327L)) {
            ((TabLayout) view.requireViewById(R.id.greenscreen_tab_layout)).setSelectedTabIndicator((Drawable) null);
        }
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final int getExtraDragSpace() {
        return this.A05;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.C51E
    public final boolean isScrolledToBottom() {
        AbstractC021208i abstractC021208i;
        ViewPager viewPager = this.A01;
        if (viewPager != null) {
            abstractC021208i = viewPager.getAdapter();
        } else {
            abstractC021208i = null;
        }
        C14360o3.A0C(abstractC021208i, "null cannot be cast to non-null type com.instagram.ar.core.discovery.greenscreengallery.ui.GreenscreenGalleryCategoryPageAdapter");
        C44446JlD c44446JlD = (C44446JlD) abstractC021208i;
        if (((AbstractC59962oe) c44446JlD.A01.get(c44446JlD.A00)) instanceof AbstractC45514KDf) {
            return !((AbstractC43842Ja5) r1).getRecyclerView().canScrollVertically(1);
        }
        return false;
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        AbstractC021208i abstractC021208i;
        ViewPager viewPager = this.A01;
        if (viewPager != null) {
            abstractC021208i = viewPager.getAdapter();
        } else {
            abstractC021208i = null;
        }
        C14360o3.A0C(abstractC021208i, "null cannot be cast to non-null type com.instagram.ar.core.discovery.greenscreengallery.ui.GreenscreenGalleryCategoryPageAdapter");
        C44446JlD c44446JlD = (C44446JlD) abstractC021208i;
        InterfaceC08430c6 interfaceC08430c6 = (AbstractC59962oe) c44446JlD.A01.get(c44446JlD.A00);
        if (interfaceC08430c6 instanceof AbstractC45514KDf) {
            return !AbstractC43592JPx.A1X(((AbstractC43842Ja5) interfaceC08430c6).getRecyclerView());
        }
        if (interfaceC08430c6 instanceof MSL) {
            return ((MSL) interfaceC08430c6).isScrolledToTop();
        }
        return false;
    }

    @Override // X.C51D
    public final void onBottomSheetClosed() {
        C05A c05a = ((C1825187q) this.A04.getValue()).A06;
        if (c05a.getValue() == EnumC1825287r.A03) {
            c05a.Egh(EnumC1825287r.A02);
        }
    }

    @Override // X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
        C3DN c3dn = this.A02;
        if (c3dn != null) {
            ((C1825187q) this.A04.getValue()).A05.Egh(Integer.valueOf(c3dn.A08() - i));
        }
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public KDT() {
        C0YZ A1D = AbstractC25225BEi.A1D(C1825187q.class);
        this.A04 = AbstractC25225BEi.A0a(C50250MHf.A01(this, 44), C50250MHf.A01(this, 45), new C29897DGl(40, null, this), A1D);
        this.A03 = AbstractC60492pY.A02(this);
        this.A05 = 200;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(802928976);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        FragmentActivity requireActivity = requireActivity();
        this.A02 = AbstractC31172DnG.A0r(requireActivity);
        AbstractC10360h2 childFragmentManager = getChildFragmentManager();
        C14360o3.A07(childFragmentManager);
        UserSession A0r = AbstractC166987dD.A0r(this.A03);
        InterfaceC09390do interfaceC09390do = this.A04;
        this.A00 = new C44446JlD(requireActivity, childFragmentManager, (C1825187q) interfaceC09390do.getValue(), A0r);
        C3DN c3dn = this.A02;
        if (c3dn != null) {
            c3dn.A0W(true);
        }
        ((C1825187q) interfaceC09390do.getValue()).A06.Egh(EnumC1825287r.A03);
        View inflate = layoutInflater.inflate(R.layout.greenscreen_gallery_fragment_layout, viewGroup, false);
        C0f9.A09(1796914721, A02);
        return inflate;
    }
}
