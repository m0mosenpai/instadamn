package com.instagram.business.fragment;

import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC31178DnM;
import X.AbstractC31179DnN;
import X.AbstractC31180DnO;
import X.AbstractC34213F7l;
import X.AbstractC35092Fd3;
import X.AbstractC35174FfR;
import X.AbstractC35211Fg4;
import X.AbstractC59962oe;
import X.C06090Tz;
import X.C0f9;
import X.C1L2;
import X.C36707GGc;
import X.C36783GJg;
import X.EVM;
import X.Ef3;
import X.EnumC151596s5;
import X.EnumC72412Xd8;
import X.EnumC72435Xdf;
import X.GYL;
import X.InterfaceC37190Ga1;
import X.InterfaceC37222GaX;
import X.InterfaceC56362iU;
import X.InterfaceC60072op;
import X.InterfaceC60122ou;
import X.ViewOnClickListenerC35690FpP;
import X.Y7A;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;

/* loaded from: classes6.dex */
public final class ConnectFBPageFragment extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou, InterfaceC37190Ga1 {
    public BusinessFlowAnalyticsLogger A00;
    public InterfaceC37222GaX A01;
    public BusinessNavBar A02;
    public EVM A03;
    public AbstractC18680vv A04;
    public IgdsBottomButtonLayout A05;
    public String A06;
    public boolean A07;
    public final GYL A08 = new C36707GGc(this, 0);

    @Override // X.InterfaceC37190Ga1
    public final void APP() {
    }

