package X;

import android.animation.TimeInterpolator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.PhoneNumberUtils;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.ui.NotificationBar;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* loaded from: classes6.dex */
public final class EKE extends AbstractC59962oe implements InterfaceC12870lZ, InterfaceC60072op, InterfaceC37221GaW, GY6, GY5 {
    public static final String __redex_internal_original_name = "PhoneConfirmationFragment";
    public long A00;
    public C07270a1 A01;
    public C36134Fx8 A02;
    public C36135Fx9 A03;
    public C36136FxA A04;
    public C36137FxB A05;
    public RegFlowExtras A06;
    public EVN A07;
    public SearchEditText A08;
    public String A0A;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public Dialog A0H;
    public C35161Ff3 A0I;
    public NotificationBar A0J;
    public InlineErrorMessageView A0K;
    public String A0L;
    public String A0B = "";
    public String A0M = "";
    public boolean A0G = false;
    public String A09 = "";

    @Override // X.InterfaceC37221GaW
    public final void Dbn(boolean z) {
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (this.A0E && !AbstractC31172DnG.A1a(AbstractC31174DnI.A0f(), "has_user_confirmed_dialog")) {
            AbstractC34266F9m.A00(this, this.A01, null, B75(), C0Q(), null);
            return true;
        }
        C35159Ff1.A00.A01(this.A01, B75(), C0Q().A01);
        return false;
    }

