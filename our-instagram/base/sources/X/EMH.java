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

/* loaded from: classes6.dex */
public final class EMH extends AbstractC59962oe implements JHA {
    public static final String __redex_internal_original_name = "ProfileTabbedExplorerFragment";
    public C38321qM A00;
    public C39396Hag A01;
    public AnonymousClass708 A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "tabbed_explorer_sheet";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgSegmentedTabLayout igSegmentedTabLayout = (IgSegmentedTabLayout) AbstractC166997dE.A0R(view, R.id.tab_layout);
        ViewPager viewPager = (ViewPager) AbstractC166997dE.A0R(view, R.id.tab_layout_pager);
        View A0S = AbstractC166997dE.A0S(view, R.id.tab_layout_header_container);
        View A0S2 = AbstractC166997dE.A0S(view, R.id.tab_layout_header);
        AbstractC31172DnG.A1B(requireContext(), igSegmentedTabLayout, AbstractC53242c7.A02(getContext()));
        AbstractC10360h2 childFragmentManager = getChildFragmentManager();
        C14360o3.A07(childFragmentManager);
        this.A01 = new C39396Hag(childFragmentManager, viewPager, this, igSegmentedTabLayout);
        viewPager.A0J(new C48113LRn(this, 2));
        AbstractC31174DnI.A1E(getViewLifecycleOwner(), AbstractC31172DnG.A0E(((C31810DyU) this.A05.getValue()).A02), new C30177DRh(17, this, A0S2, A0S, igSegmentedTabLayout), 68);
    }

    @Override // X.JHA
    public final /* bridge */ /* synthetic */ Fragment ALl(Object obj) {
        int A05 = AbstractC25227BEk.A05((EnumC33379EpC) obj, 0);
        if (A05 != 1) {
            if (A05 == 0) {
                String A01 = AbstractC153636vY.A01(requireArguments(), "ProfileTabbedExplorerFragment.USER_ID");
                UserSession A0r = AbstractC166987dD.A0r(this.A04);
                AnonymousClass708 anonymousClass708 = this.A02;
                if (anonymousClass708 == null) {
                    C14360o3.A0F("delegate");
                    throw C00O.createAndThrow();
                }
                C38321qM c38321qM = this.A00;
                C14360o3.A0B(A0r, 0);
                Bundle A0E = AbstractC31174DnI.A0E(A01, 1);
                EIB eib = new EIB();
                AbstractC31173DnH.A1C(A0E, A0r);
                A0E.putString("LinksListFragment.USER_ID", A01);
                eib.setArguments(A0E);
                eib.A01 = anonymousClass708;
                eib.A00 = c38321qM;
                return eib;
            }
            throw B4Z.A00();
        }
        String A012 = AbstractC153636vY.A01(requireArguments(), "ProfileTabbedExplorerFragment.USER_ID");
        UserSession A0r2 = AbstractC166987dD.A0r(this.A04);
        AbstractC167017dG.A1N(A0r2, A012);
        Bundle A0b = AbstractC166987dD.A0b();
        C32233EHr c32233EHr = new C32233EHr();
        AbstractC31173DnH.A1C(A0b, A0r2);
        A0b.putString("ChannelsListFragment.USER_ID", A012);
        A0b.putString("ChannelsListFragment.ENTRY_POINT", null);
        A0b.putBoolean("is_broadcast_channel_only", false);
        c32233EHr.setArguments(A0b);
        return c32233EHr;
    }

    @Override // X.JHA
    public final /* bridge */ /* synthetic */ C47673L3g C4s(Object obj) {
        EnumC33379EpC enumC33379EpC = (EnumC33379EpC) obj;
        C14360o3.A0B(enumC33379EpC, 0);
        return new C47673L3g(null, getString(enumC33379EpC.A00), null, -1, false);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    public EMH() {
        GSv gSv = new GSv(this, 15);
        GSv gSv2 = new GSv(this, 12);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new GSv(gSv2, 13));
        this.A05 = AbstractC25225BEi.A0a(new GSv(A00, 14), gSv, new C57257Pbf(4, null, A00), AbstractC25225BEi.A1D(C31810DyU.class));
        this.A03 = AbstractC09440dt.A00(enumC09460dv, new GSv(this, 11));
        this.A04 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1099683920);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_tabbed_explorer_fragment, false);
        C0f9.A09(-473744090, A02);
        return A0R;
    }
}
