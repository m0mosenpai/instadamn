package X;

import com.google.common.collect.EvictingQueue;

/* renamed from: X.M3n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49946M3n implements Runnable {
    public final /* synthetic */ L3O A00;
    public final /* synthetic */ C137246Jd A01;

    public RunnableC49946M3n(L3O l3o, C137246Jd c137246Jd) {
        this.A00 = l3o;
        this.A01 = c137246Jd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L3O l3o = this.A00;
        EvictingQueue evictingQueue = l3o.A02;
        evictingQueue.offer(this.A01);
        l3o.A03.A00(evictingQueue);
    }
}
