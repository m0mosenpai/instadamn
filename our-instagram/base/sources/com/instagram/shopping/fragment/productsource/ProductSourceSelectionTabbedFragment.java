package com.instagram.shopping.fragment.productsource;

import X.AbstractC10360h2;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC25229BEm;
import X.AbstractC31177DnL;
import X.AbstractC37303Gc4;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.C1XJ;
import X.C41768Iek;
import X.C46080Kac;
import X.EnumC39617HeR;
import X.HCN;
import X.HD9;
import X.InterfaceC08430c6;
import X.InterfaceC09390do;
import X.InterfaceC50521MRz;
import X.InterfaceC56362iU;
import X.InterfaceC60072op;
import X.InterfaceC60122ou;
import X.JPR;
import X.L5P;
import X.MSV;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.facebook.R;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class ProductSourceSelectionTabbedFragment extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou, InterfaceC50521MRz {
    public EnumC39617HeR A00;
    public boolean A01;
    public boolean A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);
    public final boolean A04 = true;
    public C46080Kac tabbedFragmentController;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131970020);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "product_source_selection";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC10360h2 childFragmentManager = getChildFragmentManager();
        C14360o3.A07(childFragmentManager);
        ViewPager viewPager = (ViewPager) AbstractC166987dD.A0c(view, R.id.tabs_viewpager);
        FixedTabBar fixedTabBar = (FixedTabBar) AbstractC166987dD.A0c(view, R.id.fixed_tabbar_view);
        ArrayList A1E = AbstractC166987dD.A1E();
        if (this.A01) {
            A1E.add(EnumC39617HeR.A03);
        }
        if (this.A02) {
            A1E.add(EnumC39617HeR.A04);
        }
        this.tabbedFragmentController = new C46080Kac(childFragmentManager, viewPager, fixedTabBar, this, A1E, false, false);
        EnumC39617HeR A01 = C41768Iek.A01(AbstractC166987dD.A0r(this.A03));
        this.A00 = A01;
        C46080Kac c46080Kac = this.tabbedFragmentController;
        if (c46080Kac != null) {
            c46080Kac.A06(A01);
        } else {
            C14360o3.A0F("tabbedFragmentController");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC50521MRz
    public final /* bridge */ /* synthetic */ Fragment ALl(Object obj) {
        Fragment hd9;
        EnumC39617HeR enumC39617HeR = (EnumC39617HeR) obj;
        if (enumC39617HeR != null) {
            int ordinal = enumC39617HeR.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    C1XJ.A00.A0T();
                    hd9 = new HCN();
                }
            } else {
                C1XJ.A00.A0T();
                hd9 = new HD9();
            }
            Bundle bundle = this.mArguments;
            if (bundle == null) {
                bundle = AbstractC166987dD.A0b();
            }
            bundle.putBoolean("is_tabbed", true);
            EnumC39617HeR enumC39617HeR2 = this.A00;
            if (enumC39617HeR2 != null) {
                bundle.putString("initial_tab", enumC39617HeR2.toString());
            }
            hd9.setArguments(bundle);
            return hd9;
        }
        throw AbstractC37303Gc4.A0M(enumC39617HeR, "Invalid tab for product source selection: ", AbstractC166987dD.A1C());
    }

    @Override // X.InterfaceC50521MRz
    public final /* bridge */ /* synthetic */ L5P ANJ(Object obj) {
        String str;
        int i;
        EnumC39617HeR enumC39617HeR = (EnumC39617HeR) obj;
        Resources A09 = AbstractC31177DnL.A09(this);
        if (enumC39617HeR != null) {
            int ordinal = enumC39617HeR.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i = 2131970018;
                }
            } else {
                i = 2131970019;
            }
            str = A09.getString(i);
            return new L5P(null, null, null, str, null, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1);
        }
        str = null;
        return new L5P(null, null, null, str, null, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1);
    }

    @Override // X.InterfaceC50521MRz
    public final /* bridge */ /* synthetic */ void Dru(Object obj) {
        EnumC39617HeR enumC39617HeR;
        EnumC39617HeR enumC39617HeR2 = (EnumC39617HeR) obj;
        if (isResumed() && enumC39617HeR2 != (enumC39617HeR = this.A00)) {
            C46080Kac c46080Kac = this.tabbedFragmentController;
            if (c46080Kac != null) {
                InterfaceC08430c6 A03 = c46080Kac.A03(enumC39617HeR);
                String A00 = MSV.A00(1439);
                C14360o3.A0C(A03, A00);
                ((JPR) A03).DXQ();
                this.A00 = enumC39617HeR2;
                C46080Kac c46080Kac2 = this.tabbedFragmentController;
                if (c46080Kac2 != null) {
                    InterfaceC08430c6 A032 = c46080Kac2.A03(enumC39617HeR2);
                    C14360o3.A0C(A032, A00);
                    ((JPR) A032).DXZ();
                    return;
                }
            }
            C14360o3.A0F("tabbedFragmentController");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // X.AbstractC59962oe
    public final boolean isContainerFragment() {
        return this.A04;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C46080Kac c46080Kac = this.tabbedFragmentController;
        if (c46080Kac != null) {
            InterfaceC08430c6 A02 = c46080Kac.A02();
            if ((A02 instanceof InterfaceC60072op) && ((InterfaceC60072op) A02).onBackPressed()) {
                return true;
            }
            return false;
        }
        C14360o3.A0F("tabbedFragmentController");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(634643220);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = requireArguments.getBoolean("show_brands_tab");
        requireArguments.getBoolean("show_collections_tab");
        this.A02 = requireArguments.getBoolean("show_catalogs_tab");
        C0f9.A09(-161087022, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-670259224);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.product_source_selection_tabbed_fragment, viewGroup, false);
        C0f9.A09(-1652118593, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(2001112915);
        super.onDestroyView();
        this.tabbedFragmentController = null;
        C0f9.A09(-1561799197, A02);
    }
}
