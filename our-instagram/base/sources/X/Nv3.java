package X;

import com.instagram.common.session.UserSession;
import com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource;

/* loaded from: classes9.dex */
public abstract class Nv3 {
    public static final MainFeedLocalDataSource A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (MainFeedLocalDataSource) userSession.A01(MainFeedLocalDataSource.class, new C57248PbW(userSession, 27));
    }
}
