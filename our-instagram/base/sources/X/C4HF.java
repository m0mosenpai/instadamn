package X;

import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

/* renamed from: X.4HF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4HF {
    @Deprecated(message = "Should only be used when trying to synchronize complex operations, otherwise use IgExecutor.")
    public final C4HD A00(UserSession userSession) {
        Class cls;
        InterfaceC16820sZ interfaceC16820sZ;
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A05, userSession, 36327907131407300L)) {
            cls = BUZ.class;
            interfaceC16820sZ = BUY.A00;
        } else {
            cls = C4HC.class;
            interfaceC16820sZ = C4HE.A00;
        }
        return (C4HD) userSession.A01(cls, interfaceC16820sZ);
    }
}
