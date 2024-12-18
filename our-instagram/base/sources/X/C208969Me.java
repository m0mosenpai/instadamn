package X;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.9Me, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208969Me {
    public final ReentrantLock A01 = new ReentrantLock();
    public int A00 = 0;

    public final boolean A00() {
        ReentrantLock reentrantLock = this.A01;
        reentrantLock.lock();
        try {
            boolean z = true;
            if ((this.A00 & 1) != 1) {
                z = false;
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean A01() {
        ReentrantLock reentrantLock = this.A01;
        reentrantLock.lock();
        try {
            return AbstractC167007dF.A1N(this.A00);
        } finally {
            reentrantLock.unlock();
        }
    }
}
