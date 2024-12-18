package X;

import android.os.SystemClock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.TRn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64731TRn implements Runnable, InterfaceC106504r4 {
    public long A00;
    public Thread A01;
    public C61245Rji A02;
    public final String A03;
    public final ThreadPoolExecutor A04;
    public final Runnable A05;
    public final ExecutorService A06;
    public final AtomicBoolean A07 = new AtomicBoolean(true);
    public final AtomicBoolean A08 = AbstractC166997dE.A17();

    public RunnableC64731TRn(ExecutorService executorService, ThreadPoolExecutor threadPoolExecutor) {
        TJZ tjz = new TJZ(this);
        this.A05 = tjz;
        this.A06 = executorService;
        this.A04 = threadPoolExecutor;
        this.A03 = "IgExecutor";
        executorService.execute(tjz);
    }

    @Override // X.InterfaceC106504r4
    public final boolean AHE() {
        if (this.A07.get()) {
            return true;
        }
        Thread thread = this.A01;
        if (thread != null && thread.isAlive()) {
            this.A02 = A00(thread);
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC106514r5
    public final void Cpp() {
        boolean z = this.A08.get();
        AtomicBoolean atomicBoolean = this.A07;
        if (z) {
            atomicBoolean.set(true);
            return;
        }
        atomicBoolean.set(false);
        this.A00 = SystemClock.uptimeMillis();
        this.A06.execute(this);
    }

    @Override // X.InterfaceC106504r4
    public final void EHc() {
        AtomicBoolean atomicBoolean = this.A07;
        if (!atomicBoolean.get()) {
            Thread thread = this.A01;
            if (thread != null && thread.isAlive()) {
                C61245Rji A00 = A00(thread);
                C61245Rji c61245Rji = this.A02;
                if (c61245Rji != null) {
                    A00.initCause(c61245Rji);
                }
                if (!atomicBoolean.get()) {
                    C106484r2.A00().A05(AnonymousClass001.A0R("ThreadPoolExecutorWatchdog-", this.A03), A00);
                }
            }
            this.A08.set(true);
            C106484r2 A002 = C106484r2.A00();
            synchronized (A002.A03) {
                A002.A05.add(this);
            }
            return;
        }
        this.A02 = null;
    }

    @Override // X.InterfaceC106514r5
    public final String getName() {
        return this.A03;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Throwable, X.Rji, java.lang.Exception] */
    private C61245Rji A00(Thread thread) {
        long uptimeMillis = SystemClock.uptimeMillis();
        StackTraceElement[] stackTrace = thread.getStackTrace();
        long uptimeMillis2 = (SystemClock.uptimeMillis() - uptimeMillis) / 1000;
        StringBuilder A11 = AbstractC166997dE.A11(AnonymousClass001.A0R("Blocked on ", this.A03));
        A11.append(" thread=[num=");
        ThreadPoolExecutor threadPoolExecutor = this.A04;
        A11.append(threadPoolExecutor.getPoolSize());
        A11.append(", active=");
        A11.append(threadPoolExecutor.getActiveCount());
        StringBuilder A112 = AbstractC166997dE.A11(AbstractC166997dE.A0x("]", A11));
        A112.append(" task=[queuing=");
        A112.append(threadPoolExecutor.getQueue().size());
        A112.append(", finished=");
        A112.append(threadPoolExecutor.getCompletedTaskCount());
        ?? exc = new Exception(AnonymousClass001.A0s(AnonymousClass001.A0s(AbstractC166997dE.A0x("]", A112), " for ", " seconds; ", (SystemClock.uptimeMillis() - this.A00) / 1000), "dump took ", AbstractC43591JPw.A00(225), uptimeMillis2));
        exc.setStackTrace(stackTrace);
        return exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01 = Thread.currentThread();
        this.A07.set(true);
        if (this.A08.getAndSet(false)) {
            C106484r2 A00 = C106484r2.A00();
            synchronized (A00.A03) {
                A00.A05.remove(this);
            }
        }
    }
}
