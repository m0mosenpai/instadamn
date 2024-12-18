package X;

import android.os.MessageQueue;

/* renamed from: X.JQr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43610JQr implements MessageQueue.IdleHandler {
    public final /* synthetic */ Runnable A00;

    public C43610JQr(Runnable runnable) {
        this.A00 = runnable;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        this.A00.run();
        return false;
    }
}
