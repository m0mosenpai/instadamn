package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.XPt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72144XPt extends C5GB {
    @Override // X.C5GB
    public final void A08() {
        this.A06 = null;
        this.A04.A01();
    }

    @Override // X.C5GB
    public final boolean A0B() {
        return false;
    }

    @Override // X.C5GB
    public final void A06() {
        List list;
        C5GB c5gb;
        C56082hw c56082hw = this.A02;
        if (c56082hw instanceof C3O6) {
            Y8R y8r = this.A04;
            y8r.A09 = true;
            C3O6 c3o6 = (C3O6) c56082hw;
            int i = c3o6.A00;
            boolean z = c3o6.A02;
            int i2 = 0;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            y8r.A06 = C05F.A0u;
                            while (i2 < ((C3O7) c3o6).A00) {
                                C56082hw c56082hw2 = ((C3O7) c3o6).A01[i2];
                                if (z || c56082hw2.A0R != 8) {
                                    Y8R y8r2 = c56082hw2.A0l.A03;
                                    Y8R.A00(y8r, y8r2, y8r2.A07);
                                }
                                i2++;
                            }
                        } else {
                            return;
                        }
                    } else {
                        y8r.A06 = C05F.A0j;
                        while (i2 < ((C3O7) c3o6).A00) {
                            C56082hw c56082hw3 = ((C3O7) c3o6).A01[i2];
                            if (z || c56082hw3.A0R != 8) {
                                Y8R y8r3 = c56082hw3.A0l.A04;
                                Y8R.A00(y8r, y8r3, y8r3.A07);
                            }
                            i2++;
                        }
                    }
                    Y8R y8r4 = this.A02.A0l.A04;
                    list = y8r.A07;
                    Y8R.A00(y8r4, y8r, list);
                    c5gb = this.A02.A0l;
                    Y8R.A00(c5gb.A03, y8r, list);
                }
                y8r.A06 = C05F.A0Y;
                while (i2 < ((C3O7) c3o6).A00) {
                    C56082hw c56082hw4 = ((C3O7) c3o6).A01[i2];
                    if (z || c56082hw4.A0R != 8) {
                        Y8R y8r5 = c56082hw4.A0k.A03;
                        Y8R.A00(y8r, y8r5, y8r5.A07);
                    }
                    i2++;
                }
            } else {
                y8r.A06 = C05F.A0N;
                while (i2 < ((C3O7) c3o6).A00) {
                    C56082hw c56082hw5 = ((C3O7) c3o6).A01[i2];
                    if (z || c56082hw5.A0R != 8) {
                        Y8R y8r6 = c56082hw5.A0k.A04;
                        Y8R.A00(y8r, y8r6, y8r6.A07);
                    }
                    i2++;
                }
            }
            Y8R y8r7 = this.A02.A0k.A04;
            list = y8r.A07;
            Y8R.A00(y8r7, y8r, list);
            c5gb = this.A02.A0k;
            Y8R.A00(c5gb.A03, y8r, list);
        }
    }

    @Override // X.C5GB
    public final void A07() {
        C56082hw c56082hw = this.A02;
        if (c56082hw instanceof C3O6) {
            int i = ((C3O6) c56082hw).A00;
            if (i != 0 && i != 1) {
                c56082hw.A0W = this.A04.A02;
            } else {
                c56082hw.A0V = this.A04.A02;
            }
        }
    }

    @Override // X.C5GB, X.C5GC
    public final void F9z(C5GC c5gc) {
        int i;
        C3O6 c3o6 = (C3O6) this.A02;
        int i2 = c3o6.A00;
        Y8R y8r = this.A04;
        Iterator it = y8r.A08.iterator();
        int i3 = 0;
        int i4 = -1;
        while (it.hasNext()) {
            int i5 = ((Y8R) it.next()).A02;
            if (i4 == -1 || i5 < i4) {
                i4 = i5;
            }
            if (i3 < i5) {
                i3 = i5;
            }
        }
        if (i2 != 0 && i2 != 2) {
            i = i3 + c3o6.A01;
        } else {
            i = i4 + c3o6.A01;
        }
        y8r.A02(i);
    }
}
