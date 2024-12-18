package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.WvV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71526WvV implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C5SW A01;

    public RunnableC71526WvV(UserSession userSession, C5SW c5sw) {
        this.A01 = c5sw;
        this.A00 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5SW c5sw = this.A01;
        if (c5sw != null) {
            UserSession userSession = this.A00;
            if (C28350CfA.A00(userSession) && !c5sw.A09()) {
                c5sw.A07(userSession);
            }
        }
    }
}
