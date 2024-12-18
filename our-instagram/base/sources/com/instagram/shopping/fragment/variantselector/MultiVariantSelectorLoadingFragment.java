package com.instagram.shopping.fragment.variantselector;

import X.AbstractC018607g;
import X.AbstractC111324zv;
import X.AbstractC12990ll;
import X.AbstractC13880nE;
import X.AbstractC153636vY;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.C00O;
import X.C08790ch;
import X.C0f9;
import X.C14360o3;
import X.C1GJ;
import X.C1ON;
import X.C25621Ms;
import X.C39026HGc;
import X.C41049IFs;
import X.C42862Ixc;
import X.EnumC39584Hdu;
import X.HAY;
import X.ISY;
import X.InterfaceC09390do;
import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.ui.emptystaterow.EmptyStateView;

/* loaded from: classes7.dex */
public final class MultiVariantSelectorLoadingFragment extends AbstractC59962oe {
    public EnumC39584Hdu A00;
    public C41049IFs A01;
    public String A02;
    public String A03;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public EmptyStateView emptyStateView;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "multi_variant_selector_loading";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        EmptyStateView emptyStateView = (EmptyStateView) view.requireViewById(R.id.empty);
        C14360o3.A0B(emptyStateView, 0);
        this.emptyStateView = emptyStateView;
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            int i = bundle2.getInt("arg_fixed_height");
            if (i > 0) {
                EmptyStateView emptyStateView2 = this.emptyStateView;
                if (emptyStateView2 != null) {
                    AbstractC13880nE.A0W(emptyStateView2, i);
                }
                str = "emptyStateView";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            EmptyStateView emptyStateView3 = this.emptyStateView;
            if (emptyStateView3 != null) {
                emptyStateView3.A0L();
                C42862Ixc c42862Ixc = new C42862Ixc(this, 1);
                EnumC39584Hdu enumC39584Hdu = this.A00;
                if (enumC39584Hdu != null) {
                    FragmentActivity requireActivity = requireActivity();
                    C08790ch A00 = AbstractC018607g.A00(this);
                    AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A04);
                    String str2 = this.A03;
                    if (str2 == null) {
                        str = "productId";
                    } else {
                        String str3 = this.A02;
                        if (str3 == null) {
                            str = "merchantId";
                        } else {
                            C25621Ms A0N = AbstractC31173DnH.A0N(A0o);
                            A0N.A0B("commerce/product_tagging/product_group/");
                            A0N.A9s("product_id", str2);
                            A0N.A9s("merchant_id", str3);
                            A0N.A9s("usage", enumC39584Hdu.A00);
                            C1ON A0S = AbstractC31172DnG.A0S(A0N, HAY.class, ISY.class);
                            A0S.A00 = new C39026HGc(A0o, c42862Ixc, str2, 3);
                            C1GJ.A00(requireActivity, A00, A0S);
                            return;
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                return;
            }
            str = "emptyStateView";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-709850966);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A03 = AbstractC153636vY.A01(bundle2, "product_id");
            this.A02 = AbstractC153636vY.A01(bundle2, "merchant_id");
            this.A00 = (EnumC39584Hdu) bundle2.getSerializable(AbstractC111324zv.A00(2913));
            C0f9.A09(-927462199, A02);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(1456951960, A02);
        throw A0g;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1928075675);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(com.facebook.R.layout.layout_empty_state_view, viewGroup, false);
        C0f9.A09(-1176040588, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(436504481);
        super.onDestroyView();
        this.emptyStateView = null;
        C0f9.A09(-1831071057, A02);
    }
}
