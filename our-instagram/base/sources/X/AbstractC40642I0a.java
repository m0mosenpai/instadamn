package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.I0a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40642I0a {
    public static final void A00(UserSession userSession, C41155IJu c41155IJu, InterfaceC60442pS interfaceC60442pS, boolean z) {
        AbstractC167017dG.A1O(userSession, interfaceC60442pS);
        C82713mZ A0M = AbstractC37302Gc3.A0M(interfaceC60442pS, "instagram_ad_", "survey_primer_response");
        A0M.A7F = c41155IJu.A01;
        Boolean valueOf = Boolean.valueOf(z);
        A0M.A1r = valueOf;
        A0M.A7Q = c41155IJu.A03;
        AbstractC37302Gc3.A1R(A0M);
        if (!C5I7.A00(userSession, A0M, interfaceC60442pS, C05F.A00)) {
            C19280xC A00 = C19280xC.A00(interfaceC60442pS, AnonymousClass001.A0R("instagram_ad_", "survey_primer_response"));
            A00.A0C("survey_id", c41155IJu.A01);
            A00.A09("responses", valueOf);
            A00.A0C("tracking_token", c41155IJu.A03);
            AbstractC31173DnH.A1S(A00, userSession);
        }
    }
}
