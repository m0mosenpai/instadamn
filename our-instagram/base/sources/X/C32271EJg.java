package X;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.R;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import com.instagram.actionbar.ActionButton;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.EJg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32271EJg extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PhoneVerifyFragment";
    public long A00;
    public CountDownTimer A01;
    public EditText A02;
    public TextView A03;
    public TextView A04;
    public ActionButton A05;
    public AbstractC18680vv A06;
    public UserSession A07;
    public C35002FbZ A08;
    public C36127Fx1 A09;
    public C36128Fx2 A0A;
    public C36129Fx3 A0B;
    public C36130Fx4 A0C;
    public C35471Fl7 A0D;
    public EnumC33365Eoy A0E;
    public ProgressButton A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J;
    public InputMethodManager A0K;
    public final Handler A0L = new Handler();
    public final Runnable A0O = new RunnableC36839GLm(this);
    public final C1P1 A0M = EV0.A00(this, 35);
    public final C1P1 A0N = EV0.A00(this, 36);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "phone_verify";
    }

    public static void A00(C32271EJg c32271EJg) {
        if (c32271EJg.A0E == EnumC33365Eoy.A07) {
            C0J8.A03(c32271EJg.A07, "createEnableSMSTwoFactorRequest() additionally includes a checkNotNull in IgApi.Builder to assert that the user session is not null");
            C1ON A03 = AbstractC35177FfU.A03(c32271EJg.requireContext(), c32271EJg.A07, AbstractC31173DnH.A0j(c32271EJg.requireArguments(), PaymentDetailChangeTypes$Companion.PHONE_NUMBER), new C11L("\\D+").A00(AbstractC167007dF.A0g(c32271EJg.A0D.A01), ""));
            A03.A00 = c32271EJg.A0N;
            c32271EJg.schedule(A03);
        }
        C0J8.A03(c32271EJg.A07, "createVerifySMSCodeTask() additionally includes a checkNotNull in IgApi.Builder to assert that the user session is not null");
        Bundle requireArguments = c32271EJg.requireArguments();
        C1ON A05 = AbstractC152476ta.A05(c32271EJg.A07, requireArguments.getString(PaymentDetailChangeTypes$Companion.PHONE_NUMBER), new C11L("\\D+").A00(AbstractC167007dF.A0g(c32271EJg.A0D.A01), ""), requireArguments.getBoolean("HAS_SMS_CONSENT"));
        A05.A00 = c32271EJg.A0N;
        c32271EJg.schedule(A05);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        this.A05 = interfaceC56362iU.Ehi(new ViewOnClickListenerC35677FpC(this, 33), 2131976610);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A06;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.FbZ, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        EnumC33365Eoy enumC33365Eoy;
        int A02 = C0f9.A02(-1652015096);
        int A022 = C0f9.A02(803847063);
        super.onCreate(bundle);
        this.A06 = AbstractC31176DnK.A0R(this);
        if (bundle == null) {
            bundle = this.mArguments;
        }
        ?? obj = new Object();
        obj.A02 = bundle.getInt("resend_sms_delay_sec");
        obj.A01 = bundle.getInt("robocall_count_down_time_sec");
        obj.A03 = bundle.getBoolean("robocall_after_max_sms");
        obj.A00 = bundle.getInt("max_sms_count");
        this.A08 = obj;
        this.A00 = SystemClock.elapsedRealtime();
        C0f9.A09(-1270960520, A022);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A07 = AbstractC31176DnK.A0S(this);
            String A0H = AbstractC31181DnP.A0H(AbstractC31173DnH.A0j(bundle2, PaymentDetailChangeTypes$Companion.PHONE_NUMBER));
            this.A0H = A0H;
            if (A0H != null) {
                this.A0H = A0H.replace("-", " ");
            }
        }
        this.A0K = (InputMethodManager) requireActivity().getSystemService("input_method");
        boolean z = false;
        if (bundle2 != null && bundle2.getBoolean("AUTO_CONFIRM_SMS", false)) {
            z = true;
        }
        this.A0I = z;
        Bundle bundle3 = this.mArguments;
        if (bundle3 == null) {
            enumC33365Eoy = EnumC33365Eoy.A03;
        } else {
            enumC33365Eoy = EnumC33365Eoy.values()[bundle3.getInt("flow_key")];
        }
        this.A0E = enumC33365Eoy;
        this.A0J = EnumC33365Eoy.A04.equals(enumC33365Eoy);
        C0f9.A09(-1298985371, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        int A02 = C0f9.A02(-1682722048);
        int A022 = C0f9.A02(1504536409);
        boolean z = this.A0J;
        int i = R.layout.fragment_verify;
        if (z) {
            i = R.layout.fragment_verify_new;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        this.A03 = AbstractC166997dE.A0T(inflate, R.id.code_verification_instruction);
        if (this.A0J) {
            this.A0G = getString(2131976595);
            string = AbstractC31173DnH.A0B(inflate.getResources(), this.A0H, 2131972454).toString();
        } else {
            String string2 = getString(2131976596);
            this.A0G = string2;
            string = getString(2131976593, this.A0H, string2);
        }
        String str = this.A0G;
        TextView textView = this.A03;
        ViewOnClickListenerC35677FpC viewOnClickListenerC35677FpC = new ViewOnClickListenerC35677FpC(this, 20);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(string);
        AnonymousClass773.A05(A0H, new C33252Elm(Integer.valueOf(textView.getCurrentTextColor()), viewOnClickListenerC35677FpC, 4), str);
        AbstractC25227BEk.A11(textView);
        textView.setHighlightColor(0);
        textView.setText(A0H);
        C0f9.A09(892733533, A022);
        if (this.A0J) {
            ProgressButton A0U = AbstractC31180DnO.A0U(inflate);
            this.A0F = A0U;
            A0U.setEnabled(false);
            ViewOnClickListenerC35677FpC.A00(this.A0F, 32, this);
        } else {
            this.A04 = AbstractC166997dE.A0T(inflate, R.id.code_verification_instruction);
            String string3 = getString(2131955008);
            String A0w = AbstractC31174DnI.A0w(this, string3, 2131976611);
            TextView textView2 = this.A04;
            C0J8.A03(textView2, "Set as non-null in the line directly preceding this method call in OnCreateView");
            ViewOnClickListenerC35677FpC viewOnClickListenerC35677FpC2 = new ViewOnClickListenerC35677FpC(this, 34);
            SpannableStringBuilder A0H2 = AbstractC25225BEi.A0H(A0w);
            AnonymousClass773.A05(A0H2, new C33252Elm(Integer.valueOf(textView2.getCurrentTextColor()), viewOnClickListenerC35677FpC2, 4), string3);
            AbstractC25227BEk.A11(textView2);
            textView2.setHighlightColor(0);
            textView2.setText(A0H2);
        }
        EditText A0H3 = AbstractC31173DnH.A0H(inflate, R.id.confirmation_code);
        this.A02 = A0H3;
        C35471Fl7 c35471Fl7 = new C35471Fl7(A0H3, this);
        this.A0D = c35471Fl7;
        this.A02.addTextChangedListener(c35471Fl7);
        C35754Fqr.A00(this.A02, this, 10);
        if (this.A0J) {
            C35251Fgk.A04((SearchEditText) this.A02);
        }
        if (this.A0I) {
            C41451vu c41451vu = C41451vu.A01;
            C36129Fx3 c36129Fx3 = new C36129Fx3(this);
            this.A0B = c36129Fx3;
            c41451vu.A02(c36129Fx3, C36042Fve.class);
            C36127Fx1 c36127Fx1 = new C36127Fx1(this);
            this.A09 = c36127Fx1;
            c41451vu.A02(c36127Fx1, C36039Fvb.class);
            C36130Fx4 c36130Fx4 = new C36130Fx4(this);
            this.A0C = c36130Fx4;
            c41451vu.A02(c36130Fx4, C36050Fvm.class);
            C36128Fx2 c36128Fx2 = new C36128Fx2(this);
            this.A0A = c36128Fx2;
            c41451vu.A02(c36128Fx2, C36049Fvl.class);
        }
        C0f9.A09(1059740674, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1653739574);
        super.onDestroy();
        CountDownTimer countDownTimer = this.A01;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A01 = null;
        }
        C0f9.A09(-187956484, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1871408601);
        InputMethodManager inputMethodManager = this.A0K;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.A02.getWindowToken(), 0);
        }
        this.A02.removeCallbacks(this.A0O);
        this.A0D = null;
        this.A02 = null;
        this.A04 = null;
        this.A05 = null;
        this.A0F = null;
        if (this.A0I) {
            C41451vu c41451vu = C41451vu.A01;
            C36129Fx3 c36129Fx3 = this.A0B;
            if (c36129Fx3 != null) {
                c41451vu.A03(c36129Fx3, C36042Fve.class);
            }
            C36127Fx1 c36127Fx1 = this.A09;
            if (c36127Fx1 != null) {
                c41451vu.A03(c36127Fx1, C36039Fvb.class);
            }
            C36130Fx4 c36130Fx4 = this.A0C;
            if (c36130Fx4 != null) {
                c41451vu.A03(c36130Fx4, C36050Fvm.class);
            }
            C36128Fx2 c36128Fx2 = this.A0A;
            if (c36128Fx2 != null) {
                c41451vu.A03(c36128Fx2, C36049Fvl.class);
            }
        }
        super.onDestroyView();
        C0f9.A09(-2024631975, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1801650564);
        int A022 = C0f9.A02(248008605);
        super.onResume();
        C35002FbZ c35002FbZ = this.A08;
        if (c35002FbZ.A03 && c35002FbZ.A00 <= 0 && SystemClock.elapsedRealtime() - this.A00 >= c35002FbZ.A02 * 1000 && this.A01 == null) {
            CountDownTimerC31738Dwr countDownTimerC31738Dwr = new CountDownTimerC31738Dwr(this, c35002FbZ.A01 * 1000);
            this.A01 = countDownTimerC31738Dwr;
            countDownTimerC31738Dwr.start();
        }
        C0f9.A09(-1688372431, A022);
        this.A02.postDelayed(this.A0O, 200L);
        C0f9.A09(-1510732322, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.A08.A01(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(916723602);
        super.onStart();
        this.A02.requestFocus();
        C0f9.A09(317712146, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1162232179);
        super.onStop();
        AbstractC31171DnF.A16(this);
        Window A0H = AbstractC31174DnI.A0H(this);
        A0H.getClass();
        A0H.setSoftInputMode(3);
        C0f9.A09(-1295161056, A02);
    }
}
