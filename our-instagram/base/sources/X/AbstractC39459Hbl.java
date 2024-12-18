package X;

import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.Hbl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39459Hbl extends AbstractC37552Gg8 {
    public final int A0d() {
        int i;
        C37525Gfh c37525Gfh = (C37525Gfh) this;
        if (c37525Gfh instanceof C37883Gld) {
            synchronized (c37525Gfh) {
                i = c37525Gfh.A00;
            }
            return i;
        }
        if (c37525Gfh instanceof C37886Glg) {
            C37886Glg c37886Glg = (C37886Glg) c37525Gfh;
            ReentrantReadWriteLock.ReadLock A09 = AbstractC37552Gg8.A09(c37886Glg);
            try {
                return ((C37525Gfh) c37886Glg).A00;
            } finally {
                A09.unlock();
            }
        }
        return c37525Gfh.A00;
    }

    public abstract List A0e(java.util.Set set);

    public final void A0f(int i) {
        int i2;
        C37525Gfh c37525Gfh = (C37525Gfh) this;
        if (c37525Gfh instanceof C37886Glg) {
            C37886Glg c37886Glg = (C37886Glg) c37525Gfh;
            ReentrantReadWriteLock reentrantReadWriteLock = c37886Glg.A00;
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            int i3 = 0;
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i2 = reentrantReadWriteLock.getReadHoldCount();
                for (int i4 = 0; i4 < i2; i4++) {
                    readLock.unlock();
                }
            } else {
                i2 = 0;
            }
            ReentrantReadWriteLock.WriteLock A0A = AbstractC37552Gg8.A0A(reentrantReadWriteLock);
            try {
                ((C37525Gfh) c37886Glg).A00 = i;
                return;
            } finally {
                while (i3 < i2) {
                    readLock.lock();
                    i3++;
                }
                A0A.unlock();
            }
        }
        if (c37525Gfh instanceof C37883Gld) {
            synchronized (c37525Gfh) {
                c37525Gfh.A00 = i;
            }
        } else {
            c37525Gfh.A00 = i;
        }
    }

    public abstract void A0g(C120985dq c120985dq, boolean z);

    public abstract void A0h(C120985dq c120985dq, boolean z);
}
