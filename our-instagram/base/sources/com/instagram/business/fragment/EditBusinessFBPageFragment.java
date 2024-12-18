package com.instagram.business.fragment;

import X.AbstractC12990ll;
import X.AbstractC151606s6;
import X.AbstractC166997dE;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC31180DnO;
import X.AbstractC31557Dth;
import X.C0f9;
import X.C32410EPl;
import X.C38K;
import X.C3LO;
import X.C3LY;
import X.C60462pV;
import X.EVO;
import X.EnumC151596s5;
import X.GWT;
import X.InterfaceC56362iU;
import X.InterfaceC60072op;
import X.InterfaceC60122ou;
import X.ViewOnClickListenerC35690FpP;
import X.Y7A;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.business.activity.FbConnectPageActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EditBusinessFBPageFragment extends C38K implements InterfaceC60072op, InterfaceC60122ou, GWT {
    public static final CallerContext A07 = CallerContext.A01(EditBusinessFBPageFragment.class.getName());
    public ImageView A00;
    public C32410EPl A01;
    public UserSession A02;
    public String A03;
    public TextView A04;
    public ViewSwitcher A05;
    public BusinessFlowAnalyticsLogger A06;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "edit_business_fb_page";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A06;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Cid(new Y7A("page_change", this.A03, null, null, null, null, null, null));
        }
        FragmentActivity activity = getActivity();
        if (!(activity instanceof FbConnectPageActivity)) {
            return false;
        }
        activity.finish();
        return true;
    }

    private void A01() {
        ViewSwitcher viewSwitcher;
        if (isResumed() && (viewSwitcher = this.A05) != null) {
            viewSwitcher.setEnabled(false);
            TextView textView = this.A04;
            textView.getClass();
            ColorStateList textColors = this.A04.getTextColors();
            textColors.getClass();
            textView.setTextColor(textColors.withAlpha(64));
        }
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return this.A02;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.Efu(2131977183);
        ViewOnClickListenerC35690FpP.A02(AbstractC31174DnI.A0K(), interfaceC56362iU, this, 10);
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A0A = R.layout.business_text_action_button;
        A0B.A05 = 2131961124;
        A0B.A0G = ViewOnClickListenerC35690FpP.A00(this, 11);
        ViewSwitcher viewSwitcher = (ViewSwitcher) interfaceC56362iU.AAB(new C3LY(A0B));
        this.A05 = viewSwitcher;
        TextView textView = (TextView) viewSwitcher.getChildAt(0);
        this.A04 = textView;
        textView.setText(2131961124);
        A01();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(2107892518);
        super.onCreate(bundle);
        this.A03 = AbstractC31180DnO.A0b(this);
        C60462pV c60462pV = new C60462pV();
        c60462pV.A0E(new EVO(getActivity()));
        A0a(c60462pV);
        UserSession A0S = AbstractC31176DnK.A0S(this);
        this.A02 = A0S;
        AbstractC31174DnI.A0m(A0S).Baz();
        this.A01 = new C32410EPl(requireContext(), this, this, getString(2131973237), null, null);
        this.A06 = AbstractC151606s6.A00(EnumC151596s5.A07, this, this.A02, AbstractC166997dE.A0n());
        C0f9.A09(-75179511, A02);
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(381946027);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.edit_business_fb_page_view);
        C0f9.A09(1490347579, A02);
        return A0A;
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-26026926);
        super.onResume();
        A01();
        C0f9.A09(-540530219, A02);
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        A0U(this.A01);
        AbstractC31557Dth.A01(this, this.A01.isEmpty());
        ImageView A0I = AbstractC31173DnH.A0I(view, R.id.refresh);
        this.A00 = A0I;
        A0I.setVisibility(8);
        ViewOnClickListenerC35690FpP.A01(this.A00, 9, this);
    }
}
