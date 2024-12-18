package X;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes12.dex */
public final class YKY extends AtomicInteger implements InterfaceC42071wx, InterfaceC41801wU {
    public int A00;
    public InterfaceC41801wU A01;
    public InterfaceC136016Dg A02;
    public final int A03;
    public final InterfaceC42071wx A04;
    public final C6D4 A05;
    public final YKc A06;
    public final C6JD A07 = new AtomicReference();
    public final boolean A08;
    public volatile boolean A09;
    public volatile boolean A0A;
    public volatile boolean A0B;

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        this.A0A = true;
        this.A01.dispose();
        C6KP.A01(this.A06);
    }

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        this.A0B = true;
        A00();
    }

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        if (this.A00 == 0) {
            this.A02.offer(obj);
        }
        A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC42071wx
    public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
        C137416Km c137416Km;
        if (C6KP.A02(this.A01, interfaceC41801wU)) {
            this.A01 = interfaceC41801wU;
            if (interfaceC41801wU instanceof InterfaceC135996De) {
                InterfaceC136006Df interfaceC136006Df = (InterfaceC136006Df) interfaceC41801wU;
                int EJ7 = interfaceC136006Df.EJ7(3);
                if (EJ7 == 1) {
                    this.A00 = EJ7;
                    this.A02 = interfaceC136006Df;
                    this.A0B = true;
                    this.A04.Dpc(this);
                    A00();
                    return;
                }
                if (EJ7 == 2) {
                    this.A00 = EJ7;
                    c137416Km = interfaceC136006Df;
                    this.A02 = c137416Km;
                    this.A04.Dpc(this);
                }
            }
            c137416Km = new C137416Km(this.A03);
            this.A02 = c137416Km;
            this.A04.Dpc(this);
        }
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        if (Y4X.A02(th, this.A07)) {
            this.A0B = true;
            A00();
        } else {
            AbstractC142886co.A02(th);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.6JD, java.util.concurrent.atomic.AtomicReference] */
    public YKY(InterfaceC42071wx interfaceC42071wx, C6D4 c6d4, int i, boolean z) {
        this.A04 = interfaceC42071wx;
        this.A05 = c6d4;
        this.A03 = i;
        this.A08 = z;
        this.A06 = new YKc(interfaceC42071wx, this);
    }

    public final void A00() {
        Throwable A01;
        if (getAndIncrement() == 0) {
            InterfaceC42071wx interfaceC42071wx = this.A04;
            InterfaceC136016Dg interfaceC136016Dg = this.A02;
            C6JD c6jd = this.A07;
            while (true) {
                if (!this.A09) {
                    if (this.A0A) {
                        interfaceC136016Dg.clear();
                        return;
                    }
                    if (!this.A08 && c6jd.get() != null) {
                        interfaceC136016Dg.clear();
                        this.A0A = true;
                        break;
                    }
                    boolean z = this.A0B;
                    try {
                        Object poll = interfaceC136016Dg.poll();
                        boolean A1Z = AbstractC25229BEm.A1Z(poll);
                        if (z) {
                            if (A1Z) {
                                this.A0A = true;
                                A01 = Y4X.A01(c6jd);
                                if (A01 == null) {
                                    interfaceC42071wx.onComplete();
                                    return;
                                }
                            }
                        } else if (A1Z) {
                        }
                        try {
                            Object apply = this.A05.apply(poll);
                            AbstractC42141x4.A01(apply, "The mapper returned a null ObservableSource");
                            InterfaceC42061ww interfaceC42061ww = (InterfaceC42061ww) apply;
                            if (interfaceC42061ww instanceof Callable) {
                                try {
                                    Object call = ((Callable) interfaceC42061ww).call();
                                    if (call != null && !this.A0A) {
                                        interfaceC42071wx.DVo(call);
                                    }
                                } catch (Throwable th) {
                                    AbstractC62281S5a.A00(th);
                                    Y4X.A02(th, c6jd);
                                }
                            } else {
                                this.A09 = true;
                                interfaceC42061ww.EpF(this.A06);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            AbstractC62281S5a.A00(th);
                            this.A0A = true;
                            this.A01.dispose();
                            interfaceC136016Dg.clear();
                            Y4X.A02(th, c6jd);
                            A01 = Y4X.A01(c6jd);
                            interfaceC42071wx.onError(A01);
                            return;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        AbstractC62281S5a.A00(th);
                        this.A0A = true;
                        this.A01.dispose();
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }
}
