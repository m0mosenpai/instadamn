package X;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.PtW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C58336PtW implements Iterable {
    public C58345Ptg A01;
    public C58345Ptg A02;
    public final WeakHashMap A03 = new WeakHashMap();
    public int A00 = 0;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C58336PtW) {
            C58336PtW c58336PtW = (C58336PtW) obj;
            if (this.A00 == c58336PtW.A00) {
                Iterator it = iterator();
                Iterator it2 = c58336PtW.iterator();
                while (it.hasNext() && it2.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(it);
                    Object next = it2.next();
                    if (A1K == null) {
                        if (next == null) {
                        }
                    } else if (!A1K.equals(next)) {
                        return false;
                    }
                }
                return (it.hasNext() || it2.hasNext()) ? false : true;
            }
        }
        return false;
    }

    public final int A00() {
        return this.A00;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.3Tq, X.2Zr, java.lang.Object] */
    public final C74023Tq A01() {
        C58345Ptg c58345Ptg = this.A01;
        C58345Ptg c58345Ptg2 = this.A02;
        ?? obj = new Object();
        obj.A00 = c58345Ptg2;
        obj.A01 = c58345Ptg;
        this.A03.put(obj, false);
        return obj;
    }

    public final C58345Ptg A02() {
        return this.A02;
    }

    public final C58345Ptg A03() {
        return this.A01;
    }

    public C58345Ptg A04(Object obj) {
        C58345Ptg c58345Ptg = this.A02;
        while (c58345Ptg != null && !c58345Ptg.A02.equals(obj)) {
            c58345Ptg = c58345Ptg.A00;
        }
        return c58345Ptg;
    }

    public final C211611s A05() {
        C211611s c211611s = new C211611s(this);
        this.A03.put(c211611s, false);
        return c211611s;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Iterator, X.2Zr, java.lang.Object] */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C58345Ptg c58345Ptg = this.A02;
        C58345Ptg c58345Ptg2 = this.A01;
        ?? obj = new Object();
        obj.A00 = c58345Ptg2;
        obj.A01 = c58345Ptg;
        this.A03.put(obj, false);
        return obj;
    }

    public Object A06(Object obj) {
        C58345Ptg A04 = A04(obj);
        if (A04 == null) {
            return null;
        }
        this.A00--;
        WeakHashMap weakHashMap = this.A03;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC211711t) it.next()).A00(A04);
            }
        }
        C58345Ptg c58345Ptg = A04.A01;
        C58345Ptg c58345Ptg2 = A04.A00;
        if (c58345Ptg != null) {
            c58345Ptg.A00 = c58345Ptg2;
        } else {
            this.A02 = c58345Ptg2;
        }
        C58345Ptg c58345Ptg3 = A04.A00;
        if (c58345Ptg3 != null) {
            c58345Ptg3.A01 = c58345Ptg;
        } else {
            this.A01 = c58345Ptg;
        }
        A04.A00 = null;
        A04.A01 = null;
        return A04.A03;
    }

    public Object A07(Object obj, Object obj2) {
        C58345Ptg A04 = A04(obj);
        if (A04 != null) {
            return A04.A03;
        }
        C58345Ptg c58345Ptg = new C58345Ptg(obj, obj2);
        this.A00++;
        C58345Ptg c58345Ptg2 = this.A01;
        if (c58345Ptg2 == null) {
            this.A02 = c58345Ptg;
        } else {
            c58345Ptg2.A00 = c58345Ptg;
            c58345Ptg.A01 = c58345Ptg2;
        }
        this.A01 = c58345Ptg;
        return null;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += AbstractC166987dD.A1K(it).hashCode();
        }
        return i;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            AbstractC58318PtA.A1V(A1C, it.next());
            if (it.hasNext()) {
                AbstractC58318PtA.A1S(A1C);
            }
        }
        return AbstractC58319PtB.A0w(A1C);
    }
}
