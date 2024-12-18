package X;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
public final class B52 extends ReentrantLock implements AutoCloseable {
    public boolean A00;

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.A00) {
            unlock();
        }
    }
}
