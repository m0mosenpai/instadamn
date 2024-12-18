package X;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes12.dex */
public final class YCQ implements YNq, YOv {
    public YRK A00;
    public int A01;
    public final YDP A02;
    public final AtomicReference A04 = new AtomicReference();
    public final C72726Xly A03 = new Object();

    @Override // X.YOv
    public final void D78(YRK yrk) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.YNq, java.lang.Object, X.YCP] */
    @Override // X.YOv
    public final void A78(YNr yNr, YRK yrk, Object obj) {
        int i;
        if (this.A00 != null) {
            if (this.A01 == 0) {
                this.A04.set(Thread.currentThread());
            }
            this.A01++;
            try {
                Iterator it = this.A02.iterator();
                while (it.hasNext()) {
                    YNw yNw = (YNw) it.next();
                    ?? obj2 = new Object();
                    obj2.A00 = this;
                    yNw.CuU(obj2, obj);
                }
                yNr.accept(obj);
                while (true) {
                    if (i + (-1) == 0) {
                        C72726Xly c72726Xly = this.A03;
                        C72764Xmg c72764Xmg = c72726Xly.A00;
                        if (c72764Xmg == null) {
                            this.A04.set(null);
                            return;
                        }
                        this.A01 = 1;
                        YRK yrk2 = this.A00;
                        C72764Xmg c72764Xmg2 = c72764Xmg.A00;
                        c72726Xly.A00 = c72764Xmg2;
                        if (c72764Xmg2 == null) {
                            c72726Xly.A01 = null;
                        }
                        yrk2.APm(c72764Xmg.A01);
                    } else {
                        return;
                    }
                }
            } finally {
                this.A01--;
            }
        } else {
            throw AbstractC166987dD.A18("setOuterStore must be called before the first dispatch");
        }
    }

    @Override // X.YNq
    public final void APm(Object obj) {
        if (this.A04.get() == Thread.currentThread()) {
            C72726Xly c72726Xly = this.A03;
            C72764Xmg c72764Xmg = new C72764Xmg(c72726Xly, obj);
            C72764Xmg c72764Xmg2 = c72726Xly.A01;
            if (c72764Xmg2 == null) {
                c72726Xly.A01 = c72764Xmg;
                c72726Xly.A00 = c72764Xmg;
                return;
            } else {
                c72764Xmg2.A00 = c72764Xmg;
                c72726Xly.A01 = c72764Xmg;
                return;
            }
        }
        this.A00.APm(obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.Xly, java.lang.Object] */
    public YCQ(YDP ydp) {
        this.A02 = new YDP(ydp);
    }
}
