package X;

import com.instagram.common.session.UserSession;
import com.instagram.igtv.repository.series.IGTVSeriesRepository;
import com.instagram.igtv.repository.user.UserNetworkDataSource;
import com.instagram.igtv.repository.user.UserRepository;

/* loaded from: classes9.dex */
public final class ND6 extends AbstractC61132qb {
    public final UserSession A00;
    public final O39 A01;
    public final C47638L1x A02;
    public final String A03;

    public ND6(UserSession userSession, O39 o39, C47638L1x c47638L1x, String str) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = o39;
        this.A03 = str;
        this.A02 = c47638L1x;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        O39 o39 = this.A01;
        String str = this.A03;
        UserNetworkDataSource userNetworkDataSource = new UserNetworkDataSource(userSession);
        C14360o3.A0B(userSession, 0);
        return new C44537Jmh(userSession, o39, (IGTVSeriesRepository) userSession.A01(IGTVSeriesRepository.class, C57538PgC.A01(userSession, 1)), (UserRepository) userSession.A01(UserRepository.class, new C57251PbZ(10, userNetworkDataSource, userSession)), this.A02, str);
    }
}
