package X;

import com.instagram.common.session.UserSession;
import com.instagram.newsfeed.data.ActivityFeedRepository;

/* renamed from: X.4DU, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4DU {
    public static final ActivityFeedRepository A00(UserSession userSession, C4DT c4dt) {
        C14360o3.A0B(userSession, 0);
        return (ActivityFeedRepository) userSession.A01(ActivityFeedRepository.class, new C9F9(28, c4dt, userSession));
    }
}
