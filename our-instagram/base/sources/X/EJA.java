package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* loaded from: classes6.dex */
public final class EJA extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "TwoFacAddEmailFragment";
    public IgFormField A00;
    public ProgressButton A01;
    public String A02;
    public boolean A03;
    public final EV0 A04 = EV0.A00(this, 42);
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131975837);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC31182DnR.A02();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(448852595);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = AbstractC31172DnG.A13(requireArguments, "email");
        this.A03 = AbstractC31172DnG.A1X(requireArguments, "KEY_SHOULD_SHOW_SKIP_BUTTON");
        C0f9.A09(-1131049785, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = C0f9.A02(-1618294384);
        C14360o3.A0B(layoutInflater, 0);
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.two_fac_add_email_fragment, viewGroup, false);
        IgFormField A0k = AbstractC31172DnG.A0k(inflate, R.id.two_fac_add_email_form_field);
        this.A00 = A0k;
        if (A0k == null) {
            str = "emailFormField";
        } else {
            boolean z = true;
            A0k.setRuleChecker(new G8L(requireContext(), true));
            String str2 = this.A02;
            str = "email";
            if (str2 != null) {
                if (str2.length() > 0) {
                    A0k.setText(str2);
                }
                A0k.A0H(new C35469Fl4(this, 22));
                ProgressButton A0U = AbstractC31180DnO.A0U(inflate);
                String str3 = this.A02;
                if (str3 != null) {
                    if (str3.length() <= 0) {
                        z = false;
                    }
                    A0U.setEnabled(z);
                    C0fQ.A00(new ViewOnClickListenerC31591DuJ(48, this, A0U), A0U);
                    this.A01 = A0U;
                    TextView A0T = AbstractC166997dE.A0T(inflate, R.id.two_fac_add_email_explanation);
                    C14360o3.A0A(A0T);
                    AnonymousClass773.A07(new Em1(this, requireContext().getColor(AbstractC53242c7.A0C(A0T.getContext()))), A0T, AbstractC25227BEk.A0v(this, 2131975917), getString(2131975840));
                    View requireViewById = inflate.requireViewById(R.id.footer);
                    C14360o3.A0A(requireViewById);
                    if (!this.A03) {
                        i = 8;
                    }
                    requireViewById.setVisibility(i);
                    ViewOnClickListenerC35677FpC.A00(requireViewById, 44, this);
                    C0f9.A09(-88838753, A02);
                    return inflate;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
