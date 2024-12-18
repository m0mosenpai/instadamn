package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.onboarding.repository.CreatorAIAgentCreationRepository;

/* renamed from: X.BvY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26993BvY extends AbstractC61132qb {
    public final UserSession A00;

    public C26993BvY(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        C14360o3.A0B(userSession, 0);
        return new C26900Bu3(new CreatorAIAgentCreationRepository(userSession));
    }
}
