package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.fx.access.constants.FxcalAccountType;
import com.instagram.fx.access.sso.FxSsoViewModel;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class EVQ extends AbstractC60592pi implements CallerContextable {
    public static final CallerContext A0B = CallerContext.A00(EVQ.class);
    public static final String __redex_internal_original_name = "FacebookLoginHelper";
    public FxSsoViewModel A00;
    public C34669FPe A01;
    public String A02;
    public final Activity A04;
    public final AbstractC59962oe A06;
    public final InterfaceC11380iw A07;
    public final C07270a1 A08;
    public final EnumC31713DwI A09;
    public final C34933FaJ A0A;
    public final Handler A05 = new Handler();
    public EV9 A03 = new EV9(this);

    private DialogInterface.OnClickListener A00(FM7 fm7, String str, String str2, String str3, String str4, String str5) {
        int i;
        String str6 = fm7.A00;
        switch (str6.hashCode()) {
            case -1828522310:
                if (!str6.equals("email_sign_up")) {
                    return null;
                }
                i = 13;
                break;
            case -563041124:
                if (!str6.equals("switch_to_signup_flow")) {
                    return null;
                }
                return DialogInterfaceOnClickListenerC35454FkB.A00(this, 29);
            case -469212106:
                if (!str6.equals("forgot_password_flow")) {
                    return null;
                }
                return new DialogInterfaceOnClickListenerC35446Fk3(this, str2, 15);
            case 366006153:
                if (!str6.equals("username_log_in")) {
                    return null;
                }
                return new DialogInterfaceOnClickListenerC35451Fk8(fm7, this, str3, 9);
            case 460966973:
                if (!str6.equals("stop_account_deletion")) {
                    return null;
                }
                return new DialogInterfaceOnClickListenerC35363Fie(this, fm7, str, str4, str5, 3);
            case 1160163273:
                if (!str6.equals("login_with_facebook")) {
                    return null;
                }
                return new DialogInterfaceOnClickListenerC35451Fk8(fm7, this, str, 10);
            case 1671672458:
                if (!str6.equals("dismiss")) {
                    return null;
                }
                i = 14;
                break;
            case 2138021083:
                if (!str6.equals("create_new_account_with_fb_contact_point_taken")) {
                    return null;
                }
                i = 16;
                break;
            default:
                return null;
        }
        return new DialogInterfaceOnClickListenerC35446Fk3(this, str3, i);
    }

    public final void A07() {
        C07270a1 c07270a1 = this.A08;
        String str = this.A09.A01;
        boolean A1R = AbstractC167007dF.A1R(0, c07270a1, str);
        double A01 = AbstractC31171DnF.A01();
        double A00 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(c07270a1), "try_facebook_auth");
        AbstractC31177DnL.A1B(A0f, A01, A00);
        AbstractC31179DnN.A15(A0f);
        AbstractC31176DnK.A1J(A0f, A00);
        AbstractC31176DnK.A1K(A0f, A01);
        AbstractC31171DnF.A1A(A0f, str);
        AbstractC35274Fh9.A09(A0f, c07270a1);
        A0f.A7v("is_standalone", null);
        A0f.AAP("view", null);
        A0f.AAP("flow", null);
        A0f.Cht();
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("login_source", "IGNativeLoginWithFacebook");
        A1G.put("account_recovery_event_source", "ig_native_login_with_fb");
        A1G.put("event_request_id", AbstractC166997dE.A0o());
        HashMap A1G2 = AbstractC166987dD.A1G();
        A1G2.put("flow", "ig_caa_linking");
        A1G2.put("should_skip_native_auth", Boolean.valueOf(A1R));
        A1G2.put("target_account_type", 0);
        A1G2.put("logging_event", "auth_flow_initiated");
        A1G2.put("pass_through_params", new JSONObject(A1G));
        HashMap A1G3 = AbstractC166987dD.A1G();
        A1G3.put("params", AbstractC31175DnJ.A0d(A1G2));
        AbstractC59962oe abstractC59962oe = this.A06;
        AbstractC192798gL A04 = C192108fB.A04(c07270a1, "com.bloks.www.fx.pf.auth_flow.async", A1G3);
        C32392EOt.A00(A04, this, 6);
        abstractC59962oe.schedule(A04);
    }

    public final void A0A(C46h c46h, C46h c46h2, C07270a1 c07270a1, String str, String str2, String str3, String str4) {
        A02(C4JK.A00, c46h, c46h2, c07270a1, this, null, str, str2, str3, str4, true);
    }

    public static void A02(C46h c46h, C46h c46h2, C46h c46h3, C07270a1 c07270a1, EVQ evq, Boolean bool, String str, String str2, String str3, String str4, boolean z) {
        String str5;
        C1ON A0C;
        C1Q9 c1q9;
        boolean z2;
        String str6 = null;
        Activity activity = evq.A04;
        C07270a1 c07270a12 = evq.A08;
        if (str3 != null) {
            FNZ A0H = AbstractC35276FhB.A0H(FxcalAccountType.A04, str2, str);
            if (c46h3 instanceof C4JL) {
                str6 = (String) c46h3.A03();
            }
            A0C = AbstractC35276FhB.A0B(c07270a12, A0H, bool, str3, C16030qx.A00(activity), AbstractC31172DnG.A10(activity), str6, str4);
            c1q9 = C1Q9.A1w;
        } else {
            if (c46h instanceof C4JL) {
                str5 = (String) c46h.A03();
            } else {
                str5 = null;
            }
            if (c46h3 instanceof C4JL) {
                str6 = (String) c46h3.A03();
            }
            A0C = AbstractC35276FhB.A0C(c07270a12, bool, str5, str2, null, null, C16030qx.A00(activity), AbstractC31172DnG.A10(activity), str6, z, true, false, false, false);
            c1q9 = C1Q9.A1t;
        }
        C35230FgN A02 = c1q9.A02(c07270a12);
        EnumC31713DwI enumC31713DwI = evq.A09;
        C35230FgN.A02(A02, EnumC33445EqI.A04, enumC31713DwI);
        if (c46h instanceof C4JL) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        AbstractC59962oe abstractC59962oe = evq.A06;
        C6WQ A0T = AbstractC31180DnO.A0T(abstractC59962oe);
        A0T.A00(AbstractC31174DnI.A0w(abstractC59962oe, abstractC59962oe.getString(2131962025), 2131956634));
        A0C.A00 = new C32546EUw(c46h2, c07270a1, evq, A0T, str2, str, str3, booleanValue, z2, false);
        abstractC59962oe.schedule(A0C);
        double A01 = AbstractC31171DnF.A01();
        double A00 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(c07270a12), "try_facebook_sso");
        AbstractC31179DnN.A18(A0f, A01, A00);
        AbstractC31179DnN.A15(A0f);
        AbstractC31171DnF.A1A(A0f, enumC31713DwI.A01);
        AbstractC35274Fh9.A08(A0f, c07270a12);
    }

    public static void A03(EVQ evq) {
        C35230FgN.A03(C1Q9.A1K.A02(evq.A08), evq.A09);
        evq.A05.post(new GM2(evq));
    }

    public static void A04(EVQ evq, User user, String str) {
        C1Q9 c1q9 = C1Q9.A19;
        C07270a1 c07270a1 = evq.A08;
        C35230FgN.A03(c1q9.A02(c07270a1), evq.A09);
        C140966Yy A0N = AbstractC31177DnL.A0N(evq.A06.getActivity(), c07270a1);
        String id = user.getId();
        String username = user.getUsername();
        ImageUrl Bhu = user.Bhu();
        ELC elc = new ELC();
        Bundle A09 = AbstractC31176DnK.A09("IgSessionManager.LOGGED_OUT_TOKEN");
        A09.putString("argument_reset_token", str);
        A09.putString("argument_user_id", id);
        A09.putString("argument_user_name", username);
        A09.putParcelable("argument_profile_pic_url", Bhu);
        AbstractC31176DnK.A1A(A09, elc, A0N);
    }

    public static void A05(EVQ evq, C1Q9 c1q9, String str) {
        if (str != null && str.equals("fb_email_taken")) {
            C35230FgN.A03(c1q9.A02(evq.A08), evq.A09);
        }
    }

    public final void A0B(C07270a1 c07270a1, String str, String str2, boolean z) {
        C4JK c4jk = C4JK.A00;
        A02(c4jk, c4jk, c4jk, c07270a1, this, null, str, str2, null, null, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if (r9 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        if (r15 != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0C(X.EfV r22, java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EVQ.A0C(X.EfV, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onCreate() {
        ((IgFragmentActivity) this.A04).registerOnActivityResultListener(this.A03);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        ((IgFragmentActivity) this.A04).unregisterOnActivityResultListener(this.A03);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        this.A05.removeCallbacksAndMessages(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (((X.GZG) r3).CPW() == false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            r4 = this;
            android.app.Activity r3 = r4.A04
            boolean r0 = r3 instanceof X.GZG
            if (r0 == 0) goto L10
            r0 = r3
            X.GZG r0 = (X.GZG) r0
            boolean r0 = r0.CPW()
            r1 = 1
            if (r0 != 0) goto L11
        L10:
            r1 = 0
        L11:
            X.0a1 r2 = r4.A08
            int r0 = X.AbstractC31174DnI.A06(r2)
            if (r0 <= 0) goto L25
            if (r1 != 0) goto L25
            java.lang.String r1 = "FacebookLoginHelper"
            java.lang.String r0 = "activity finish loop"
            X.C0K8.A0E(r1, r0)
            r3.finish()
        L25:
            X.18V r0 = X.C18V.A01
            if (r0 == 0) goto L37
            r1 = 0
            X.C14360o3.A0B(r2, r1)
            X.1AC r0 = r0.A01()
            X.AbstractC202778xv.A00()
            X.C1AC.A00(r0, r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EVQ.onResume():void");
    }

    public EVQ(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, C07270a1 c07270a1, FxSsoViewModel fxSsoViewModel, EnumC31713DwI enumC31713DwI, String str) {
        this.A08 = c07270a1;
        this.A06 = abstractC59962oe;
        this.A04 = abstractC59962oe.getActivity();
        this.A09 = enumC31713DwI;
        this.A07 = interfaceC11380iw;
        this.A01 = new C34669FPe(abstractC59962oe, c07270a1);
        this.A0A = FBS.A00(c07270a1);
        this.A02 = str;
        this.A00 = fxSsoViewModel;
    }

    public static FM7 A01(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FM7 fm7 = (FM7) it.next();
            if (fm7.A00.equals(str)) {
                return fm7;
            }
        }
        return null;
    }

    public static void A06(EVQ evq, String str, String str2, List list, List list2, boolean z, boolean z2) {
        String str3;
        double A01 = AbstractC31171DnF.A01();
        double A00 = AbstractC31171DnF.A00();
        C07270a1 c07270a1 = evq.A08;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(c07270a1), "register_with_facebook");
        AbstractC31177DnL.A1B(A0f, A01, A00);
        AbstractC31172DnG.A1O(A0f);
        AbstractC31179DnN.A1A(A0f, OptSvcAnalyticsStore.LOGGING_KEY_STEP, evq.A09.A01, A00);
        AbstractC35274Fh9.A07(A0f, A01);
        A0f.A7v("has_fb_access_token", Boolean.valueOf(AbstractC167007dF.A1W(str2)));
        AbstractC35274Fh9.A0A(A0f, c07270a1);
        AbstractC31171DnF.A19(A0f, "facebook");
        A0f.Cht();
        if (list != null && !list.isEmpty()) {
            str3 = (String) AbstractC166987dD.A16(list);
        } else {
            str3 = "unknown";
        }
        if (C1AD.A06(C06090Tz.A05, 18298188473566401L)) {
            FP4.getInstance().startDeviceValidation(evq.A06.getContext(), str3);
        }
        evq.A05.post(new GR3(evq, str, str2, list, list2, z, z2));
    }

    public final void A08() {
        double A01 = AbstractC31171DnF.A01();
        double A00 = AbstractC31171DnF.A00();
        C07270a1 c07270a1 = this.A08;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this.A07, c07270a1), "pw_recovery_tapped");
        AbstractC31177DnL.A1B(A0f, A01, A00);
        AbstractC31172DnG.A1N(A0f);
        AbstractC31179DnN.A1A(A0f, OptSvcAnalyticsStore.LOGGING_KEY_STEP, this.A09.A01, A00);
        AbstractC31176DnK.A1K(A0f, A01);
        AbstractC35274Fh9.A08(A0f, c07270a1);
    }

    public final void A09(TextView textView, AbstractC59962oe abstractC59962oe, EnumC31713DwI enumC31713DwI) {
        String str;
        C203168yY c203168yY;
        C203158yX c203158yX = C36007Fv5.A00().A01;
        if (c203158yX != null && (c203168yY = c203158yX.A00) != null) {
            str = c203168yY.A00;
        } else {
            str = null;
        }
        C07270a1 c07270a1 = this.A08;
        AbstractC34354FCw.A00(c07270a1, enumC31713DwI.A01);
        if (TextUtils.isEmpty(str)) {
            if (C36159FxZ.A03.A00(c07270a1, __redex_internal_original_name)) {
                if (AbstractC31181DnP.A11(c07270a1, __redex_internal_original_name)) {
                    str = null;
                } else {
                    str = C36159FxZ.A01;
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
            } else {
                textView.setText(2131965711);
                return;
            }
        }
        FxSsoViewModel fxSsoViewModel = this.A00;
        if (fxSsoViewModel != null) {
            String A0w = AbstractC31174DnI.A0w(abstractC59962oe, str, 2131956788);
            C14360o3.A0B(A0w, 0);
            AbstractC31172DnG.A0F(fxSsoViewModel.A01).A0B(A0w);
        }
        AbstractC31177DnL.A10(textView, abstractC59962oe, str, 2131956788);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
        C34876FYl.A00();
        AbstractC34349FCr.A00(this.A08, this.A09.A01, "facebook_login_helper");
    }
}
