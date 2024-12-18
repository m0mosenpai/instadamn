package com.instagram.business.fragment;

import X.AbstractC151606s6;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC31179DnN;
import X.AbstractC35211Fg4;
import X.AbstractC59962oe;
import X.C0f9;
import X.C14360o3;
import X.C16Z;
import X.C34951Fab;
import X.EVM;
import X.EVO;
import X.EnumC222416a;
import X.FTW;
import X.InterfaceC37190Ga1;
import X.InterfaceC37222GaX;
import X.InterfaceC56362iU;
import X.InterfaceC60072op;
import X.InterfaceC60122ou;
import X.ViewOnClickListenerC35690FpP;
import X.Y7A;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.List;

/* loaded from: classes6.dex */
public class ProfessionalAccountDescriptionFragment extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou, InterfaceC37190Ga1 {
    public BusinessFlowAnalyticsLogger A00;
    public InterfaceC37222GaX A01;
    public String A02;
    public UserSession A03;
    public EnumC222416a A04;
    public BusinessNavBar mBusinessNavBar;
    public EVM mBusinessNavBarHelper;
    public View mMainView;

    @Override // X.InterfaceC37190Ga1
    public final void APP() {
    }

    @Override // X.InterfaceC37190Ga1
    public final void ARU() {
    }

    @Override // X.InterfaceC37190Ga1
    public final void DjW() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "professional_account_description_fragment";
    }

    @Override // X.InterfaceC37190Ga1
    public final void Dao() {
        ((BusinessConversionActivity) this.A01).CnD(null);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Cm3(new Y7A("value_props", this.A02, "continue", null, null, null, null, null));
        }
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger2 = this.A00;
        if (businessFlowAnalyticsLogger2 != null) {
            businessFlowAnalyticsLogger2.CjL(new Y7A("value_props", this.A02, null, null, null, null, null, null));
        }
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Cid(new Y7A("value_props", this.A02, null, null, null, null, null, null));
        }
        if (AbstractC35211Fg4.A03(this.A01) && AbstractC166987dD.A10(this.A03).A0I() != EnumC222416a.A07) {
            this.A01.AGf();
            return true;
        }
        AbstractC31179DnN.A1T(this.A01);
        return true;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        ViewOnClickListenerC35690FpP.A02(AbstractC31174DnI.A0K(), interfaceC56362iU, this, 32);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A03;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        InterfaceC37222GaX A01 = AbstractC35211Fg4.A01(this);
        A01.getClass();
        this.A01 = A01;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(523760863);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        bundle2.getClass();
        UserSession A0S = AbstractC31176DnK.A0S(this);
        this.A03 = A0S;
        this.A00 = AbstractC151606s6.A00(this.A01.B77(), this, A0S, (String) AbstractC166987dD.A17(((BusinessConversionActivity) this.A01).A0C));
        this.A02 = AbstractC31172DnG.A13(bundle2, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        this.A04 = C16Z.A00(bundle2.getInt("selected_account_type"));
        EVO.A00(this);
        C0f9.A09(506673393, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String A0p;
        String A0p2;
        Drawable drawable;
        int A02 = C0f9.A02(1562725913);
        View inflate = layoutInflater.inflate(R.layout.stacked_value_props, viewGroup, false);
        this.mMainView = inflate;
        ViewGroup A0F = AbstractC31173DnH.A0F(inflate, R.id.value_props_container);
        View findViewById = this.mMainView.findViewById(R.id.scroll_view);
        BusinessNavBar businessNavBar = (BusinessNavBar) this.mMainView.requireViewById(R.id.navigation_bar);
        this.mBusinessNavBar = businessNavBar;
        EVM evm = new EVM(businessNavBar, this, 2131968535, -1);
        this.mBusinessNavBarHelper = evm;
        registerLifecycleListener(evm);
        this.mBusinessNavBar.A01(findViewById);
        Context requireContext = requireContext();
        UserSession userSession = this.A03;
        EnumC222416a enumC222416a = this.A04;
        Context requireContext2 = requireContext();
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(enumC222416a, 1);
        List<C34951Fab> A01 = FTW.A01(requireContext2, enumC222416a, false);
        int ordinal = enumC222416a.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 1 && ordinal != 0) {
                    throw AbstractC166987dD.A12("No supported onboarding configuration for account type");
                }
                throw AbstractC166987dD.A12("No supported onboarding configuration for account type");
            }
            A0p = AbstractC166997dE.A0p(requireContext2, 2131952111);
            A0p2 = AbstractC166997dE.A0p(requireContext2, 2131952110);
            drawable = requireContext2.getDrawable(R.drawable.instagram_media_account_pano_outline_24);
            if (drawable == null) {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else {
            A0p = AbstractC166997dE.A0p(requireContext2, 2131952109);
            A0p2 = AbstractC166997dE.A0p(requireContext2, 2131952108);
            drawable = requireContext2.getDrawable(R.drawable.instagram_business_pano_outline_24);
            if (drawable == null) {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        ImageView A08 = AbstractC31171DnF.A08(A0F, R.id.title_icon);
        TextView A0e = AbstractC166987dD.A0e(A0F, R.id.title);
        TextView A0e2 = AbstractC166987dD.A0e(A0F, R.id.subtitle);
        if (A08 != null) {
            A08.setImageDrawable(drawable);
        }
        if (A0e != null) {
            A0e.setText(A0p);
        }
        if (A0e2 != null) {
            A0e2.setText(A0p2);
        }
        for (C34951Fab c34951Fab : A01) {
            View inflate2 = layoutInflater.inflate(R.layout.stacked_value_props_row, A0F, false);
            String str = c34951Fab.A03;
            String str2 = c34951Fab.A02;
            Drawable drawable2 = requireContext.getDrawable(c34951Fab.A01);
            TextView A0T = AbstractC166997dE.A0T(inflate2, R.id.title);
            TextView A0T2 = AbstractC166997dE.A0T(inflate2, R.id.subtitle);
            ImageView A0I = AbstractC31173DnH.A0I(inflate2, R.id.icon);
            A0T.setText(str);
            A0T2.setText(str2);
            A0I.setImageDrawable(drawable2);
            A0F.addView(inflate2);
        }
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Clo(new Y7A("value_props", this.A02, null, null, null, null, null, null));
        }
        View view = this.mMainView;
        C0f9.A09(-1558325978, A02);
        return view;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-590947068);
        super.onDestroyView();
        unregisterLifecycleListener(this.mBusinessNavBarHelper);
        C0f9.A09(-1613655386, A02);
    }
}
