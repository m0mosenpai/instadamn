package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.PtZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ThreadFactoryC58338PtZ implements ThreadFactory {
    public final AtomicInteger A00 = AbstractC58319PtB.A16();
    public final /* synthetic */ C58337PtY A01;

    public ThreadFactoryC58338PtZ(C58337PtY c58337PtY) {
        this.A01 = c58337PtY;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName(AnonymousClass001.A0O("arch_disk_io_", this.A00.getAndIncrement()));
        return thread;
    }
}