    private void A02(String str, boolean z) {
        Integer num;
        C32988Efu c32988Efu;
        String str2;
        String str3 = this.A0L;
        String str4 = null;
        if (str3 != null && z) {
            num = C05F.A00;
        } else {
            num = null;
        }
        if (this.A0C == null) {
            c32988Efu = null;
        } else {
            c32988Efu = new C32988Efu(this, str);
        }
        if (str3 != null && num != null && z) {
            C47989LJs c47989LJs = C47989LJs.A00;
            C07270a1 c07270a1 = this.A01;
            String str5 = C0Q().A01;
            switch (num.intValue()) {
                case 1:
                    str2 = "authentication_flow";
                    break;
                case 2:
                    str2 = "optimistic_authentication_flow";
                    break;
                case 3:
                    str2 = NetInfoModule.CONNECTION_TYPE_NONE;
                    break;
                default:
                    str2 = "registration_flow";
                    break;
            }
            c47989LJs.A04(c07270a1, str5, "client_reg_send_reg_nonce", "send user input nonce to server for auto conf registration", str2, "ar_code_sms");
        }
        Context context = getContext();
        C07270a1 c07270a12 = this.A01;
        String str6 = this.A0A;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str4 = "authentication_flow";
                    break;
                case 2:
                    str4 = "optimistic_authentication_flow";
                    break;
                case 3:
                    str4 = NetInfoModule.CONNECTION_TYPE_NONE;
                    break;
                default:
                    str4 = "registration_flow";
                    break;
            }
        }
        C1ON A07 = AbstractC35276FhB.A07(context, c07270a12, str6, str, str4, this.A0L, null, null);
        C07270a1 c07270a13 = this.A01;
        FragmentActivity activity = getActivity();
        A07.A00 = new C32977Efj(activity, this, c07270a13, new G9Q(activity), c32988Efu, this, C0Q(), C05F.A01, this.A0A, str, this.A0C);
        C1GJ.A03(A07);
    }

    @Override // X.InterfaceC37221GaW
    public final void APP() {
        this.A08.setEnabled(false);
        this.A08.setClearButtonEnabled(false);
    }

    @Override // X.InterfaceC37221GaW
    public final void ARU() {
        this.A08.setEnabled(true);
        this.A08.setClearButtonEnabled(true);
    }

    @Override // X.InterfaceC37221GaW
    public final EnumC33445EqI B75() {
        if (this.A0E) {
            return EnumC33445EqI.A06;
        }
        return null;
    }

    @Override // X.InterfaceC37221GaW
    public final EnumC31713DwI C0Q() {
        if (this.A0E) {
            return EnumC31713DwI.A0V;
        }
        return EnumC31713DwI.A1K;
    }

    @Override // X.InterfaceC37221GaW
    public final boolean CbE() {
        SearchEditText searchEditText = this.A08;
        RectF rectF = AbstractC13880nE.A01;
        C14360o3.A0B(searchEditText, 0);
        return AbstractC167007dF.A1P(searchEditText.getText().length(), 6);
    }

    @Override // X.InterfaceC37221GaW
    public final void DVq() {
        String A0J = AbstractC13880nE.A0J(this.A08);
        if (this.A0E) {
            C35231FgO.A01(getContext(), this.A01, AbstractC35259Fgt.A00(this.A09, this.A0B), A0J, true);
            return;
        }
        if (this.A0D) {
            C006802i.A0p.markerStart(725095506);
            C006802i.A0p.markerAnnotate(725095506, "flow", "prod");
            A01(A0J, AbstractC35259Fgt.A00(this.A09, this.A0B));
        } else {
            A02(A0J, false);
        }
        C35031Fc4.A00.A02(this.A01, C0Q().A01);
    }

    @Override // X.GY5
    public final void Dhw(Context context, String str, String str2) {
        if (this.A0E) {
            C35231FgO.A01(context, this.A01, str2, str, false);
        } else if (this.A0D) {
            A01(str, str2);
        } else {
            A02(str, true);
        }
    }

    @Override // X.GY6
    public final void Eks(String str, Integer num) {
        if (this.A0G) {
            AbstractC35090Fd1.A00(this, this.A01, this.A06, str);
            this.A0G = false;
        } else if (C05F.A15 == num) {
            this.A0K.A04(str);
            this.A0J.A02();
        } else {
            AbstractC35259Fgt.A08(this.A0J, str);
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        if (this.A0D && this.A0H == null) {
            C193328hC A0P = AbstractC31180DnO.A0P(this);
            A0P.A0A(2131965791);
            AbstractC31177DnL.A1A(this, A0P, this.A0B, 2131965790);
            A0P.A08(R.drawable.confirmation_icon);
            A0P.A07();
            Dialog A02 = A0P.A02();
            this.A0H = A02;
            C0fJ.A00(A02);
            C19280xC A05 = C1Q9.A1E.A02(this.A01).A05(null, C0Q());
            this.A0I.A00.putString(AbstractC31176DnK.A0r(EnumC33320EoF.A09), "sms");
            this.A0I.A03(A05);
            AbstractC31173DnH.A1S(A05, this.A01);
        }
        C006802i.A0p.markerAnnotate(725096125, DatePickerDialogModule.ARG_MODE, "sms");
        C006802i.A0p.markerEnd(725096125, (short) 2);
    }

    public static void A00(EKE eke) {
        String string = eke.getString(2131974265);
        NotificationBar notificationBar = eke.A0J;
        Context context = notificationBar.getContext();
        notificationBar.A04(string, AbstractC167007dF.A09(context, R.attr.igds_color_success), context.getColor(AbstractC53242c7.A02(context)));
    }

    private void A01(String str, String str2) {
        C1ON A06 = AbstractC35276FhB.A06(getContext(), this.A01, str, str2, AbstractC31189DnY.A00(), IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
        A06.A00 = new C32996Egj(getActivity(), this.A01, this);
        C1GJ.A03(A06);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "phone_confirmation";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A01;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        RegFlowExtras regFlowExtras;
        int A03 = C0f9.A03(1948543156);
        if (this.A0E && (regFlowExtras = this.A06) != null) {
            regFlowExtras.A0N = C0Q().name();
            regFlowExtras.A03(B75());
            regFlowExtras.A05 = AbstractC13880nE.A0J(this.A08);
            C35146Fen.A00(getContext()).A03(this.A01, this.A06);
        }
        C0f9.A0A(-984396273, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(1052312869, C0f9.A03(-1206822333));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        Integer A02;
        int A022 = C0f9.A02(1558969250);
        super.onCreate(bundle);
        this.A01 = C023409i.A0A.A02(this.mArguments);
        this.A0I = C35161Ff3.A00(this.mArguments);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            z = bundle2.getBoolean("should_enable_auto_conf");
        } else {
            z = false;
        }
        this.A0F = z;
        C07270a1 c07270a1 = this.A01;
        String str = C0Q().A01;
        EnumC33445EqI B75 = B75();
        RegFlowExtras regFlowExtras = this.A06;
        if (regFlowExtras == null) {
            A02 = null;
        } else {
            A02 = regFlowExtras.A02();
        }
        C35161Ff3 c35161Ff3 = this.A0I;
        AbstractC167017dG.A1N(c07270a1, str);
        C35203Ffv.A00(c07270a1, c35161Ff3, B75, A02, str, null);
        if (!AbstractC31180DnO.A0f(C06090Tz.A05).contains(__redex_internal_original_name)) {
            if (AbstractC34263F9j.A00().booleanValue()) {
                FBE.A00().A00(requireContext(), this.A01, null);
            }
            if (AbstractC34264F9k.A00().booleanValue()) {
                FBE.A00().A01(requireContext(), this.A01, null);
            }
        }
        C0f9.A09(1373456028, A022);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        String replace;
        String A0H;
        CountryCodeData countryCodeData;
        String formatNumber;
        int A02 = C0f9.A02(1967083849);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.reg_container);
        this.A0J = AbstractC31180DnO.A0S(A0A);
        layoutInflater.inflate(R.layout.phone_confirmation_fragment, AbstractC31180DnO.A05(A0A), true);
        this.A0E = requireArguments().getBoolean("arg_is_reg_flow");
        this.A06 = (RegFlowExtras) AbstractC31180DnO.A04(this);
        this.A0D = requireArguments().getBoolean("arg_is_multiple_account_recovery", false);
        String string = requireArguments().getString("phone_number_key");
        String string2 = requireArguments().getString("query_key");
        String string3 = requireArguments().getString("client_message");
        String string4 = requireArguments().getString("register_start_message");
        if (!this.A0E ? string == null || string2 == null : this.A06 == null) {
            z = false;
        } else {
            z = true;
        }
        C18C.A0G(z, "Must have the reg flow extra when in the reg flow, or a phone number and a lookup key when otherwise");
        this.A0A = string2;
        this.A0L = string3;
        this.A0C = string4;
        RegFlowExtras regFlowExtras = this.A06;
        String str = "";
        if (this.A0E && regFlowExtras != null) {
            replace = regFlowExtras.A0R;
        } else {
            replace = string.replace("+", "");
        }
        this.A0B = replace;
        if (this.A0E && (countryCodeData = regFlowExtras.A01) != null) {
            this.A09 = countryCodeData.A00();
            String str2 = countryCodeData.A01;
            String str3 = countryCodeData.A00;
            if (str3 != null) {
                formatNumber = PhoneNumberUtils.formatNumber(replace, str3);
            } else {
                formatNumber = PhoneNumberUtils.formatNumber(replace);
            }
            A0H = AnonymousClass001.A0T(str2, formatNumber, ' ');
        } else {
            A0H = AbstractC31181DnP.A0H(replace);
        }
        if (A0H != null) {
            str = A0H;
        }
        this.A0M = AbstractC31181DnP.A0I(requireContext(), str).toString();
        TextView A0T = AbstractC166997dE.A0T(A0A, R.id.field_title);
        if (this.A0E) {
            AbstractC31180DnO.A14(AbstractC166997dE.A0N(this), A0T, this.A0M, 2131961867);
            A0T.setTextAppearance(R.style.igds_headline_2);
            A0T.setAllCaps(false);
        } else {
            A0T.setText(2131961866);
        }
        TextView A0T2 = AbstractC166997dE.A0T(A0A, R.id.field_detail);
        C07270a1 c07270a1 = this.A01;
        boolean z2 = this.A0D;
        EKE eke = this;
        if (z2) {
            eke = null;
        }
        ViewOnClickListenerC35641Fob viewOnClickListenerC35641Fob = new ViewOnClickListenerC35641Fob(this, c07270a1, this, eke, B75(), C0Q(), this.A09, this.A0B);
        if (z2) {
            AbstractC31180DnO.A14(AbstractC166997dE.A0N(this), A0T2, this.A0M, 2131974113);
        } else if (this.A0E) {
            String string5 = getString(2131955023);
            String string6 = getString(2131972456);
            SpannableStringBuilder A0H2 = AbstractC25225BEi.A0H(getString(2131969563, string5, string6));
            AnonymousClass773.A05(A0H2, new C33252Elm(AbstractC31174DnI.A0q(requireActivity(), AbstractC53242c7.A06(requireActivity())), this, 5), string5);
            AnonymousClass773.A05(A0H2, new C33253Eln(viewOnClickListenerC35641Fob, this, AbstractC31174DnI.A0q(requireActivity(), AbstractC53242c7.A06(requireActivity()))), string6);
            AbstractC31176DnK.A1G(A0T2, A0H2);
        } else {
            AbstractC31180DnO.A14(AbstractC166997dE.A0N(this), A0T2, this.A0M, 2131972454);
            C35251Fgk.A03(A0T2, R.color.grey_5);
        }
        this.A00 = SystemClock.elapsedRealtime();
        SearchEditText searchEditText = (SearchEditText) A0A.requireViewById(R.id.confirmation_field);
        this.A08 = searchEditText;
        C35251Fgk.A04(searchEditText);
        this.A08.requestFocus();
        this.A08.setHint(2131956588);
        this.A08.setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
        if (this.A0E && this.A06 != null && AbstractC13880nE.A10(this.A08) && !TextUtils.isEmpty(this.A06.A05)) {
            this.A08.setText(this.A06.A05);
        }
        this.A0K = (InlineErrorMessageView) A0A.findViewById(R.id.confirmation_field_inline_error);
        ViewGroup viewGroup2 = (ViewGroup) A0A.findViewById(R.id.confirmation_field_container);
        TimeInterpolator timeInterpolator = InlineErrorMessageView.A09;
        FC5.A00(viewGroup2);
        EVN evn = new EVN(this.A08, this.A01, this, (ProgressButton) A0A.findViewById(R.id.next_button));
        this.A07 = evn;
        registerLifecycleListener(evn);
        if (!this.A0D && !this.A0E) {
            C0fQ.A00(viewOnClickListenerC35641Fob, A0T2);
        }
        C41451vu c41451vu = C41451vu.A01;
        C36136FxA c36136FxA = new C36136FxA(this);
        this.A04 = c36136FxA;
        c41451vu.A02(c36136FxA, C36042Fve.class);
        C36134Fx8 c36134Fx8 = new C36134Fx8(this);
        this.A02 = c36134Fx8;
        c41451vu.A02(c36134Fx8, C36039Fvb.class);
        C36137FxB c36137FxB = new C36137FxB(this);
        this.A05 = c36137FxB;
        c41451vu.A02(c36137FxB, C36050Fvm.class);
        C36135Fx9 c36135Fx9 = new C36135Fx9(this);
        this.A03 = c36135Fx9;
        c41451vu.A02(c36135Fx9, C36049Fvl.class);
        if (this.A0E) {
            AbstractC35259Fgt.A05(A0A, this, this.A01, B75(), C0Q(), false);
            View findViewById = A0A.findViewById(R.id.log_in_button);
            Context requireContext = requireContext();
            TextView[] textViewArr = {A0T2, (TextView) findViewById};
            int i = 0;
            do {
                C35251Fgk.A03(textViewArr[i], AbstractC53242c7.A06(requireContext));
                i++;
            } while (i < 2);
            C35203Ffv.A00.A02(this.A01, B75(), C0Q().A01);
        } else {
            AbstractC31176DnK.A1D(A0A, R.id.reg_footer_container);
        }
        C218914p.A08.A0A(this);
        C0f9.A09(1319449344, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1367963899);
        super.onDestroyView();
        unregisterLifecycleListener(this.A07);
        C218914p.A06(this);
        C41451vu c41451vu = C41451vu.A01;
        c41451vu.A03(this.A04, C36042Fve.class);
        c41451vu.A03(this.A02, C36039Fvb.class);
        c41451vu.A03(this.A05, C36050Fvm.class);
        c41451vu.A03(this.A03, C36049Fvl.class);
        C35231FgO.A03.A05(getContext());
        this.A07 = null;
        this.A08 = null;
        this.A0K = null;
        this.A0J = null;
        C0f9.A09(-1634135274, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1143558386);
        super.onPause();
        AbstractC13880nE.A0O(this.A08);
        AbstractC31174DnI.A0H(this).setSoftInputMode(0);
        C0f9.A09(16518198, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1752519897);
        super.onResume();
        AbstractC35259Fgt.A06(this.A08);
        AbstractC31180DnO.A1B(this);
        C0f9.A09(541374712, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(799897039);
        super.onStart();
        C0f9.A09(-912062893, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-10588112);
        super.onStop();
        Dialog dialog = this.A0H;
        if (dialog != null && dialog.isShowing()) {
            this.A0H.dismiss();
        }
        C0f9.A09(-1543476083, A02);
    }
}
