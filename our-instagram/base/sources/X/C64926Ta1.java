package X;

import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.Ta1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64926Ta1 extends LinkedBlockingQueue<Runnable> {
    public C64926Ta1() {
        super(C3OO.FLAG_MOVED);
    }

    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        if (size() == 0) {
            return super.offer(obj);
        }
        return false;
    }
}
