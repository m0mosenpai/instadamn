package X;

import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.DrC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31407DrC {
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0105, code lost:
    
        if (r2 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0119, code lost:
    
        if (r2 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0129, code lost:
    
        if (r2 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0139, code lost:
    
        if (r2 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0149, code lost:
    
        if (r2 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x015b, code lost:
    
        if (r2 == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C126455ng r143, X.C81663kb r144) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC31407DrC.A00(X.5ng, X.3kb):void");
    }

    public static final void A01(C81663kb c81663kb, List list) {
        int i;
        if (AbstractC167007dF.A1Z(c81663kb.A05)) {
            ReentrantReadWriteLock reentrantReadWriteLock = c81663kb.A03;
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            int i2 = 0;
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i = reentrantReadWriteLock.getReadHoldCount();
                for (int i3 = 0; i3 < i; i3++) {
                    readLock.unlock();
                }
            } else {
                i = 0;
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                C80693iy c80693iy = c81663kb.A01;
                if (c80693iy.A29 != list) {
                    c80693iy.A29 = AbstractC166987dD.A1F(list);
                    c81663kb.A00 = null;
                    c80693iy.A01();
                }
                return;
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
        C80693iy c80693iy2 = c81663kb.A01;
        synchronized (c80693iy2) {
            if (c80693iy2.A29 != list) {
                c80693iy2.A29 = AbstractC166987dD.A1F(list);
                c81663kb.A00 = null;
                c80693iy2.A01();
            }
        }
    }
}
