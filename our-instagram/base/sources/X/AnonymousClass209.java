package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.209, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass209 {
    public long A00;
    public HandlerThread A01;
    public Handler A02;
    public final AtomicLong A03 = new AtomicLong(0);
    public final String A04;

    public final Handler A00() {
        Handler handler;
        synchronized (this) {
            if (this.A01 == null) {
                HandlerThread handlerThread = new HandlerThread(this.A04);
                AbstractC09770fa.A00(handlerThread);
                this.A01 = handlerThread;
                handlerThread.start();
                this.A02 = new Handler(handlerThread.getLooper());
            }
            handler = this.A02;
        }
        return handler;
    }

    public final boolean A01(final Runnable runnable) {
        this.A03.incrementAndGet();
        Handler A00 = A00();
        if (A00 != null) {
            return A00.post(new Runnable() { // from class: X.4Mc
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass209.this.A00++;
                    runnable.run();
                }
            });
        }
        return false;
    }

    public final boolean A02(final Runnable runnable) {
        this.A03.incrementAndGet();
        Handler A00 = A00();
        if (A00 != null) {
            return A00.postAtFrontOfQueue(new Runnable() { // from class: X.20D
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass209.this.A00++;
                    runnable.run();
                }
            });
        }
        return false;
    }

    public AnonymousClass209(String str) {
        this.A04 = str;
    }
}
