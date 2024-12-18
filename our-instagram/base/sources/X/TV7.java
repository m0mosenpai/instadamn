package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class TV7 implements ThreadFactory {
    public final AtomicInteger A00 = MSW.A1C(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new TY4(runnable, AnonymousClass001.A0O("RtiExecutor #", this.A00.getAndIncrement()));
    }
}
