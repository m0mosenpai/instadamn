package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ave, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24644Ave implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C5SW A01;

    public RunnableC24644Ave(UserSession userSession, C5SW c5sw) {
        this.A01 = c5sw;
        this.A00 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A07(this.A00);
    }
}
