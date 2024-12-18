package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public abstract class IQX {
    public static final void A01(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3) {
        C14360o3.A0B(str2, 2);
        C82713mZ A0M = AbstractC37302Gc3.A0M(interfaceC60442pS, "instagram_ad_", "hide_response");
        A0M.A7F = str;
        A0M.A7Q = str3;
        A0M.A6v = str2;
        C32U.A0H(userSession, A0M, interfaceC60442pS);
    }

    public static final void A00(UserSession userSession, C42520Irz c42520Irz, InterfaceC60442pS interfaceC60442pS, boolean z) {
        String str;
        if (z) {
            str = "hide_all_polls_button";
        } else {
            str = "hide_button";
        }
        C82713mZ A0M = AbstractC37302Gc3.A0M(interfaceC60442pS, "instagram_ad_", str);
        A0M.A7F = c42520Irz.getId();
        A0M.A7Q = c42520Irz.CAR();
        C32U.A0H(userSession, A0M, interfaceC60442pS);
    }
}
