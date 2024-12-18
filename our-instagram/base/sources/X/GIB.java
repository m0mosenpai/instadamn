package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class GIB implements InterfaceC37185GZw {
    public static final InterfaceC08100bW A00 = AbstractC31175DnJ.A0B();

    @Override // X.InterfaceC37185GZw
    public final void CJ9(Bundle bundle, FragmentActivity fragmentActivity, AbstractC18680vv abstractC18680vv) {
        if (abstractC18680vv instanceof UserSession) {
            if (bundle.containsKey("uid") && bundle.containsKey("token") && bundle.containsKey(CacheBehaviorLogger.SOURCE)) {
                UserSession userSession = (UserSession) abstractC18680vv;
                String A0j = AbstractC31173DnH.A0j(bundle, "uid");
                Pattern pattern = AbstractC13670mt.A01;
                String valueOf = String.valueOf(Long.parseLong(A0j, 36));
                if (!userSession.userId.equals(valueOf)) {
                    User BOa = C0BQ.A00(userSession).BOa(valueOf);
                    if (BOa != null) {
                        AbstractC35275FhA.A03(fragmentActivity, bundle);
                        InterfaceC02900Bo A002 = C0BQ.A00(userSession);
                        if (A002.AGB(fragmentActivity, userSession, BOa)) {
                            A002.E45(fragmentActivity, null, userSession, BOa, "deep_link");
                            return;
                        }
                        return;
                    }
                    if (AbstractC35181FfY.A02(userSession)) {
                        bundle.putBoolean("IS_ADD_ACCOUNT_FLOW", true);
                        AbstractC35178FfV.A01(fragmentActivity, bundle, userSession);
                        return;
                    } else {
                        C9GR.A07(fragmentActivity, 2131966062);
                        fragmentActivity.finish();
                        return;
                    }
                }
            }
            AbstractC35275FhA.A03(fragmentActivity, bundle);
            return;
        }
        android.net.Uri A003 = AbstractC35275FhA.A00(bundle);
        if (A003 != null) {
            C3MA A004 = C3M9.A00(abstractC18680vv);
            String queryParameter = A003.getQueryParameter(MSV.A00(387));
            if (queryParameter != null) {
                A004.A00 = queryParameter;
                A004.A01 = "ig_app_auth";
                A004.A03 = A004.A02;
            }
        }
        if (bundle.containsKey("uid") && bundle.containsKey("token") && bundle.containsKey(CacheBehaviorLogger.SOURCE) && bundle.getBoolean("bypass", false) && "bypass_login_email".equals(bundle.get(CacheBehaviorLogger.SOURCE)) && !C1AD.A06(C06090Tz.A04, 2324154250092885223L)) {
            bundle.putBoolean("IS_ADD_ACCOUNT_FLOW", true);
        }
        AbstractC35178FfV.A01(fragmentActivity, bundle, abstractC18680vv);
    }

    @Override // X.InterfaceC37185GZw
    public final boolean EJT() {
        return false;
    }

    @Override // X.InterfaceC37185GZw
    public final Bundle AFg(AbstractC18680vv abstractC18680vv, String str) {
        android.net.Uri A01 = AbstractC08820cl.A01(A00, str);
        if (A01 == null) {
            return null;
        }
        String scheme = A01.getScheme();
        if (!"https".equalsIgnoreCase(scheme) && !"http".equalsIgnoreCase(scheme)) {
            if (!"instagram".equalsIgnoreCase(scheme)) {
                return null;
            }
            String host = A01.getHost();
            host.getClass();
            if (!host.equalsIgnoreCase("mainfeed") && !host.equalsIgnoreCase("explore") && !host.equalsIgnoreCase("news") && !host.equalsIgnoreCase("profile")) {
                return null;
            }
            Bundle A0b = AbstractC166987dD.A0b();
            AbstractC31178DnM.A0q(A01, A0b, host);
            return A0b;
        }
        if (!AbstractC34911FZx.A00(A01)) {
            return null;
        }
        List<String> pathSegments = A01.getPathSegments();
        if (pathSegments.size() != 2) {
            return null;
        }
        if (!"_n".equalsIgnoreCase(AbstractC25226BEj.A1I(pathSegments, 0)) && !"n".equalsIgnoreCase(AbstractC25226BEj.A1I(pathSegments, 0))) {
            return null;
        }
        Bundle A0b2 = AbstractC166987dD.A0b();
        String A1I = AbstractC25226BEj.A1I(pathSegments, 1);
        AbstractC31178DnM.A0q(A01, A0b2, A1I);
        java.util.Set<String> queryParameterNames = A01.getQueryParameterNames();
        String queryParameter = A01.getQueryParameter("utm_medium");
        String str2 = "email";
        if (A01.getBooleanQueryParameter("bypass", false) && A01.getQueryParameterNames().contains("uid") && A01.getQueryParameterNames().contains("token") && "email".equalsIgnoreCase(queryParameter)) {
            str2 = "bypass_login_email";
        } else if (!"email".equalsIgnoreCase(queryParameter) && !A1I.equalsIgnoreCase("emaillogin")) {
            str2 = "";
            if (!"".equalsIgnoreCase(queryParameter) && !A1I.equalsIgnoreCase("smslogin")) {
                str2 = "stop_deletions_email_login";
                if (!A1I.equalsIgnoreCase("stop_deletions_email_login")) {
                    str2 = "stop_deletions_sms_login";
                    if (!A1I.equalsIgnoreCase("stop_deletions_sms_login")) {
                        str2 = A1I.equalsIgnoreCase("account_deactivation_email_login") ? "account_deactivation_email" : null;
                    }
                }
            }
        }
        if (queryParameterNames.contains("uid") && queryParameterNames.contains("token") && str2 != null) {
            AbstractC31178DnM.A0r(A01, A0b2, "uid", "token");
            A0b2.putString(CacheBehaviorLogger.SOURCE, str2);
        }
        if (queryParameterNames.contains("auto_send")) {
            AbstractC31173DnH.A1A(A01, A0b2, "auto_send");
        }
        if (queryParameterNames.contains("bypass")) {
            AbstractC31172DnG.A1I(A01, A0b2, "bypass");
        }
        if (!queryParameterNames.contains("reminder")) {
            return A0b2;
        }
        AbstractC31173DnH.A1A(A01, A0b2, "reminder");
        return A0b2;
    }
}
