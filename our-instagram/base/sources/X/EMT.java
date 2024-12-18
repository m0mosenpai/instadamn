package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.List;

/* loaded from: classes6.dex */
public final class EMT extends AbstractC59962oe implements InterfaceC37221GaW, InterfaceC65458TkU {
    public static final String __redex_internal_original_name = "EmailAcquisitionFragment";
    public IgFormField A00;
    public InterfaceC37264GbH A01;
    public EVN A02;
    public TextView A03;
    public ProgressButton A04;
    public List A05;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);

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
        return "cp_acquisition_email";
    }

    @Override // X.InterfaceC37221GaW
    public final void DVq() {
        CharSequence charSequence;
        IgFormField igFormField = this.A00;
        if (igFormField != null) {
            charSequence = igFormField.getText();
        } else {
            charSequence = null;
        }
        String valueOf = String.valueOf(charSequence);
        if (valueOf.length() > 0 && AbstractC13670mt.A0C(valueOf)) {
            EVN evn = this.A02;
            if (evn != null) {
                evn.A01();
            }
            UserSession A0r = AbstractC166987dD.A0r(this.A06);
            List list = this.A05;
            F9U.A00(A0r, new GAS(this, valueOf), valueOf, AbstractC31180DnO.A0c(this), C16030qx.A02.A05(requireContext()), list);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // X.InterfaceC37221GaW
    public final EnumC31713DwI C0Q() {
        return EnumC31713DwI.A11;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1577732365);
        super.onCreate(bundle);
        getParentFragmentManager().A0u(new C35758Fqv(this, 5), this, "conf_code_response_request_code");
        registerLifecycleListener(new C60927Rbh(requireContext(), AbstractC166987dD.A0r(this.A06), this));
        C0f9.A09(968488642, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = C0f9.A02(-1111052623);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.nux_email_acquisition_fragment, viewGroup, false);
        this.A01 = AbstractC34275F9v.A00(this);
        IgFormField A0k = AbstractC31172DnG.A0k(inflate, R.id.add_email_form);
        this.A00 = A0k;
        if (A0k != null) {
            A0k.setLabelText(getString(2131961715));
            A0k.setInputType(33);
            A0k.setRuleChecker(new G8L(requireContext()));
        }
        TextView A0T = AbstractC166997dE.A0T(inflate, R.id.skip_button);
        this.A03 = A0T;
        if (A0T != null) {
            A0T.setText(2131968687);
            ViewOnClickListenerC35667Fp2.A00(A0T, 62, this);
        }
        TextView A0N = AbstractC167007dF.A0N(inflate, R.id.disclaimer_text);
        C14360o3.A0B(A0N, 0);
        String A0v = AbstractC25227BEk.A0v(this, 2131961710);
        SpannableStringBuilder A08 = AbstractC31178DnM.A08(this, A0v, 2131961709);
        AnonymousClass773.A05(A08, new C31749Dx2(A0v, this, 4), A0v);
        AbstractC25227BEk.A11(A0N);
        A0N.setText(A08);
        ProgressButton A0U = AbstractC31180DnO.A0U(inflate);
        this.A04 = A0U;
        if (A0U != null) {
            EVN evn = new EVN(null, AbstractC166987dD.A0o(this.A06), this, A0U);
            this.A02 = evn;
            registerLifecycleListener(evn);
        }
        IgFormField igFormField = this.A00;
        if ((igFormField == null || igFormField.getText().length() == 0) && (str = (String) AbstractC001800i.A0J(AbstractC34340FCi.A00(requireActivity()))) != null) {
            IgFormField igFormField2 = this.A00;
            if (igFormField2 != null) {
                igFormField2.setText(str);
            }
            AbstractC34355FCx.A00(AbstractC166987dD.A0o(this.A06), "cp_acquisition_email", "android_account_manager");
        }
        C35203Ffv.A01(AbstractC166987dD.A0o(this.A06), "cp_acquisition_email");
        C0f9.A09(-2135644155, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1311833517);
        super.onDestroyView();
        unregisterLifecycleListener(this.A02);
        this.A00 = null;
        this.A03 = null;
        this.A04 = null;
        this.A02 = null;
        C0f9.A09(200314603, A02);
    }

    @Override // X.InterfaceC65458TkU
    public final void Dtf(List list) {
        this.A05 = list;
    }
}
