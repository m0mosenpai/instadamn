package X;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.Wqs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71263Wqs implements Runnable {
    public final /* synthetic */ C4RQ A00;

    public RunnableC71263Wqs(C4RQ c4rq) {
        this.A00 = c4rq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4RQ c4rq = this.A00;
        AtomicLong atomicLong = C4RQ.A0c;
        Object obj = c4rq.A0J;
        synchronized (obj) {
            obj.notifyAll();
        }
    }
}
