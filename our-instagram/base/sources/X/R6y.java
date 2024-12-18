package X;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public abstract class R6y extends AbstractC61579Rq3 implements Future {
    public final C64925Ta0 A00() {
        if (this instanceof R6v) {
            return ((R6v) this).A00;
        }
        return ((RunnableC60556R6t) this).A00;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (this instanceof R6v) {
            R6v r6v = (R6v) this;
            ExecutorServiceC64921TZw executorServiceC64921TZw = r6v.A01;
            String str = ExecutorServiceC64921TZw.A0A;
            synchronized (executorServiceC64921TZw) {
                PriorityQueue priorityQueue = executorServiceC64921TZw.A02;
                Iterator it = priorityQueue.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C64525TIb c64525TIb = (C64525TIb) it.next();
                    if (c64525TIb.A01 == r6v) {
                        priorityQueue.remove(c64525TIb);
                        ExecutorServiceC64921TZw.A02(executorServiceC64921TZw);
                        break;
                    }
                }
            }
            return r6v.A00.cancel(z);
        }
        return A00().cancel(z);
    }

    public Object get(long j, TimeUnit timeUnit) {
        return A00().get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return A00().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return A00().isDone();
    }

    public Object get() {
        return A00().get();
    }
}
