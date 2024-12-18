package X;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.registration.ui.NotificationBar;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.user.model.User;

/* renamed from: X.ELi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32318ELi extends AbstractC59962oe implements InterfaceC60072op, InterfaceC37221GaW {
    public static final String __redex_internal_original_name = "OneClickPasswordResetFragment";
    public EditText A00;
    public UserSession A01;
    public NotificationBar A02;
    public EVN A03;
    public String A04;
    public String A05;
    public android.net.Uri A06;
    public View A07;
    public ProgressButton A08;

    @Override // X.InterfaceC37221GaW
    public final EnumC33445EqI B75() {
        return null;
    }

    @Override // X.InterfaceC37221GaW
    public final void Dbn(boolean z) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "one_click_password_reset";
    }

    public static void A00(C32318ELi c32318ELi) {
        AbstractC31525Dt9.A05(c32318ELi.getActivity(), c32318ELi.A06, c32318ELi, c32318ELi.A01);
    }

    @Override // X.InterfaceC37221GaW
    public final void APP() {
        this.A08.setEnabled(false);
        this.A07.setEnabled(false);
    }

    @Override // X.InterfaceC37221GaW
    public final void ARU() {
        this.A08.setEnabled(true);
        this.A07.setEnabled(true);
    }

    @Override // X.InterfaceC37221GaW
    public final boolean CbE() {
        if (AbstractC13880nE.A0J(this.A00).length() < 6) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC37221GaW
    public final void DVq() {
        this.A02.A02();
        FD5.A00(this.A01, "one_click_pwd_reset");
        UserSession userSession = this.A01;
        String A0g = AbstractC167007dF.A0g(this.A00);
        String str = this.A04;
        String str2 = this.A05;
        String A0l = AbstractC31173DnH.A0l(this);
        String A0m = AbstractC31176DnK.A0m(this);
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0B("accounts/change_password/");
        A0M.A9s("enc_new_password", AbstractC31176DnK.A0p(userSession, A0g));
        AbstractC31171DnF.A1J(A0M, userSession.userId);
        A0M.A9s("access_pw_reset_token", str);
        AbstractC31180DnO.A1R(A0M, CacheBehaviorLogger.SOURCE, str2, A0l, A0m);
        C1ON A0I = AbstractC31178DnM.A0I(A0M, C40781ul.class, C55702hA.class);
        A0I.A00 = new C31456Ds0(32, this, this);
        schedule(A0I);
    }

    @Override // X.InterfaceC37221GaW
    public final EnumC31713DwI C0Q() {
        return EnumC31713DwI.A16;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A01;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        A00(this);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1842430290);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = AbstractC31176DnK.A0S(this);
        this.A04 = AbstractC31173DnH.A0j(requireArguments, "argument_token");
        this.A05 = AbstractC31173DnH.A0j(requireArguments, "argument_source");
        this.A06 = (android.net.Uri) requireArguments.getParcelable("argument_redirect_uri");
        UserSession userSession = this.A01;
        AbstractC167017dG.A1N(userSession, "one_click_pwd_reset");
        C35203Ffv.A01(userSession, "one_click_pwd_reset");
        C0f9.A09(1462431658, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1357909530);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.fragment_one_click_password_reset);
        AbstractC166997dE.A0T(A0A, R.id.field_title).setText(2131961861);
        this.A02 = AbstractC31180DnO.A0S(A0A);
        EditText A0H = AbstractC31173DnH.A0H(A0A, R.id.new_password);
        this.A00 = A0H;
        A0H.setTypeface(Typeface.DEFAULT);
        AbstractC31179DnN.A0s(this.A00);
        User A10 = AbstractC166987dD.A10(this.A01);
        AbstractC31173DnH.A1T(this, AbstractC31172DnG.A0Z(A0A, R.id.user_profile_picture), A10);
        AbstractC31177DnL.A10(AbstractC166997dE.A0T(A0A, R.id.field_detail), this, A10.getUsername(), 2131972460);
        ProgressButton progressButton = (ProgressButton) A0A.findViewById(R.id.next_button);
        this.A08 = progressButton;
        EVN evn = new EVN(this.A00, this.A01, this, progressButton, 2131972459);
        this.A03 = evn;
        registerLifecycleListener(evn);
        View requireViewById = A0A.requireViewById(R.id.skip_text);
        this.A07 = requireViewById;
        ViewOnClickListenerC35677FpC.A00(requireViewById, 28, this);
        C0f9.A09(-1330606596, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-688851188);
        super.onDestroy();
        C0f9.A09(-526760338, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(785916726);
        super.onDestroyView();
        this.A00 = null;
        this.A08 = null;
        this.A07 = null;
        this.A02 = null;
        unregisterLifecycleListener(this.A03);
        C0f9.A09(611071929, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1250535983);
        super.onPause();
        if (requireActivity().getCurrentFocus() != null) {
            AbstractC13880nE.A0O(requireActivity().getCurrentFocus());
        }
        C0f9.A09(1021350735, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1246472770);
        super.onResume();
        ((BaseFragmentActivity) requireActivity()).A0d();
        C0f9.A09(2099254657, A02);
    }
}
