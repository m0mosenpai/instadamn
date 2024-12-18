package X;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0T8, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0T8 {
    public static C0T7 A00;
    public static final ReadWriteLock A01 = new ReentrantReadWriteLock();
    public static volatile boolean A02;

    public static void A00() {
        try {
            ReadWriteLock readWriteLock = A01;
            readWriteLock.readLock().lock();
            readWriteLock.readLock().unlock();
        } catch (Throwable th) {
            A01.readLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        if (X.C0T8.A00 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A01() {
        /*
            java.util.concurrent.locks.ReadWriteLock r2 = X.C0T8.A01     // Catch: java.lang.Throwable -> L1b
            java.util.concurrent.locks.Lock r0 = r2.readLock()     // Catch: java.lang.Throwable -> L1b
            r0.lock()     // Catch: java.lang.Throwable -> L1b
            boolean r0 = X.C0T8.A02     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L12
            X.0T7 r0 = X.C0T8.A00     // Catch: java.lang.Throwable -> L1b
            r1 = 1
            if (r0 != 0) goto L13
        L12:
            r1 = 0
        L13:
            java.util.concurrent.locks.Lock r0 = r2.readLock()
            r0.unlock()
            return r1
        L1b:
            r1 = move-exception
            java.util.concurrent.locks.ReadWriteLock r0 = X.C0T8.A01
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0T8.A01():boolean");
    }
}
