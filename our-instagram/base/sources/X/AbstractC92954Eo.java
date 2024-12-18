package X;

import com.instagram.common.session.UserSession;
import com.instagram.friendmap.data.FriendMapRepository;

/* renamed from: X.4Eo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC92954Eo {
    public static final FriendMapRepository A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (FriendMapRepository) userSession.A01(FriendMapRepository.class, new C9EM(userSession, 7));
    }
}
