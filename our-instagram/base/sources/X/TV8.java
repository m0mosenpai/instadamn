package X;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes10.dex */
public final class TV8 implements ThreadFactory {
    public final /* synthetic */ ThreadFactory A00;

    public TV8(ThreadFactory threadFactory) {
        this.A00 = threadFactory;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.A00.newThread(runnable);
        newThread.getClass();
        newThread.setDaemon(true);
        return newThread;
    }
}
