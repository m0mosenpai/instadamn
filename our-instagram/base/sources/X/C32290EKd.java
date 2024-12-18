package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.R;
import com.instagram.ui.widget.editphonenumber.CountryCodeTextView;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.EKd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32290EKd extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "TwoFacCheckWhatsAppPhoneNumberFragment";
    public ProgressButton A00;
    public String A01;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);
    public final C1P1 A02 = EV0.A00(this, 44);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131975896);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC31182DnR.A02();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC31179DnN.A0y(AbstractC35179FfW.A00().A02(C05F.A0j, true, !requireArguments().getBoolean("has_two_fac_already_on")), requireActivity(), this.A03);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = C0f9.A02(-1379017564);
        C14360o3.A0B(layoutInflater, 0);
        View A0C = AbstractC31173DnH.A0C(layoutInflater, viewGroup, R.layout.two_fac_check_whatsapp_phone_number_fragment, false);
        EditPhoneNumberView editPhoneNumberView = (EditPhoneNumberView) AbstractC166997dE.A0R(A0C, R.id.edit_phone_number_view);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString(AbstractC31182DnR.A03(), "");
        this.A01 = string;
        if (string == null) {
            str = "currPhoneNumber";
        } else {
            if (string.length() > 0) {
                String string2 = requireArguments.getString("country_code", "");
                String string3 = requireArguments.getString("national_number", "");
                Context requireContext = requireContext();
                C14360o3.A0A(string2);
                editPhoneNumberView.setupEditPhoneNumberView(AnonymousClass780.A01(requireContext, string2), string3);
            }
            ViewOnClickListenerC35677FpC viewOnClickListenerC35677FpC = new ViewOnClickListenerC35677FpC(this, 52);
            int color = requireContext().getColor(AbstractC31180DnO.A01(this));
            CountryCodeTextView countryCodeTextView = editPhoneNumberView.A04;
            C0fQ.A00(viewOnClickListenerC35677FpC, countryCodeTextView);
            countryCodeTextView.setTextColor(color);
            EditText editText = editPhoneNumberView.A01;
            C0fQ.A00(viewOnClickListenerC35677FpC, editText);
            editText.setFocusable(false);
            editText.setTextColor(color);
            ProgressButton A0U = AbstractC31180DnO.A0U(A0C);
            this.A00 = A0U;
            if (A0U == null) {
                str = "nextButton";
            } else {
                ViewOnClickListenerC35677FpC.A00(A0U, 51, this);
                AbstractC35235FgT.A02(new Em1(this, AbstractC31181DnP.A02(this), 24), new Em1(this, AbstractC31181DnP.A02(this), 25), AbstractC167007dF.A0N(A0C, R.id.learn_more_and_policy), AbstractC25227BEk.A0v(this, 2131975900), AbstractC25227BEk.A0v(this, 2131975901));
                C0f9.A09(-637058865, A02);
                return A0C;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
