package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.facebook.R;
import com.google.android.material.tabs.TabLayout;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class V0K extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PromoteCreateAudienceLocationsFragmentV2";
    public ViewPager A00;
    public TabLayout A01;
    public W5D A02;
    public FRW A03;
    public SpinnerImageView A04;
    public final InterfaceC09390do A07 = new C60842q8(new X31(this, 32), new X31(this, 33), new C57253Pbb(21, null, this), new C0YZ(UFT.class));
    public final InterfaceC09390do A05 = C1XM.A00(new X31(this, 31));
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_create_audience_locations";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.UF6, X.08i, X.0h1] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = (ViewPager) view.requireViewById(R.id.locations_view_pager);
        this.A01 = (TabLayout) view.requireViewById(R.id.locations_tab_layout);
        this.A04 = AbstractC31180DnO.A0V(view);
        AbstractC10360h2 childFragmentManager = getChildFragmentManager();
        C14360o3.A07(childFragmentManager);
        ?? abstractC10350h1 = new AbstractC10350h1(childFragmentManager, 0);
        abstractC10350h1.A01 = new ArrayList();
        abstractC10350h1.A00 = new ArrayList();
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList();
        AbstractC155756z4.A00().A00();
        InterfaceC09390do interfaceC09390do = this.A06;
        UserSession userSession = (UserSession) interfaceC09390do.getValue();
        C14360o3.A0B(userSession, 0);
        V04 v04 = new V04();
        AbstractC25233BEq.A15(v04, "IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        arrayList.add(v04);
        AbstractC155756z4.A00().A00();
        UserSession userSession2 = (UserSession) interfaceC09390do.getValue();
        C14360o3.A0B(userSession2, 0);
        C67868Uzz c67868Uzz = new C67868Uzz();
        AbstractC25233BEq.A15(c67868Uzz, "IgSessionManager.SESSION_TOKEN_KEY", userSession2.token);
        arrayList.add(c67868Uzz);
        arrayList2.add(AbstractC166997dE.A0p(requireContext(), 2131970514));
        arrayList2.add(AbstractC166997dE.A0p(requireContext(), 2131970513));
        abstractC10350h1.A01 = arrayList;
        abstractC10350h1.A00 = arrayList2;
        ViewPager viewPager = this.A00;
        String str = "viewPager";
        if (viewPager != 0) {
            viewPager.setAdapter(abstractC10350h1);
            ViewPager viewPager2 = this.A00;
            if (viewPager2 != null) {
                viewPager2.A0J(new WTB(this, 1));
                TabLayout tabLayout = this.A01;
                if (tabLayout == null) {
                    str = "tabLayout";
                } else {
                    ViewPager viewPager3 = this.A00;
                    if (viewPager3 != null) {
                        tabLayout.setupWithViewPager(viewPager3);
                        ViewPager viewPager4 = this.A00;
                        if (viewPager4 != null) {
                            viewPager4.setCurrentItem(((UFT) this.A07.getValue()).A06().A00);
                            AbstractC65702TsY.A1M(AbstractC65702TsY.A0N(this.A05), VG4.A0z);
                            View findViewById = view.findViewById(R.id.audience_potential_reach_view);
                            if (findViewById != null) {
                                this.A02 = new W5D((UserSession) interfaceC09390do.getValue(), getActivity(), findViewById);
                            }
                            C57312k6 A0a = AbstractC25229BEm.A0a(this);
                            AbstractC23641Du.A05(AnonymousClass191.A00, new MBT(this, null, 2), A0a);
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A00(V0K v0k) {
        FRW frw = v0k.A03;
        if (frw != null) {
            WNT.A01(frw, C05F.A1F, v0k, 17);
            frw.A01(!((UFT) v0k.A07.getValue()).A07().isEmpty());
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A06.getValue();
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        this.A03 = new FRW(AbstractC31176DnK.A05(this, interfaceC56362iU), interfaceC56362iU);
        interfaceC56362iU.Efu(2131970516);
        AbstractC31179DnN.A1G(interfaceC56362iU);
        interfaceC56362iU.EkS(true);
        A00(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(882097699);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.promote_create_audience_locations_view, false);
        C0f9.A09(921507766, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(2099793295);
        super.onDestroyView();
        W5D w5d = this.A02;
        if (w5d != null) {
            w5d.A01();
        }
        this.A02 = null;
        C0f9.A09(-1562357887, A02);
    }
}
