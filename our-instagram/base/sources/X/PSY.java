package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class PSY implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C5SW A01;
    public final /* synthetic */ NER A02;

    public PSY(UserSession userSession, C5SW c5sw, NER ner) {
        this.A02 = ner;
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
