package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.IAs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40920IAs {
    public static final void A00(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3) {
        ((C25462BOb) userSession.A01(C25462BOb.class, new DGY(userSession, 49))).A00(str);
        if (str3 != null) {
            C82713mZ A0M = AbstractC37302Gc3.A0M(interfaceC60442pS, "instagram_ad_", "report_button");
            A0M.A7Q = str2;
            A0M.A6v = str3;
            A0M.A76 = "report_button";
            C32U.A0H(userSession, A0M, interfaceC60442pS);
        }
    }
}
