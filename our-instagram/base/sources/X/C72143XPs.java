package X;

import java.util.List;

/* renamed from: X.XPs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72143XPs extends C5GB {
    @Override // X.C5GB
    public final boolean A0B() {
        return false;
    }

    @Override // X.C5GB
    public final void A06() {
        List list;
        C5GB c5gb;
        C56082hw c56082hw = this.A02;
        C3OH c3oh = (C3OH) c56082hw;
        int i = c3oh.A02;
        int i2 = c3oh.A03;
        int i3 = c3oh.A01;
        Y8R y8r = this.A04;
        if (i3 == 1) {
            if (i != -1) {
                y8r.A08.add(c56082hw.A0h.A0k.A04);
                this.A02.A0h.A0k.A04.A07.add(y8r);
            } else if (i2 != -1) {
                y8r.A08.add(c56082hw.A0h.A0k.A03);
                this.A02.A0h.A0k.A03.A07.add(y8r);
                i = -i2;
            } else {
                y8r.A09 = true;
                y8r.A08.add(c56082hw.A0h.A0k.A03);
                this.A02.A0h.A0k.A03.A07.add(y8r);
                Y8R y8r2 = this.A02.A0k.A04;
                list = y8r.A07;
                Y8R.A00(y8r2, y8r, list);
                c5gb = this.A02.A0k;
            }
            y8r.A00 = i;
            Y8R y8r22 = this.A02.A0k.A04;
            list = y8r.A07;
            Y8R.A00(y8r22, y8r, list);
            c5gb = this.A02.A0k;
        } else {
            if (i != -1) {
                y8r.A08.add(c56082hw.A0h.A0l.A04);
                this.A02.A0h.A0l.A04.A07.add(y8r);
            } else if (i2 != -1) {
                y8r.A08.add(c56082hw.A0h.A0l.A03);
                this.A02.A0h.A0l.A03.A07.add(y8r);
                i = -i2;
            } else {
                y8r.A09 = true;
                y8r.A08.add(c56082hw.A0h.A0l.A03);
                this.A02.A0h.A0l.A03.A07.add(y8r);
                Y8R y8r3 = this.A02.A0l.A04;
                list = y8r.A07;
                Y8R.A00(y8r3, y8r, list);
                c5gb = this.A02.A0l;
            }
            y8r.A00 = i;
            Y8R y8r32 = this.A02.A0l.A04;
            list = y8r.A07;
            Y8R.A00(y8r32, y8r, list);
            c5gb = this.A02.A0l;
        }
        Y8R.A00(c5gb.A03, y8r, list);
    }

    @Override // X.C5GB
    public final void A07() {
        C56082hw c56082hw = this.A02;
        int i = ((C3OH) c56082hw).A01;
        int i2 = this.A04.A02;
        if (i == 1) {
            c56082hw.A0V = i2;
        } else {
            c56082hw.A0W = i2;
        }
    }

    @Override // X.C5GB
    public final void A08() {
        this.A04.A01();
    }

    @Override // X.C5GB, X.C5GC
    public final void F9z(C5GC c5gc) {
        Y8R y8r = this.A04;
        if (y8r.A0A && !y8r.A0B) {
            y8r.A02((int) ((((Y8R) y8r.A08.get(0)).A02 * ((C3OH) this.A02).A00) + 0.5f));
        }
    }
}
