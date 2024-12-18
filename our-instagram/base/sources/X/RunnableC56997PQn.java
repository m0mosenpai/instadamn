package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.PQn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56997PQn implements Runnable {
    public final /* synthetic */ C5SW A00;
    public final /* synthetic */ NET A01;

    public RunnableC56997PQn(C5SW c5sw, NET net2) {
        this.A01 = net2;
        this.A00 = c5sw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NET net2 = this.A01;
        Activity activity = net2.A00;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            C5SW c5sw = this.A00;
            UserSession userSession = net2.A01;
            c5sw.A07(userSession);
            AnonymousClass229.A01(userSession).A1N(EnumC50631MWs.A0O, AbstractC166997dE.A0b(), "ig_video_sharing_settings");
        }
    }
}
