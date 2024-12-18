package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.PSa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57035PSa implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C5SW A01;
    public final /* synthetic */ NES A02;

    public RunnableC57035PSa(UserSession userSession, C5SW c5sw, NES nes) {
        this.A02 = nes;
        this.A01 = c5sw;
        this.A00 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity = this.A02.A00;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            this.A01.A07(this.A00);
        }
    }
}
