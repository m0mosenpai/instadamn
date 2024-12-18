package X;

import com.instagram.common.session.UserSession;
import com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository;

/* renamed from: X.Nz7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54287Nz7 {
    public static final LimitsPlusRepository A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (LimitsPlusRepository) userSession.A01(LimitsPlusRepository.class, new C57511Pfl(userSession, 3));
    }
}
