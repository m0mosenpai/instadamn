package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes12.dex */
public final class YKe extends AtomicReference implements InterfaceC42071wx, InterfaceC41801wU, YOD {
    public InterfaceC42061ww A00;
    public final long A01;
    public final InterfaceC42071wx A02;
    public final AbstractC151006r1 A03;
    public final TimeUnit A05;
    public final C73553YKg A04 = new AtomicReference();
    public final AtomicLong A06 = new AtomicLong();
    public final AtomicReference A07 = new AtomicReference();

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        AtomicLong atomicLong = this.A06;
        long j = atomicLong.get();
        if (j != Long.MAX_VALUE) {
            long j2 = 1 + j;
            if (atomicLong.compareAndSet(j, j2)) {
                C73553YKg c73553YKg = this.A04;
                ((InterfaceC41801wU) c73553YKg.get()).dispose();
                this.A02.DVo(obj);
                C6KP.A00(this.A03.A01(new RunnableC73523YHn(this, j2), this.A05, this.A01), c73553YKg);
            }
        }
    }

    @Override // X.InterfaceC42071wx
    public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
        C6KP.A03(interfaceC41801wU, this.A07);
    }

    @Override // X.YOD
    public final void DtL(long j) {
        if (this.A06.compareAndSet(j, Long.MAX_VALUE)) {
            C6KP.A01(this.A07);
            InterfaceC42061ww interfaceC42061ww = this.A00;
            this.A00 = null;
            interfaceC42061ww.EpF(new C73486YFp(this.A02, this));
            this.A03.dispose();
        }
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        C6KP.A01(this.A07);
        C6KP.A01(this);
        this.A03.dispose();
    }

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        if (this.A06.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            C6KP.A01(this.A04);
            this.A02.onComplete();
            this.A03.dispose();
        }
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        if (this.A06.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            C6KP.A01(this.A04);
            this.A02.onError(th);
            this.A03.dispose();
            return;
        }
        AbstractC142886co.A02(th);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.YKg, java.util.concurrent.atomic.AtomicReference] */
    public YKe(InterfaceC42061ww interfaceC42061ww, InterfaceC42071wx interfaceC42071wx, AbstractC151006r1 abstractC151006r1, TimeUnit timeUnit, long j) {
        this.A02 = interfaceC42071wx;
        this.A01 = j;
        this.A05 = timeUnit;
        this.A03 = abstractC151006r1;
        this.A00 = interfaceC42061ww;
    }
}
