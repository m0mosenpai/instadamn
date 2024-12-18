package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class TVG implements ThreadFactory {
    public static final AtomicInteger A00 = new AtomicInteger();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, AbstractC58320PtC.A12("measurement-", AbstractC58318PtA.A0q(23), A00.incrementAndGet()));
    }
}
