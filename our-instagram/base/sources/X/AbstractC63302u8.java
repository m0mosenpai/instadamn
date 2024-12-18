package X;

import com.instagram.common.session.UserSession;
import com.instagram.monetization.repository.MonetizationRepository;

/* renamed from: X.2u8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC63302u8 {
    public static final MonetizationRepository A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (MonetizationRepository) userSession.A01(MonetizationRepository.class, new C9EA(userSession, 24));
    }
}
