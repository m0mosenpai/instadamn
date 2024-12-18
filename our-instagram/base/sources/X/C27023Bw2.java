package X;

import com.instagram.common.session.UserSession;
import com.instagram.wonderwall.model.WallLaunchConfig;
import com.instagram.wonderwall.repository.WallFeedRepository;

/* renamed from: X.Bw2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27023Bw2 extends AbstractC61132qb {
    public final UserSession A00;
    public final WallLaunchConfig A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        WallLaunchConfig wallLaunchConfig = this.A01;
        String str = wallLaunchConfig.A01;
        AbstractC167017dG.A1N(str, userSession);
        return new C25883Bcj(userSession, wallLaunchConfig, new WallFeedRepository(userSession, str), CZ2.A00(userSession));
    }

    public C27023Bw2(UserSession userSession, WallLaunchConfig wallLaunchConfig) {
        AbstractC167017dG.A1P(userSession, wallLaunchConfig);
        this.A00 = userSession;
        this.A01 = wallLaunchConfig;
    }
}
