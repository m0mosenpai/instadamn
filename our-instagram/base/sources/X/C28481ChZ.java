package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.meta.foa.accountswitcher.UserAccountInfo;
import com.meta.foa.session.FoaUserSession;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.ChZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28481ChZ {
    public static final C28481ChZ A00 = new Object();

    public static final void A01(Context context, Fragment fragment, UserAccountInfo userAccountInfo, FoaUserSession foaUserSession, String str, String str2) {
        long j;
        EnumC31511Dsv enumC31511Dsv;
        String A04;
        boolean A1b = AbstractC25233BEq.A1b(foaUserSession, str, str2);
        C14360o3.A0B(fragment, 5);
        String str3 = userAccountInfo.A03;
        if (str3 != null) {
            j = Long.parseLong(str3);
        } else {
            j = 0;
        }
        String str4 = userAccountInfo.A02;
        if (C14360o3.A0K(str4, "THREADS")) {
            enumC31511Dsv = EnumC31511Dsv.THREADS;
        } else {
            enumC31511Dsv = EnumC31511Dsv.FACEBOOK;
        }
        AbstractC35103FdE.A00(enumC31511Dsv, foaUserSession, str, str2, j, false, AbstractC167007dF.A1O((j > 0L ? 1 : (j == 0L ? 0 : -1))));
        if (j > 0) {
            AbstractC35103FdE.A01(foaUserSession, (int) j, A1b);
        }
        UserSession A002 = AbstractC28057CYl.A00(foaUserSession);
        String str5 = userAccountInfo.A00;
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            if (str5 != null) {
                C14360o3.A0B(A002, 0);
                C28207Cc4 c28207Cc4 = (C28207Cc4) A002.A01(C28207Cc4.class, new C50152MDf(A002, 14));
                if (C14360o3.A0K(str4, "THREADS")) {
                    C16920sk A0E = AbstractC06930Yk.A0E();
                    android.net.Uri build = new Uri.Builder().scheme(MSV.A00(181)).authority("feed").build();
                    C14360o3.A07(build);
                    String A003 = AbstractC111324zv.A00(1876);
                    C16920sk A0E2 = AbstractC06930Yk.A0E();
                    C16920sk A0E3 = AbstractC06930Yk.A0E();
                    AbstractC167007dF.A1J(A0E, 5, A0E2);
                    C14360o3.A0B(A0E3, 10);
                    String A01 = c28207Cc4.A01.A01(CallerContext.A01("FxDeeplinkUtil"), AbstractC111324zv.A00(2484), str5);
                    if (A01 != null) {
                        Uri.Builder buildUpon = AbstractC08820cl.A03(build.toString()).buildUpon();
                        buildUpon.appendQueryParameter(A003, A01);
                        Iterator it = A0E.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry A1K = AbstractC166987dD.A1K(it);
                            buildUpon.appendQueryParameter((String) A1K.getKey(), (String) A1K.getValue());
                        }
                        String str6 = "";
                        if (AbstractC14490oL.A0A(context) && (A04 = AbstractC14490oL.A04(context)) != null) {
                            str6 = A04;
                        }
                        if (str6.length() > 0) {
                            Intent intent = new Intent("android.intent.action.VIEW", AbstractC08820cl.A03(buildUpon.build().toString()));
                            Iterator it2 = A0E2.entrySet().iterator();
                            while (it2.hasNext()) {
                                Map.Entry A1K2 = AbstractC166987dD.A1K(it2);
                                intent.putExtra((String) A1K2.getKey(), AbstractC166987dD.A1a(A1K2.getValue()));
                            }
                            Iterator it3 = A0E3.entrySet().iterator();
                            while (it3.hasNext()) {
                                Map.Entry A1K3 = AbstractC166987dD.A1K(it3);
                                intent.putExtra((String) A1K3.getKey(), (String) A1K3.getValue());
                            }
                            intent.setPackage(str6);
                            if (!C12260kU.A0B(context, intent)) {
                                A03(foaUserSession, str2, A1b);
                                C0K8.A0C("FxDeeplinkUtil", AnonymousClass001.A14("Launching ", str6, " failed for ", str, " : ", str, '.'));
                                return;
                            }
                        } else {
                            AbstractC14490oL.A07(context, AbstractC111324zv.A00(2134), null);
                            A03(foaUserSession, str2, false);
                            String A004 = AbstractC111324zv.A00(1503);
                            UserSession A005 = AbstractC28057CYl.A00(foaUserSession);
                            C14360o3.A0B(A005, 0);
                            C31514Dsy.A03(A005, AbstractC003100w.A0k(10, str5), AbstractC003100w.A0k(10, str5), "inter_app", AbstractC167017dG.A0j(), str, null, "app_store", null, A004, System.currentTimeMillis(), false, A1b, A1b);
                            return;
                        }
                    }
                    A03(foaUserSession, str2, A1b);
                    return;
                }
                c28207Cc4.A00(context, activity, CallerContext.A01("AccountSwitcherInstagramAppBindings"), "", str5, AbstractC111324zv.A00(375), str, str2, null);
                return;
            }
            C35243Fgc.A01(context, activity, A002, userAccountInfo.A08, AbstractC111324zv.A00(375), str, str2, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0031, code lost:
    
        if (r0 <= 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(androidx.fragment.app.Fragment r21, com.meta.foa.accountswitcher.UserAccountInfo r22, com.meta.foa.session.FoaUserSession r23, java.lang.String r24, java.lang.String r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28481ChZ.A02(androidx.fragment.app.Fragment, com.meta.foa.accountswitcher.UserAccountInfo, com.meta.foa.session.FoaUserSession, java.lang.String, java.lang.String, boolean):void");
    }

    public final boolean A05(FoaUserSession foaUserSession) {
        if (!A04(foaUserSession)) {
            return AbstractC54472f1.A04(18312632448661762L, true);
        }
        return false;
    }

    public static final C29896DGk A00(Activity activity, FoaUserSession foaUserSession, String str, String str2) {
        AbstractC167027dH.A12(foaUserSession, str, str2);
        UserSession A002 = AbstractC28057CYl.A00(foaUserSession);
        C14360o3.A0B(A002, 0);
        long parseLong = Long.parseLong(A002.userId);
        EnumC31512Dsw A003 = C31514Dsy.A00(str);
        Long valueOf = Long.valueOf(parseLong);
        double A004 = C1Q9.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(A002), "manage_accounts_button_tapped");
        if (A0f.isSampled()) {
            A0f.A9K("raw_initiator_account_id", valueOf);
            A0f.A9K("initiator_identity_id", valueOf);
            AbstractC25234BEr.A0x(A003, A0f, str2, A004);
            A0f.A7v("is_cds", AbstractC166997dE.A0b());
            A0f.A8R(EnumC31511Dsv.INSTAGRAM, "initiator_account_type");
            A0f.Cht();
        }
        return C29896DGk.A00(activity, AbstractC28057CYl.A00(foaUserSession), 5);
    }

    public static final void A03(FoaUserSession foaUserSession, String str, boolean z) {
        Long A0n = AbstractC25233BEq.A0n(foaUserSession.getUserId());
        UserSession A002 = AbstractC28057CYl.A00(foaUserSession);
        C14360o3.A0B(A002, 0);
        Boolean valueOf = Boolean.valueOf(z);
        boolean z2 = C31514Dsy.A04;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(A002), AbstractC111324zv.A00(2454));
        if (A0f.isSampled()) {
            A0f.A7v(AbstractC111324zv.A00(3215), valueOf);
            A0f.A9K("initiator_identity_id", A0n);
            A0f.AAP("event_session_id", str);
            A0f.Cht();
        }
    }

    public static final boolean A04(FoaUserSession foaUserSession) {
        boolean A08 = AbstractC54472f1.A08(AbstractC28057CYl.A00(foaUserSession), !AbstractC40751ui.A00(r4).A02(C31518Dt2.A00, "FACEBOOK").isEmpty());
        if (AbstractC54472f1.A04(18301933686558975L, true) && A08) {
            return true;
        }
        return false;
    }
}
