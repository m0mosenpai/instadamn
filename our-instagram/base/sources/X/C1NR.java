package X;

import java.io.File;
import java.util.Comparator;

/* renamed from: X.1NR, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1NR {
    public final C1NU A00;
    public final C1NV A01;
    public final Object A02 = new Object();

    public abstract void A00(String str);

    public abstract boolean A02(C1H2 c1h2, String str);

    public final void A01(String str, long j) {
        synchronized (this.A02) {
            C1NU c1nu = this.A00;
            CRP crp = (CRP) c1nu.A03.get(str);
            if (crp != null) {
                long j2 = crp.A01;
                crp.A01 = j;
                c1nu.A02 += j - j2;
                C1NU.A00(c1nu);
            }
        }
    }

    public C1NR(File file, Comparator comparator, int i) {
        this.A00 = new C1NU(i, comparator);
        this.A01 = new C1NV(this, file);
    }
}
