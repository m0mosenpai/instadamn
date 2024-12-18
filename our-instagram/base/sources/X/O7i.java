package X;

import com.instagram.common.session.UserSession;
import com.instagram.fanclub.api.FanClubApi;

/* loaded from: classes9.dex */
public final class O7i {
    public final UserSession A00;
    public final FanClubApi A01;

    public /* synthetic */ O7i(UserSession userSession) {
        FanClubApi fanClubApi = new FanClubApi(userSession);
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = fanClubApi;
    }
}
