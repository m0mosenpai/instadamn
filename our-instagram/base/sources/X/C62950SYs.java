package X;

import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.SYs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62950SYs {
    public ExecutorService A00;
    public final Deque A01 = new ArrayDeque();
    public final Deque A02 = new ArrayDeque();
    public final Deque A03 = new ArrayDeque();

    public final void A01(C65148TeN c65148TeN) {
        c65148TeN.A01.decrementAndGet();
        Deque deque = this.A02;
        synchronized (this) {
            if (!deque.remove(c65148TeN)) {
                throw AbstractC58318PtA.A0W("Call wasn't in-flight!");
            }
        }
        A00(this);
    }

    public static void A00(C62950SYs c62950SYs) {
        int i;
        ExecutorService executorService;
        ArrayList A1E = AbstractC166987dD.A1E();
        synchronized (c62950SYs) {
            Iterator it = c62950SYs.A01.iterator();
            while (it.hasNext()) {
                C65148TeN c65148TeN = (C65148TeN) it.next();
                Deque deque = c62950SYs.A02;
                if (deque.size() < 64) {
                    if (c65148TeN.A01.get() < 5) {
                        it.remove();
                        c65148TeN.A01.incrementAndGet();
                        A1E.add(c65148TeN);
                        deque.add(c65148TeN);
                    }
                }
            }
            c62950SYs.A02.size();
            c62950SYs.A03.size();
        }
        int size = A1E.size();
        for (i = 0; i < size; i++) {
            C65148TeN c65148TeN2 = (C65148TeN) A1E.get(i);
            synchronized (c62950SYs) {
                executorService = c62950SYs.A00;
                if (executorService == null) {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    SynchronousQueue synchronousQueue = new SynchronousQueue();
                    byte[] bArr = AbstractC63404SjZ.A07;
                    executorService = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new TVC("OkHttp Dispatcher", false));
                    c62950SYs.A00 = executorService;
                }
            }
            try {
                try {
                    executorService.execute(c65148TeN2);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    TIU tiu = c65148TeN2.A02;
                    tiu.A00.A01(interruptedIOException);
                    c65148TeN2.A00.DGE(interruptedIOException, tiu);
                    tiu.A02.A0J.A01(c65148TeN2);
                }
            } catch (Throwable th) {
                c65148TeN2.A02.A02.A0J.A01(c65148TeN2);
                throw th;
            }
        }
    }
}
