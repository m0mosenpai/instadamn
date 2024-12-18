package X;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.TUt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ExecutorC64805TUt implements Executor {
    public static final C25051Kj A05 = new C25051Kj(ExecutorC64805TUt.class);
    public final Executor A04;
    public final Deque A02 = new ArrayDeque();
    public Integer A01 = C05F.A00;
    public long A00 = 0;
    public final TRX A03 = new TRX(this);

    public ExecutorC64805TUt(Executor executor) {
        executor.getClass();
        this.A04 = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable task) {
        Integer num;
        task.getClass();
        Deque deque = this.A02;
        synchronized (deque) {
            Integer num2 = this.A01;
            if (num2 != C05F.A0N && num2 != (num = C05F.A0C)) {
                long j = this.A00;
                TRW trw = new TRW(task);
                deque.add(trw);
                Integer num3 = C05F.A01;
                this.A01 = num3;
                boolean z = true;
                try {
                    this.A04.execute(this.A03);
                    if (this.A01 == num3) {
                        synchronized (deque) {
                            if (this.A00 == j && this.A01 == num3) {
                                this.A01 = num;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    synchronized (deque) {
                        Integer num4 = this.A01;
                        if ((num4 != C05F.A00 && num4 != num3) || !deque.removeLastOccurrence(trw)) {
                            z = false;
                        }
                        if ((th instanceof RejectedExecutionException) && !z) {
                            return;
                        } else {
                            throw th;
                        }
                    }
                }
            }
            deque.add(task);
        }
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SequentialExecutor@");
        A1C.append(System.identityHashCode(this));
        A1C.append("{");
        return JQ0.A0l(this.A04, A1C);
    }
}
