package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.onboarding.repository.CreatorAIAgentCreationRepository;

/* renamed from: X.BvX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26992BvX extends AbstractC61132qb {
    public final UserSession A00;

    public C26992BvX(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        C14360o3.A0B(userSession, 0);
        return new C26904Bu7(userSession, new CreatorAIAgentCreationRepository(userSession));
    }
}
