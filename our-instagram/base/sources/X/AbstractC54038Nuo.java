package X;

import com.instagram.common.session.UserSession;
import com.instagram.immersivecatchup.repository.ImmersiveCatchUpRepository;

/* renamed from: X.Nuo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54038Nuo {
    public static final ImmersiveCatchUpRepository A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (ImmersiveCatchUpRepository) userSession.A01(ImmersiveCatchUpRepository.class, new C57551PgP(userSession, 29));
    }
}
