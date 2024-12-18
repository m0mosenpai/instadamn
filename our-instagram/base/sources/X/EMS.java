package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* loaded from: classes6.dex */
public final class EMS extends AbstractC59962oe implements InterfaceC37221GaW, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ContactPointConfirmationFragment";
    public long A00;
    public EVN A01;
    public boolean A02;
    public TextView A03;
    public IgFormField A04;
    public IgdsHeadline A05;
    public ProgressButton A06;
    public final InterfaceC09390do A08 = AbstractC60492pY.A02(this);
    public String A07 = "email";

    @Override // X.InterfaceC37221GaW
    public final void APP() {
    }

    @Override // X.InterfaceC37221GaW
    public final void ARU() {
    }

    @Override // X.InterfaceC37221GaW
    public final EnumC33445EqI B75() {
        return null;
    }

    @Override // X.InterfaceC37221GaW
    public final boolean CbE() {
        return true;
    }

    @Override // X.InterfaceC37221GaW
    public final void Dbn(boolean z) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "cp_acquisition_confirmation";
    }

    @Override // X.InterfaceC37221GaW
    public final void DVq() {
        String str;
        String str2;
        IgFormField igFormField = this.A04;
        if (igFormField == null || (str = AbstractC31174DnI.A0x(igFormField)) == null) {
            str = "";
        }
        Bundle bundle = this.mArguments;
        if (bundle == null || (str2 = bundle.getString("nux_contact_point")) == null) {
            str2 = "";
        }
        if (str.length() > 0 && str2.length() > 0) {
            EVN evn = this.A01;
            if (evn != null) {
                evn.A01();
            }
            UserSession A0r = AbstractC166987dD.A0r(this.A08);
            String A0c = AbstractC31180DnO.A0c(this);
            String A05 = C16030qx.A02.A05(requireContext());
            FH4 fh4 = new FH4(this);
            C14360o3.A0B(A0r, 0);
            C40701ud A01 = AbstractC40691uc.A01(A0r);
            C2JM A0b = AbstractC25225BEi.A0b();
            C2JM A0b2 = AbstractC25225BEi.A0b();
            C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, str2, "contact_point");
            C0CA.A00(A0T, A0c, AbstractC31189DnY.A02());
            C0CA.A00(A0T, A05, "guid");
            C0CA.A00(A0T, str, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
            C35826Fs2.A00(new C31463Ds7(fh4, 9), new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "data"), "NUXConfirmContactPointMutation", A0b.getParamsCopy(), A0b2.getParamsCopy(), C60018Qse.class, true, null, 0, null, "xdt_async_confirm_confirmation_code", AbstractC166987dD.A1E()), A01, fh4, 9);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A08);
    }

    public static final void A00(EMS ems, int i) {
        String A0p = AbstractC166997dE.A0p(ems.requireContext(), i);
        C41451vu c41451vu = C41451vu.A01;
        C146106i8 A0X = AbstractC31173DnH.A0X(A0p);
        A0X.A06();
        AbstractC31178DnM.A1N(c41451vu, A0X);
    }

    @Override // X.InterfaceC37221GaW
    public final EnumC31713DwI C0Q() {
        return EnumC31713DwI.A10;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        Integer num;
        String str2;
        int A02 = C0f9.A02(863447639);
        C14360o3.A0B(layoutInflater, 0);
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.nux_contact_point_confirmation_fragment, viewGroup, false);
        IgFormField A0k = AbstractC31172DnG.A0k(inflate, R.id.add_conf_code_form);
        this.A04 = A0k;
        if (A0k != null) {
            A0k.setLabelText(requireContext().getString(2131956563));
            A0k.setInputType(2);
            A0k.setMaxLength(6);
        }
        TextView A0T = AbstractC166997dE.A0T(inflate, R.id.skip_button);
        this.A03 = A0T;
        if (A0T != null) {
            A0T.setText(2131956670);
            ViewOnClickListenerC35667Fp2.A00(A0T, 57, this);
        }
        IgdsHeadline A0Q = AbstractC31179DnN.A0Q(inflate, R.id.confirm_cp_header);
        this.A05 = A0Q;
        if (A0Q != null) {
            Context requireContext = requireContext();
            Bundle bundle2 = this.mArguments;
            if (bundle2 != null) {
                str2 = bundle2.getString("nux_contact_point");
            } else {
                str2 = null;
            }
            A0Q.setBody(AbstractC167007dF.A0f(requireContext, str2, 2131956671));
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            z = bundle3.getBoolean("nux_contact_point_is_phone", false);
        }
        this.A02 = z;
        if (z) {
            str = "phone";
        } else {
            str = "email";
        }
        this.A07 = str;
        ProgressButton A0U = AbstractC31180DnO.A0U(inflate);
        this.A06 = A0U;
        if (A0U != null) {
            AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A08);
            if (this.A02) {
                num = C05F.A0Y;
            } else {
                num = C05F.A00;
            }
            EVN evn = new EVN(null, A0o, this, A0U);
            evn.A03 = num;
            this.A01 = evn;
            registerLifecycleListener(evn);
        }
        this.A00 = System.currentTimeMillis();
        C35203Ffv.A00(AbstractC166987dD.A0o(this.A08), null, null, null, "contact_point_confirmation", this.A07);
        C0f9.A09(1649443840, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-459807646);
        super.onDestroyView();
        unregisterLifecycleListener(this.A01);
        this.A04 = null;
        this.A03 = null;
        this.A05 = null;
        this.A06 = null;
        this.A01 = null;
        C0f9.A09(-562300514, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1263115178);
        super.onResume();
        IgFormField igFormField = this.A04;
        if (igFormField != null) {
            igFormField.requestFocus();
            AbstractC13880nE.A0R(igFormField);
        }
        C0f9.A09(1491301923, A02);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
    }
}
