package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository;

/* renamed from: X.JmG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44510JmG extends AbstractC52922bZ {
    public final CreatorAgentSuggestedRepliesSettingsRepository A00;
    public final C0UO A01;

    public C44510JmG(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        CreatorAgentSuggestedRepliesSettingsRepository creatorAgentSuggestedRepliesSettingsRepository = (CreatorAgentSuggestedRepliesSettingsRepository) userSession.A01(CreatorAgentSuggestedRepliesSettingsRepository.class, new C29887DGb(userSession, 25));
        this.A00 = creatorAgentSuggestedRepliesSettingsRepository;
        this.A01 = creatorAgentSuggestedRepliesSettingsRepository.A01;
    }

    public final void A00() {
        CreatorAgentSuggestedRepliesSettingsRepository creatorAgentSuggestedRepliesSettingsRepository = this.A00;
        if (!AbstractC166987dD.A1a(creatorAgentSuggestedRepliesSettingsRepository.A01.getValue())) {
            AbstractC43593JPy.A1S(creatorAgentSuggestedRepliesSettingsRepository, AbstractC25230BEn.A0s(creatorAgentSuggestedRepliesSettingsRepository.A00), ((C4A7) creatorAgentSuggestedRepliesSettingsRepository).A01, 9);
        }
    }
}
