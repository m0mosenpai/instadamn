package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository;

/* loaded from: classes9.dex */
public final class NBR extends AbstractC61132qb {
    public final UserSession A00;

    public NBR(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        NZZ A02 = OYB.A02(userSession);
        return new C52884Naf(userSession, (IgLiveJoinRequestsRepository) A02.A02.getValue(), A02.A01(), A02.A02(), A02.A03(), C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36323204142214218L));
    }
}
