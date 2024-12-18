package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* loaded from: classes6.dex */
public final class EL0 extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "TwoFacAuthenticatorAppConfirmFragment";
    public boolean A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Ehk(getString(2131975847));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC31182DnR.A02();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public static final void A00(EL0 el0) {
        FRQ A00 = AbstractC35179FfW.A00();
        Bundle requireArguments = el0.requireArguments();
        Integer num = C05F.A01;
        AbstractC31179DnN.A0y(A00.A01(requireArguments, num, num, "", false), el0.requireActivity(), el0.A01);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        getParentFragmentManager().A0x(AbstractC31178DnM.A0Z(), 0);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-346998489);
        super.onCreate(bundle);
        AbstractC35075Fcm.A02(AbstractC166987dD.A0r(this.A01), "enter_code_from_auth_app");
        C0f9.A09(2031026664, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(425497743);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.two_fac_authenticator_app_fragment, viewGroup, false);
        IgdsHeadline A0Q = AbstractC31179DnN.A0Q(inflate, R.id.two_factor_headline);
        A0Q.setImageResource(R.drawable.ig_illustrations_illo_2fac_code_refresh);
        A0Q.setHeadline(2131975849);
        A0Q.setBody(AbstractC31174DnI.A0w(this, requireArguments().getString("arg_two_fac_app_name"), 2131975848));
        C64P c64p = (C64P) inflate.requireViewById(R.id.next_bottom_button);
        AbstractC31173DnH.A1H(this, c64p, 2131968535);
        c64p.setPrimaryActionOnClickListener(new ViewOnClickListenerC35677FpC(this, 45));
        c64p.setSecondaryAction(getText(2131975857), new ViewOnClickListenerC35677FpC(this, 46));
        EVO.A01(this);
        C0f9.A09(319297835, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-1212020503);
        super.onStart();
        String A13 = AbstractC31172DnG.A13(requireArguments(), "arg_totp_seed");
        if (!this.A00 && A13 != null) {
            this.A00 = true;
            String username = AbstractC31176DnK.A0g(C17060sy.A01, this.A01).getUsername();
            String str = AbstractC14490oL.A02;
            C12260kU.A03(AbstractC31177DnL.A07(AnonymousClass001.A11("otpauth://totp/Instagram:", username, "?secret=", A13, "&issuer=Instagram")), this);
        }
        C0f9.A09(-869669048, A02);
    }
}
