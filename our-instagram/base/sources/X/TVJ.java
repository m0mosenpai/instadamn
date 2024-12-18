package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class TVJ implements ThreadFactory {
    public static final AtomicInteger A03 = MSW.A1C(1);
    public final String A00;
    public final ThreadGroup A01;
    public final AtomicInteger A02 = MSW.A1C(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.A01, runnable, AnonymousClass001.A0O(this.A00, this.A02.getAndIncrement()), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }

    public TVJ() {
        ThreadGroup threadGroup;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager == null) {
            threadGroup = Thread.currentThread().getThreadGroup();
        } else {
            threadGroup = securityManager.getThreadGroup();
        }
        this.A01 = threadGroup;
        this.A00 = AnonymousClass001.A0c("lottie-", "-thread-", A03.getAndIncrement());
    }
}
