package com.instagram.settings.common;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC31171DnF;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC37300Gc1;
import X.AbstractC37314GcG;
import X.AbstractC53242c7;
import X.AbstractC60492pY;
import X.AbstractC63260SgI;
import X.C00O;
import X.C05F;
import X.C0f9;
import X.C114795Gm;
import X.C14360o3;
import X.C25531Mh;
import X.C38K;
import X.EPV;
import X.EnumC153216up;
import X.InterfaceC09390do;
import X.InterfaceC1571373s;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import X.MWN;
import X.SXK;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.ui.emptystaterow.EmptyStateView;

/* loaded from: classes9.dex */
public final class PaymentOptionsFragment extends C38K implements InterfaceC60122ou, InterfaceC1571373s {
    public EPV A00;
    public String A01;
    public boolean A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);
    public EmptyStateView emptyStateView;

    @Override // X.InterfaceC1571373s
    public final void DDQ() {
    }

    @Override // X.InterfaceC1571373s
    public final /* synthetic */ void DDS(EnumC153216up enumC153216up) {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131969410);
        interfaceC56362iU.EkS(true);
        Context context = getContext();
        if (context != null) {
            interfaceC56362iU.Ehg(new C114795Gm(null, AbstractC31174DnI.A09(context, AbstractC53242c7.A08(getContext())), null, null, null, null, C05F.A00, -2, -2, -2, -2, -2, -2, -2, true));
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "settings_payments_options";
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        String str = this.A01;
        if (str == null) {
            C14360o3.A0F("sessionId");
            throw C00O.createAndThrow();
        }
        bundle.putString(AbstractC37314GcG.A00(), str);
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View emptyView = AbstractC37300Gc1.A02(this).getEmptyView();
        C14360o3.A0C(emptyView, "null cannot be cast to non-null type com.instagram.ui.emptystaterow.EmptyStateView");
        EmptyStateView emptyStateView = (EmptyStateView) emptyView;
        this.emptyStateView = emptyStateView;
        if (emptyStateView != null) {
            emptyStateView.A0P(EnumC153216up.A06);
        }
        A02(this, "payment_settings_loading");
        InterfaceC09390do interfaceC09390do = this.A03;
        MWN.A00(AbstractC166987dD.A0r(interfaceC09390do)).A0G.add(this);
        if (MWN.A00(AbstractC166987dD.A0r(interfaceC09390do)).A0A != null && this.A02) {
            MWN A00 = MWN.A00(AbstractC166987dD.A0r(interfaceC09390do));
            A00.A04.A02 = false;
            A00.A01.A01(A00);
            return;
        }
        MWN.A00(AbstractC166987dD.A0r(interfaceC09390do)).A04();
    }

    public static final void A02(PaymentOptionsFragment paymentOptionsFragment, String str) {
        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(AbstractC31176DnK.A0M(paymentOptionsFragment, paymentOptionsFragment.A03), "payflows_init"), 355);
        A0A.A0R("product", "ig_payment_settings");
        A0A.A0R("flow_name", "payment_settings");
        A0A.A0R("flow_step", str);
        A0A.A0R("event_name", "init");
        String str2 = paymentOptionsFragment.A01;
        if (str2 == null) {
            C14360o3.A0F("sessionId");
            throw C00O.createAndThrow();
        }
        A0A.A0u(str2);
        A0A.Cht();
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return AbstractC166987dD.A0o(this.A03);
    }

    public static final void A01(PaymentOptionsFragment paymentOptionsFragment, int i, int i2) {
        EmptyStateView emptyStateView = paymentOptionsFragment.emptyStateView;
        if (emptyStateView != null) {
            emptyStateView.A0T(EnumC153216up.A04, i);
        }
        EmptyStateView emptyStateView2 = paymentOptionsFragment.emptyStateView;
        if (emptyStateView2 != null) {
            emptyStateView2.A0S(EnumC153216up.A04, i2);
        }
        EmptyStateView emptyStateView3 = paymentOptionsFragment.emptyStateView;
        if (emptyStateView3 != null) {
            emptyStateView3.A0R(EnumC153216up.A04, R.drawable.instagram_lock_outline_96);
        }
    }

    @Override // X.InterfaceC1571373s
    public final void DDR() {
        Context context = getContext();
        if (context != null) {
            SimpleWebViewActivity.A02.A02(context, AbstractC166987dD.A0o(this.A03), new SimpleWebViewConfig(new SXK(AbstractC63260SgI.A01(context, "https://help.instagram.com/contact/502692143473097?ref=igapp"))));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        int A02 = C0f9.A02(-1538088349);
        super.onCreate(bundle);
        this.A00 = new EPV(requireContext(), AbstractC166987dD.A0o(this.A03), this);
        Bundle bundle2 = this.mArguments;
        boolean z = false;
        if (bundle2 != null) {
            z = bundle2.getBoolean("com.instagram.settings.intf.ARGUMENT_FORCE_RISK_FETCH", false);
        }
        this.A02 = z;
        EPV epv = this.A00;
        if (epv == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        A0U(epv);
        if (bundle != null && (string = bundle.getString(AbstractC37314GcG.A00())) != null) {
            this.A01 = string;
        } else {
            this.A01 = AbstractC166997dE.A0n();
            A02(this, "payment_settings");
        }
        C0f9.A09(1837796785, A02);
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1502328838);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_listview_with_empty_state, viewGroup, false);
        C0f9.A09(1849910987, A02);
        return inflate;
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1492004075);
        super.onDestroyView();
        MWN.A00(AbstractC166987dD.A0r(this.A03)).A0G.remove(this);
        this.emptyStateView = null;
        C0f9.A09(667903179, A02);
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-289081184);
        super.onResume();
        MWN A00 = MWN.A00(AbstractC166987dD.A0r(this.A03));
        if (MWN.A02(A00) && A00.A03() != C05F.A00) {
            A00.A04.A02 = false;
            A00.A01.A01(A00);
            EmptyStateView emptyStateView = this.emptyStateView;
            if (emptyStateView != null) {
                emptyStateView.A0P(EnumC153216up.A06);
            }
        }
        C0f9.A09(1123217473, A02);
    }
}
