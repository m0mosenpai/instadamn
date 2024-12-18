package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.EKf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32292EKf extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "TwoFacAuthenticatorAppSetupFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Ehk(AbstractC166997dE.A0N(this).getString(2131975952));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC31182DnR.A02();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        getParentFragmentManager().A0x(AbstractC31178DnM.A0Z(), 0);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(157634974);
        super.onCreate(bundle);
        AbstractC35075Fcm.A02(AbstractC166987dD.A0r(this.A00), "get_code_from_auth_app");
        C0f9.A09(-911052219, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-109050813);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.two_fac_authenticator_app_fragment, viewGroup, false);
        IgdsHeadline A0Q = AbstractC31179DnN.A0Q(inflate, R.id.two_factor_headline);
        A0Q.setImageResource(R.drawable.ig_illustrations_illo_2fac_code_refresh);
        A0Q.setHeadline(AbstractC31174DnI.A0w(this, requireArguments().getString("arg_two_fac_app_name"), 2131975859));
        A0Q.setBody(2131975858);
        C64P c64p = (C64P) inflate.requireViewById(R.id.next_bottom_button);
        AbstractC31173DnH.A1H(this, c64p, 2131968535);
        c64p.setPrimaryActionOnClickListener(new ViewOnClickListenerC35677FpC(this, 49));
        c64p.setSecondaryAction(getText(2131975857), new ViewOnClickListenerC35677FpC(this, 50));
        EVO.A01(this);
        C0f9.A09(214527831, A02);
        return inflate;
    }
}
