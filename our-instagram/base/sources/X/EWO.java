package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.prompts.dailyprompts.repository.DirectDailyPromptsResponseListRepository;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes6.dex */
public final class EWO extends AbstractC61132qb {
    public final UserSession A00;
    public final DirectThreadKey A01;
    public final String A02;

    public EWO(UserSession userSession, DirectThreadKey directThreadKey, String str) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = directThreadKey;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        String str = this.A02;
        DirectThreadKey directThreadKey = this.A01;
        C14360o3.A0B(userSession, 0);
        return new C31816Dya(userSession, (DirectDailyPromptsResponseListRepository) userSession.A01(DirectDailyPromptsResponseListRepository.class, new C37056GUm(userSession, 18)), directThreadKey, str);
    }
}
