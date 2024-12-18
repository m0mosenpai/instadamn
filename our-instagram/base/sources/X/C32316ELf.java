package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.google.android.material.textfield.TextInputLayout;
import com.instagram.fx.access.sso.FxSsoViewModel;
import com.instagram.nux.activity.SignedOutFragmentActivity;
import com.instagram.nux.ui.NetzDgTermsTextView;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ELf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32316ELf extends AbstractC59962oe implements InterfaceC60072op, InterfaceC37227Gac {
    public static final String A0X;
    public static final String __redex_internal_original_name = "LoginLandingFragment";
    public View A00;
    public View A01;
    public View A02;
    public EditText A03;
    public TextView A04;
    public TextView A05;
    public C07270a1 A06;
    public FxSsoViewModel A07;
    public FJQ A08;
    public FRB A09;
    public EVQ A0A;
    public C34669FPe A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public List A0F;
    public boolean A0G;
    public boolean A0J;
    public boolean A0K;
    public Handler A0M;
    public TextView A0N;
    public TextInputLayout A0O;
    public FN0 A0P;
    public ProgressButton A0Q;
    public String A0R;
    public boolean A0H = false;
    public boolean A0I = false;
    public boolean A0L = true;
    public final InterfaceC41501vz A0U = C31650DvG.A00(this, 62);
    public final TextWatcher A0T = new C35469Fl4(this, 24);
    public final InterfaceC41501vz A0V = C31650DvG.A00(this, 63);
    public final InterfaceC41501vz A0W = C31650DvG.A00(this, 64);
    public final InterfaceC41501vz A0S = C31650DvG.A00(this, 65);

    @Override // X.InterfaceC37227Gac
    public final void DRA(FQD fqd) {
        InterfaceC37225Gaa interfaceC37225Gaa;
        boolean z;
        String trim = AbstractC13880nE.A0J(this.A05).trim();
        Iterator it = this.A08.A01.A02.iterator();
        while (true) {
            if (it.hasNext()) {
                interfaceC37225Gaa = (InterfaceC37225Gaa) it.next();
                if (trim.equals(interfaceC37225Gaa.getUsername())) {
                    break;
                }
            } else {
                interfaceC37225Gaa = null;
                break;
            }
        }
        C07270a1 c07270a1 = this.A06;
        if (interfaceC37225Gaa != null && C35264Fgy.A00() >= 1) {
            int i = 2131953618;
            int i2 = 2131953615;
            if (interfaceC37225Gaa instanceof EgP) {
                i = 2131953613;
                i2 = 2131953616;
            } else if (interfaceC37225Gaa instanceof EgO) {
                i = 2131953614;
                i2 = 2131953617;
            }
            C35203Ffv.A00(c07270a1, null, null, null, "access_dialog", interfaceC37225Gaa.AY9());
            C193328hC A0c = AbstractC31176DnK.A0c(this);
            A0c.A05 = AbstractC31174DnI.A0w(this, interfaceC37225Gaa.getUsername(), 2131953619);
            AbstractC31179DnN.A11(this, A0c, i);
            DialogInterfaceOnClickListenerC35455FkC.A02(A0c, interfaceC37225Gaa, c07270a1, 44, 2131953620);
            A0c.A0d(new DialogInterfaceOnClickListenerC35448Fk5(7, interfaceC37225Gaa, c07270a1, this, this), getString(i2));
            AbstractC166987dD.A1W(A0c);
            z = true;
        } else {
            z = false;
        }
        fqd.A00(z);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "login_landing";
    }

    static {
        String str = AbstractC14490oL.A02;
        A0X = AnonymousClass001.A0R("com.instagram.android", "login.fragment.ARGUMENT_OMNISTRING");
    }

    public static void A00(C32316ELf c32316ELf) {
        boolean z = c32316ELf.A0J;
        TextView textView = c32316ELf.A05;
        if (z) {
            textView.setEnabled(false);
            c32316ELf.A03.setEnabled(false);
            c32316ELf.A0Q.setShowProgressBar(true);
        } else {
            textView.setEnabled(true);
            c32316ELf.A03.setEnabled(true);
            c32316ELf.A0Q.setShowProgressBar(false);
            if (!AbstractC31179DnN.A1a(c32316ELf.A05) && !AbstractC31179DnN.A1a(c32316ELf.A03) && !c32316ELf.A0G) {
                c32316ELf.A0Q.setEnabled(true);
                return;
            }
        }
        c32316ELf.A0Q.setEnabled(false);
    }

    public static void A01(C32316ELf c32316ELf, String str) {
        if (c32316ELf.A04 != null && c32316ELf.A01 != null && c32316ELf.getContext() != null) {
            c32316ELf.A04.setText(str);
            AbstractC166987dD.A1O(c32316ELf.getContext(), c32316ELf.A04, R.color.design_dark_default_color_on_background);
            c32316ELf.A01.setBackgroundResource(R.drawable.blue_button_background);
            c32316ELf.A01.jumpDrawablesToCurrentState();
            C35251Fgk.A02(c32316ELf.A04, R.color.design_dark_default_color_on_background);
        }
    }

    public static void A02(C32316ELf c32316ELf, boolean z) {
        String str;
        if (new Date().getTime() < 1347336060000L) {
            AbstractC31171DnF.A0z(2131977124);
            return;
        }
        C006802i c006802i = C006802i.A0p;
        c006802i.markerStart(2293785);
        c006802i.markerAnnotate(2293785, "login_flow", "prod");
        String A0J = AbstractC13880nE.A0J(c32316ELf.A05);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(c32316ELf.A06), "log_in_attempt");
        double A01 = AbstractC31171DnF.A01();
        double A00 = AbstractC31171DnF.A00();
        AbstractC31179DnN.A15(A0f);
        AbstractC31179DnN.A17(A0f, A01, A00);
        EnumC31713DwI enumC31713DwI = EnumC31713DwI.A0t;
        AbstractC31171DnF.A1A(A0f, "login");
        AbstractC31176DnK.A1K(A0f, A01);
        C16030qx c16030qx = C16030qx.A02;
        A0f.AAP("guid", c16030qx.A04(AbstractC12290kX.A00));
        A0f.A7v("keyboard", AbstractC31173DnH.A0e(A0f, "log_in_token", A0J, z));
        A0f.Cht();
        String A0l = AbstractC31173DnH.A0l(c32316ELf);
        String A05 = c16030qx.A05(c32316ELf.getContext());
        String A0J2 = AbstractC13880nE.A0J(c32316ELf.A03);
        try {
            str = C35270Fh5.A01(c32316ELf.getActivity(), c32316ELf.A06, enumC31713DwI, C05F.A01);
        } catch (IOException unused) {
            str = null;
        }
        C07270a1 c07270a1 = c32316ELf.A06;
        int A002 = C35264Fgy.A00();
        List list = c32316ELf.A0F;
        C1ON A0E = AbstractC35276FhB.A0E(c07270a1, str, A0l, c32316ELf.A0D, c32316ELf.A0E, A05, A0J2, null, A0J, list, A002);
        A0E.A00 = new C32975Efg(c32316ELf, c32316ELf, c32316ELf.A06, c32316ELf, c32316ELf, A0J, A0J2);
        c32316ELf.schedule(A0E);
    }

    @Override // X.InterfaceC37227Gac
    public final void Cut(String str, String str2) {
        String str3;
        String A0J = AbstractC13880nE.A0J(this.A05);
        String A0l = AbstractC31173DnH.A0l(this);
        String A0m = AbstractC31176DnK.A0m(this);
        String A0J2 = AbstractC13880nE.A0J(this.A03);
        try {
            str3 = C35270Fh5.A01(getActivity(), this.A06, EnumC31713DwI.A0t, C05F.A01);
        } catch (IOException unused) {
            str3 = null;
        }
        C07270a1 c07270a1 = this.A06;
        int A00 = C35264Fgy.A00();
        List list = this.A0F;
        C1ON A0E = AbstractC35276FhB.A0E(c07270a1, str3, A0l, this.A0D, this.A0E, A0m, A0J2, str2, A0J, list, A00);
        A0E.A00 = new C32975Efg(this, this, this.A06, this, this, A0J, A0J2);
        schedule(A0E);
    }

    @Override // X.InterfaceC37227Gac
    public final void DV5() {
        RegFlowExtras regFlowExtras = new RegFlowExtras();
        regFlowExtras.A04 = this.A0R;
        AbstractC31175DnJ.A0R();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
        AbstractC31171DnF.A12(A0b, "IgSessionManager.LOGGED_OUT_TOKEN");
        EKF ekf = new EKF();
        ekf.setArguments(A0b);
        AbstractC35259Fgt.A07(ekf, this.mFragmentManager, "android.nux.ContactPointTriageFragment");
    }

    @Override // X.InterfaceC37227Gac
    public final void Dki() {
        C07270a1 c07270a1 = this.A06;
        String A0J = AbstractC13880nE.A0J(this.A05);
        String A0l = AbstractC31173DnH.A0l(this);
        String A0m = AbstractC31176DnK.A0m(this);
        C25621Ms A0M = AbstractC31173DnH.A0M(c07270a1);
        A0M.A0B("accounts/send_password_reset/");
        AbstractC31180DnO.A1R(A0M, AbstractC31182DnR.A01(), A0J, A0l, A0m);
        C1ON A0I = AbstractC31178DnM.A0I(A0M, EDD.class, C34807FVj.class);
        A0I.A00 = new C32527EUd(getContext());
        schedule(A0I);
    }

    @Override // X.InterfaceC37227Gac
    public final void Do2(C34691FQc c34691FQc) {
        this.A0B.A00(c34691FQc, AbstractC13880nE.A0J(this.A05));
    }

    @Override // X.InterfaceC37227Gac
    public final void DoB(C07270a1 c07270a1, C32196ECr c32196ECr) {
        this.A0M.post(new RunnableC36943GPm(c07270a1, c32196ECr, this));
    }

    @Override // X.InterfaceC37227Gac
    public final void DoC() {
        C1ON A02 = AbstractC35276FhB.A02(requireContext(), this.A06, C05F.A0Y, AbstractC13880nE.A0J(this.A05));
        A02.A00 = new C33109EjD(this, this.A06);
        schedule(A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.A0A.onActivityResult(i, i2, intent);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C35159Ff1.A00.A02(this.A06, "login");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            window.getClass();
            window.clearFlags(8192);
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC37227Gac
    public final void DQP() {
        String str;
        String str2;
        if (AbstractC31171DnF.A1X(C36007Fv5.A00().A02(this.A06, "ig_android_growth_FX_access_fbig_create_cp_claiming", __redex_internal_original_name))) {
            this.A0A.A0B(this.A06, C36007Fv5.A00().A01(this.A06, "ig_android_growth_FX_access_fbig_create_cp_claiming", __redex_internal_original_name), C36007Fv5.A00().A02(this.A06, "ig_android_growth_FX_access_fbig_create_cp_claiming", __redex_internal_original_name), true);
            return;
        }
        if (C36159FxZ.A03.A00(this.A06, __redex_internal_original_name)) {
            if (AbstractC31181DnP.A11(this.A06, __redex_internal_original_name)) {
                str = null;
            } else {
                str = C36159FxZ.A00;
            }
            if (AbstractC31181DnP.A11(this.A06, __redex_internal_original_name)) {
                str2 = null;
            } else {
                str2 = C36159FxZ.A02;
            }
            if (str == null || str2 == null) {
                return;
            }
            this.A0A.A0B(this.A06, str, str2, true);
            return;
        }
        this.A0A.A07();
    }

    @Override // X.InterfaceC37227Gac
    public final void Dkh() {
        C1ON A03 = AbstractC35276FhB.A03(getContext(), this.A06, AbstractC13880nE.A0J(this.A05));
        A03.A00 = new C32527EUd(getContext());
        schedule(A03);
    }

    @Override // X.InterfaceC37227Gac
    public final void Dkj() {
        schedule(AbstractC35276FhB.A01(getContext(), this.A06, null, null, AbstractC13880nE.A0J(this.A05), null, false, false));
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A06;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1983981610);
        super.onCreate(bundle);
        this.A0M = AbstractC167007dF.A0J();
        this.A06 = C023409i.A0A.A02(this.mArguments);
        this.A07 = AbstractC31178DnM.A0O(requireActivity());
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && AbstractC31172DnG.A13(bundle2, MSV.A00(94)).equalsIgnoreCase("force_logout_login_help")) {
            C07270a1 c07270a1 = this.A06;
            AbstractC34229F8b.A00(getActivity(), this.mArguments, AbstractC018607g.A00(this), this, c07270a1);
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                bundle3.remove("original_url");
            }
        }
        this.A0G = false;
        if (bundle != null && bundle.containsKey("LoginLandingFragment.LOGIN_FAILED")) {
            this.A0G = bundle.getBoolean("LoginLandingFragment.LOGIN_FAILED");
        }
        FragmentActivity activity = getActivity();
        if (activity instanceof SignedOutFragmentActivity) {
            this.A0R = ((SignedOutFragmentActivity) activity).A06;
        }
        C07270a1 c07270a12 = this.A06;
        EnumC31713DwI enumC31713DwI = EnumC31713DwI.A0t;
        this.A0A = new EVQ(this, this, c07270a12, this.A07, enumC31713DwI, this.A0R);
        C60462pV c60462pV = new C60462pV();
        c60462pV.A0E(new EVI(getActivity(), this, this.A06, enumC31713DwI));
        c60462pV.A0E(this.A0A);
        registerLifecycleListenerSet(c60462pV);
        FRB frb = new FRB(this, this.A06);
        this.A09 = frb;
        frb.A00();
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            this.A0H = bundle4.getBoolean("IS_ADD_ACCOUNT_FLOW", false);
            this.A0I = bundle4.getBoolean("is_current_user_fb_connected", false);
            this.A0C = bundle4.getString("current_username");
            this.A0K = bundle4.getBoolean("multiple_accounts_logged_in", false);
            if (bundle4.getBoolean("should_show_youth_regulation_block", false)) {
                FEC.A00.A00(getRootActivity());
                bundle4.remove("should_show_youth_regulation_block");
            }
        }
        C07270a1 c07270a13 = this.A06;
        AbstractC167017dG.A1N(c07270a13, "login");
        C35203Ffv.A01(c07270a13, "login");
        schedule(new EZF(this, 3));
        C0f9.A09(-1450087778, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1301732880);
        View inflate = layoutInflater.inflate(R.layout.reg_container, viewGroup, false);
        View inflate2 = layoutInflater.inflate(R.layout.login_landing, AbstractC31180DnO.A05(inflate), true);
        ImageView A0I = AbstractC31173DnH.A0I(inflate, R.id.login_landing_logo);
        AbstractC35259Fgt.A01(requireContext(), null, A0I);
        AbstractC31180DnO.A10(requireContext(), A0I);
        this.A00 = inflate2.findViewById(R.id.login_or_divider);
        this.A05 = AbstractC166997dE.A0T(inflate, R.id.login_username);
        FJQ fjq = new FJQ(requireContext());
        this.A08 = fjq;
        TextView textView = this.A05;
        C07270a1 c07270a1 = this.A06;
        if (textView instanceof AutoCompleteTextView) {
            Context context = getContext();
            context.getClass();
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textView;
            fjq.A00 = new C34615FMy(context, autoCompleteTextView, this, c07270a1, new FH0(new GAW(fjq)), new C36551GAa(c07270a1, this, fjq), EnumC31713DwI.A1e, AbstractC166997dE.A0N(this).getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material), false);
            Resources A0N = AbstractC166997dE.A0N(this);
            AbstractC167027dH.A12(autoCompleteTextView, textView, A0N);
            autoCompleteTextView.addOnLayoutChangeListener(new LQD(3, A0N, textView, autoCompleteTextView));
            fjq.A01.A00(context, this, c07270a1, new C61972ry(context, AbstractC018607g.A00(this)), new GAX(fjq, 2));
        }
        EditText A0H = AbstractC31173DnH.A0H(inflate, R.id.password);
        this.A03 = A0H;
        A0H.setTypeface(Typeface.DEFAULT);
        AbstractC31179DnN.A0s(this.A03);
        this.A03.setImeOptions(6);
        this.A03.setInputType(524416);
        C35754Fqr.A00(this.A03, this, 15);
        this.A0O = (TextInputLayout) inflate.requireViewById(R.id.password_input_layout);
        AccessibilityManager accessibilityManager = (AccessibilityManager) requireContext().getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            this.A0O.setPasswordVisibilityToggleEnabled(false);
        } else {
            this.A0O.setPasswordVisibilityToggleEnabled(true);
        }
        ProgressButton A0U = AbstractC31180DnO.A0U(inflate);
        this.A0Q = A0U;
        C0fQ.A00(new ViewOnClickListenerC31724DwT(this, 7), A0U);
        this.A0P = new FN0(this.A0Q, (ScrollView) inflate.findViewById(R.id.scroll_view), 0);
        this.A0B = new C34669FPe(this, this.A06);
        this.A01 = inflate.requireViewById(R.id.login_facebook_container);
        TextView A0e = AbstractC166987dD.A0e(inflate, R.id.login_facebook);
        this.A04 = A0e;
        if (A0e != null) {
            AbstractC56952jT.A01(A0e);
            C35251Fgk.A02(this.A04, R.color.badge_color);
        }
        C0fQ.A00(new ViewOnClickListenerC31724DwT(this, 6), this.A01);
        TextView A0T = AbstractC166997dE.A0T(inflate, R.id.login_forgot_button);
        this.A0N = A0T;
        AbstractC56952jT.A01(A0T);
        AbstractC31180DnO.A13(AbstractC166997dE.A0N(this), this.A0N, 2131976445);
        AbstractC35081Fcs.A00(this.A0N, requireContext());
        C0fQ.A00(new ViewOnClickListenerC31724DwT(this, 8), this.A0N);
        if (this.A04 != null && !FxSsoViewModel.A01(this.A07)) {
            AbstractC31171DnF.A15(this.A04, AbstractC31176DnK.A0k(this.A07.A00));
        } else {
            this.A0A.A09(this.A04, this, EnumC31713DwI.A0t);
        }
        C31470DsE.A00(this, AbstractC31172DnG.A0F(this.A07.A00), 31);
        C31470DsE.A00(this, AbstractC31172DnG.A0F(this.A07.A02), 30);
        boolean A0L = AbstractC53242c7.A0L(getContext(), R.attr.nuxAllowSignUpFlow, true);
        View requireViewById = inflate.requireViewById(R.id.log_in_button);
        if (A0L) {
            TextView textView2 = (TextView) requireViewById;
            AbstractC56952jT.A01(textView2);
            AbstractC31180DnO.A13(AbstractC166997dE.A0N(this), textView2, 2131976566);
            AbstractC35081Fcs.A00(textView2, requireContext());
            C0fQ.A00(new ViewOnClickListenerC31724DwT(this, 5), textView2);
        } else {
            requireViewById.setVisibility(8);
            AbstractC35081Fcs.A00(this.A0N, requireContext());
        }
        this.A05.addTextChangedListener(C106904rr.A00(this.A06));
        this.A03.addTextChangedListener(C106904rr.A00(this.A06));
        ViewOnFocusChangeListenerC35694FpU.A00(this.A05, 14, this);
        ViewOnFocusChangeListenerC35694FpU.A00(this.A03, 15, this);
        A00(this);
        ((NetzDgTermsTextView) inflate2.requireViewById(R.id.netz_dg_terms_text_view)).A00(this.A06);
        if (this.A04 != null) {
            C35037FcA.A01(C1Q9.A0Z.A02(this.A06).A06(EnumC33445EqI.A04, EnumC31713DwI.A0t), this.A0I);
        }
        View requireViewById2 = inflate2.requireViewById(R.id.trusted_friends_footer_view);
        this.A02 = requireViewById2;
        requireViewById2.setVisibility(8);
        C0fQ.A00(new ViewOnClickListenerC31724DwT(this, 4), this.A02);
        C0f9.A09(1895926441, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-221206744);
        super.onDestroyView();
        this.A05.removeTextChangedListener(C106904rr.A00(this.A06));
        this.A03.removeTextChangedListener(C106904rr.A00(this.A06));
        C41451vu c41451vu = C41451vu.A01;
        c41451vu.A03(this.A0V, C36036FvY.class);
        c41451vu.A03(this.A0S, C36035FvX.class);
        c41451vu.A03(this.A0U, C36048Fvk.class);
        c41451vu.A03(this.A0W, C36037FvZ.class);
        this.A05 = null;
        this.A03 = null;
        this.A0O = null;
        this.A0Q = null;
        this.A01 = null;
        this.A04 = null;
        this.A00 = null;
        this.A0N = null;
        this.A0P = null;
        this.A02 = null;
        C0f9.A09(-1326857595, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-767177829);
        super.onPause();
        TextView textView = this.A05;
        TextWatcher textWatcher = this.A0T;
        textView.removeTextChangedListener(textWatcher);
        this.A03.removeTextChangedListener(textWatcher);
        AbstractC31171DnF.A16(this);
        Window A0H = AbstractC31174DnI.A0H(this);
        A0H.getClass();
        A0H.setSoftInputMode(3);
        C0f9.A09(1451566328, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-293242861);
        super.onResume();
        TextView textView = this.A05;
        TextWatcher textWatcher = this.A0T;
        textView.addTextChangedListener(textWatcher);
        this.A03.addTextChangedListener(textWatcher);
        AbstractC31180DnO.A0x(requireActivity());
        boolean A022 = AbstractC13620mo.A02(requireContext());
        TextView textView2 = this.A05;
        int i = 16;
        if (A022) {
            i = 21;
        }
        textView2.setGravity(i);
        this.A03.setGravity(i);
        A00(this);
        Window A0H = AbstractC31174DnI.A0H(this);
        A0H.getClass();
        A0H.setFlags(8192, 8192);
        C0f9.A09(1351198721, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("LoginLandingFragment.LOGIN_FAILED", this.A0G);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-1789594530);
        super.onStart();
        FN0 fn0 = this.A0P;
        if (fn0 != null) {
            fn0.A00.Dnr(getActivity());
        }
        C0f9.A09(4174404, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(1684686041);
        super.onStop();
        FN0 fn0 = this.A0P;
        if (fn0 != null) {
            fn0.A00.onStop();
        }
        C0f9.A09(-1292305259, A02);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.TnA] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        super.onViewCreated(view, bundle);
        if (!this.A0K && this.A0H && this.A0I) {
            this.A0L = false;
            int i = 0;
            this.A01.setVisibility(4);
            View view2 = this.A00;
            view2.getClass();
            if (!this.A0L) {
                i = 4;
            }
            view2.setVisibility(i);
        }
        C41451vu c41451vu = C41451vu.A01;
        c41451vu.A02(this.A0V, C36036FvY.class);
        c41451vu.A02(this.A0U, C36048Fvk.class);
        c41451vu.A02(this.A0W, C36037FvZ.class);
        Bundle bundle3 = this.mArguments;
        if ((bundle3 == null || !bundle3.getBoolean("IS_ONE_CLICK_LOGIN", false)) && ((bundle2 = this.mArguments) == null || !bundle2.getBoolean(MSV.A00(347), false))) {
            C07270a1 c07270a1 = this.A06;
            EnumC31713DwI enumC31713DwI = EnumC31713DwI.A0t;
            C14360o3.A0B(c07270a1, 0);
            AbstractC31710DwF.A00(this, c07270a1, new Object(), enumC31713DwI, false);
        }
        C07270a1 c07270a12 = this.A06;
        C14360o3.A0B(c07270a12, 0);
        C25621Ms A0M = AbstractC31177DnL.A0M(c07270a12);
        A0M.A0B("trusted_friend/get_non_expired_requests_info/");
        C32539EUp.A00(this, AbstractC31172DnG.A0R(null, A0M, ECI.class, C34871FYg.class, false), 33);
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null && AbstractC31171DnF.A0a(bundle4) != null && this.mArguments.getBoolean("ARGUMENT_SHOW_LOGIN_FOR_CONTENT_DIALOG", false)) {
            C193328hC A00 = AbstractC35254Fgn.A00(getRootActivity());
            A00.A0A(2131965779);
            AbstractC31176DnK.A1W(A00);
            this.mArguments.remove("ARGUMENT_SHOW_LOGIN_FOR_CONTENT_DIALOG");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewStateRestored(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = 1904453107(0x7183a5f3, float:1.303781E30)
            int r6 = X.C0f9.A02(r0)
            super.onViewStateRestored(r9)
            android.os.Bundle r2 = r8.mArguments
            if (r2 == 0) goto L34
            r7 = 0
            java.lang.String r0 = X.AbstractC31171DnF.A0a(r2)
            if (r0 == 0) goto L21
            android.net.Uri r1 = X.AbstractC08820cl.A03(r0)
            java.lang.String r0 = X.AbstractC31189DnY.A01()
            java.lang.String r7 = r1.getQueryParameter(r0)
        L21:
            java.lang.String r0 = X.C32316ELf.A0X
            java.lang.String r1 = r2.getString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L35
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r7 = r1
            if (r0 == 0) goto L35
        L34:
            r7 = 0
        L35:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L5f
            boolean r0 = r8.A0H
            if (r0 != 0) goto L5f
            java.lang.String r2 = X.C35264Fgy.A01()
            if (r2 == 0) goto L5f
            X.0a1 r0 = r8.A06
            java.util.Iterator r1 = X.AbstractC31178DnM.A0i(r0)
        L4b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L9d
            java.lang.Object r0 = r1.next()
            X.3oP r0 = (X.C83803oP) r0
            java.lang.String r0 = r0.A07
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L4b
        L5f:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L96
            android.widget.TextView r0 = r8.A05
            r0.setText(r7)
            double r4 = X.AbstractC31171DnF.A01()
            double r2 = X.AbstractC31171DnF.A00()
            X.0a1 r0 = r8.A06
            X.0wW r1 = X.AbstractC12220kQ.A02(r0)
            java.lang.String r0 = "login_username_prefilled"
            X.0Ai r1 = X.AbstractC166987dD.A0f(r1, r0)
            X.AbstractC31179DnN.A16(r1, r4, r2)
            java.lang.String r0 = "prefill"
            X.AbstractC31177DnL.A1G(r1, r0, r7, r2)
            java.lang.String r0 = "login"
            X.AbstractC31178DnM.A19(r1, r0)
            X.AbstractC35274Fh9.A05(r1)
            X.AbstractC31172DnG.A1O(r1)
            X.0a1 r0 = r8.A06
            X.AbstractC35274Fh9.A0B(r1, r0)
        L96:
            r0 = -1023968216(0xffffffffc2f77c28, float:-123.74249)
            X.C0f9.A09(r0, r6)
            return
        L9d:
            r7 = r2
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32316ELf.onViewStateRestored(android.os.Bundle):void");
    }
}
