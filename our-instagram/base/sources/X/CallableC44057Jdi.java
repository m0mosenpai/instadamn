package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.Callable;

/* renamed from: X.Jdi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC44057Jdi implements Callable {
    public final /* synthetic */ UserSession A00;

    public CallableC44057Jdi(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        UserSession userSession = this.A00;
        return userSession.A01(C5e4.class, new C50154MDh(userSession, 1));
    }
}
