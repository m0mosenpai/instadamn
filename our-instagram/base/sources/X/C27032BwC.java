package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.settings.repository.CreatorAiSettingsRepository;

/* renamed from: X.BwC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27032BwC extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;
    public final String A02;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C25869BcQ(userSession, new BP5(userSession, this.A02), new CreatorAiSettingsRepository(userSession, AbstractC40691uc.A01(userSession)), this.A01);
    }

    public C27032BwC(UserSession userSession, String str, String str2) {
        AbstractC167027dH.A13(userSession, str, str2);
        this.A00 = userSession;
        this.A01 = str;
        this.A02 = str2;
    }
}
