package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.inspiration.repository.CreatorInspirationHubAccountsRepository;

/* renamed from: X.Bva, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26995Bva extends AbstractC61132qb {
    public final UserSession A00;

    public C26995Bva(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C25846Bc1(userSession, new CreatorInspirationHubAccountsRepository(userSession));
    }
}
