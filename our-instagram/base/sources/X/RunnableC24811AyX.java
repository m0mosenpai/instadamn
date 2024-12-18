package X;

import android.os.Handler;
import android.os.Looper;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.AyX, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24811AyX implements Runnable {
    public final Runnable A00;
    public final Timer A01;
    public final AtomicBoolean A02;

    public /* synthetic */ RunnableC24811AyX(Runnable runnable) {
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper);
        this.A00 = runnable;
        this.A02 = AbstractC166997dE.A17();
        this.A01 = new Timer();
        handler.postDelayed(this, 1000L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicBoolean atomicBoolean = this.A02;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.A01.cancel();
            this.A00.run();
        }
    }
}
