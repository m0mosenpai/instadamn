package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public final class XMV extends AtomicBoolean implements InterfaceC42071wx, InterfaceC41801wU {
    public InterfaceC41801wU A00;
    public final InterfaceC42071wx A01;
    public final RunnableC72099XNt A02;
    public final C72092XNm A03;

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        if (compareAndSet(false, true)) {
            this.A03.A03(this.A02);
            this.A01.onComplete();
        }
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.A03.A03(this.A02);
            this.A01.onError(th);
        } else {
            AbstractC142886co.A02(th);
        }
    }

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        this.A01.DVo(obj);
    }

    @Override // X.InterfaceC42071wx
    public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
        if (C6KP.A02(this.A00, interfaceC41801wU)) {
            this.A00 = interfaceC41801wU;
            this.A01.Dpc(this);
        }
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        this.A00.dispose();
        if (compareAndSet(false, true)) {
            C72092XNm c72092XNm = this.A03;
            RunnableC72099XNt runnableC72099XNt = this.A02;
            synchronized (c72092XNm) {
                RunnableC72099XNt runnableC72099XNt2 = c72092XNm.A00;
                if (runnableC72099XNt2 != null && runnableC72099XNt2 == runnableC72099XNt) {
                    long j = runnableC72099XNt.A00 - 1;
                    runnableC72099XNt.A00 = j;
                    if (j == 0 && runnableC72099XNt.A01) {
                        c72092XNm.A04(runnableC72099XNt);
                    }
                }
            }
        }
    }

    public XMV(InterfaceC42071wx interfaceC42071wx, RunnableC72099XNt runnableC72099XNt, C72092XNm c72092XNm) {
        this.A01 = interfaceC42071wx;
        this.A03 = c72092XNm;
        this.A02 = runnableC72099XNt;
    }
}
