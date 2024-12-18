package X;

import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.UserDetailLaunchConfig;

/* loaded from: classes9.dex */
public final class MV4 extends AbstractC61132qb {
    public final UserSession A00;
    public final UserDetailLaunchConfig A01;

    public MV4(UserSession userSession, UserDetailLaunchConfig userDetailLaunchConfig) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = userDetailLaunchConfig;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new MUB(userSession, this.A01, new MV3(userSession));
    }
}
