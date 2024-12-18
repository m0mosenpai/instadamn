package X;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Html;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.ui.NotificationBar;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public final class EKC extends AbstractC59962oe implements InterfaceC12870lZ, InterfaceC60072op, InterfaceC37221GaW, GY6 {
    public static final String __redex_internal_original_name = "OnePageRegistrationFragment";
    public TextView A00;
    public C07270a1 A01;
    public C36131Fx5 A02;
    public C36132Fx6 A03;
    public C36133Fx7 A04;
    public FQF A05;
    public FQF A06;
    public C34950Faa A07;
    public RegFlowExtras A08;
    public EVN A09;
    public InlineErrorMessageView A0A;
    public InlineErrorMessageView A0B;
    public ProgressButton A0C;
    public SearchEditText A0D;
    public SearchEditText A0E;
    public EnumC33445EqI A0F;
    public boolean A0H;
    public NotificationBar A0J;
    public final List A0M = AbstractC166987dD.A1E();
    public final List A0N = AbstractC166987dD.A1E();
    public String A0K = "";
    public boolean A0I = false;
    public boolean A0G = true;
    public final Handler A0L = new HandlerC31740Dwt(Looper.getMainLooper(), this, 4);
    public final WKa A0O = new Em2(this, 11);

    public static void A00(EKC ekc) {
        String str;
        C34706FQr c34706FQr;
        C07270a1 c07270a1 = ekc.A01;
        String A0J = AbstractC13880nE.A0J(ekc.A0E);
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < A0J.length()) {
                if (A0J.charAt(i) > 127) {
                    break;
                } else {
                    i++;
                }
            } else {
                z = true;
                break;
            }
        }
        EnumC33445EqI enumC33445EqI = ekc.A0F;
        EnumC31713DwI enumC31713DwI = EnumC33523Erw.A0A.A00;
        AbstractC167007dF.A1E(c07270a1, 0, enumC31713DwI);
        double A01 = AbstractC31171DnF.A01();
        double A00 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(c07270a1), "valid_password");
        A0f.A7v("contains_only_ascii", Boolean.valueOf(z));
        AbstractC31179DnN.A16(A0f, A01, A00);
        AbstractC35274Fh9.A06(A0f);
        AbstractC31176DnK.A1J(A0f, A00);
        AbstractC31171DnF.A1A(A0f, enumC31713DwI.A01);
        AbstractC31179DnN.A15(A0f);
        if (enumC33445EqI == null || (str = enumC33445EqI.A00) == null) {
            str = "null";
        }
        AbstractC31171DnF.A19(A0f, str);
        AbstractC35274Fh9.A04(A0f);
        AbstractC35274Fh9.A08(A0f, c07270a1);
        RegFlowExtras regFlowExtras = ekc.A08;
        regFlowExtras.A0e = ekc.A0M;
        regFlowExtras.A0f = ekc.A0N;
        regFlowExtras.A0O = AbstractC13880nE.A0J(ekc.A0D);
        EZR ezr = ekc.A07.A00;
        if (ezr != null) {
            ezr.A05.A01();
            synchronized (ezr) {
                c34706FQr = ezr.A04;
            }
        } else {
            c34706FQr = new C34706FQr();
        }
        regFlowExtras.A02 = c34706FQr;
        regFlowExtras.A0h = ekc.A0G;
        regFlowExtras.A03(ekc.A0F);
        regFlowExtras.A0w = ekc.A0H;
        regFlowExtras.A0P = AbstractC167007dF.A0g(ekc.A0E);
        if (!ekc.A0I && !ekc.requireActivity().isFinishing()) {
            AbstractC31172DnG.A1A();
            RegFlowExtras regFlowExtras2 = ekc.A08;
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras2);
            AbstractC31173DnH.A1B(A0b);
            C33001Ego c33001Ego = new C33001Ego();
            AbstractC31177DnL.A15(c33001Ego, AbstractC31173DnH.A0J(A0b, c33001Ego, ekc), ekc.A01);
        }
        FragmentActivity activity = ekc.getActivity();
        if (activity != null) {
            activity.getWindow().clearFlags(8192);
        }
    }

    public static void A01(EKC ekc) {
        String str = ekc.A0K;
        String A0g = AbstractC167007dF.A0g(ekc.A0D);
        if (!str.isEmpty() || !A0g.isEmpty()) {
            C07270a1 c07270a1 = ekc.A01;
            String A0l = AbstractC31173DnH.A0l(ekc);
            String A0m = AbstractC31176DnK.A0m(ekc);
            String A02 = AbstractC31172DnG.A0P(ekc.A01).A02(C19T.A27);
            C25621Ms A0M = AbstractC31173DnH.A0M(c07270a1);
            A0M.A0B("accounts/username_suggestions/");
            A0M.A9s("email", str);
            A0M.A9s(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A0g);
            AbstractC31173DnH.A1O(A0M, A0l);
            A0M.A9s("guid", A0m);
            A0M.A0H("phone_id", A02);
            AbstractC31176DnK.A1Q(A0M);
            C32539EUp.A00(ekc, AbstractC31178DnM.A0I(A0M, ECX.class, FWF.class), 34);
        }
    }

    public static boolean A02(EKC ekc) {
        String str;
        String A0J = AbstractC13880nE.A0J(ekc.A0E);
        if (A0J.length() < 6) {
            ekc.Eks(ekc.getString(2131969374), C05F.A0C);
            str = "password_too_short";
        } else if (SUJ.A00(A0J)) {
            ekc.Eks(ekc.getString(2131969378), C05F.A0C);
            str = "password_blacklisted";
        } else {
            InlineErrorMessageView inlineErrorMessageView = ekc.A0B;
            if (inlineErrorMessageView != null) {
                inlineErrorMessageView.A03();
                return false;
            }
            return false;
        }
        C35037FcA A06 = C1Q9.A1D.A02(ekc.A01).A06(ekc.A0F, EnumC33523Erw.A0A.A00);
        A06.A04("reason", str);
        A06.A02();
        return true;
    }

    @Override // X.InterfaceC37221GaW
    public final void APP() {
        SearchEditText searchEditText = this.A0D;
        if (searchEditText != null) {
            searchEditText.setEnabled(false);
        }
        SearchEditText searchEditText2 = this.A0E;
        if (searchEditText2 != null) {
            searchEditText2.setEnabled(false);
        }
    }

    @Override // X.InterfaceC37221GaW
    public final void ARU() {
        SearchEditText searchEditText = this.A0D;
        if (searchEditText != null) {
            searchEditText.setEnabled(true);
        }
        SearchEditText searchEditText2 = this.A0E;
        if (searchEditText2 != null) {
            searchEditText2.setEnabled(true);
        }
    }

    @Override // X.InterfaceC37221GaW
    public final EnumC31713DwI C0Q() {
        return EnumC33523Erw.A0A.A00;
    }

    @Override // X.InterfaceC37221GaW
    public final boolean CbE() {
        String A0J = AbstractC13880nE.A0J(this.A0E);
        if (!TextUtils.isEmpty(A0J) && A0J.length() >= 6) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC37221GaW
    public final void DVq() {
        this.A0C.setShowProgressBar(true);
        if (!A02(this)) {
            C35230FgN A02 = C1Q9.A0b.A02(this.A01);
            EnumC31713DwI enumC31713DwI = EnumC33523Erw.A0A.A00;
            C19280xC A05 = A02.A05(null, enumC31713DwI);
            A05.A09("is_ci_opt_in", Boolean.valueOf(this.A0G));
            A05.A0D("event_tag", Arrays.asList("REGISTRATION", "one_page_registration"));
            AbstractC31173DnH.A1S(A05, this.A01);
            if (!this.A0G) {
                A00(this);
                return;
            }
            C07270a1 c07270a1 = this.A01;
            String str = enumC31713DwI.A01;
            C14360o3.A0B(c07270a1, 0);
            double A00 = AbstractC31174DnI.A00(str, 1);
            double A002 = AbstractC31171DnF.A00();
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(c07270a1), "nux_contacts_upsell_viewed");
            AbstractC31179DnN.A18(A0f, A00, A002);
            AbstractC31171DnF.A1A(A0f, str);
            AbstractC31179DnN.A15(A0f);
            AbstractC35274Fh9.A0C(A0f, c07270a1, "release_channel", AbstractC35274Fh9.A01());
            A0f.Cht();
            AbstractC23451Ch.A04(getActivity(), new C36162Fxc(this, 4), "android.permission.READ_CONTACTS");
        }
    }

    @Override // X.InterfaceC37221GaW
    public final void Dbn(boolean z) {
        TextView textView = this.A00;
        if (textView != null) {
            textView.setEnabled(z);
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        if (AbstractC13880nE.A10(this.A0D) && !TextUtils.isEmpty(this.A08.A0O)) {
            this.A0D.setText(this.A08.A0O);
        }
        this.A05.A04 = true;
        super.onViewCreated(view, bundle);
    }

    @Override // X.InterfaceC37221GaW
    public final EnumC33445EqI B75() {
        return this.A0F;
    }

    @Override // X.GY6
    public final void Eks(String str, Integer num) {
        InlineErrorMessageView inlineErrorMessageView;
        int intValue = num.intValue();
        if (intValue != 5) {
            if (intValue == 2) {
                inlineErrorMessageView = this.A0B;
            }
            AbstractC35259Fgt.A08(this.A0J, str);
            this.A0C.setShowProgressBar(false);
        }
        inlineErrorMessageView = this.A0A;
        if (inlineErrorMessageView != null) {
            inlineErrorMessageView.A04(str);
            this.A0C.setShowProgressBar(false);
        }
        AbstractC35259Fgt.A08(this.A0J, str);
        this.A0C.setShowProgressBar(false);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "one_page_registration";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A01;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(3655845);
        RegFlowExtras regFlowExtras = this.A08;
        regFlowExtras.A03(this.A0F);
        regFlowExtras.A0N = EnumC33523Erw.A0A.A00.name();
        regFlowExtras.A0O = AbstractC13880nE.A0J(this.A0D);
        C35146Fen.A00(getContext()).A03(this.A01, this.A08);
        C0f9.A0A(-1892074952, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(-2030707857, C0f9.A03(90308131));
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (!AbstractC31172DnG.A1a(AbstractC31174DnI.A0f(), "has_user_confirmed_dialog")) {
            C07270a1 c07270a1 = this.A01;
            EnumC31713DwI enumC31713DwI = EnumC33523Erw.A0A.A00;
            AbstractC34266F9m.A00(this, c07270a1, new C36575GAz(this, 1), this.A0F, enumC31713DwI, null);
            return true;
        }
        C34907FZt.A00();
        AbstractC13880nE.A0J(this.A0D);
        SearchEditText searchEditText = this.A0E;
        if (searchEditText != null) {
            searchEditText.getText().toString();
        }
        C35159Ff1.A00.A01(this.A01, this.A0F, EnumC33523Erw.A0A.A00.A01);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.getWindow().clearFlags(8192);
            return false;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(1371889512);
        super.onCreate(bundle);
        this.A01 = AbstractC31180DnO.A0L(this);
        RegFlowExtras regFlowExtras = (RegFlowExtras) AbstractC31180DnO.A04(this);
        this.A08 = regFlowExtras;
        regFlowExtras.getClass();
        this.A0H = true;
        if (AbstractC31171DnF.A1X(this.A08.A08)) {
            this.A0K = this.A08.A08;
            this.A0F = EnumC33445EqI.A03;
        } else {
            ArrayList A00 = AbstractC34340FCi.A00(getContext());
            if (!A00.isEmpty()) {
                this.A0K = (String) AbstractC166997dE.A0k(A00);
            }
        }
        if (AbstractC31171DnF.A1X(this.A08.A0Q)) {
            this.A0F = EnumC33445EqI.A06;
        }
        this.A07 = new C34950Faa(this, this.A01);
        EnumC33445EqI enumC33445EqI = this.A0F;
        EnumC33445EqI enumC33445EqI2 = EnumC33445EqI.A06;
        RegFlowExtras regFlowExtras2 = this.A08;
        if (enumC33445EqI == enumC33445EqI2) {
            str = regFlowExtras2.A0Q;
        } else {
            str = regFlowExtras2.A08;
        }
        FP4 fp4 = FP4.getInstance();
        Context context = getContext();
        if (str == null) {
            str = "unknown";
        }
        fp4.startDeviceValidation(context, str);
        C0f9.A09(1834561928, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Class cls;
        C36132Fx6 c36132Fx6;
        int A02 = C0f9.A02(-342513999);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.reg_container);
        layoutInflater.inflate(R.layout.one_page_reg_triage_fragment, AbstractC31180DnO.A05(A0A), true);
        AbstractC166997dE.A0T(A0A, R.id.field_title).setText(2131962952);
        int A01 = AbstractC31177DnL.A01(A0A, R.id.field_detail);
        SearchEditText searchEditText = (SearchEditText) A0A.requireViewById(R.id.password);
        this.A0E = searchEditText;
        searchEditText.setInputType(129);
        this.A0E.setTypeface(Typeface.DEFAULT);
        ViewOnFocusChangeListenerC35694FpU.A00(this.A0E, 17, this);
        this.A0E.setAllowTextSelection(true);
        FQF fqf = new FQF(this.A0E, this.A01, this, C05F.A0N);
        this.A06 = fqf;
        fqf.A04 = true;
        CompoundButton compoundButton = (CompoundButton) A0A.requireViewById(R.id.remember_password_checkbox);
        compoundButton.setChecked(this.A0H);
        C35745Fqd.A01(compoundButton, this, 36);
        compoundButton.setText(2131972136);
        SearchEditText searchEditText2 = (SearchEditText) A0A.requireViewById(R.id.full_name);
        this.A0D = searchEditText2;
        ViewOnFocusChangeListenerC35694FpU.A00(searchEditText2, 16, this);
        this.A0D.setFilters(new InputFilter[]{new C33178EkP(getContext(), this), new InputFilter.LengthFilter(30)});
        this.A0D.setAllowTextSelection(true);
        C35754Fqr.A00(this.A0D, this, 16);
        this.A05 = new FQF(this.A0D, this.A01, this, C05F.A0C);
        this.A0A = (InlineErrorMessageView) A0A.findViewById(R.id.full_name_inline_error);
        this.A0B = (InlineErrorMessageView) A0A.findViewById(R.id.password_inline_error);
        ViewGroup viewGroup2 = (ViewGroup) A0A.findViewById(R.id.one_page_input_container);
        TimeInterpolator timeInterpolator = InlineErrorMessageView.A09;
        FC5.A00(viewGroup2);
        C41451vu c41451vu = C41451vu.A01;
        if (this.A0F == EnumC33445EqI.A06) {
            cls = C36050Fvm.class;
            C36133Fx7 c36133Fx7 = new C36133Fx7(this);
            this.A04 = c36133Fx7;
            c36132Fx6 = c36133Fx7;
        } else {
            cls = C36044Fvg.class;
            C36132Fx6 c36132Fx62 = new C36132Fx6(this);
            this.A03 = c36132Fx62;
            c36132Fx6 = c36132Fx62;
        }
        c41451vu.A02(c36132Fx6, cls);
        C36131Fx5 c36131Fx5 = new C36131Fx5(this);
        this.A02 = c36131Fx5;
        c41451vu.A02(c36131Fx5, C36048Fvk.class);
        TextView A0T = AbstractC166997dE.A0T(A0A, R.id.search_contact_explanation);
        String string = getString(2131962612);
        if (string == null) {
            string = "";
        }
        A0T.setText(Html.fromHtml(string));
        ViewOnClickListenerC31724DwT.A00(A0T, 11, this);
        if (this.A0F == EnumC33445EqI.A04) {
            A0T.setVisibility(A01);
            this.A0G = false;
        } else {
            A0T.setVisibility(0);
            TextView A0T2 = AbstractC166997dE.A0T(A0A, R.id.continue_without_ci);
            this.A00 = A0T2;
            ViewOnClickListenerC31724DwT.A00(A0T2, 12, this);
            this.A00.setVisibility(0);
            this.A00.setEnabled(false);
        }
        ProgressButton A0U = AbstractC31180DnO.A0U(A0A);
        this.A0C = A0U;
        this.A09 = new EVN(this.A0E, this.A01, this, A0U, 2131956787);
        this.A0C.setTypeface(1);
        EVN evn = this.A09;
        evn.A00 = new C35754Fqr(this, 17);
        registerLifecycleListener(evn);
        this.A0J = AbstractC31180DnO.A0S(A0A);
        C218914p.A08.A0A(this);
        C35203Ffv.A00.A02(this.A01, this.A0F, EnumC33523Erw.A0A.A00.A01);
        C0f9.A09(669144924, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1514386063);
        super.onDestroyView();
        C34950Faa c34950Faa = this.A07;
        EZR ezr = c34950Faa.A00;
        if (ezr != null) {
            ezr.A05.A01();
            c34950Faa.A00 = null;
        }
        unregisterLifecycleListener(this.A09);
        this.A0D.setOnFocusChangeListener(null);
        this.A0D.setOnEditorActionListener(null);
        SearchEditText searchEditText = this.A0E;
        if (searchEditText != null) {
            searchEditText.setOnFocusChangeListener(null);
            this.A0E.setOnEditorActionListener(null);
        }
        this.A0C.setOnClickListener(null);
        this.A0L.removeCallbacksAndMessages(null);
        this.A09 = null;
        this.A0J = null;
        this.A0D = null;
        this.A0E = null;
        this.A0C = null;
        this.A0A = null;
        this.A0B = null;
        this.A00 = null;
        C36133Fx7 c36133Fx7 = this.A04;
        if (c36133Fx7 != null) {
            C41451vu.A01.A03(c36133Fx7, C36050Fvm.class);
            this.A04 = null;
        }
        C36132Fx6 c36132Fx6 = this.A03;
        if (c36132Fx6 != null) {
            C41451vu.A01.A03(c36132Fx6, C36044Fvg.class);
            this.A03 = null;
        }
        C36131Fx5 c36131Fx5 = this.A02;
        if (c36131Fx5 != null) {
            C41451vu.A01.A03(c36131Fx5, C36048Fvk.class);
            this.A02 = null;
        }
        C218914p.A06(this);
        C0f9.A09(-1197381634, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1823486273);
        super.onPause();
        this.A0I = true;
        EZR ezr = this.A07.A00;
        if (ezr != null) {
            ezr.A05.A01();
        }
        this.A0J.A03();
        AbstractC13880nE.A0O(requireView());
        this.A0D.removeTextChangedListener(this.A0O);
        this.A0L.removeCallbacksAndMessages(null);
        AbstractC31174DnI.A0H(this).setSoftInputMode(0);
        C0f9.A09(-1716600127, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-2010592335);
        super.onResume();
        this.A0I = false;
        C34950Faa c34950Faa = this.A07;
        EZR ezr = c34950Faa.A00;
        if (ezr != null && ezr.A00 != ezr.A01) {
            C14120nc.A00().ATO(ezr);
        } else {
            C34950Faa.A00(c34950Faa);
        }
        A01(this);
        this.A0D.addTextChangedListener(this.A0O);
        AbstractC31180DnO.A1B(this);
        C0f9.A09(236842767, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-720690943);
        super.onStop();
        C0f9.A09(-1119621760, A02);
    }
}
