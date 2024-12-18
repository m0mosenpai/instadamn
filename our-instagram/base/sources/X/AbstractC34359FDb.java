package X;

import com.instagram.api.schemas.ScreenTimeScreenType;
import com.instagram.common.session.UserSession;

/* renamed from: X.FDb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34359FDb {
    public static final void A00(ScreenTimeScreenType screenTimeScreenType, UserSession userSession, long j) {
        C14360o3.A0B(userSession, 0);
        AnonymousClass282 anonymousClass282 = AnonymousClass280.A01;
        C35148Feq A07 = anonymousClass282.A07(userSession, screenTimeScreenType.toString());
        if (A07 != null && A07.A02() != 0) {
            A07.A00 = j;
            C35148Feq.A01(A07);
            anonymousClass282.A0B(userSession, A07, screenTimeScreenType.toString());
        }
    }
}
