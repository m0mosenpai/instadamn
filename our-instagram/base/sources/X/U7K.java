package X;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes11.dex */
public final class U7K extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        U7J u7j = (U7J) message.obj;
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                U7K u7k = U7H.A04;
            }
        } else {
            U7H u7h = u7j.A00;
            Object obj = u7j.A01[0];
            U7K u7k2 = U7H.A04;
            if (!u7h.A01.isCancelled()) {
                u7h.A05(obj);
            }
            u7h.A03 = C05F.A0C;
        }
    }
}
