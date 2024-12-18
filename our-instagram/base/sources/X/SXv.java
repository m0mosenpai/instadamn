package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class SXv {
    public static SXv A01;
    public static final Object A02 = AbstractC58318PtA.A0b();
    public Handler A00;

    /* JADX WARN: Type inference failed for: r2v3, types: [X.SXv, java.lang.Object] */
    public static SXv A00() {
        SXv sXv;
        synchronized (A02) {
            SXv sXv2 = A01;
            sXv = sXv2;
            if (sXv2 == null) {
                HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                handlerThread.start();
                Looper looper = handlerThread.getLooper();
                ?? obj = new Object();
                obj.A00 = new Handler(looper);
                A01 = obj;
                sXv = obj;
            }
        }
        return sXv;
    }

    public final C5KS A01(final Callable callable) {
        final C58411Pup c58411Pup = new C58411Pup();
        Rj8.A01.execute(new Runnable() { // from class: X.TOs
            @Override // java.lang.Runnable
            public final void run() {
                RkG e;
                Callable callable2 = callable;
                C58411Pup c58411Pup2 = c58411Pup;
                try {
                    c58411Pup2.A01(callable2.call());
                } catch (RkG e2) {
                    e = e2;
                    c58411Pup2.A00(e);
                } catch (Exception e3) {
                    e = new RkG("Internal error has occurred when executing ML Kit tasks", e3);
                    c58411Pup2.A00(e);
                }
            }
        });
        return c58411Pup.A00;
    }
}
