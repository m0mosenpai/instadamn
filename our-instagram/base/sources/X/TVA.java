package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class TVA implements ThreadFactory {
    public final ThreadFactory A00 = Executors.defaultThreadFactory();
    public final AtomicInteger A01 = MSW.A1C(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.A01;
        Thread newThread = this.A00.newThread(runnable);
        newThread.setName(AnonymousClass001.A0O("PlayBillingLibrary-", atomicInteger.getAndIncrement()));
        return newThread;
    }
}
