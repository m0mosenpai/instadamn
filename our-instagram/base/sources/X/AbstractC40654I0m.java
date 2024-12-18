package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.I0m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40654I0m {
    public static final void A00(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3, int i) {
        AbstractC167007dF.A1G(str, 0, userSession);
        C82713mZ A0M = AbstractC37302Gc3.A0M(interfaceC60442pS, "instagram_survey_", MSV.A00(1526));
        A0M.A70 = str;
        A0M.A6N = str2;
        A0M.A6e = str3;
        A0M.A0Z = i;
        AbstractC37302Gc3.A1R(A0M);
        if (!C5I7.A00(userSession, A0M, interfaceC60442pS, C05F.A01)) {
            AbstractC37304Gc5.A1P(userSession, A0M);
        }
    }
}
