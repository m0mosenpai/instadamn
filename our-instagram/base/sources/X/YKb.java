package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes12.dex */
public final class YKb extends AtomicLong implements InterfaceC42071wx, InterfaceC41801wU, YOD {
    public final long A00;
    public final InterfaceC42071wx A01;
    public final AbstractC151006r1 A02;
    public final TimeUnit A04;
    public final C73553YKg A03 = new AtomicReference();
    public final AtomicReference A05 = new AtomicReference();

    @Override // X.InterfaceC42071wx
    public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
        C6KP.A03(interfaceC41801wU, this.A05);
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        C6KP.A01(this.A05);
        this.A02.dispose();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.YKg, java.util.concurrent.atomic.AtomicReference] */
    public YKb(InterfaceC42071wx interfaceC42071wx, AbstractC151006r1 abstractC151006r1, TimeUnit timeUnit, long j) {
        this.A01 = interfaceC42071wx;
        this.A00 = j;
        this.A04 = timeUnit;
        this.A02 = abstractC151006r1;
    }

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        long j = get();
        if (j != Long.MAX_VALUE) {
            long j2 = 1 + j;
            if (compareAndSet(j, j2)) {
                C73553YKg c73553YKg = this.A03;
                ((InterfaceC41801wU) c73553YKg.get()).dispose();
                this.A01.DVo(obj);
                C6KP.A00(this.A02.A01(new RunnableC73523YHn(this, j2), this.A04, this.A00), c73553YKg);
            }
        }
    }

    @Override // X.YOD
    public final void DtL(long j) {
        if (compareAndSet(j, Long.MAX_VALUE)) {
            C6KP.A01(this.A05);
            InterfaceC42071wx interfaceC42071wx = this.A01;
            long j2 = this.A00;
            TimeUnit timeUnit = this.A04;
            Throwable th = Y4X.A00;
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("The source did not signal an event for ");
            A1C.append(j2);
            A1C.append(" ");
            A1C.append(timeUnit.toString().toLowerCase());
            interfaceC42071wx.onError(new TimeoutException(AbstractC166997dE.A0x(" and has been terminated.", A1C)));
            this.A02.dispose();
        }
    }

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            C6KP.A01(this.A03);
            this.A01.onComplete();
            this.A02.dispose();
        }
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            C6KP.A01(this.A03);
            this.A01.onError(th);
            this.A02.dispose();
            return;
        }
        AbstractC142886co.A02(th);
    }
}
