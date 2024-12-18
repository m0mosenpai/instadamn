package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.facebook.R;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import java.util.List;

/* renamed from: X.ENr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32367ENr extends C53Z implements InterfaceC60112ot, InterfaceC50521MRz {
    public static final String __redex_internal_original_name = "RestrictHomeFragment";
    public C18920wW A00;
    public C166217bp A01;
    public final C28151Xt A02 = C28151Xt.A02;
    public final InterfaceC37143GYe A03 = new GJP(this);

    @Override // X.InterfaceC60112ot
    public final boolean CPM() {
        return false;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31176DnK.A1C(ViewOnClickListenerC35682FpH.A00(this, 55), AbstractC31174DnI.A0K(), interfaceC56362iU);
        interfaceC56362iU.Efu(2131972550);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttachFragment(Fragment fragment) {
        C166217bp c166217bp;
        C14360o3.A0B(fragment, 0);
        if ((fragment instanceof ENR) && (c166217bp = this.A01) != null) {
            ((ENR) fragment).A03 = c166217bp;
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsBanner igdsBanner = (IgdsBanner) AbstractC166997dE.A0R(view, R.id.restrict_home_description);
        int i = 2131972525;
        if (C18U.A06(C06090Tz.A06, getSession(), 36321443205621192L)) {
            i = 2131972541;
        }
        igdsBanner.setBody(i);
        igdsBanner.setAction(2131972523);
        G81.A00(igdsBanner, this, 15);
        EnumC33324EoJ enumC33324EoJ = EnumC33324EoJ.A02;
        List A1J = AbstractC166987dD.A1J(enumC33324EoJ);
        FixedTabBar fixedTabBar = (FixedTabBar) AbstractC166997dE.A0R(view, R.id.restrict_home_tab_bar);
        ViewPager viewPager = (ViewPager) AbstractC166997dE.A0S(view, R.id.restrict_home_view_pager);
        AbstractC10360h2 childFragmentManager = getChildFragmentManager();
        C14360o3.A07(childFragmentManager);
        new C46080Kac(childFragmentManager, viewPager, fixedTabBar, this, A1J, false, false).A06(enumC33324EoJ);
        fixedTabBar.setVisibility(8);
        ViewOnClickListenerC35682FpH.A01(AbstractC166997dE.A0S(view, R.id.search_row), 56, this);
        C18920wW c18920wW = this.A00;
        if (c18920wW == null) {
            AbstractC31171DnF.A0s();
            throw C00O.createAndThrow();
        }
        C75R.A09(c18920wW, null, "impression", "restricted_accounts_list");
    }

    @Override // X.InterfaceC50521MRz
    public final /* bridge */ /* synthetic */ Fragment ALl(Object obj) {
        EnumC33324EoJ enumC33324EoJ = (EnumC33324EoJ) obj;
        Bundle A0C = AbstractC31177DnL.A0C(enumC33324EoJ);
        AbstractC03240Dh.A00(A0C, getSession());
        A0C.putSerializable("list_tab", enumC33324EoJ);
        C28151Xt c28151Xt = this.A02;
        if (c28151Xt != null && c28151Xt.A00.getValue() != null) {
            ENR enr = new ENR();
            enr.setArguments(A0C);
            return enr;
        }
        return new Fragment();
    }

    @Override // X.InterfaceC50521MRz
    public final /* bridge */ /* synthetic */ L5P ANJ(Object obj) {
        int i;
        int A05 = AbstractC25227BEk.A05((EnumC33324EoJ) obj, 0);
        if (A05 != 0) {
            if (A05 == 1) {
                i = 2131968694;
            } else {
                throw B4Z.A00();
            }
        } else {
            i = 2131972559;
        }
        return AbstractC41372ISz.A00(i);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "restrict_home";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C166217bp c166217bp;
        int A02 = C0f9.A02(1142976623);
        super.onCreate(bundle);
        C28151Xt c28151Xt = this.A02;
        if (c28151Xt != null) {
            c166217bp = c28151Xt.A01(getSession());
        } else {
            c166217bp = null;
        }
        this.A01 = c166217bp;
        this.A00 = AbstractC12220kQ.A01(this, getSession());
        C0f9.A09(-1246214322, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(398444225);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_restrict_home, false);
        C0f9.A09(275585815, A02);
        return A0R;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1142181823);
        super.onPause();
        C166217bp c166217bp = this.A01;
        if (c166217bp != null) {
            c166217bp.A02(this.A03);
        }
        C0f9.A09(1692492228, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-71898081);
        super.onResume();
        C166217bp c166217bp = this.A01;
        if (c166217bp != null) {
            InterfaceC37143GYe interfaceC37143GYe = this.A03;
            C14360o3.A0B(interfaceC37143GYe, 0);
            c166217bp.A03.add(AbstractC25225BEi.A16(interfaceC37143GYe));
        }
        C0f9.A09(-1591417017, A02);
    }

    @Override // X.InterfaceC50521MRz
    public final /* bridge */ /* synthetic */ void Dru(Object obj) {
    }
}
