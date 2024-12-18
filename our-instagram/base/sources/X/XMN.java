package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes12.dex */
public final class XMN extends AtomicInteger implements InterfaceC41801wU {
    public int A00;
    public int A01;
    public Object[] A02;
    public final InterfaceC42071wx A03;
    public final C6D4 A04;
    public final C137416Km A05;
    public final C6JD A06 = new AtomicReference();
    public final XMO[] A07;
    public volatile boolean A08;
    public volatile boolean A09;

    public final void A02(int i, Object obj) {
        boolean z;
        synchronized (this) {
            Object[] objArr = this.A02;
            if (objArr == null) {
                return;
            }
            Object obj2 = objArr[i];
            int i2 = this.A00;
            if (obj2 == null) {
                i2++;
                this.A00 = i2;
            }
            objArr[i] = obj;
            if (i2 == objArr.length) {
                this.A05.offer(objArr.clone());
                z = true;
            } else {
                z = false;
            }
            if (z) {
                A01();
            }
        }
    }

    public final void A03(C137416Km c137416Km) {
        synchronized (this) {
            this.A02 = null;
        }
        c137416Km.clear();
    }

    public final void A00() {
        for (XMO xmo : this.A07) {
            C6KP.A01(xmo);
        }
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        if (!this.A08) {
            this.A08 = true;
            A00();
            if (getAndIncrement() == 0) {
                A03(this.A05);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.6JD, java.util.concurrent.atomic.AtomicReference] */
    public XMN(InterfaceC42071wx interfaceC42071wx, C6D4 c6d4, int i, int i2) {
        this.A03 = interfaceC42071wx;
        this.A04 = c6d4;
        this.A02 = new Object[i];
        XMO[] xmoArr = new XMO[i];
        for (int i3 = 0; i3 < i; i3++) {
            xmoArr[i3] = new XMO(this, i3);
        }
        this.A07 = xmoArr;
        this.A05 = new C137416Km(i2);
    }

    public final void A01() {
        Throwable A01;
        if (getAndIncrement() == 0) {
            C137416Km c137416Km = this.A05;
            InterfaceC42071wx interfaceC42071wx = this.A03;
            int i = 1;
            while (!this.A08) {
                C6JD c6jd = this.A06;
                if (c6jd.get() != null) {
                    A00();
                    A03(c137416Km);
                    A01 = Y4X.A01(c6jd);
                } else {
                    boolean z = this.A09;
                    Object poll = c137416Km.poll();
                    boolean z2 = false;
                    if (poll == null) {
                        z2 = true;
                    }
                    try {
                        if (z) {
                            if (z2) {
                                A03(c137416Km);
                                A01 = Y4X.A01(c6jd);
                                if (A01 == null) {
                                    interfaceC42071wx.onComplete();
                                    return;
                                }
                            }
                        } else if (z2) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        }
                        Object apply = this.A04.apply(poll);
                        AbstractC42141x4.A01(apply, "The combiner returned a null value");
                        interfaceC42071wx.DVo(apply);
                    } catch (Throwable th) {
                        AbstractC62281S5a.A00(th);
                        Y4X.A02(th, c6jd);
                        A00();
                        A03(c137416Km);
                        interfaceC42071wx.onError(Y4X.A01(c6jd));
                        return;
                    }
                }
                interfaceC42071wx.onError(A01);
                return;
            }
            A03(c137416Km);
        }
    }
}
