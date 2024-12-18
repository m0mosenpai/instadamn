package com.instagram.profile.edit.fragment;

import X.AbstractC018607g;
import X.AbstractC10360h2;
import X.AbstractC152476ta;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25233BEq;
import X.AbstractC25651Mw;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC31179DnN;
import X.AbstractC31180DnO;
import X.AbstractC35211Fg4;
import X.AbstractC59962oe;
import X.C05F;
import X.C0f9;
import X.C1GJ;
import X.C1ON;
import X.C1QI;
import X.C2AS;
import X.C2E7;
import X.C31456Ds0;
import X.C31722DwR;
import X.C31728DwZ;
import X.C34649FOh;
import X.C35905FtP;
import X.C3CZ;
import X.C6WQ;
import X.EnumC222416a;
import X.GBZ;
import X.InterfaceC37218GaT;
import X.InterfaceC37222GaX;
import X.InterfaceC37280Gbh;
import X.InterfaceC41501vz;
import X.InterfaceC56362iU;
import X.InterfaceC60072op;
import X.InterfaceC60122ou;
import X.ViewOnClickListenerC31724DwT;
import X.Y7A;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.actionbar.ActionButton;
import com.instagram.aistudio.profile.model.AiStudioProfileBannerModel;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.profile.edit.controller.EditProfileFieldsController;
import com.instagram.profile.edit.controller.editcontrollerexpression.EditProfileExpressionController;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public class CompleteYourProfileFragment extends AbstractC59962oe implements InterfaceC60072op, InterfaceC37218GaT, InterfaceC60122ou {
    public C3CZ A00;
    public BusinessFlowAnalyticsLogger A01;
    public UserSession A02;
    public C34649FOh A03;
    public EditProfileFieldsController A04;
    public User A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public InterfaceC37222GaX A0A;
    public IgImageView mAvatarImageView;
    public TextView mChangeAvatarButton;
    public ActionButton mSaveButton;
    public final GBZ A0C = new GBZ(this);
    public boolean A09 = true;
    public final InterfaceC41501vz A0B = C31728DwZ.A00(this, 17);

    @Override // X.InterfaceC37218GaT
    public final AiStudioProfileBannerModel Aak() {
        return null;
    }

    @Override // X.InterfaceC37218GaT
    public final View.OnClickListener B8x() {
        return null;
    }

    @Override // X.InterfaceC37218GaT
    public final View.OnClickListener CE9() {
        return null;
    }

    @Override // X.InterfaceC37218GaT
    public final boolean CSq() {
        return false;
    }

    @Override // X.InterfaceC37218GaT
    public final boolean CSt() {
        return false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "complete_your_profile_fragment";
    }

    public static void A00(CompleteYourProfileFragment completeYourProfileFragment) {
        if (completeYourProfileFragment.mView != null && completeYourProfileFragment.A03 != null) {
            A02(completeYourProfileFragment);
            GBZ gbz = completeYourProfileFragment.A0C;
            gbz.A00 = false;
            completeYourProfileFragment.A04.A0B(null, completeYourProfileFragment.A03, completeYourProfileFragment.A05);
            gbz.A00 = true;
            A01(completeYourProfileFragment);
        }
    }

    public static void A01(CompleteYourProfileFragment completeYourProfileFragment) {
        ActionButton actionButton = completeYourProfileFragment.mSaveButton;
        if (actionButton != null && completeYourProfileFragment.mView != null) {
            actionButton.setEnabled(completeYourProfileFragment.A04.A0D());
        }
    }

    public static void A02(CompleteYourProfileFragment completeYourProfileFragment) {
        IgImageView igImageView = completeYourProfileFragment.mAvatarImageView;
        if (igImageView != null) {
            AbstractC31173DnH.A1T(completeYourProfileFragment, igImageView, completeYourProfileFragment.A05);
        }
        if (completeYourProfileFragment.mChangeAvatarButton != null) {
            boolean A1k = completeYourProfileFragment.A05.A1k();
            TextView textView = completeYourProfileFragment.mChangeAvatarButton;
            int i = 2131955025;
            if (A1k) {
                i = 2131952349;
            }
            textView.setText(i);
        }
    }

    public static void A03(CompleteYourProfileFragment completeYourProfileFragment, String str) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = completeYourProfileFragment.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Clv(new Y7A("profile_completion", completeYourProfileFragment.A06, "continue", str, null, null, null, null));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        ?? obj = new Object();
        obj.A02 = "";
        this.mSaveButton = C31722DwR.A00(new ViewOnClickListenerC31724DwT(this, 57), interfaceC56362iU, obj);
        A01(this);
        AbstractC31180DnO.A17(new ViewOnClickListenerC31724DwT(this, 58), AbstractC31176DnK.A0I(), interfaceC56362iU);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        if (this.A09 && (businessFlowAnalyticsLogger = this.A01) != null) {
            businessFlowAnalyticsLogger.Cid(new Y7A("profile_completion", this.A06, null, null, null, null, null, null));
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC37218GaT
    public final InterfaceC37280Gbh Bhd() {
        return this.A0C;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A02;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.A00.A08(intent, i, i2, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A0A = AbstractC35211Fg4.A01(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1466685548);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        UserSession A0S = AbstractC31176DnK.A0S(this);
        this.A02 = A0S;
        EditProfileFieldsController editProfileFieldsController = new EditProfileFieldsController(AbstractC018607g.A00(this), A0S, false);
        this.A04 = editProfileFieldsController;
        registerLifecycleListener(editProfileFieldsController);
        this.A05 = AbstractC166987dD.A10(this.A02);
        this.A06 = AbstractC31171DnF.A0Z(requireArguments);
        this.A08 = requireArguments.getBoolean("ARG_CHECKLIST_ITEM_COMPLETED", false);
        BusinessFlowAnalyticsLogger A00 = AbstractC35211Fg4.A00(this.A0A, this, this.A02);
        this.A01 = A00;
        if (A00 != null) {
            A00.Clo(new Y7A("profile_completion", this.A06, null, null, null, null, null, null));
        }
        boolean z = C3CZ.A0G;
        UserSession userSession = this.A02;
        AbstractC10360h2 A0I = AbstractC31174DnI.A0I(this);
        User user = this.A05;
        C35905FtP c35905FtP = new C35905FtP(this, 2);
        Integer num = C05F.A0s;
        AbstractC25233BEq.A0w(1, userSession, A0I, user);
        this.A00 = new C3CZ(this, A0I, c35905FtP, userSession, user, num, null);
        C6WQ A0T = AbstractC31180DnO.A0T(this);
        A0T.A00(getString(2131965660));
        C1ON A06 = AbstractC152476ta.A06(this.A02);
        C31456Ds0.A00(A06, this, A0T, 39);
        C1GJ.A03(A06);
        C0f9.A09(1360781239, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1359328329);
        View inflate = layoutInflater.inflate(R.layout.fragment_complete_your_profile, viewGroup, false);
        this.A04.A0C(inflate, (ScrollView) inflate, requireActivity(), getViewLifecycleOwner(), null, this, this.A05, false, false);
        AbstractC31180DnO.A06(inflate).setText(2131956559);
        TextView A0E = AbstractC31176DnK.A0E(inflate);
        int i = 2131956558;
        if (C2E7.A01(this.A05)) {
            i = 2131956557;
        }
        A0E.setText(i);
        C0f9.A09(2016693768, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1774528546);
        super.onDestroyView();
        AbstractC25651Mw.A00(this.A02).A02(this.A0B, C2AS.class);
        this.mSaveButton = null;
        C0f9.A09(-2105393123, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-2060869903);
        super.onPause();
        FragmentActivity activity = getActivity();
        if (activity != null && activity.getWindow() != null) {
            activity.getWindow().setSoftInputMode(48);
        }
        C0f9.A09(1939939026, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1557717387);
        super.onResume();
        A01(this);
        Window A0H = AbstractC31174DnI.A0H(this);
        A0H.getClass();
        A0H.setSoftInputMode(32);
        C0f9.A09(254190277, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        EditProfileExpressionController editProfileExpressionController;
        IgFormField igFormField;
        super.onViewCreated(view, bundle);
        IgImageView A0Z = AbstractC31172DnG.A0Z(view, R.id.profile_pic_imageview);
        this.mAvatarImageView = A0Z;
        A0Z.setVisibility(0);
        ViewOnClickListenerC31724DwT.A00(this.mAvatarImageView, 55, this);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.change_avatar_button);
        this.mChangeAvatarButton = A0T;
        A0T.setVisibility(0);
        TextView textView = this.mChangeAvatarButton;
        boolean z = C1QI.A0E().A00;
        Context requireContext = requireContext();
        AbstractC166987dD.A1O(requireContext, textView, AbstractC31179DnN.A00(requireContext, this, z ? 1 : 0));
        ViewOnClickListenerC31724DwT.A00(this.mChangeAvatarButton, 56, this);
        A00(this);
        EnumC222416a A0I = this.A05.A0I();
        if (A0I != null) {
            EditProfileFieldsController editProfileFieldsController = this.A04;
            if (A0I == EnumC222416a.A05 && (editProfileExpressionController = editProfileFieldsController.A05) != null && (igFormField = editProfileExpressionController.nameField) != null) {
                igFormField.setLabelText(editProfileFieldsController.A06().getString(2131954418));
            }
        }
        AbstractC25651Mw.A00(this.A02).A01(this.A0B, C2AS.class);
    }
}
