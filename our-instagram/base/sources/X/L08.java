package X;

import com.instagram.common.session.UserSession;
import com.instagram.fanclub.api.FanClubApi;

/* loaded from: classes8.dex */
public final class L08 {
    public final UserSession A00;
    public final FanClubApi A01;

    public /* synthetic */ L08(UserSession userSession) {
        FanClubApi fanClubApi = new FanClubApi(userSession);
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = fanClubApi;
    }
}