    @Override // X.InterfaceC37190Ga1
    public final void ARU() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "connect_fb_page";
    }

    public static void A00(ConnectFBPageFragment connectFBPageFragment) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = connectFBPageFragment.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Clu(new Y7A("facebook_connect", connectFBPageFragment.A06, "facebook_connect", null, null, null, null, null));
        }
    }

    public static void A01(ConnectFBPageFragment connectFBPageFragment) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = connectFBPageFragment.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Clv(new Y7A("facebook_connect", connectFBPageFragment.A06, "facebook_connect", null, null, null, null, null));
        }
    }

    private void A02(String str) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Cm3(new Y7A("facebook_connect", this.A06, str, null, null, null, null, null));
        }
    }

    private boolean A03() {
        InterfaceC37222GaX interfaceC37222GaX;
        if (AbstractC35211Fg4.A03(this.A01) || ((interfaceC37222GaX = this.A01) != null && interfaceC37222GaX.B77() == EnumC151596s5.A06)) {
            AbstractC18680vv abstractC18680vv = this.A04;
            C06090Tz c06090Tz = C06090Tz.A06;
            if (AbstractC31178DnM.A1X(c06090Tz, abstractC18680vv, 36313961372584278L) || AbstractC31178DnM.A1X(c06090Tz, this.A04, 36313961372715351L)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC37190Ga1
    public final void Dao() {
        EnumC72412Xd8 enumC72412Xd8;
        InterfaceC37222GaX interfaceC37222GaX;
        A02("continue");
        if (A03()) {
            AbstractC35174FfR.A00(EnumC72435Xdf.A02, this.A04, "upsell_primary_click");
        }
        Ef3 A01 = AbstractC34213F7l.A00().A01(this, this.A04, AbstractC35092Fd3.A01(requireActivity(), (UserSession) this.A04, new C36783GJg(this, 0)));
        if (AbstractC35211Fg4.A03(this.A01) || ((interfaceC37222GaX = this.A01) != null && interfaceC37222GaX.B77() == EnumC151596s5.A06)) {
            enumC72412Xd8 = EnumC72412Xd8.A07;
        } else {
            enumC72412Xd8 = EnumC72412Xd8.A04;
        }
        A01.A06(enumC72412Xd8.A01(), null);
    }

    @Override // X.InterfaceC37190Ga1
    public final void DjW() {
        A02("skip");
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Clj(new Y7A("facebook_connect", this.A06, null, null, null, null, null, null));
        }
        if (A03()) {
            AbstractC35174FfR.A00(EnumC72435Xdf.A02, this.A04, "upsell_secondary_click");
        }
        InterfaceC37222GaX interfaceC37222GaX = this.A01;
        if (interfaceC37222GaX != null) {
            ((BusinessConversionActivity) interfaceC37222GaX).A0p(AbstractC31174DnI.A0F("fb_account_linked", null), true);
        }
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        if (this.A07) {
            ViewOnClickListenerC35690FpP.A02(AbstractC31174DnI.A0K(), interfaceC56362iU, this, 6);
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        AbstractC18680vv abstractC18680vv = this.A04;
        intent.getClass();
        if (i2 == -1) {
            C1L2.A01(intent, abstractC18680vv, AbstractC35092Fd3.A00(requireActivity(), (UserSession) abstractC18680vv, this.A08));
        } else {
            CallerContext callerContext = C1L2.A00;
            if (i == 64206) {
                AbstractC31171DnF.A0z(2131965778);
                A01(this);
                super.onActivityResult(i, i2, intent);
            }
        }
        A00(this);
        super.onActivityResult(i, i2, intent);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Cid(new Y7A("facebook_connect", this.A06, null, null, null, null, null, null));
        }
        if (this.A07) {
            InterfaceC37222GaX interfaceC37222GaX = this.A01;
            interfaceC37222GaX.getClass();
            interfaceC37222GaX.EL3(AbstractC31174DnI.A0F("fb_account_linked", null));
            return true;
        }
        return true;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A04;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A01 = AbstractC35211Fg4.A01(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0046, code lost:
    
        if (r2 != com.instagram.business.controller.datamodel.ConversionStep.A0G) goto L9;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            r0 = -275909405(0xffffffffef8df4e3, float:-8.786687E28)
            int r3 = X.C0f9.A02(r0)
            super.onCreate(r5)
            java.lang.String r0 = X.AbstractC31180DnO.A0b(r4)
            r0.getClass()
            r4.A06 = r0
            X.0vv r0 = X.AbstractC31176DnK.A0R(r4)
            r4.A04 = r0
            r0.getClass()
            X.EVO.A00(r4)
            X.GaX r0 = r4.A01
            if (r0 == 0) goto L3b
            X.0vv r2 = r4.A04
            X.6s5 r1 = r0.B77()
            X.GaX r0 = r4.A01
            com.instagram.business.activity.BusinessConversionActivity r0 = (com.instagram.business.activity.BusinessConversionActivity) r0
            X.0do r0 = r0.A0C
            java.lang.Object r0 = X.AbstractC166987dD.A17(r0)
            java.lang.String r0 = (java.lang.String) r0
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = X.AbstractC151606s6.A00(r1, r4, r2, r0)
            r4.A00 = r0
        L3b:
            X.GaX r0 = r4.A01
            if (r0 == 0) goto L48
            com.instagram.business.controller.datamodel.ConversionStep r2 = r0.E3w()
            com.instagram.business.controller.datamodel.ConversionStep r1 = com.instagram.business.controller.datamodel.ConversionStep.A0G
            r0 = 0
            if (r2 == r1) goto L49
        L48:
            r0 = 1
        L49:
            r4.A07 = r0
            r0 = -616750385(0xffffffffdb3d22cf, float:-5.3237043E16)
            X.C0f9.A09(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.fragment.ConnectFBPageFragment.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        EVM evm;
        int A02 = C0f9.A02(2006500486);
        boolean A03 = A03();
        int i = R.layout.connect_fb_fragment;
        if (A03) {
            i = R.layout.connect_fb_igds_fragment;
        }
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, i);
        if (A03()) {
            this.A05 = AbstractC31172DnG.A0j(A0A, R.id.navigation_bar);
            int i2 = 2131965777;
            if (A03()) {
                i2 = 2131956789;
            }
            int i3 = 2131974116;
            if (A03()) {
                i3 = 2131968689;
            }
            IgdsBottomButtonLayout igdsBottomButtonLayout = this.A05;
            igdsBottomButtonLayout.getClass();
            evm = new EVM(this, igdsBottomButtonLayout, i2, i3);
        } else {
            BusinessNavBar businessNavBar = (BusinessNavBar) A0A.findViewById(R.id.navigation_bar);
            this.A02 = businessNavBar;
            int i4 = 2131965777;
            if (A03()) {
                i4 = 2131956789;
            }
            int i5 = 2131974116;
            if (A03()) {
                i5 = 2131968689;
            }
            evm = new EVM(businessNavBar, this, i4, i5);
        }
        this.A03 = evm;
        registerLifecycleListener(evm);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Clo(new Y7A("facebook_connect", this.A06, null, null, null, null, null, null));
        }
        if (A03()) {
            AbstractC35174FfR.A00(EnumC72435Xdf.A02, this.A04, "upsell_impressions");
        }
        C0f9.A09(2026544249, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1379720923);
        super.onDestroyView();
        unregisterLifecycleListener(this.A03);
        C0f9.A09(379728544, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1715915950);
        super.onResume();
        Drawable drawable = requireContext().getDrawable(R.drawable.ig_illustrations_illo_fb_connect_refresh);
        drawable.getClass();
        if (A03()) {
            IgdsHeadline A0Q = AbstractC31179DnN.A0Q(requireView(), R.id.headline);
            A0Q.setImageDrawable(requireContext().getDrawable(R.drawable.fx_upsell_assets_account_center_logout_value_prop_image));
            A0Q.setHeadline(2131963010);
            int i = 2131963008;
            if (AbstractC31178DnM.A1X(C06090Tz.A05, this.A04, 36318312174458974L)) {
                i = 2131963009;
            }
            A0Q.setBody(i);
        } else {
            View view = this.mView;
            view.getClass();
            AbstractC31173DnH.A0I(view, R.id.image).setImageDrawable(drawable);
            AbstractC31180DnO.A06(view).setText(2131956622);
            AbstractC31176DnK.A0E(this.mView).setText(2131956626);
        }
        C0f9.A09(-1360048063, A02);
    }
}
