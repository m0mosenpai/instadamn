package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes12.dex */
public final class XMK extends AtomicInteger implements Runnable, InterfaceC42071wx, InterfaceC41801wU {
    public InterfaceC41801wU A00;
    public Throwable A01;
    public boolean A02;
    public final long A03;
    public final InterfaceC42071wx A04;
    public final AbstractC151006r1 A05;
    public final TimeUnit A06;
    public final AtomicReference A07 = new AtomicReference();
    public volatile boolean A08;
    public volatile boolean A09;
    public volatile boolean A0A;

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        this.A08 = true;
        this.A00.dispose();
        this.A05.dispose();
        if (getAndIncrement() == 0) {
            this.A07.lazySet(null);
        }
    }

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        this.A09 = true;
        A00();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A0A = true;
        A00();
    }

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        this.A07.set(obj);
        A00();
    }

    @Override // X.InterfaceC42071wx
    public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
        if (C6KP.A02(this.A00, interfaceC41801wU)) {
            this.A00 = interfaceC41801wU;
            this.A04.Dpc(this);
        }
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        this.A01 = th;
        this.A09 = true;
        A00();
    }

    public XMK(InterfaceC42071wx interfaceC42071wx, AbstractC151006r1 abstractC151006r1, TimeUnit timeUnit, long j) {
        this.A04 = interfaceC42071wx;
        this.A03 = j;
        this.A06 = timeUnit;
        this.A05 = abstractC151006r1;
    }

    public final void A00() {
        if (getAndIncrement() == 0) {
            AtomicReference atomicReference = this.A07;
            InterfaceC42071wx interfaceC42071wx = this.A04;
            int i = 1;
            while (!this.A08) {
                boolean z = this.A09;
                if (z && this.A01 != null) {
                    atomicReference.lazySet(null);
                    interfaceC42071wx.onError(this.A01);
                } else {
                    boolean z2 = false;
                    if (atomicReference.get() == null) {
                        z2 = true;
                    }
                    if (z) {
                        atomicReference.getAndSet(null);
                        interfaceC42071wx.onComplete();
                    } else {
                        if (z2) {
                            if (this.A0A) {
                                this.A02 = false;
                                this.A0A = false;
                            }
                        } else if (!this.A02 || this.A0A) {
                            interfaceC42071wx.DVo(atomicReference.getAndSet(null));
                            this.A0A = false;
                            this.A02 = true;
                            this.A05.A01(this, this.A06, this.A03);
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
                this.A05.dispose();
                return;
            }
            atomicReference.lazySet(null);
        }
    }
}
