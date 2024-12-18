package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.settings.avoidedtopics.repository.AvoidedTopicsRepository;

/* renamed from: X.Bvs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27013Bvs extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        String str = this.A01;
        AbstractC167017dG.A1N(userSession, str);
        return new C25867BcM(new AvoidedTopicsRepository(AbstractC40691uc.A01(userSession), str, C4A8.A00(245403032)));
    }

    public C27013Bvs(UserSession userSession, String str) {
        AbstractC167017dG.A1P(userSession, str);
        this.A00 = userSession;
        this.A01 = str;
    }
}
