package X;

import java.io.File;
import java.util.HashMap;

/* renamed from: X.1NQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1NQ extends C1NR {
    public final long A00;

    @Override // X.C1NR
    public final boolean A02(C1H2 c1h2, String str) {
        boolean z;
        synchronized (this.A02) {
            C1NU c1nu = super.A00;
            C14360o3.A0B(str, 0);
            HashMap hashMap = c1nu.A03;
            CRP crp = (CRP) hashMap.get(str);
            z = false;
            if (crp != null) {
                if (crp.A00 < System.currentTimeMillis()) {
                    CRP crp2 = (CRP) hashMap.remove(str);
                    if (crp2 != null) {
                        c1nu.A02 -= crp2.A01;
                        c1nu.A04.remove(crp2);
                    }
                } else {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Comparator] */
    public C1NQ(File file, int i) {
        super(file, new Object(), i);
        this.A00 = 604800000L;
    }

    @Override // X.C1NR
    public final void A00(String str) {
        long currentTimeMillis = System.currentTimeMillis() + this.A00;
        synchronized (this.A02) {
            super.A00.A01(new CRP(str, currentTimeMillis), str);
        }
    }
}
