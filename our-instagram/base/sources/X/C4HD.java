package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: X.4HD, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4HD implements InterfaceC13000lm {
    public Handler A00;
    public HandlerThread A01;
    public boolean A02;
    public final String A03;

    private final synchronized HandlerThread A00() {
        HandlerThread handlerThread;
        if (this.A01 == null) {
            HandlerThread handlerThread2 = new HandlerThread(this.A03);
            AbstractC09770fa.A00(handlerThread2);
            this.A01 = handlerThread2;
            handlerThread2.start();
            if (this.A02) {
                C0w9.A03("direct_handler_thread_recreated", "DirectHandlerThread is recreated after the user session has ended.");
            }
        }
        handlerThread = this.A01;
        C14360o3.A0A(handlerThread);
        return handlerThread;
    }

    public final synchronized Handler A01() {
        Handler handler;
        handler = this.A00;
        if (handler == null) {
            handler = new Handler(A00().getLooper());
            this.A00 = handler;
        }
        return handler;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        synchronized (this) {
            HandlerThread handlerThread = this.A01;
            if (handlerThread != null) {
                handlerThread.quit();
                this.A01 = null;
                this.A00 = null;
            }
            this.A02 = true;
        }
    }

    public C4HD(String str) {
        this.A03 = str;
    }

    public final Looper A02() {
        Looper looper = A00().getLooper();
        C14360o3.A07(looper);
        return looper;
    }
}
