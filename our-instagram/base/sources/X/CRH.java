package X;

import com.facebook.pando.IPandoGraphQLService;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class CRH {
    public UserSession A00;
    public final C40701ud A01;
    public IPandoGraphQLService.Token token;

    public CRH(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        C14360o3.A0B(A01, 1);
        this.A01 = A01;
        this.A00 = userSession;
    }
}
