package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository;

/* renamed from: X.7UN, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7UN {
    public static final AvatarReactionsRepository A00(UserSession userSession) {
        return (AvatarReactionsRepository) userSession.A01(AvatarReactionsRepository.class, new C9EW(userSession, 15));
    }
}
