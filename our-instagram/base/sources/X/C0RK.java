package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: X.0RK, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0RK implements C0Rw {
    public Handler A00;
    public final Context A01;

    @Override // X.C0Rw
    public boolean CTk() {
        return false;
    }

    @Override // X.C0Rw
    public final Handler Aex() {
        Handler handler = this.A00;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("Fixie-background-pri", 10);
            AbstractC09770fa.A00(handlerThread);
            handlerThread.start();
            Handler handler2 = new Handler(handlerThread.getLooper());
            this.A00 = handler2;
            return handler2;
        }
        return handler;
    }

    public C0RK(Context context) {
        this.A01 = context.getApplicationContext();
    }
}
