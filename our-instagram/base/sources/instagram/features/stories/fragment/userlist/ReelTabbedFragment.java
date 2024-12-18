package instagram.features.stories.fragment.userlist;

import X.AbstractC12220kQ;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC31172DnG;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC31179DnN;
import X.AbstractC59962oe;
import X.C0f9;
import X.C39523Hcp;
import X.C46080Kac;
import X.InterfaceC02590Ai;
import X.InterfaceC50521MRz;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import X.JL7;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;

/* loaded from: classes7.dex */
public abstract class ReelTabbedFragment extends AbstractC59962oe implements InterfaceC60122ou, InterfaceC50521MRz {
    public UserSession A00;
    public Object A01;
    public FixedTabBar mTabBar;
    public C46080Kac mTabController;
    public ViewPager mViewPager;

    @Override // X.InterfaceC50521MRz
    public final void Dru(Object obj) {
        if (this instanceof C39523Hcp) {
            JL7 jl7 = (JL7) obj;
            this.A01 = jl7;
            UserSession userSession = this.A00;
            String value = jl7.getValue();
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this, userSession), "ig_aqr_responder_tab_switched");
            A0f.AAP("selected", value);
            A0f.Cht();
            return;
        }
        this.A01 = obj;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        int i;
        boolean z = this instanceof C39523Hcp;
        Context requireContext = requireContext();
        if (z) {
            i = 2131971789;
        } else {
            i = 2131971772;
        }
        AbstractC31175DnJ.A1I(interfaceC56362iU, requireContext.getString(i));
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-873232827);
        super.onCreate(bundle);
        this.A00 = AbstractC31176DnK.A0S(this);
        C0f9.A09(-892160625, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1595649592);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_reel_poll_voters_tabbed_fragment);
        C0f9.A09(-692468331, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1247110639);
        super.onDestroyView();
        this.mTabController = null;
        this.mTabBar = null;
        this.mViewPager = null;
        C0f9.A09(124734541, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1993303799);
        super.onStart();
        AbstractC31179DnN.A1K(this, 8);
        C0f9.A09(230545836, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-5969789);
        super.onStop();
        AbstractC31179DnN.A1K(this, 0);
        C0f9.A09(1496839921, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mTabBar = (FixedTabBar) view.requireViewById(R.id.fixed_tabbar_view);
        this.mViewPager = (ViewPager) view.requireViewById(R.id.view_pager);
    }
}
