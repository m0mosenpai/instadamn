package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout;
import com.instagram.user.model.UpcomingEvent;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: X.HCe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38931HCe extends AbstractC59962oe implements InterfaceC60442pS, C51D, JHA {
    public static final String __redex_internal_original_name = "CombinedTagsListFragment";
    public Fragment A00;
    public C38321qM A01;
    public C39396Hag A02;
    public IK7 A03;
    public InterfaceC43588JPt A04;
    public String A05;
    public String A06;
    public IgSegmentedTabLayout A07;
    public String A08;
    public final C37816GkW A0B = C37816GkW.A00(this, 43);
    public final Map A09 = new EnumMap(EnumC39569Hdf.class);
    public final InterfaceC09390do A0A = AbstractC60492pY.A02(this);

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        EnumC39569Hdf enumC39569Hdf;
        int i;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewPager viewPager = (ViewPager) AbstractC166997dE.A0R(view, R.id.view_pager);
        viewPager.A0J(new C38527Gwo(this, this));
        IgSegmentedTabLayout igSegmentedTabLayout = (IgSegmentedTabLayout) view.requireViewById(R.id.view_switcher);
        this.A07 = igSegmentedTabLayout;
        String str = "segmentedTabLayout";
        if (igSegmentedTabLayout != null) {
            AbstractC31172DnG.A1B(requireContext(), igSegmentedTabLayout, AbstractC53242c7.A02(requireContext()));
            AbstractC10360h2 childFragmentManager = getChildFragmentManager();
            C14360o3.A07(childFragmentManager);
            IgSegmentedTabLayout igSegmentedTabLayout2 = this.A07;
            if (igSegmentedTabLayout2 != null) {
                this.A02 = new C39396Hag(childFragmentManager, viewPager, this, igSegmentedTabLayout2);
                C38321qM c38321qM = this.A01;
                if (c38321qM != null) {
                    ArrayList A1E = AbstractC166987dD.A1E();
                    InterfaceC09390do interfaceC09390do = this.A0A;
                    UpcomingEvent A2B = c38321qM.A2B(AbstractC166987dD.A0r(interfaceC09390do));
                    if (A2B != null && AbstractC41774Ieq.A0B(A2B)) {
                        enumC39569Hdf = EnumC39569Hdf.A05;
                    } else {
                        enumC39569Hdf = EnumC39569Hdf.A06;
                    }
                    if (AbstractC76233bT.A00(AbstractC166987dD.A0r(interfaceC09390do), c38321qM)) {
                        A1E.add(enumC39569Hdf);
                        this.A09.put(enumC39569Hdf, "upcoming_event");
                    }
                    C38321qM c38321qM2 = this.A01;
                    if (c38321qM2 != null && c38321qM2.A53() && !c38321qM2.A6a(AbstractC166987dD.A0r(interfaceC09390do))) {
                        EnumC39569Hdf enumC39569Hdf2 = EnumC39569Hdf.A04;
                        A1E.add(enumC39569Hdf2);
                        this.A09.put(enumC39569Hdf2, "products");
                    }
                    C38321qM c38321qM3 = this.A01;
                    if (c38321qM3 != null && c38321qM3.A51()) {
                        EnumC39569Hdf enumC39569Hdf3 = EnumC39569Hdf.A03;
                        A1E.add(enumC39569Hdf3);
                        this.A09.put(enumC39569Hdf3, "accounts");
                    }
                    if (A1E.size() == 1) {
                        IgSegmentedTabLayout igSegmentedTabLayout3 = this.A07;
                        if (igSegmentedTabLayout3 != null) {
                            igSegmentedTabLayout3.setVisibility(8);
                        }
                    }
                    C39396Hag c39396Hag = this.A02;
                    if (c39396Hag == null) {
                        str = "tabFragmentPagerAdapter";
                    } else {
                        if (A1E.contains(enumC39569Hdf)) {
                            i = A1E.indexOf(enumC39569Hdf);
                        } else {
                            i = 0;
                        }
                        c39396Hag.A00(A1E, i);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.JHA
    public final /* bridge */ /* synthetic */ Fragment ALl(Object obj) {
        ArrayList A3M;
        String id;
        UpcomingEvent A2B;
        EnumC39569Hdf enumC39569Hdf = (EnumC39569Hdf) obj;
        int A05 = AbstractC25227BEk.A05(enumC39569Hdf, 0);
        if (A05 != 1) {
            if (A05 != 0) {
                if (A05 != 2 && A05 != 3) {
                    throw AbstractC166987dD.A14(AbstractC167017dG.A0n(enumC39569Hdf, "Invalid tabModel: ", AbstractC166987dD.A1C()));
                }
                AbstractC22762A2g.A00();
                InterfaceC09390do interfaceC09390do = this.A0A;
                C14360o3.A0B(interfaceC09390do.getValue(), 0);
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                C38321qM c38321qM = this.A01;
                if (c38321qM != null && (id = c38321qM.getId()) != null) {
                    String str = this.A05;
                    if (str == null) {
                        C14360o3.A0F("priorModule");
                        throw C00O.createAndThrow();
                    }
                    C38321qM c38321qM2 = this.A01;
                    if (c38321qM2 != null && (A2B = c38321qM2.A2B(AbstractC166987dD.A0r(interfaceC09390do))) != null) {
                        return IA5.A00(A0r, this.A04, A2B, id, str, AbstractC111324zv.A00(537), false, false, false);
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            C1XJ.A00.A0T();
            UserSession A0r2 = AbstractC166987dD.A0r(this.A0A);
            C38321qM c38321qM3 = this.A01;
            if (c38321qM3 != null) {
                String str2 = this.A06;
                Bundle A0b = AbstractC166987dD.A0b();
                AbstractC37301Gc2.A0u(A0b, c38321qM3);
                A0b.putSerializable("media_type", c38321qM3.BRp());
                A0b.putString("prior_module", getModuleName());
                A0b.putBoolean(AbstractC111324zv.A00(3101), false);
                if (c38321qM3.A3M() == null) {
                    A3M = AbstractC166987dD.A1E();
                } else {
                    A3M = c38321qM3.A3M();
                }
                A0b.putParcelableArrayList(MSV.A00(121), AbstractC166987dD.A1F(A3M));
                AbstractC31173DnH.A1C(A0b, A0r2);
                A0b.putString("shopping_session_id", str2);
                ENN enn = new ENN();
                enn.setArguments(A0b);
                return enn;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        Fragment fragment = this.A00;
        if (fragment == null) {
            throw AbstractC166987dD.A14("Required value was null.");
        }
        return fragment;
    }

    @Override // X.JHA
    public final /* bridge */ /* synthetic */ C47673L3g C4s(Object obj) {
        EnumC39569Hdf enumC39569Hdf = (EnumC39569Hdf) obj;
        C14360o3.A0B(enumC39569Hdf, 0);
        return new C47673L3g(null, requireContext().getString(enumC39569Hdf.A00), null, -1, false);
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
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
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A05;
        if (str == null) {
            C14360o3.A0F("priorModule");
            throw C00O.createAndThrow();
        }
        return str;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
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
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        C39396Hag c39396Hag = this.A02;
        if (c39396Hag == null) {
            C14360o3.A0F("tabFragmentPagerAdapter");
            throw C00O.createAndThrow();
        }
        InterfaceC08430c6 item = c39396Hag.getItem(c39396Hag.A01.getSelectedIndex());
        C14360o3.A07(item);
        C14360o3.A0C(item, MSV.A00(3));
        return ((C51D) item).isScrolledToTop();
    }

    @Override // X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
        InterfaceC08430c6 interfaceC08430c6 = this.A00;
        if (interfaceC08430c6 != null) {
            ((C51D) interfaceC08430c6).onBottomSheetPositionChanged(i, i2);
        }
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
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
    public final void onCreate(Bundle bundle) {
        int i;
        int A02 = C0f9.A02(1419511357);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A06 = bundle2.getString("shopping_session_id");
            this.A05 = AbstractC153636vY.A01(bundle2, "prior_module_name");
            this.A08 = bundle2.getString("prior_submodule_name");
            AnonymousClass341 anonymousClass341 = (AnonymousClass341) bundle2.getSerializable("media_surface");
            String string = bundle2.getString("media_id");
            InterfaceC09390do interfaceC09390do = this.A0A;
            C38321qM A0F = AbstractC37304Gc5.A0F(string, interfaceC09390do);
            if (A0F == null) {
                AbstractC167017dG.A0y(getActivity(), C3DN.A00);
                i = 1461099480;
            } else {
                this.A01 = A0F;
                if (A0F.A53() && !A0F.A6a(AbstractC166987dD.A0r(interfaceC09390do))) {
                    this.A00 = C1XJ.A00.A0T().A0F(AbstractC166987dD.A0r(interfaceC09390do), A0F, this, anonymousClass341, new C42916IyU(this), null, null, null, this.A06, this.A08, null);
                }
                AbstractC31176DnK.A0Q(interfaceC09390do).A01(this.A0B, C71H.class);
                i = 574548398;
            }
            C0f9.A09(i, A02);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(1447992272, A02);
        throw A0g;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(28907566);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.combined_tags_list_fragment, false);
        C0f9.A09(-1616040887, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1527862475);
        super.onDestroy();
        AbstractC31176DnK.A0Q(this.A0A).A02(this.A0B, C71H.class);
        C0f9.A09(-293487461, A02);
    }
}
