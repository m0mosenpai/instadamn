package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class TVB implements ThreadFactory {
    public final AtomicInteger A01 = new AtomicInteger();
    public final ThreadFactory A00 = Executors.defaultThreadFactory();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.A00.newThread(new RunnableC58413Pur(runnable));
        newThread.setName(AnonymousClass001.A06(this.A01.getAndIncrement(), "GAC_Executor", "[", "]"));
        return newThread;
    }
}
