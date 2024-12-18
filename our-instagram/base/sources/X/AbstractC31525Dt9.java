package X;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.nux.ndx.util.NdxStepsManager$updateEligibleStepsStore$1;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Dt9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31525Dt9 implements CallerContextable {
    public static final String __redex_internal_original_name = "LoginUtil";

    public static C34691FQc A03(AbstractC115105If abstractC115105If) {
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        if (abstractC115105If instanceof C115095Ie) {
            z = true;
        } else {
            C32196ECr c32196ECr = (C32196ECr) ((C115115Ig) abstractC115105If).A00;
            str = c32196ECr.mErrorType;
            z8 = c32196ECr.A02;
            z3 = c32196ECr.isCheckpointRequired();
            z6 = c32196ECr.hasErrorType("invalid_one_tap_nonce");
            z5 = c32196ECr.hasErrorType("invalid_google_token_nonce");
            z2 = c32196ECr.hasErrorType("bad_password");
            z7 = c32196ECr.hasErrorType("invalid_user");
            z4 = c32196ECr.hasErrorType("inactive user");
            z9 = c32196ECr.hasErrorType("unusable_password");
        }
        return new C34691FQc(str, z, z8, z4, z7, z5, z2, z6, z3, false, z9);
    }

    public static void A04(Activity activity, android.net.Uri uri, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        A07(activity, uri, interfaceC11380iw, userSession, AbstractC31171DnF.A01(), true, false, false, false);
    }

    public static void A05(Activity activity, android.net.Uri uri, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        A07(activity, uri, interfaceC11380iw, userSession, AbstractC31171DnF.A01(), false, false, false, false);
    }

    public static void A08(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        A07(activity, null, interfaceC11380iw, userSession, AbstractC31171DnF.A01(), false, false, false, false);
    }

    public static android.net.Uri A00(Activity activity) {
        Bundle A0A;
        String A0a;
        if (activity == null || (A0A = AbstractC31173DnH.A0A(activity)) == null || (A0a = AbstractC31171DnF.A0a(A0A)) == null) {
            return null;
        }
        return AbstractC08820cl.A03(A0a);
    }

    public static android.net.Uri A01(Fragment fragment) {
        String A0a;
        Bundle bundle = fragment.mArguments;
        if (bundle == null || (A0a = AbstractC31171DnF.A0a(bundle)) == null) {
            return null;
        }
        return AbstractC08820cl.A03(A0a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.lang.Object, X.1vN] */
    public static void A07(Activity activity, android.net.Uri uri, InterfaceC11380iw interfaceC11380iw, UserSession userSession, double d, boolean z, boolean z2, boolean z3, boolean z4) {
        Bundle bundle;
        Intent launchIntentForPackage;
        String moduleName;
        C1QE.A01("log_in").A08();
        Integer num = C05F.A00;
        FMC fmc = new FMC(activity, userSession, num);
        C12L c12l = C12L.A00;
        C14360o3.A0B(c12l, 0);
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC23641Du.A03(num, AnonymousClass191.A00, new NdxStepsManager$updateEligibleStepsStore$1(fmc, null, 3, currentTimeMillis), AnonymousClass194.A02(c12l.AOT(1260133026, 3)));
        User A10 = AbstractC166987dD.A10(userSession);
        LHJ.A01(A10.Bhu(), A10.getId(), A10.getUsername());
        if (z && C1C0.A00(userSession)) {
            AbstractC25651Mw.A00(userSession).E4s(new Object());
        }
        if (activity instanceof GZG) {
            GZG gzg = (GZG) activity;
            if (gzg.CPW()) {
                String BLC = gzg.BLC();
                if (BLC == null || BLC.isEmpty()) {
                    BLC = "0";
                }
                long parseLong = Long.parseLong(userSession.userId);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "ig_account_added");
                Long valueOf = Long.valueOf(parseLong);
                A0f.A9K("pk_added", valueOf);
                A0f.A9K("updated_accounts_count", AbstractC31171DnF.A0V(AbstractC31174DnI.A06(userSession)));
                A0f.A9K("from_pk", AbstractC25228BEl.A13(BLC));
                A0f.A9K("to_pk", valueOf);
                if (interfaceC11380iw == null) {
                    moduleName = null;
                } else {
                    moduleName = interfaceC11380iw.getModuleName();
                }
                AbstractC31171DnF.A1D(A0f, moduleName);
                A0f.Cht();
                C31514Dsy.A03(userSession, valueOf, valueOf, "intra_app", AbstractC166997dE.A0n(), "new_account_created", null, null, null, null, d, true, false, true);
            }
        }
        Bundle A0A = AbstractC31173DnH.A0A(activity);
        if (A0A != null && A0A.getBoolean("LAUNCH_CALLING_APPLICATION_PACKAGE")) {
            String string = A0A.getString("CALLING_APPLICATION_PACKAGE_NAME");
            PackageManager packageManager = activity.getPackageManager();
            if (packageManager != null && (launchIntentForPackage = packageManager.getLaunchIntentForPackage(string)) != null) {
                C12260kU.A0B(activity, launchIntentForPackage);
                activity.finish();
            }
        }
        Intent A03 = C14H.A00().A03(activity, 0);
        if (uri != null) {
            A03.setData(uri);
        }
        A03.addFlags(268468224);
        A03.putExtra("LOGIN_EVENT", true);
        if (z2) {
            A03.putExtra("FORCE_LOGOUT_LOGIN_EVENT", true);
        }
        if (z3) {
            A03.putExtra("REACTIVATION_EVENT", true);
        }
        if (z4) {
            A03.putExtra("NDX_ACCOUNT_LOGIN_EVENT", true);
        }
        List A032 = C66224U4u.A03(C66224U4u.A00(activity));
        if (A032 != null && !A032.isEmpty() && XLX.class.isInstance(A032.get(AbstractC25226BEj.A05(A032))) && (bundle = ActivityOptions.makeCustomAnimation(activity, R.anim.cds_fade_in, R.anim.cds_slide_out_bottom).toBundle()) != null) {
            C12260kU.A02(activity, A03, bundle);
        } else {
            C12260kU.A0C(activity, A03);
        }
        activity.finish();
    }

    public static boolean A09(AbstractC115105If abstractC115105If) {
        if ((abstractC115105If instanceof C115115Ig) && ((C32196ECr) abstractC115105If.A00()).A02) {
            return true;
        }
        return false;
    }

    public static void A06(Activity activity, android.net.Uri uri, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        A07(activity, uri, interfaceC11380iw, userSession, AbstractC31171DnF.A01(), false, false, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x01af, code lost:
    
        if (r17 == 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01c7, code lost:
    
        if (r16 == false) goto L75;
     */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, X.95R] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.instagram.common.session.UserSession A02(android.content.Context r19, X.InterfaceC11380iw r20, X.C07270a1 r21, com.instagram.user.model.User r22, java.lang.String r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 981
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC31525Dt9.A02(android.content.Context, X.0iw, X.0a1, com.instagram.user.model.User, java.lang.String, boolean):com.instagram.common.session.UserSession");
    }
}
