package com.instagram.business.fragment;

import X.AbstractC151606s6;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC18680vv;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC31178DnM;
import X.AbstractC31180DnO;
import X.AbstractC34025F0e;
import X.AbstractC35211Fg4;
import X.AbstractC59962oe;
import X.C06090Tz;
import X.C08730cb;
import X.C0f9;
import X.C0fQ;
import X.C14360o3;
import X.C17060sy;
import X.C1GJ;
import X.C1ON;
import X.C31456Ds0;
import X.C32548EUy;
import X.C34577FLm;
import X.C9GR;
import X.EVM;
import X.EnumC151596s5;
import X.EnumC222416a;
import X.FIK;
import X.FXB;
import X.Fp1;
import X.InterfaceC37190Ga1;
import X.InterfaceC37191Ga2;
import X.InterfaceC37222GaX;
import X.InterfaceC60072op;
import X.RunnableC36807GKg;
import X.ViewOnClickListenerC35684FpJ;
import X.Y7A;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class AccountTypeSelectionV2Fragment extends AbstractC59962oe implements InterfaceC60072op, InterfaceC37191Ga2, InterfaceC37190Ga1 {
    public BusinessFlowAnalyticsLogger A00;
    public EVM A01;
    public UserSession A02;
    public EnumC222416a A03;
    public EnumC222416a A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public final Handler A08 = AbstractC167007dF.A0J();
    public RadioButton mBusinessRadioButton;
    public InterfaceC37222GaX mController;
    public RadioButton mCreatorRadioButton;

    @Override // X.InterfaceC37190Ga1
    public final void APP() {
    }

    @Override // X.InterfaceC37190Ga1
    public final void ARU() {
    }

    @Override // X.InterfaceC37191Ga2
    public final void Dfz() {
    }

    @Override // X.InterfaceC37190Ga1
    public final void DjW() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "account_type_selection_v2_fragment";
    }

    public static void A00(EnumC151596s5 enumC151596s5, AccountTypeSelectionV2Fragment accountTypeSelectionV2Fragment) {
        InterfaceC37222GaX interfaceC37222GaX = accountTypeSelectionV2Fragment.mController;
        if (interfaceC37222GaX != null) {
            interfaceC37222GaX.EUd(enumC151596s5);
            AbstractC31174DnI.A1S(accountTypeSelectionV2Fragment.mController);
        }
        if (accountTypeSelectionV2Fragment.A00 != null) {
            String str = accountTypeSelectionV2Fragment.A05;
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put("preselected_account_type", accountTypeSelectionV2Fragment.A03.A01);
            HashMap A1G2 = AbstractC166987dD.A1G();
            A1G2.put("selected_account_type", accountTypeSelectionV2Fragment.A04.A01);
            accountTypeSelectionV2Fragment.A00.CjL(new Y7A("account_type_selection", str, null, null, null, A1G, A1G2, null));
        }
        InterfaceC37222GaX interfaceC37222GaX2 = accountTypeSelectionV2Fragment.mController;
        if (interfaceC37222GaX2 != null) {
            AbstractC151606s6.A00(enumC151596s5, accountTypeSelectionV2Fragment, accountTypeSelectionV2Fragment.A02, (String) AbstractC166987dD.A17(((BusinessConversionActivity) interfaceC37222GaX2).A0C));
        }
    }

    public static void A01(AccountTypeSelectionV2Fragment accountTypeSelectionV2Fragment) {
        EnumC151596s5 enumC151596s5;
        if (accountTypeSelectionV2Fragment.mController != null) {
            boolean z = accountTypeSelectionV2Fragment.A06;
            EnumC222416a A0I = AbstractC166987dD.A10(accountTypeSelectionV2Fragment.A02).A0I();
            EnumC222416a enumC222416a = EnumC222416a.A06;
            if (z) {
                if (A0I == enumC222416a) {
                    enumC151596s5 = EnumC151596s5.A06;
                } else {
                    enumC151596s5 = EnumC151596s5.A03;
                }
            } else if (A0I == enumC222416a) {
                enumC151596s5 = EnumC151596s5.A05;
            } else {
                enumC151596s5 = EnumC151596s5.A04;
            }
            if (AbstractC31178DnM.A1X(C06090Tz.A05, accountTypeSelectionV2Fragment.A02, 36316808935903900L)) {
                BusinessFlowAnalyticsLogger A00 = AbstractC151606s6.A00(enumC151596s5, accountTypeSelectionV2Fragment, accountTypeSelectionV2Fragment.A02, (String) AbstractC166987dD.A17(((BusinessConversionActivity) accountTypeSelectionV2Fragment.mController).A0C));
                C34577FLm c34577FLm = new C34577FLm(A00, enumC151596s5, new FIK(enumC151596s5, accountTypeSelectionV2Fragment), accountTypeSelectionV2Fragment);
                UserSession userSession = accountTypeSelectionV2Fragment.A02;
                C14360o3.A0B(userSession, 0);
                C31456Ds0 c31456Ds0 = new C31456Ds0(10, c34577FLm, A00);
                C1ON A002 = FXB.A00(userSession, "email_and_sms");
                A002.A00 = c31456Ds0;
                C1GJ.A03(A002);
                return;
            }
            A00(enumC151596s5, accountTypeSelectionV2Fragment);
        }
    }

    public static void A02(AccountTypeSelectionV2Fragment accountTypeSelectionV2Fragment, String str) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        if (!accountTypeSelectionV2Fragment.A07 && (businessFlowAnalyticsLogger = accountTypeSelectionV2Fragment.A00) != null) {
            businessFlowAnalyticsLogger.Cm3(new Y7A("account_type_selection", accountTypeSelectionV2Fragment.A05, str, null, null, null, null, null));
        }
    }

    @Override // X.InterfaceC37190Ga1
    public final void Dao() {
        A02(this, "continue");
        if (this.mController != null && this.A04 != AbstractC166987dD.A10(this.A02).A0I()) {
            ((BusinessConversionActivity) this.mController).A0o(requireContext(), this, this, this.A04, "account_type_selection", true);
            return;
        }
        if (this.mController != null) {
            EnumC222416a enumC222416a = EnumC222416a.A05;
            if (enumC222416a.equals(this.A04) && enumC222416a.equals(AbstractC166987dD.A10(this.A02).A0I())) {
                AbstractC34025F0e.A00(new C32548EUy(this, 6), this.A02, this, this.A06);
                return;
            }
        }
        A01(this);
    }

    @Override // X.InterfaceC37191Ga2
    public final void Dfs(String str, String str2, String str3) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Clv(new Y7A("account_type_selection", this.A05, "switch_to_professional", str2, str3, null, null, null));
        }
        C9GR.A09(requireContext(), str);
        this.A01.A00();
    }

    @Override // X.InterfaceC37191Ga2
    public final void DgF() {
        this.A01.A01();
    }

    @Override // X.InterfaceC37191Ga2
    public final void DgQ(EnumC222416a enumC222416a) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Clu(new Y7A("account_type_selection", this.A05, "switch_to_professional", null, null, null, null, null));
        }
        if (EnumC222416a.A05.equals(AbstractC166987dD.A10(this.A02).A0I())) {
            AbstractC34025F0e.A00(new C32548EUy(this, 6), this.A02, this, this.A06);
            return;
        }
        this.A08.post(new RunnableC36807GKg(this));
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Cid(new Y7A("account_type_selection", this.A05, null, null, null, null, null, null));
            return true;
        }
        return true;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A02;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.mController = AbstractC35211Fg4.A01(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        EnumC222416a enumC222416a;
        int A02 = C0f9.A02(34459038);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = AbstractC31176DnK.A0S(this);
        this.A05 = AbstractC31173DnH.A0j(requireArguments, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        InterfaceC37222GaX interfaceC37222GaX = this.mController;
        if (interfaceC37222GaX != null) {
            this.A00 = AbstractC151606s6.A00(interfaceC37222GaX.B77(), this, this.A02, (String) AbstractC166987dD.A17(((BusinessConversionActivity) this.mController).A0C));
        }
        UserSession userSession = this.A02;
        C08730cb c08730cb = C17060sy.A01;
        if (AbstractC31174DnI.A0l(userSession, c08730cb) != null) {
            enumC222416a = AbstractC31174DnI.A0l(this.A02, c08730cb);
            this.A03 = enumC222416a;
        } else {
            this.A03 = EnumC222416a.A08;
            enumC222416a = EnumC222416a.A05;
        }
        this.A04 = enumC222416a;
        this.A06 = AbstractC35211Fg4.A04(this.mController);
        C0f9.A09(404990344, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int A02 = C0f9.A02(-1007450277);
        this.A07 = true;
        View inflate = layoutInflater.inflate(R.layout.account_type_selection_v2_fragment, viewGroup, false);
        IgdsBottomButtonLayout A0j = AbstractC31172DnG.A0j(inflate, R.id.navigation_bar_igds_bottom_button);
        C14360o3.A0B(A0j, 2);
        EVM evm = new EVM(this, A0j, 2131968535, -1);
        this.A01 = evm;
        registerLifecycleListener(evm);
        EVM evm2 = this.A01;
        BusinessNavBar businessNavBar = evm2.A00;
        if (businessNavBar != null) {
            businessNavBar.setPrimaryButtonEnabled(false);
        } else {
            IgdsBottomButtonLayout igdsBottomButtonLayout = evm2.A02;
            if (igdsBottomButtonLayout != null) {
                igdsBottomButtonLayout.setPrimaryButtonEnabled(false);
            }
        }
        View requireViewById = inflate.requireViewById(R.id.header);
        TextView A06 = AbstractC31180DnO.A06(requireViewById);
        TextView A0E = AbstractC31176DnK.A0E(requireViewById);
        EnumC222416a enumC222416a = this.A03;
        EnumC222416a enumC222416a2 = EnumC222416a.A06;
        if (enumC222416a == enumC222416a2) {
            A06.setText(2131952119);
            i = 2131952118;
        } else {
            A06.setText(2131952117);
            i = 2131952116;
        }
        A0E.setText(i);
        EnumC222416a enumC222416a3 = this.A03;
        View requireViewById2 = inflate.requireViewById(R.id.card_1);
        View view = requireViewById2;
        View requireViewById3 = inflate.requireViewById(R.id.card_2);
        if (enumC222416a3 != enumC222416a2) {
            view = requireViewById3;
            requireViewById3 = requireViewById2;
        }
        ViewGroup A0F = AbstractC31173DnH.A0F(requireViewById3, R.id.container_value_prop);
        ViewGroup A0F2 = AbstractC31173DnH.A0F(view, R.id.container_value_prop);
        A0F.setVisibility(8);
        A0F2.setVisibility(8);
        this.mBusinessRadioButton = (RadioButton) requireViewById3.requireViewById(R.id.radio_account_type);
        this.mCreatorRadioButton = (RadioButton) view.requireViewById(R.id.radio_account_type);
        C0fQ.A00(new ViewOnClickListenerC35684FpJ(A0F, A0F2, this, 4), this.mBusinessRadioButton);
        C0fQ.A00(new ViewOnClickListenerC35684FpJ(A0F2, A0F, this, 5), this.mCreatorRadioButton);
        Fp1.A00(requireViewById3, 56, this);
        Fp1.A00(view, 57, this);
        AbstractC166997dE.A0T(requireViewById3, R.id.text_card_title).setText(2131952109);
        AbstractC166997dE.A0T(requireViewById3, R.id.text_card_description).setText(2131952108);
        AbstractC166997dE.A0T(view, R.id.text_card_title).setText(2131952111);
        AbstractC166997dE.A0T(view, R.id.text_card_description).setText(2131952110);
        if (this.A00 != null) {
            String str = this.A05;
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put("preselected_account_type", this.A03.A01);
            this.A00.Clo(new Y7A("account_type_selection", str, null, null, null, A1G, null, null));
        }
        C0f9.A09(1919441539, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-387637542);
        super.onDestroyView();
        unregisterLifecycleListener(this.A01);
        C0f9.A09(-63247709, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        RadioButton radioButton;
        int A02 = C0f9.A02(-1520255634);
        super.onViewStateRestored(bundle);
        int ordinal = this.A04.ordinal();
        if (ordinal != 2) {
            if (ordinal == 3) {
                radioButton = this.mCreatorRadioButton;
            }
            this.A07 = false;
            C0f9.A09(-1651681999, A02);
        }
        radioButton = this.mBusinessRadioButton;
        radioButton.performClick();
        this.A07 = false;
        C0f9.A09(-1651681999, A02);
    }
}
