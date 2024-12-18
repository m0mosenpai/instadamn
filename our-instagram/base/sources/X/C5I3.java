package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.5I3, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5I3 implements C5I4 {
    public C5I5 A03 = C5I5.A07;
    public int A00 = -1;
    public long A01 = -1;
    public long A02 = -1;

    @Override // X.C5I4
    public Integer Awh() {
        return null;
    }

    @Override // X.C5I4
    public final int BIC() {
        if (this instanceof C5ID) {
            return ((C5ID) this).A00;
        }
        if (this instanceof C5IE) {
            return ((C5IE) this).A00;
        }
        return this.A00;
    }

    @Override // X.C5I4
    public final long BIE() {
        if (this instanceof C5IE) {
            return ((C5IE) this).A01;
        }
        if (this instanceof C5ID) {
            return ((C5ID) this).A01;
        }
        return this.A01;
    }

    @Override // X.C5I4
    public final int BVI() {
        if (this instanceof C5ID) {
            return ((C5ID) this).A04;
        }
        return 0;
    }

    @Override // X.C5I4
    public final long BsG() {
        if (this instanceof C5IE) {
            return ((C5IE) this).A02;
        }
        if (this instanceof C5ID) {
            return ((C5ID) this).A02;
        }
        return this.A02;
    }

    @Override // X.C5I4
    public final C5I5 C03() {
        if (this instanceof C5ID) {
            return ((C5ID) this).A03;
        }
        if (this instanceof C5IE) {
            return ((C5IE) this).A03;
        }
        return this.A03;
    }

    @Override // X.C5I4
    public final boolean CWh() {
        C5I5 c5i5 = C5I5.A06;
        C5I5 C03 = C03();
        if (c5i5 != C03 && C5I5.A03 != C03) {
            return false;
        }
        return true;
    }

    @Override // X.C5I4
    public final void EWC(int i) {
        if (this instanceof C5ID) {
            C5ID c5id = (C5ID) this;
            List list = c5id.A05;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((C5I4) it.next()).EWC(i);
                }
            }
            c5id.A00 = i;
            return;
        }
        if (this instanceof C5IE) {
            C5IE c5ie = (C5IE) this;
            List list2 = c5ie.A04;
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    ((C5I4) it2.next()).EWC(i);
                }
            }
            c5ie.A00 = i;
            return;
        }
        this.A00 = i;
    }

    @Override // X.C5I4
    public final void EWD(long j) {
        if (this instanceof C5ID) {
            C5ID c5id = (C5ID) this;
            List list = c5id.A05;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((C5I4) it.next()).EWD(j);
                }
            }
            c5id.A01 = j;
            return;
        }
        if (this instanceof C5IE) {
            C5IE c5ie = (C5IE) this;
            List list2 = c5ie.A04;
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    ((C5I4) it2.next()).EWD(j);
                }
            }
            c5ie.A01 = j;
            return;
        }
        this.A01 = j;
    }

    @Override // X.C5I4
    public final void EdQ(long j) {
        if (this instanceof C5ID) {
            C5ID c5id = (C5ID) this;
            List list = c5id.A05;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((C5I4) it.next()).EdQ(j);
                }
            }
            c5id.A02 = j;
            return;
        }
        if (this instanceof C5IE) {
            C5IE c5ie = (C5IE) this;
            List list2 = c5ie.A04;
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    ((C5I4) it2.next()).EdQ(j);
                }
            }
            c5ie.A02 = j;
            return;
        }
        this.A02 = j;
    }

    @Override // X.C5I4
    public final void Eek(C5I5 c5i5) {
        if (this instanceof C5ID) {
            C5ID c5id = (C5ID) this;
            C14360o3.A0B(c5i5, 0);
            List list = c5id.A05;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((C5I4) it.next()).Eek(c5i5);
                }
            }
            c5id.A03 = c5i5;
            return;
        }
        if (this instanceof C5IE) {
            C5IE c5ie = (C5IE) this;
            C14360o3.A0B(c5i5, 0);
            List list2 = c5ie.A04;
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    ((C5I4) it2.next()).Eek(c5i5);
                }
            }
            c5ie.A03 = c5i5;
            return;
        }
        C14360o3.A0B(c5i5, 0);
        this.A03 = c5i5;
    }
}
