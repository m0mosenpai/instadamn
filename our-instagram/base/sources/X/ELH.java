package X;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.fx.access.sso.FxSsoViewModel;
import com.instagram.ui.text.FreeAutoCompleteTextView;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class ELH extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou, CallerContextable {
    public static final long A0R = TimeUnit.SECONDS.toMillis(10);
    public static final String __redex_internal_original_name = "LookupFragment";
    public int A00;
    public int A01;
    public Dialog A02;
    public View A03;
    public TextView A04;
    public InterfaceC41501vz A05;
    public InterfaceC41501vz A06;
    public C07270a1 A07;
    public FxSsoViewModel A08;
    public C35161Ff3 A09;
    public FRE A0A;
    public EVG A0B;
    public EVQ A0C;
    public C6WQ A0D;
    public FreeAutoCompleteTextView A0E;
    public InlineErrorMessageView A0F;
    public ProgressButton A0G;
    public Integer A0H;
    public boolean A0L;
    public final List A0O = AbstractC166987dD.A1E();
    public final Handler A0M = new Handler();
    public final GYL A0P = new GGZ(this);
    public String A0I = "";
    public boolean A0K = false;
    public boolean A0J = false;
    public final View.OnClickListener A0N = new ViewOnClickListenerC35677FpC(this, 25);
    public final Runnable A0Q = new RunnableC36833GLg(this);

    public static void A04(ELH elh, C34955Faf c34955Faf) {
        String str;
        Integer num = elh.A0H;
        String str2 = "";
        if (num == null) {
            str = "";
        } else {
            str = F9V.A00(num);
        }
        if (c34955Faf != null) {
            str2 = c34955Faf.A01;
        }
        C07270a1 c07270a1 = elh.A07;
        AbstractC167007dF.A1E(c07270a1, 0, str2);
        double A01 = AbstractC31171DnF.A01();
        double A00 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(c07270a1), "prefill_lookup_identifier");
        AbstractC31179DnN.A16(A0f, A01, A00);
        AbstractC35274Fh9.A05(A0f);
        AbstractC31172DnG.A1O(A0f);
        A0f.A7v("prefilled", true);
        AbstractC31176DnK.A1J(A0f, A00);
        AbstractC31178DnM.A19(A0f, "user_lookup");
        A0f.AAP("cp_prefill_type", str);
        AbstractC31175DnJ.A16(A0f, str2);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "password_lookup";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FreeAutoCompleteTextView freeAutoCompleteTextView = this.A0E;
        Resources A0N = AbstractC166997dE.A0N(this);
        AbstractC167027dH.A12(freeAutoCompleteTextView, freeAutoCompleteTextView, A0N);
        freeAutoCompleteTextView.addOnLayoutChangeListener(new LQD(3, A0N, freeAutoCompleteTextView, freeAutoCompleteTextView));
        Context requireContext = requireContext();
        FRE fre = FRE.A04;
        if (fre == null) {
            AbstractC52232aO.A00(requireContext);
            fre = new FRE();
            FRE.A04 = fre;
        }
        this.A0A = fre;
        fre.A00(requireContext(), this, this.A07, AbstractC31178DnM.A0L(this), new GAX(this, 0));
        String string = requireArguments().getString("com.instagram.android.login.fragment.ARGUMENT_OMNISTRING");
        Integer num = C05F.A0C;
        C14360o3.A0B(num, 0);
        EnumSet of = EnumSet.of(EnumC33395EpS.A05, EnumC33395EpS.A03, EnumC33395EpS.A07);
        C14360o3.A0A(of);
        EnumSet complementOf = EnumSet.complementOf(of);
        C14360o3.A07(complementOf);
        ArrayList A04 = C35270Fh5.A04(requireActivity(), this.A07, EnumC31713DwI.A1j, complementOf);
        Context requireContext2 = requireContext();
        C07270a1 c07270a1 = this.A07;
        Context requireContext3 = requireContext();
        C07270a1 c07270a12 = this.A07;
        C14360o3.A0B(c07270a12, 2);
        ArrayList A02 = AbstractC35100FdB.A02(requireContext3, c07270a12, num);
        JSONArray A0p = AbstractC31171DnF.A0p();
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            try {
                A0p.put(((AbstractC33622EtY) it.next()).A00());
            } catch (JSONException unused) {
            }
        }
        JSONArray A0p2 = AbstractC31171DnF.A0p();
        Iterator it2 = A04.iterator();
        while (it2.hasNext()) {
            try {
                A0p2.put(((AbstractC33622EtY) it2.next()).A00());
            } catch (JSONException unused2) {
            }
        }
        List list = this.A0O;
        C25621Ms A0M = AbstractC31173DnH.A0M(c07270a1);
        A0M.A0B("accounts/contact_point_prefill/");
        A0M.A9s("usage", "account_recovery_usage");
        AbstractC31177DnL.A0t(requireContext2, A0M);
        AbstractC31176DnK.A1O(C19T.A2B, A0M, AbstractC31172DnG.A0P(c07270a1));
        AbstractC31175DnJ.A0k(requireContext2, A0M, C16030qx.A02);
        if (list != null && !list.isEmpty()) {
            JSONArray A0p3 = AbstractC31171DnF.A0p();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                AbstractC31172DnG.A1W(it3, A0p3);
            }
            AbstractC31176DnK.A1R(A0M, A0p3);
        }
        JSONArray A0p4 = AbstractC31171DnF.A0p();
        for (int i = 0; i < A0p.length(); i++) {
            try {
                A0p4.put(A0p.getJSONObject(i));
            } catch (JSONException unused3) {
                C0w9.A03("Account recovery identifier filter", "Invalid Json");
            }
        }
        for (int i2 = 0; i2 < A0p2.length(); i2++) {
            A0p4.put(A0p2.getJSONObject(i2));
        }
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty("login_page")) {
            JSONObject A0q = AbstractC31171DnF.A0q();
            A0q.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "omnistring");
            A0q.put(CacheBehaviorLogger.SOURCE, "login_page");
            A0q.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, string);
            A0p4.put(A0q);
        }
        if (A0p4.length() > 0) {
            A0M.A9s("client_contact_points", A0p4.toString());
        }
        C1ON A0I = AbstractC31178DnM.A0I(A0M, EDS.class, FYL.class);
        A0I.A00 = new C32508ETj(this);
        C1GJ.A03(A0I);
        new Handler().postDelayed(new Runnable() { // from class: X.GLf
            @Override // java.lang.Runnable
            public final void run() {
                ELH elh = ELH.this;
                C006802i.A0p.markerEnd(725105460, (short) 2);
                C6WQ c6wq = elh.A0D;
                if (c6wq != null && (c6wq.getOwnerActivity() == null || !c6wq.getOwnerActivity().isDestroyed())) {
                    c6wq.cancel();
                }
                ELH.A02(elh);
            }
        }, 4000L);
    }

    public static Integer A00(String str) {
        if (AbstractC31175DnJ.A1Z(str.trim(), Patterns.EMAIL_ADDRESS)) {
            return C05F.A00;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '#' && charAt != '+' && charAt != ' ' && charAt != '-' && charAt != '(' && charAt != ')' && charAt != '.' && !Character.isDigit(charAt)) {
                return C05F.A0C;
            }
        }
        return C05F.A01;
    }

    public static void A02(ELH elh) {
        Bundle bundle;
        String string;
        FreeAutoCompleteTextView freeAutoCompleteTextView = elh.A0E;
        if (freeAutoCompleteTextView != null && AbstractC13880nE.A10(freeAutoCompleteTextView) && (bundle = elh.mArguments) != null && bundle.containsKey("com.instagram.android.login.fragment.ARGUMENT_OMNISTRING") && (string = elh.mArguments.getString("com.instagram.android.login.fragment.ARGUMENT_OMNISTRING")) != null) {
            freeAutoCompleteTextView.setText(string);
            elh.A0H = A00(string);
            A04(elh, null);
        }
    }

    public static void A03(ELH elh) {
        String str;
        String A0J = AbstractC13880nE.A0J(elh.A0E);
        try {
            str = C35270Fh5.A01(elh.requireActivity(), elh.A07, EnumC31713DwI.A1j, C05F.A0C);
        } catch (IOException unused) {
            str = null;
        }
        List list = elh.A0O;
        if (!AbstractC166987dD.A1b(list)) {
            list = AbstractC166987dD.A1E();
        }
        Context requireContext = elh.requireContext();
        C07270a1 c07270a1 = elh.A07;
        C25621Ms A0M = AbstractC31173DnH.A0M(c07270a1);
        A0M.A0B("users/lookup/");
        AbstractC31179DnN.A0j(requireContext, A0M, "q", A0J);
        AbstractC31178DnM.A1K(A0M, "directly_sign_in", "true");
        AbstractC31175DnJ.A1F(C19T.A1v, A0M, AbstractC31172DnG.A0P(c07270a1));
        A0M.A0I(AbstractC58317Pt9.A00(303), AbstractC14490oL.A0G(requireContext));
        A0M.A0H("country_codes", str);
        A0M.A0P(C07340a8.A00, EfS.class, C34804FVg.class, false);
        A0M.A0R = true;
        if (!list.isEmpty()) {
            A0M.A9s("google_id_tokens", TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, list));
        }
        if (LHp.A00(requireContext)) {
            A0M.A9s("android_build_type", AbstractC31176DnK.A0r((EnumC12900lc) EnumC12900lc.A02.getValue()));
        }
        C1ON A0N = A0M.A0N();
        A0N.A00 = new C32525EUb(elh, A0J);
        C1GJ.A03(A0N);
    }

    public final void A05() {
        C35161Ff3 c35161Ff3 = new C35161Ff3();
        Integer num = this.A0H;
        if (num != null) {
            c35161Ff3.A00.putString(AbstractC31176DnK.A0r(EnumC33320EoF.A04), F9V.A00(num));
        }
        Integer A00 = A00(AbstractC13880nE.A0J(this.A0E));
        Bundle bundle = c35161Ff3.A00;
        bundle.putString(AbstractC31176DnK.A0r(EnumC33320EoF.A06), F9V.A00(A00));
        bundle.putBoolean(AbstractC31176DnK.A0r(EnumC33320EoF.A08), this.A0I.equals(AbstractC13880nE.A0J(this.A0E).trim()));
        C35031Fc4.A00.A00(this.A07, c35161Ff3, "user_lookup");
        this.A0G.setShowProgressBar(true);
        C006802i.A0p.markerStart(725096220);
        C006802i.A0p.markerAnnotate(725096220, "flow", "prod");
        C006802i.A0p.markerStart(725096125);
        C006802i.A0p.markerAnnotate(725096125, "flow", "prod");
        synchronized (this) {
            this.A0L = true;
            int i = this.A00;
            if (i > 0 && i > this.A01) {
                FD2.A00(this.A07, "wait_for_time_out");
                Handler handler = this.A0M;
                Runnable runnable = this.A0Q;
                handler.postDelayed(new GOI(this, runnable), A0R);
            } else {
                FD2.A00(this.A07, "token_ready");
                if (A06()) {
                    A03(this);
                }
            }
        }
    }

    public final boolean A06() {
        FragmentActivity activity;
        if (this.mView != null && (activity = getActivity()) != null && isAdded() && this.A0E != null && !this.mRemoving && !this.mDetached && !activity.isFinishing()) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        C1L2.A01(intent, this.A07, this.A0P);
        super.onActivityResult(i, i2, intent);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C35159Ff1.A00.A02(this.A07, "user_lookup");
        return false;
    }

    private void A01() {
        Activity rootActivity;
        AbstractC31171DnF.A16(this);
        FragmentActivity activity = getActivity();
        if (activity != null && activity.getWindow() != null) {
            rootActivity = getActivity();
        } else if (getRootActivity() == null || getRootActivity().getWindow() == null) {
            return;
        } else {
            rootActivity = getRootActivity();
        }
        rootActivity.getWindow().setSoftInputMode(3);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.Efu(2131965789);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A07;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        int A02 = C0f9.A02(-1646096715);
        super.onActivityCreated(bundle);
        this.A0E.requestFocus();
        C0f9.A09(100643909, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1220661028);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        this.A07 = AbstractC31180DnO.A0L(this);
        this.A09 = C35161Ff3.A00(bundle2);
        FxSsoViewModel A0O = AbstractC31178DnM.A0O(requireActivity());
        this.A08 = A0O;
        this.A0C = new EVQ(this, this, this.A07, A0O, EnumC31713DwI.A1j, null);
        if (bundle2 != null) {
            this.A0J = bundle2.getBoolean("is_current_user_fb_connected", false);
        }
        C07270a1 c07270a1 = this.A07;
        AbstractC167017dG.A1N(c07270a1, "user_lookup");
        C35203Ffv.A01(c07270a1, "user_lookup");
        C0f9.A09(-1493479769, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1289814972);
        this.A0L = false;
        View inflate = layoutInflater.inflate(R.layout.fragment_lookup, viewGroup, false);
        if (C1AD.A06(C06090Tz.A05, 18301560022896473L)) {
            inflate = layoutInflater.inflate(R.layout.fragment_lookup_v2, viewGroup, false);
        }
        FreeAutoCompleteTextView freeAutoCompleteTextView = (FreeAutoCompleteTextView) inflate.requireViewById(R.id.fragment_lookup_edittext);
        this.A0E = freeAutoCompleteTextView;
        freeAutoCompleteTextView.addTextChangedListener(new Em2(this, 1));
        C35754Fqr.A00(this.A0E, this, 8);
        this.A0E.addTextChangedListener(C106904rr.A00(this.A07));
        ProgressButton A0U = AbstractC31180DnO.A0U(inflate);
        this.A0G = A0U;
        C0fQ.A00(this.A0N, A0U);
        this.A0F = (InlineErrorMessageView) inflate.requireViewById(R.id.inline_error);
        ViewGroup A0F = AbstractC31173DnH.A0F(inflate, R.id.container);
        TimeInterpolator timeInterpolator = InlineErrorMessageView.A09;
        FC5.A00(A0F);
        View requireViewById = inflate.requireViewById(R.id.need_more_help_text_view);
        AbstractC56952jT.A01(requireViewById);
        ViewOnClickListenerC35677FpC.A00(requireViewById, 26, this);
        if (AbstractC14490oL.A09(inflate.getContext())) {
            View requireViewById2 = inflate.requireViewById(R.id.reg_facebook_option_layout);
            this.A04 = AbstractC166997dE.A0T(inflate, R.id.login_facebook);
            this.A03 = inflate.requireViewById(R.id.login_facebook_container);
            requireViewById2.setVisibility(8);
        } else {
            this.A04 = AbstractC166997dE.A0T(inflate, R.id.login_facebook);
            this.A03 = inflate.requireViewById(R.id.login_facebook_container);
            AbstractC56952jT.A01(this.A04);
            ViewOnClickListenerC35677FpC.A00(this.A04, 27, this);
            AbstractC53242c7.A0H(requireContext(), R.attr.igds_color_primary_button);
            this.A04.setCompoundDrawablesWithIntrinsicBounds(R.drawable.instagram_facebook_circle_filled_16, 0, 0, 0);
            AbstractC166987dD.A1O(requireContext(), this.A04, AbstractC53242c7.A07(requireContext()));
            C35251Fgk.A02(this.A04, AbstractC53242c7.A08(requireContext()));
            this.A03.setBackgroundResource(R.drawable.secondary_button_selector_panavision_soft_update);
            boolean A01 = FxSsoViewModel.A01(this.A08);
            TextView textView = this.A04;
            FxSsoViewModel fxSsoViewModel = this.A08;
            if (!A01) {
                AbstractC31171DnF.A15(textView, AbstractC31176DnK.A0k(fxSsoViewModel.A00));
            } else {
                AbstractC31171DnF.A15(textView, AbstractC31176DnK.A0k(fxSsoViewModel.A01));
                this.A0C.A09(this.A04, this, EnumC31713DwI.A1j);
            }
            C31470DsE.A00(this, AbstractC31172DnG.A0F(this.A08.A00), 21);
            C31650DvG A00 = C31650DvG.A00(this, 49);
            this.A05 = A00;
            this.A06 = C31650DvG.A00(this, 50);
            C41451vu c41451vu = C41451vu.A01;
            c41451vu.A02(A00, C36036FvY.class);
            c41451vu.A02(this.A06, C36037FvZ.class);
            C07270a1 c07270a1 = this.A07;
            EnumC31713DwI enumC31713DwI = EnumC31713DwI.A1j;
            EVG evg = new EVG(c07270a1, null, enumC31713DwI);
            this.A0B = evg;
            registerLifecycleListener(evg);
            C35037FcA.A01(C1Q9.A0Z.A02(this.A07).A06(EnumC33445EqI.A04, enumC31713DwI), this.A0J);
        }
        C6WQ A0T = AbstractC31180DnO.A0T(this);
        this.A0D = A0T;
        A0T.A00(AbstractC166997dE.A0N(this).getString(2131965660));
        C0f9.A09(1578474212, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(161679314);
        super.onDestroyView();
        this.A0M.removeCallbacksAndMessages(null);
        this.A0E.removeTextChangedListener(C106904rr.A00(this.A07));
        this.A0E = null;
        this.A0A = null;
        C6WQ c6wq = this.A0D;
        if (c6wq != null && (c6wq.getOwnerActivity() == null || !c6wq.getOwnerActivity().isDestroyed())) {
            c6wq.cancel();
        }
        this.A0D = null;
        this.A02 = null;
        InterfaceC41501vz interfaceC41501vz = this.A05;
        if (interfaceC41501vz != null) {
            C41451vu.A01.A03(interfaceC41501vz, C36036FvY.class);
            this.A05 = null;
        }
        InterfaceC41501vz interfaceC41501vz2 = this.A06;
        if (interfaceC41501vz2 != null) {
            C41451vu.A01.A03(interfaceC41501vz2, C36037FvZ.class);
            this.A06 = null;
        }
        EVG evg = this.A0B;
        if (evg != null) {
            unregisterLifecycleListener(evg);
            this.A0B = null;
        }
        C0f9.A09(1597234220, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1335210386);
        this.A0K = true;
        super.onPause();
        C0f9.A09(-501608290, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-497958992);
        this.A0K = false;
        super.onResume();
        this.A0G.setEnabled(!AbstractC31179DnN.A1a(this.A0E));
        A01();
        C0f9.A09(481709764, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(981566215);
        A01();
        Dialog dialog = this.A02;
        if (dialog != null) {
            AbstractC31176DnK.A10(dialog);
        }
        super.onStop();
        C0f9.A09(1504913318, A02);
    }
}
