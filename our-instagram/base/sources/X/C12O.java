package X;

import java.util.concurrent.locks.ReadWriteLock;

/* renamed from: X.12O, reason: invalid class name */
/* loaded from: classes.dex */
public final class C12O implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC09780fb.A01("EmojiCompat.EmojiCompatInitializer.run", 1671979878);
            if (C58341Ptc.A09 != null) {
                C58341Ptc A00 = C58341Ptc.A00();
                if (A00.A01() != 1) {
                    ReadWriteLock readWriteLock = A00.A06;
                    readWriteLock.writeLock().lock();
                    try {
                        if (A00.A07 == 0) {
                            readWriteLock.writeLock().unlock();
                        } else {
                            A00.A07 = 0;
                            readWriteLock.writeLock().unlock();
                            A00.A01.A00();
                        }
                    } catch (Throwable th) {
                        readWriteLock.writeLock().unlock();
                        throw th;
                    }
                }
            }
            AbstractC09780fb.A00(1694125311);
        } catch (Throwable th2) {
            AbstractC09780fb.A00(-1024527489);
            throw th2;
        }
    }
}
