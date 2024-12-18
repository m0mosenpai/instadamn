package X;

import com.instagram.aistudio.yourais.YourAisRepository;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KFM extends AbstractC61132qb {
    public final UserSession A00;

    public KFM(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C44473Jlf(new YourAisRepository(userSession, AbstractC40691uc.A01(userSession)));
    }
}
