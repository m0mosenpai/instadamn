package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6JC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6JC extends AtomicReference implements InterfaceC42071wx {
    public int A00;
    public final long A01;
    public final C6JB A02;
    public volatile InterfaceC136016Dg A03;
    public volatile boolean A04;

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        this.A04 = true;
        this.A02.A00();
    }

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        if (this.A00 == 0) {
            C6JB c6jb = this.A02;
            if (c6jb.get() == 0 && c6jb.compareAndSet(0, 1)) {
                c6jb.A08.DVo(obj);
                if (c6jb.decrementAndGet() == 0) {
                    return;
                }
            } else {
                InterfaceC136016Dg interfaceC136016Dg = this.A03;
                if (interfaceC136016Dg == null) {
                    interfaceC136016Dg = new C137416Km(c6jb.A06);
                    this.A03 = interfaceC136016Dg;
                }
                interfaceC136016Dg.offer(obj);
                if (c6jb.getAndIncrement() != 0) {
                    return;
                }
            }
            c6jb.A01();
            return;
        }
        this.A02.A00();
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        C6JB c6jb = this.A02;
        if (Y4X.A02(th, c6jb.A0A)) {
            c6jb.A05();
            this.A04 = true;
            c6jb.A00();
            return;
        }
        AbstractC142886co.A02(th);
    }

    public C6JC(C6JB c6jb, long j) {
        this.A01 = j;
        this.A02 = c6jb;
    }

    @Override // X.InterfaceC42071wx
    public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
        if (C6KP.A03(interfaceC41801wU, this) && (interfaceC41801wU instanceof InterfaceC135996De)) {
            InterfaceC136006Df interfaceC136006Df = (InterfaceC136006Df) interfaceC41801wU;
            int EJ7 = interfaceC136006Df.EJ7(7);
            if (EJ7 == 1) {
                this.A00 = EJ7;
                this.A03 = interfaceC136006Df;
                this.A04 = true;
                this.A02.A00();
                return;
            }
            if (EJ7 != 2) {
                return;
            }
            this.A00 = EJ7;
            this.A03 = interfaceC136006Df;
        }
    }
}
