package X;

import java.util.concurrent.Callable;

/* renamed from: X.WyI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class CallableC71666WyI implements Callable {
    public final int A00;
    public final Object A01;

    public CallableC71666WyI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        if (this.A00 != 0) {
            C71182WpU c71182WpU = (C71182WpU) this.A01;
            synchronized (c71182WpU) {
                if (c71182WpU.A03 != null) {
                    while (c71182WpU.A02 > c71182WpU.A01) {
                        c71182WpU.A07((String) MSZ.A0m(AbstractC166997dE.A14(c71182WpU.A0A)));
                    }
                    if (C71182WpU.A06(c71182WpU)) {
                        C71182WpU.A01(c71182WpU);
                        c71182WpU.A00 = 0;
                    }
                }
            }
            return null;
        }
        C71183WpV c71183WpV = (C71183WpV) this.A01;
        synchronized (c71183WpV) {
            if (c71183WpV.A02 != null) {
                C71183WpV.A02(c71183WpV);
                if (C71183WpV.A08(c71183WpV)) {
                    C71183WpV.A03(c71183WpV);
                    c71183WpV.A00 = 0;
                }
            }
        }
        return null;
    }
}
