package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class Aw5 implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C5SW A01;

    public Aw5(UserSession userSession, C5SW c5sw) {
        this.A01 = c5sw;
        this.A00 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A07(this.A00);
    }
}
