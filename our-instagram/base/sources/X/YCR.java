package X;

import java.util.Iterator;

/* loaded from: classes12.dex */
public final class YCR implements YNq, YOv {
    public YRK A00;
    public final C73296Xzl A03 = new C73296Xzl();
    public final C73296Xzl A04 = new C73296Xzl();
    public int A02 = 0;
    public final C72726Xly A05 = new Object();
    public int A01 = 1;

    public final C72806XnT A00(YOu yOu, C72806XnT c72806XnT) {
        this.A01++;
        C72806XnT c72806XnT2 = new C72806XnT(yOu, this, c72806XnT);
        if (c72806XnT2.A01 == null) {
            c72806XnT2.A01 = new Y3U(c72806XnT2.A03, c72806XnT2.A05);
        }
        C73296Xzl.A00(this.A04).A00(c72806XnT2.A05);
        return c72806XnT2;
    }

    @Override // X.YOv
    public final void A78(YNr yNr, YRK yrk, Object obj) {
        C72726Xly c72726Xly;
        C72764Xmg c72764Xmg;
        this.A02++;
        yNr.accept(obj);
        C73296Xzl c73296Xzl = this.A03;
        YDP ydp = c73296Xzl.A01;
        c73296Xzl.A00 = ydp;
        Iterator it = ydp.iterator();
        while (it.hasNext()) {
            C72760Xmc c72760Xmc = (C72760Xmc) it.next();
            YD9 yd9 = c72760Xmc.A02;
            if (yd9.A00 != null && yd9.A01.CWt(obj)) {
                C73296Xzl.A00(c72760Xmc.A01.A00.A04.A03).A00.remove(c72760Xmc);
                yd9.A00 = null;
                c72760Xmc.A00.DD3(obj);
            }
        }
        while (true) {
            int i = this.A02 - 1;
            this.A02 = i;
            if (i != 0 || (c72764Xmg = (c72726Xly = this.A05).A00) == null) {
                break;
            }
            this.A02 = 1;
            C72764Xmg c72764Xmg2 = c72764Xmg.A00;
            c72726Xly.A00 = c72764Xmg2;
            if (c72764Xmg2 == null) {
                c72726Xly.A01 = null;
            }
            ((Runnable) c72764Xmg.A01).run();
        }
        c73296Xzl.A00 = c73296Xzl.A01;
    }

    @Override // X.YNq
    public final void APm(Object obj) {
        this.A00.APm(obj);
    }

    @Override // X.YOv
    public final void D78(YRK yrk) {
        this.A00 = yrk;
    }
}
