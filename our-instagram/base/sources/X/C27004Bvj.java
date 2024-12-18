package X;

import com.instagram.common.session.UserSession;
import com.instagram.wonderwall.api.WallApiGraphQLImpl;
import com.instagram.wonderwall.repository.AggregatedWallFeedRepository;

/* renamed from: X.Bvj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27004Bvj extends AbstractC61132qb {
    public final UserSession A00;

    public C27004Bvj(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        C14360o3.A0B(userSession, 0);
        return new C25882Bci(userSession, new AggregatedWallFeedRepository(new WallApiGraphQLImpl(userSession)));
    }
}
