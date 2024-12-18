package X;

import java.util.Iterator;

/* loaded from: classes9.dex */
public final class PP3 implements Runnable {
    public final /* synthetic */ P3S A00;

    public PP3(P3S p3s) {
        this.A00 = p3s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        double d;
        try {
            P3S p3s = this.A00;
            C54798OJr c54798OJr = p3s.A03;
            C47Z c47z = c54798OJr.A03;
            if (c47z != null) {
                C915347j c915347j = c47z.A6G.A00;
                synchronized (c915347j) {
                    d = c915347j.A02;
                }
            } else {
                d = 0.0d;
            }
            p3s.A00 = (int) ((C53416Nk5.A00(c54798OJr.A02) * c54798OJr.A00) + (d * 75.0d));
            Iterator A13 = AbstractC166997dE.A13(p3s.A04);
            while (A13.hasNext()) {
                ((C3O0) AbstractC166997dE.A0l(A13)).A0B(p3s);
            }
            if (p3s.A00 < 100) {
                p3s.A02.postDelayed(this, 1000L);
            }
        } catch (Throwable th) {
            P3S p3s2 = this.A00;
            if (p3s2.A00 < 100) {
                p3s2.A02.postDelayed(this, 1000L);
            }
            throw th;
        }
    }
}
