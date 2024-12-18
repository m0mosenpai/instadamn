package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public abstract class I9X {
    public static final void A00(Activity activity, UserSession userSession, C5H9 c5h9, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3, String str4) {
        boolean z;
        String str5;
        String str6;
        C14360o3.A0B(str4, 6);
        if (str2 == null) {
            if (str3 == null) {
                AbstractC11060iN.A00(userSession);
                C82713mZ A01 = C32U.A01(c5h9, c38321qM, interfaceC60442pS, AnonymousClass001.A0R("instagram_ad_", "disclaimer_ad_unit_action"));
                A01.A5D = str;
                A01.A5C = null;
                A01.A5E = null;
                A01.A5A = "disclaimer_click_failure";
                C32U.A0H(userSession, A01, interfaceC60442pS);
                return;
            }
            z = false;
        } else {
            z = true;
        }
        String A00 = AbstractC906141w.A00(activity, str, false);
        if (z) {
            str5 = "open_iab_url";
        } else {
            str5 = "open_disclaimer_fragment";
        }
        AbstractC11060iN.A00(userSession);
        C82713mZ A012 = C32U.A01(c5h9, c38321qM, interfaceC60442pS, AnonymousClass001.A0R("instagram_ad_", "disclaimer_ad_unit_action"));
        A012.A5D = A00;
        A012.A5C = str3;
        A012.A5E = str2;
        A012.A5A = str5;
        C32U.A0H(userSession, A012, interfaceC60442pS);
        C28281Yp c28281Yp = C28281Yp.A01;
        if (c28281Yp != null) {
            c28281Yp.A00.getValue();
            if (str2 == null) {
                if (str3 == null) {
                    str3 = "";
                }
            } else {
                str3 = str2;
            }
            Bundle A0E = AbstractC31174DnI.A0E(A00, 2);
            A0E.putString("DisclaimerPageFragment.TITLE", A00);
            if (z) {
                str6 = "DisclaimerPageFragment.URL";
            } else {
                str6 = "DisclaimerPageFragment.TEXT";
            }
            A0E.putString(str6, str3);
            A0E.putString("DisclaimerPageFragment.USERNAME", str4);
            AbstractC03240Dh.A00(A0E, userSession);
            AbstractC31177DnL.A0o(activity, A0E, userSession, "disclaimer_page");
            return;
        }
        C14360o3.A0F("instance");
        throw C00O.createAndThrow();
    }
}
