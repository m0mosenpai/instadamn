package X;

import android.os.Handler;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Rti, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61788Rti {
    public static final void A00(Handler handler, Runnable runnable) {
        C14360o3.A0B(handler, 0);
        CountDownLatch A15 = AbstractC58319PtB.A15();
        handler.post(new TNW(runnable, A15));
        try {
            A15.await();
        } catch (InterruptedException e) {
            C0K8.A0F("HandlerUtils", "Interrupted awaiting latch", e);
            AbstractC58318PtA.A18();
        }
    }
}
