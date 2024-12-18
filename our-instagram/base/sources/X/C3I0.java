package X;

import java.util.LinkedList;
import java.util.List;

/* renamed from: X.3I0, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3I0 extends C1I2 {
    public long A00;
    public C56060Ouc A01;
    public C1EL A02;
    public C70013Cl A03;
    public long A04;

    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        int A03 = C0f9.A03(-282287672);
        long now = this.A02.now();
        long abs = this.A00 + Math.abs(i5);
        this.A00 = abs;
        C70013Cl c70013Cl = this.A03;
        double d = (abs * 1.0d) / (now - this.A04);
        synchronized (c70013Cl) {
            c70013Cl.A00 = d;
        }
        C0f9.A0A(1390822469, A03);
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        int i2;
        int A03 = C0f9.A03(-1737101365);
        if (i != 1 && i != 2) {
            if (i == 0) {
                C56060Ouc c56060Ouc = this.A01;
                if (c56060Ouc != null) {
                    long j = this.A00;
                    List list = c56060Ouc.A03;
                    if (list.size() < 200 && (i2 = (int) j) > 0) {
                        list.add(Integer.valueOf(i2));
                        c56060Ouc.A00++;
                    }
                }
                C70013Cl c70013Cl = this.A03;
                synchronized (c70013Cl) {
                    LinkedList linkedList = c70013Cl.A03;
                    if (!linkedList.isEmpty() && linkedList.getLast() != null && ((String) linkedList.getLast()).startsWith("MainFeedFragment.scrollToTopWithReason")) {
                        c70013Cl.A03("MainFeedFragment.scrollToTopFinished");
                    }
                }
            }
        } else {
            this.A04 = this.A02.now();
            this.A00 = 0L;
        }
        C0f9.A0A(2056838202, A03);
    }
}
