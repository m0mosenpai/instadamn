package X;

import com.instagram.common.session.UserSession;
import com.instagram.incentiveplatform.api.IncentivePlatformApi;

/* renamed from: X.Nur, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54041Nur {
    public static final IncentivePlatformApi A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (IncentivePlatformApi) userSession.A01(IncentivePlatformApi.class, new C57551PgP(userSession, 40));
    }
}
