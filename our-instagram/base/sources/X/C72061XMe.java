package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.XMe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72061XMe implements InterfaceC42071wx, InterfaceC41801wU {
    public InterfaceC41801wU A00;
    public final long A01;
    public final InterfaceC42071wx A02;
    public final AbstractC151006r1 A03;
    public final TimeUnit A04;

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        this.A03.A01(new XMM(this, obj), this.A04, this.A01);
    }

    @Override // X.InterfaceC42071wx
    public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
        if (C6KP.A02(this.A00, interfaceC41801wU)) {
            this.A00 = interfaceC41801wU;
            this.A02.Dpc(this);
        }
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        this.A00.dispose();
        this.A03.dispose();
    }

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        this.A03.A01(new RunnableC73508YGn(this), this.A04, this.A01);
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        this.A03.A01(new RunnableC73522YHm(this, th), this.A04, 0L);
    }

    public C72061XMe(InterfaceC42071wx interfaceC42071wx, AbstractC151006r1 abstractC151006r1, TimeUnit timeUnit, long j) {
        this.A02 = interfaceC42071wx;
        this.A01 = j;
        this.A04 = timeUnit;
        this.A03 = abstractC151006r1;
    }
}
