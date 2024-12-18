package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* loaded from: classes6.dex */
public final class EK3 extends AbstractC59962oe implements InterfaceC60122ou, GY8 {
    public static final String __redex_internal_original_name = "TwoFacEnterPhoneNumberFragment";
    public EditPhoneNumberView A00;
    public ProgressButton A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public final InterfaceC09390do A08 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A06 = AbstractC31180DnO.A0v(this, 48);
    public final InterfaceC09390do A07 = AbstractC31180DnO.A0v(this, 49);
    public final InterfaceC09390do A05 = AbstractC31180DnO.A0v(this, 47);

    @Override // X.GY8
    public final void ESF(CountryCodeData countryCodeData) {
        C14360o3.A0B(countryCodeData, 0);
        EditPhoneNumberView editPhoneNumberView = this.A00;
        if (editPhoneNumberView == null) {
            C14360o3.A0F("editPhoneNumberView");
            throw C00O.createAndThrow();
        }
        editPhoneNumberView.setCountryCodeWithCountryPrefix(countryCodeData);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        int i = 2131975896;
        if (this.A03) {
            i = 2131975861;
        }
        AbstractC25229BEm.A1G(interfaceC56362iU, i);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC31182DnR.A02();
    }

    public static final void A00(EK3 ek3) {
        EditPhoneNumberView editPhoneNumberView = ek3.A00;
        if (editPhoneNumberView == null) {
            C14360o3.A0F("editPhoneNumberView");
            throw C00O.createAndThrow();
        }
        String phoneNumber = editPhoneNumberView.getPhoneNumber();
        InterfaceC09390do interfaceC09390do = ek3.A08;
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        C14360o3.A0A(phoneNumber);
        C14360o3.A0B(A0o, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(C34918Fa4.A01, A0o), "instagram_two_fac_setup_action");
        AbstractC31171DnF.A1C(A0f, "next");
        A0f.AAP("view", "");
        AbstractC31181DnP.A0c(A0f);
        A0f.AAP("phone_numer", phoneNumber);
        A0f.Cht();
        int length = phoneNumber.length();
        Context requireContext = ek3.requireContext();
        if (length == 0) {
            AbstractC31173DnH.A13(requireContext, ek3, 2131969574);
            return;
        }
        C1ON A02 = AbstractC35177FfU.A02(requireContext, AbstractC166987dD.A0r(interfaceC09390do), phoneNumber);
        A02.A00 = (C1P1) ek3.A07.getValue();
        ek3.schedule(A02);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A08);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-2015511356);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = AbstractC31172DnG.A13(requireArguments, AbstractC31182DnR.A03());
        this.A03 = requireArguments.getBoolean(AbstractC31180DnO.A0Z());
        this.A04 = requireArguments.getBoolean("ARG_IS_ENABLING_WHATSAPP", false);
        AbstractC35075Fcm.A02(AbstractC166987dD.A0r(this.A08), "add_phone_number");
        C0f9.A09(-82341167, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = C0f9.A02(1572219643);
        C14360o3.A0B(layoutInflater, 0);
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.two_fac_enter_phone_number_fragment, viewGroup, false);
        TextView A0N = AbstractC167007dF.A0N(inflate, R.id.two_fac_add_phone_number_description);
        if (this.A03) {
            AbstractC25227BEk.A12(AbstractC167007dF.A0N(inflate, R.id.two_fac_add_phone_number_title), this, 2131975862);
            AbstractC25227BEk.A12(A0N, this, 2131975860);
        } else if (this.A04) {
            AbstractC166997dE.A0S(inflate, R.id.two_fac_add_phone_whatsapp_disclaimer).setVisibility(0);
            A0N.setText(2131976012);
        }
        this.A00 = (EditPhoneNumberView) inflate.requireViewById(R.id.edit_phone_number_view);
        String str2 = this.A02;
        if (str2 == null) {
            str = "currPhoneNumber";
        } else {
            if (str2.length() > 0) {
                z = true;
            }
            str = "editPhoneNumberView";
            if (z) {
                Bundle requireArguments = requireArguments();
                EditPhoneNumberView editPhoneNumberView = this.A00;
                if (editPhoneNumberView != null) {
                    Context requireContext = requireContext();
                    String string = requireArguments.getString("country_code", "");
                    C14360o3.A07(string);
                    editPhoneNumberView.setupEditPhoneNumberView(AnonymousClass780.A01(requireContext, string), requireArguments.getString("national_number", ""));
                }
            }
            EditPhoneNumberView editPhoneNumberView2 = this.A00;
            if (editPhoneNumberView2 != null) {
                EditPhoneNumberView.A01(this, null, AbstractC166987dD.A0r(this.A08), EnumC33365Eoy.A07, null, (C36742GHl) this.A06.getValue(), editPhoneNumberView2);
                EditPhoneNumberView editPhoneNumberView3 = this.A00;
                if (editPhoneNumberView3 != null) {
                    editPhoneNumberView3.requestFocus();
                    ProgressButton A0U = AbstractC31180DnO.A0U(inflate);
                    this.A01 = A0U;
                    if (A0U == null) {
                        str = "nextButton";
                    } else {
                        C0fQ.A00((View.OnClickListener) this.A05.getValue(), A0U);
                        AbstractC35235FgT.A02(new Em1(this, AbstractC31181DnP.A02(this), 29), new Em1(this, AbstractC31181DnP.A02(this), 30), AbstractC167007dF.A0N(inflate, R.id.learn_more_and_policy), AbstractC25227BEk.A0v(this, 2131975900), AbstractC25227BEk.A0v(this, 2131975901));
                        EVO.A01(this);
                        C0f9.A09(-1647906659, A02);
                        return inflate;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1380118780);
        super.onPause();
        Window A0H = AbstractC31174DnI.A0H(this);
        if (A0H != null) {
            A0H.setSoftInputMode(0);
        }
        AbstractC31171DnF.A16(this);
        C0f9.A09(1968566447, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1867134172);
        super.onResume();
        EditPhoneNumberView editPhoneNumberView = this.A00;
        if (editPhoneNumberView == null) {
            C14360o3.A0F("editPhoneNumberView");
            throw C00O.createAndThrow();
        }
        editPhoneNumberView.A01.postDelayed(editPhoneNumberView.A0A, 200L);
        Window A0H = AbstractC31174DnI.A0H(this);
        if (A0H != null) {
            A0H.setSoftInputMode(16);
        }
        C0f9.A09(-1965408002, A02);
    }
}
