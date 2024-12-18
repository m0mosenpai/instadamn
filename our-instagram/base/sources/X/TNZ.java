package X;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes10.dex */
public final class TNZ implements Runnable {
    public final /* synthetic */ C64085Sz1 A00;
    public final /* synthetic */ C4MW A01;

    public TNZ(C64085Sz1 c64085Sz1, C4MW c4mw) {
        this.A00 = c64085Sz1;
        this.A01 = c4mw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C64085Sz1 c64085Sz1 = this.A00;
        if (c64085Sz1.A00.compareAndSet(true, false)) {
            C4MW c4mw = this.A01;
            try {
                ReentrantReadWriteLock reentrantReadWriteLock = c4mw.A04;
                reentrantReadWriteLock.writeLock().lock();
                c4mw.A03.remove(c64085Sz1);
                reentrantReadWriteLock.writeLock().unlock();
                c64085Sz1.onTimeout(c64085Sz1.A01, false);
            } catch (Throwable th) {
                c4mw.A04.writeLock().unlock();
                throw th;
            }
        }
    }
}
