package X;

import com.instagram.aistudio.home.repository.AiSearchRepository;
import com.instagram.common.session.UserSession;

/* renamed from: X.BvP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26984BvP extends AbstractC61132qb {
    public final UserSession A00;

    public C26984BvP(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C25847Bc2(new AiSearchRepository(userSession), userSession);
    }
}
