package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.settings.audience.AudienceRepository;
import com.instagram.creator.agent.settings.repository.CreatorAiSettingsRepository;

/* renamed from: X.Bvr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27012Bvr extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        String str = this.A01;
        UserSession userSession = this.A00;
        return new C26906Bu9(userSession, new AudienceRepository(userSession), new CreatorAiSettingsRepository(userSession, AbstractC40691uc.A01(userSession)), str);
    }

    public C27012Bvr(UserSession userSession, String str) {
        AbstractC167017dG.A1P(str, userSession);
        this.A01 = str;
        this.A00 = userSession;
    }
}
