package X;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes12.dex */
public final class XMR extends YKa implements Runnable, YRQ {
    public int A00;
    public long A01;
    public InterfaceC136016Dg A02;
    public Throwable A03;
    public YP6 A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final AbstractC151006r1 A08;
    public final AtomicLong A09 = new AtomicLong();
    public final InterfaceC73610YPe A0A;
    public volatile boolean A0B;
    public volatile boolean A0C;

    @Override // X.InterfaceC136006Df
    public final int EJ7(int i) {
        if ((i & 2) != 0) {
            this.A05 = true;
            return 2;
        }
        return 0;
    }

    public final boolean A00(InterfaceC73610YPe interfaceC73610YPe, boolean z, boolean z2) {
        if (this.A0B) {
            clear();
            return true;
        }
        if (z) {
            Throwable th = this.A03;
            if (th != null) {
                this.A0B = true;
                clear();
                interfaceC73610YPe.onError(th);
            } else if (z2) {
                this.A0B = true;
                interfaceC73610YPe.onComplete();
            } else {
                return false;
            }
            this.A08.dispose();
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC73610YPe
    public final void DVo(Object obj) {
        if (!this.A0C) {
            if (this.A00 != 2 && !this.A02.offer(obj)) {
                this.A04.cancel();
                this.A03 = new RuntimeException("Queue is full?!");
                this.A0C = true;
            }
            if (getAndIncrement() == 0) {
                this.A08.A00(this);
            }
        }
    }

    @Override // X.InterfaceC73610YPe
    public final void Dpd(YP6 yp6) {
        int i;
        if (this.A04 != null) {
            yp6.cancel();
            AbstractC142886co.A02(new IllegalStateException("Subscription already set!"));
            return;
        }
        this.A04 = yp6;
        if (yp6 instanceof YRR) {
            InterfaceC136006Df interfaceC136006Df = (InterfaceC136006Df) yp6;
            int EJ7 = interfaceC136006Df.EJ7(7);
            if (EJ7 == 1) {
                this.A00 = 1;
                this.A02 = interfaceC136006Df;
                this.A0C = true;
                this.A0A.Dpd(this);
                return;
            }
            if (EJ7 == 2) {
                this.A00 = 2;
                this.A02 = interfaceC136006Df;
                this.A0A.Dpd(this);
                i = this.A07;
                yp6.EIy(i);
            }
        }
        i = this.A07;
        this.A02 = new C207659Gt(i);
        this.A0A.Dpd(this);
        yp6.EIy(i);
    }

    @Override // X.YP6
    public final void EIy(long j) {
        if (j <= 0) {
            AbstractC142886co.A02(AbstractC166987dD.A12(AnonymousClass001.A0Q("n > 0 required but it was ", j)));
            return;
        }
        XMU.A00(this.A09, j);
        if (getAndIncrement() != 0) {
            return;
        }
        this.A08.A00(this);
    }

    @Override // X.YP6
    public final void cancel() {
        if (!this.A0B) {
            this.A0B = true;
            this.A04.cancel();
            this.A08.dispose();
            if (getAndIncrement() == 0) {
                this.A02.clear();
            }
        }
    }

    @Override // X.InterfaceC136016Dg
    public final void clear() {
        this.A02.clear();
    }

    @Override // X.InterfaceC136016Dg
    public final boolean isEmpty() {
        return this.A02.isEmpty();
    }

    @Override // X.InterfaceC73610YPe
    public final void onComplete() {
        if (!this.A0C) {
            this.A0C = true;
            if (getAndIncrement() == 0) {
                this.A08.A00(this);
            }
        }
    }

    @Override // X.InterfaceC73610YPe
    public final void onError(Throwable th) {
        if (this.A0C) {
            AbstractC142886co.A02(th);
            return;
        }
        this.A03 = th;
        this.A0C = true;
        if (getAndIncrement() != 0) {
            return;
        }
        this.A08.A00(this);
    }

    @Override // X.InterfaceC136016Dg
    public final Object poll() {
        Object poll = this.A02.poll();
        if (poll != null && this.A00 != 1) {
            long j = this.A01 + 1;
            if (j == this.A06) {
                this.A01 = 0L;
                this.A04.EIy(j);
            } else {
                this.A01 = j;
                return poll;
            }
        }
        return poll;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0058, code lost:
    
        if (r13.A0B != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x005e, code lost:
    
        if (r8.isEmpty() != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0060, code lost:
    
        r0 = get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0064, code lost:
    
        if (r5 != r0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0070, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0066, code lost:
    
        r13.A01 = r1;
        r5 = addAndGet(-r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x006d, code lost:
    
        if (r5 != 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x006f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XMR.run():void");
    }

    public XMR(AbstractC151006r1 abstractC151006r1, InterfaceC73610YPe interfaceC73610YPe, int i) {
        this.A08 = abstractC151006r1;
        this.A07 = i;
        this.A06 = i - (i >> 2);
        this.A0A = interfaceC73610YPe;
    }
}
