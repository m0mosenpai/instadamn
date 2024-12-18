package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class PSZ implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C5SW A01;
    public final /* synthetic */ NER A02;

    public PSZ(UserSession userSession, C5SW c5sw, NER ner) {
        this.A02 = ner;
        this.A01 = c5sw;
        this.A00 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NER ner = this.A02;
        Activity activity = ner.A00;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            this.A01.A07(this.A00);
            AbstractC52180N7p abstractC52180N7p = ner.A01.A00;
            if (abstractC52180N7p instanceof NMX) {
                MSW.A0b(((NMX) abstractC52180N7p).A0Y).A0E.getValue();
            }
        }
    }
}
