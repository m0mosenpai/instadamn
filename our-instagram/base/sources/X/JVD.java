package X;

import com.google.common.util.concurrent.SettableFuture;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class JVD {
    public static final void A00(InterfaceC16660sJ interfaceC16660sJ, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        AbstractC136086Dq.A00(userSession).A00(new MHU(25, interfaceC16660sJ, userSession), 2);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public final SettableFuture A01(UserSession userSession, InterfaceC16660sJ interfaceC16660sJ) {
        ?? obj = new Object();
        A00(new C50363MLp(38, (Object) obj, interfaceC16660sJ), userSession);
        return obj;
    }
}
