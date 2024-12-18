package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.suggestedreplies.repository.CreatorAgentSuggestedRepliesRepository;
import com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository;
import com.instagram.creator.agent.suggestedreplies.viewmodel.CreatorAgentSuggestedRepliesViewModel;

/* renamed from: X.KFb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45562KFb extends AbstractC61132qb {
    public final UserSession A00;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        L7S l7s = new L7S(userSession);
        CreatorAgentSuggestedRepliesRepository creatorAgentSuggestedRepliesRepository = new CreatorAgentSuggestedRepliesRepository(userSession);
        C14360o3.A0B(userSession, 0);
        return new CreatorAgentSuggestedRepliesViewModel(userSession, l7s, creatorAgentSuggestedRepliesRepository, (CreatorAgentSuggestedRepliesSettingsRepository) userSession.A01(CreatorAgentSuggestedRepliesSettingsRepository.class, new C29887DGb(userSession, 25)));
    }

    public C45562KFb(UserSession userSession) {
        this.A00 = userSession;
    }
}
