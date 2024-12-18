package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class TVD implements ThreadFactory {
    public final int A00;
    public final String A01;
    public final AtomicInteger A02 = MSW.A1C(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(new TNS(this, runnable), AnonymousClass001.A0b(this.A01, " #", this.A02.getAndIncrement()));
    }

    public TVD(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
