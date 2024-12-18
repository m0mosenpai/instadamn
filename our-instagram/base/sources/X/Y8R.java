package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public class Y8R implements C5GC {
    public int A00;
    public int A02;
    public C5GB A05;
    public C5GC A03 = null;
    public boolean A09 = false;
    public boolean A0A = false;
    public Integer A06 = C05F.A00;
    public int A01 = 1;
    public XPr A04 = null;
    public boolean A0B = false;
    public List A07 = AbstractC166987dD.A1E();
    public List A08 = AbstractC166987dD.A1E();

    public final void A01() {
        this.A08.clear();
        this.A07.clear();
        this.A0B = false;
        this.A02 = 0;
        this.A0A = false;
        this.A09 = false;
    }

    public final void A02(int i) {
        if (!this.A0B) {
            this.A0B = true;
            this.A02 = i;
            for (C5GC c5gc : this.A07) {
                c5gc.F9z(c5gc);
            }
        }
    }

    public final void A03(C5GC c5gc) {
        this.A07.add(c5gc);
        if (this.A0B) {
            c5gc.F9z(c5gc);
        }
    }

    @Override // X.C5GC
    public final void F9z(C5GC c5gc) {
        List<Y8R> list = this.A08;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((Y8R) it.next()).A0B) {
                return;
            }
        }
        this.A0A = true;
        C5GC c5gc2 = this.A03;
        if (c5gc2 != null) {
            c5gc2.F9z(this);
        }
        if (this.A09) {
            this.A05.F9z(this);
            return;
        }
        Y8R y8r = null;
        int i = 0;
        for (Y8R y8r2 : list) {
            if (!(y8r2 instanceof XPr)) {
                i++;
                y8r = y8r2;
            }
        }
        if (y8r != null && i == 1 && y8r.A0B) {
            XPr xPr = this.A04;
            if (xPr != null) {
                if (!xPr.A0B) {
                    return;
                } else {
                    this.A00 = this.A01 * xPr.A02;
                }
            }
            A02(y8r.A02 + this.A00);
        }
        C5GC c5gc3 = this.A03;
        if (c5gc3 == null) {
            return;
        }
        c5gc3.F9z(this);
    }

    public Y8R(C5GB c5gb) {
        this.A05 = c5gb;
    }

    public static void A00(Y8R y8r, Object obj, List list) {
        list.add(y8r);
        y8r.A08.add(obj);
    }

    public final String toString() {
        String str;
        Object obj;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(this.A05.A02.A0n);
        A1C.append(":");
        switch (this.A06.intValue()) {
            case 0:
                str = "UNKNOWN";
                break;
            case 1:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 2:
                str = "VERTICAL_DIMENSION";
                break;
            case 3:
                str = "LEFT";
                break;
            case 4:
                str = "RIGHT";
                break;
            case 5:
                str = "TOP";
                break;
            case 6:
                str = "BOTTOM";
                break;
            default:
                str = "BASELINE";
                break;
        }
        A1C.append(str);
        A1C.append("(");
        if (this.A0B) {
            obj = Integer.valueOf(this.A02);
        } else {
            obj = "unresolved";
        }
        A1C.append(obj);
        A1C.append(") <t=");
        A1C.append(this.A08.size());
        A1C.append(":d=");
        A1C.append(this.A07.size());
        return AbstractC166997dE.A0x(">", A1C);
    }
}
