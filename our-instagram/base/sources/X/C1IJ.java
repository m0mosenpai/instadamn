package X;

import java.util.concurrent.locks.Lock;

/* renamed from: X.1IJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1IJ implements C1IK {
    public final Lock A00;

    @Override // X.C1IK
    public final void lock() {
        this.A00.lock();
    }

    @Override // X.C1IK
    public final void unlock() {
        this.A00.unlock();
    }

    public C1IJ(Lock lock) {
        this.A00 = lock;
    }
}
