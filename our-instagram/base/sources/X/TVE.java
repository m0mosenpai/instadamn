package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class TVE implements ThreadFactory {
    public final InterfaceC65608Tnx A00;
    public final boolean A01;
    public final String A02;
    public final ThreadFactory A03;
    public final AtomicInteger A04 = new AtomicInteger();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.A03.newThread(new TN2(this, runnable));
        newThread.setName(AnonymousClass001.A07(this.A04.getAndIncrement(), "glide-", this.A02, "-thread-"));
        return newThread;
    }

    public TVE(InterfaceC65608Tnx interfaceC65608Tnx, String str, ThreadFactory threadFactory, boolean z) {
        this.A03 = threadFactory;
        this.A02 = str;
        this.A00 = interfaceC65608Tnx;
        this.A01 = z;
    }
}
