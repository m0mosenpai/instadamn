package X;

import java.util.concurrent.locks.Lock;

/* loaded from: classes10.dex */
public final class TLN implements Runnable {
    public final /* synthetic */ T5Z A00;

    public TLN(T5Z t5z) {
        this.A00 = t5z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T5Z t5z = this.A00;
        Lock lock = t5z.A0B;
        lock.lock();
        try {
            T5Z.A02(t5z);
        } finally {
            lock.unlock();
        }
    }
}
