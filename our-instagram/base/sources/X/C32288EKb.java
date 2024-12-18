package X;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.fx.access.sso.FxSsoViewModel;
import com.instagram.nux.ui.NetzDgTermsTextView;

/* renamed from: X.EKb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32288EKb extends AbstractC59962oe implements InterfaceC60072op, InterfaceC43641zu {
    public static final String __redex_internal_original_name = "FacebookLandingFragment";
    public long A00;
    public ViewGroup A01;
    public TextSwitcher A02;
    public TextView A03;
    public C11830jh A04;
    public C07270a1 A05;
    public FxSsoViewModel A06;
    public FRB A07;
    public EVQ A08;
    public boolean A0A;
    public TextView A0B;
    public InterfaceC26681Qx A0C;
    public boolean A09 = false;
    public final InterfaceC41501vz A0E = C31650DvG.A00(this, 59);
    public final InterfaceC41501vz A0D = C31650DvG.A00(this, 60);
    public final InterfaceC41501vz A0F = C31650DvG.A00(this, 61);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "landing_facebook";
    }

    public static void A01(C32288EKb c32288EKb) {
        C1R0 C98 = c32288EKb.A0C.C98();
        if (C98.A0C.contains("ig_landing_screen_text")) {
            String str = C98.A06;
            if (str == null) {
                str = c32288EKb.getString(2131977206);
            }
            c32288EKb.A0B.setText(AbstractC166997dE.A0r(AbstractC166997dE.A0N(c32288EKb), str, 2131977210));
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(250L);
            c32288EKb.A0B.startAnimation(alphaAnimation);
            return;
        }
        AbstractC31171DnF.A14(c32288EKb.A0B);
    }

    public static void A02(C32288EKb c32288EKb, String str) {
        if (c32288EKb.A02 != null && !TextUtils.isEmpty(str)) {
            c32288EKb.A02.setCurrentText(str);
            c32288EKb.A0A = true;
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.A08.onActivityResult(i, i2, intent);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C35159Ff1.A00.A02(this.A05, "landing");
        return false;
    }

    @Override // X.InterfaceC43641zu
    public final void onTokenChange() {
        C11T.A02(new RunnableC36852GLz(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(X.C32288EKb r3) {
        /*
            X.Fv5 r0 = X.C36007Fv5.A00()
            X.8yX r0 = r0.A01
            if (r0 == 0) goto L64
            X.8yY r0 = r0.A00
            if (r0 == 0) goto L64
            java.lang.String r1 = r0.A00
        Le:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L2f
            X.FxZ r2 = X.C36159FxZ.A03
            X.0a1 r0 = r3.A05
            java.lang.String r1 = "FacebookLandingFragment"
            boolean r0 = r2.A00(r0, r1)
            if (r0 == 0) goto L39
            X.0a1 r0 = r3.A05
            boolean r0 = X.AbstractC31181DnP.A11(r0, r1)
            if (r0 == 0) goto L61
            r1 = 0
        L29:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L39
        L2f:
            r0 = 2131956788(0x7f131434, float:1.9550142E38)
            java.lang.String r0 = X.AbstractC31174DnI.A0w(r3, r1, r0)
            A02(r3, r0)
        L39:
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r3.A06
            X.0do r0 = r0.A00
            java.lang.Object r0 = X.AbstractC31176DnK.A0k(r0)
            java.lang.String r0 = (java.lang.String) r0
            A02(r3, r0)
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r3.A06
            X.0do r0 = r0.A00
            X.2GT r1 = X.AbstractC31172DnG.A0F(r0)
            r0 = 28
            X.C31470DsE.A00(r3, r1, r0)
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r3.A06
            X.0do r0 = r0.A02
            X.2GT r1 = X.AbstractC31172DnG.A0F(r0)
            r0 = 29
            X.C31470DsE.A00(r3, r1, r0)
            return
        L61:
            java.lang.String r1 = X.C36159FxZ.A01
            goto L29
        L64:
            r1 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32288EKb.A00(X.EKb):void");
    }

    public static boolean A03(C32288EKb c32288EKb) {
        if (AnonymousClass780.A00(c32288EKb.getRootActivity()).A00.equals("RU") || (!C36159FxZ.A03.A00(c32288EKb.A05, __redex_internal_original_name) && !AbstractC23851Es.A04(c32288EKb.getContext()))) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A05;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bc, code lost:
    
        if (r3 != null) goto L11;
     */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, X.TnA] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            r0 = -1787563163(0xffffffff9573f365, float:-4.9265464E-26)
            int r2 = X.C0f9.A02(r0)
            r7 = r13
            super.onCreate(r14)
            android.os.Bundle r3 = r13.mArguments
            androidx.fragment.app.FragmentActivity r0 = r13.requireActivity()
            android.app.Application r0 = r0.getApplication()
            X.AbstractC52232aO.A00(r0)
            X.09Y r0 = X.C023409i.A0A
            X.0a1 r0 = r0.A02(r3)
            r13.A05 = r0
            X.0jh r0 = X.AbstractC31172DnG.A0P(r0)
            r13.A04 = r0
            androidx.fragment.app.FragmentActivity r0 = r13.requireActivity()
            com.instagram.fx.access.sso.FxSsoViewModel r0 = X.AbstractC31178DnM.A0O(r0)
            r13.A06 = r0
            X.2pV r5 = new X.2pV
            r5.<init>()
            androidx.fragment.app.FragmentActivity r4 = r13.requireActivity()
            boolean r0 = r4 instanceof com.instagram.nux.activity.SignedOutFragmentActivity
            if (r0 == 0) goto Lbf
            r0 = r4
            com.instagram.nux.activity.SignedOutFragmentActivity r0 = (com.instagram.nux.activity.SignedOutFragmentActivity) r0
            java.lang.String r12 = r0.A06
        L42:
            X.0a1 r9 = r13.A05
            X.DwI r11 = X.EnumC31713DwI.A0r
            com.instagram.fx.access.sso.FxSsoViewModel r10 = r13.A06
            X.EVQ r6 = new X.EVQ
            r8 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r13.A08 = r6
            X.0a1 r1 = r13.A05
            X.EVI r0 = new X.EVI
            r0.<init>(r4, r13, r1, r11)
            r5.A0E(r0)
            X.EVQ r0 = r13.A08
            r5.A0E(r0)
            r13.registerLifecycleListenerSet(r5)
            X.0a1 r1 = r13.A05
            X.FRB r0 = new X.FRB
            r0.<init>(r13, r1)
            r13.A07 = r0
            r0.A00()
            android.view.Window r1 = r4.getWindow()
            r0 = 32
            r1.setSoftInputMode(r0)
            X.0a1 r0 = r13.A05
            X.1Qx r0 = X.C26661Qv.A00(r0)
            r13.A0C = r0
            X.0a1 r1 = r13.A05
            java.lang.String r0 = "landing"
            X.AbstractC167017dG.A1N(r1, r0)
            X.C35203Ffv.A01(r1, r0)
            r4 = 0
            if (r3 == 0) goto Laf
            java.lang.String r0 = "IS_ONE_CLICK_LOGIN"
            boolean r0 = r3.getBoolean(r0, r4)
            if (r0 != 0) goto La0
            r0 = 347(0x15b, float:4.86E-43)
            java.lang.String r0 = X.MSV.A00(r0)
            boolean r0 = r3.getBoolean(r0, r4)
            if (r0 == 0) goto Laf
        La0:
            java.lang.String r0 = "is_current_user_fb_connected"
            boolean r0 = r3.getBoolean(r0, r4)
            r13.A09 = r0
        La8:
            r0 = 324816886(0x135c4ff6, float:2.7807328E-27)
            X.C0f9.A09(r0, r2)
            return
        Laf:
            X.0a1 r1 = r13.A05
            X.C14360o3.A0B(r1, r4)
            X.G9V r0 = new X.G9V
            r0.<init>()
            X.AbstractC31710DwF.A00(r13, r1, r0, r11, r4)
            if (r3 == 0) goto La8
            goto La0
        Lbf:
            r12 = 0
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32288EKb.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        CharSequence fromHtml;
        int A02 = C0f9.A02(-671537386);
        if (A03(this)) {
            inflate = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.landing_prominent_login);
            ((NetzDgTermsTextView) inflate.requireViewById(R.id.netz_dg_terms_text_view)).A00(this.A05);
            this.A01 = (ViewGroup) inflate.findViewById(R.id.button_group);
            boolean A03 = A03(this);
            int i = R.layout.email_or_phone_button_group;
            if (A03) {
                i = R.layout.email_or_phone_plus_login_button_group;
            }
            layoutInflater.inflate(i, this.A01);
        } else {
            inflate = layoutInflater.inflate(R.layout.landing_prominent_facebook, viewGroup, false);
            ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.button_group);
            this.A01 = viewGroup2;
            layoutInflater.inflate(R.layout.facebook_button_group, viewGroup2);
            Resources A0N = AbstractC166997dE.A0N(this);
            TextSwitcher textSwitcher = (TextSwitcher) inflate.requireViewById(R.id.facebook_text_switcher);
            this.A02 = textSwitcher;
            textSwitcher.setFactory(new C35755Fqs(A0N, this));
            this.A02.setCurrentText(getString(2131965711));
            ViewOnClickListenerC35667Fp2.A00(this.A02, 67, this);
            this.A02.setBackgroundResource(R.drawable.blue_button_background);
            this.A00 = SystemClock.elapsedRealtime();
            this.A0A = false;
            boolean z = this.A04.A00.A01.getBoolean("analytics_device_id_external", false);
            if (z || AbstractC23851Es.A04(getContext())) {
                TextView A0T = AbstractC166997dE.A0T(inflate, R.id.social_context);
                this.A03 = A0T;
                A0T.setVisibility(0);
                View requireViewById = inflate.requireViewById(R.id.divider);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) requireViewById.getLayoutParams();
                marginLayoutParams.setMargins(0, 0, 0, 0);
                requireViewById.setLayoutParams(marginLayoutParams);
                if (z) {
                    C1ON A022 = AbstractC35079Fcq.A02(this.A05, AbstractC31176DnK.A0m(this), this.A04.A02(C19T.A1f), null, false);
                    A022.A00 = new EUS(this);
                    schedule(A022);
                }
            }
            C35037FcA.A01(C1Q9.A0Z.A02(this.A05).A06(EnumC33445EqI.A04, EnumC31713DwI.A0r), this.A09);
            ((NetzDgTermsTextView) inflate.requireViewById(R.id.netz_dg_terms_text_view)).A00(this.A05);
        }
        ImageView A08 = AbstractC31171DnF.A08(inflate, R.id.logo);
        AbstractC35259Fgt.A01(getContext(), inflate.findViewById(R.id.subtitle), A08);
        AbstractC31180DnO.A10(getContext(), A08);
        this.A0B = AbstractC166987dD.A0e(inflate, R.id.zero_rating_landing_page_text_view);
        A01(this);
        TextView A0e = AbstractC166987dD.A0e(inflate, R.id.sign_up_with_email_or_phone);
        A0e.getClass();
        AbstractC56952jT.A01(A0e);
        ViewOnClickListenerC35667Fp2.A00(A0e, 65, this);
        int i2 = 2131974090;
        if (A03(this)) {
            i2 = 2131956965;
        }
        A0e.setText(i2);
        TextView A0e2 = AbstractC166987dD.A0e(inflate, R.id.log_in_button);
        A0e2.getClass();
        AbstractC56952jT.A01(A0e2);
        if (A03(this)) {
            fromHtml = getString(2131965710);
        } else {
            fromHtml = Html.fromHtml(AbstractC166997dE.A0N(this).getString(2131952945));
        }
        A0e2.setText(fromHtml);
        if (!A03(this)) {
            AbstractC35081Fcs.A00(A0e2, requireContext());
        }
        ViewOnClickListenerC35667Fp2.A00(A0e2, 66, this);
        FragmentActivity activity = getActivity();
        C1GJ.A00(activity, AbstractC018607g.A00(activity), new KK4(5, activity, this.A05, this));
        C0f9.A09(913868003, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-503136344);
        super.onDestroyView();
        C41451vu c41451vu = C41451vu.A01;
        c41451vu.A03(this.A0D, C36036FvY.class);
        c41451vu.A03(this.A0F, C36037FvZ.class);
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
        this.A0B = null;
        C0f9.A09(-359712677, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-4092273);
        super.onPause();
        C41451vu.A01.A03(this.A0E, C11920jr.class);
        C0f9.A09(-1528468534, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(862200392);
        super.onResume();
        C41451vu.A01.A02(this.A0E, C11920jr.class);
        C0f9.A09(528775597, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-1821100845);
        super.onStart();
        this.A0C.AAd(this);
        C0f9.A09(-9230632, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1479876037);
        super.onStop();
        this.A0C.EGT(this);
        C0f9.A09(-1080507106, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C41451vu c41451vu = C41451vu.A01;
        c41451vu.A02(this.A0D, C36036FvY.class);
        c41451vu.A02(this.A0F, C36037FvZ.class);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && AbstractC31171DnF.A0a(bundle2) != null && this.mArguments.getBoolean("ARGUMENT_SHOW_LOGIN_FOR_CONTENT_DIALOG", false)) {
            Activity rootActivity = getRootActivity();
            rootActivity.getClass();
            C193328hC A00 = AbstractC35254Fgn.A00(rootActivity);
            A00.A0A(2131965779);
            AbstractC31176DnK.A1W(A00);
            this.mArguments.remove("ARGUMENT_SHOW_LOGIN_FOR_CONTENT_DIALOG");
        }
    }
}
