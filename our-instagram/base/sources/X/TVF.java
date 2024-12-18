package X;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes10.dex */
public final class TVF implements ThreadFactory {
    public static final TVF A00 = new TVF();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(1);
        return thread;
    }
}
