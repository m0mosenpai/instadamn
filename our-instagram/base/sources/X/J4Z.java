package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class J4Z implements Runnable {
    public final C5SW A00;
    public final UserSession A01;

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A07(this.A01);
    }

    public J4Z(UserSession userSession, C5SW c5sw) {
        this.A00 = c5sw;
        this.A01 = userSession;
    }
}
