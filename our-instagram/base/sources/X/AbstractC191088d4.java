package X;

import com.instagram.common.session.UserSession;
import com.instagram.quicksnap.data.repository.QuickSnapRepository;

/* renamed from: X.8d4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC191088d4 {
    public static final QuickSnapRepository A00(UserSession userSession, C40121td c40121td) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c40121td, 1);
        return (QuickSnapRepository) userSession.A01(QuickSnapRepository.class, new C9F7(10, c40121td, userSession));
    }
}
