package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Ovq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56130Ovq implements InterfaceC13000lm {
    public final AtomicBoolean A00;
    public final UserSession A01;

    public C56130Ovq(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AbstractC166997dE.A17();
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.set(false);
    }
}
