package X;

import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: X.Ta0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64925Ta0 extends FutureTask implements InterfaceFutureC65699TsL {
    public final C62487SDo A00;

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        C62487SDo c62487SDo = this.A00;
        Queue queue = c62487SDo.A01;
        synchronized (queue) {
            if (c62487SDo.A00) {
                return;
            }
            c62487SDo.A00 = true;
            if (!queue.isEmpty()) {
                queue.poll();
                throw AbstractC166987dD.A15("execute");
            }
        }
    }

    public C64925Ta0(Runnable runnable, Object obj) {
        super(runnable, obj);
        this.A00 = new C62487SDo();
    }

    public C64925Ta0(Callable callable) {
        super(callable);
        this.A00 = new C62487SDo();
    }
}
