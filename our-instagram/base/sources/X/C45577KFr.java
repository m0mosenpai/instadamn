package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.securityalert.data.SecurityAlertRepository;

/* renamed from: X.KFr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45577KFr extends AbstractC61132qb {
    public final UserSession A00;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        C14360o3.A0B(userSession, 0);
        SecurityAlertRepository.A04.A00(userSession);
        return new C50910Mef(userSession, new O6J(AbstractC44185Jfo.A00(userSession)));
    }

    public C45577KFr(UserSession userSession) {
        this.A00 = userSession;
    }
}
