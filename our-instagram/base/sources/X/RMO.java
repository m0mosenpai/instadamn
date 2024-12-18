package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class RMO extends AbstractC64527TId {
    public final int A00;
    public final RLz A01;

    public final int hashCode() {
        return AbstractC37301Gc2.A02(4, this.A01);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AbstractC64527TId abstractC64527TId = (AbstractC64527TId) obj;
        int A02 = abstractC64527TId.A02();
        if (4 != A02) {
            return 4 - A02;
        }
        RLz rLz = this.A01;
        int size = rLz.size();
        RLz rLz2 = ((RMO) abstractC64527TId).A01;
        if (size != rLz2.size()) {
            return rLz.size() - rLz2.size();
        }
        for (int i = 0; i < rLz.size(); i++) {
            int compareTo = ((AbstractC64527TId) rLz.get(i)).compareTo(rLz2.get(i));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((RMO) obj).A01);
    }

    public final String toString() {
        RLz rLz = this.A01;
        if (rLz.isEmpty()) {
            return "[]";
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        int size = rLz.size();
        for (int i = 0; i < size; i++) {
            A1E.add(rLz.get(i).toString().replace("\n", "\n  "));
        }
        StringBuilder A0s = AbstractC58318PtA.A0s("[\n  ");
        Iterator it = A1E.iterator();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                A0s.append(AbstractC58323PtF.A0f(next, next));
                while (it.hasNext()) {
                    A0s.append((CharSequence) ",\n  ");
                    Object next2 = it.next();
                    A0s.append(AbstractC58323PtF.A0f(next2, next2));
                }
            }
            return AbstractC166997dE.A0x("\n]", A0s);
        } catch (IOException e) {
            throw AbstractC58318PtA.A0W(e);
        }
    }

    public RMO(RLz rLz) {
        this.A01 = rLz;
        int i = 0;
        int i2 = 0;
        while (true) {
            RLz rLz2 = this.A01;
            if (i >= rLz2.size()) {
                break;
            }
            int A03 = ((AbstractC64527TId) rLz2.get(i)).A03();
            if (i2 < A03) {
                i2 = A03;
            }
            i++;
        }
        int i3 = i2 + 1;
        this.A00 = i3;
        if (i3 <= 8) {
        } else {
            throw new IOException("Exceeded cutoff limit for max depth of cbor value");
        }
    }
}
