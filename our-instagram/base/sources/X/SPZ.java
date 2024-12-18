package X;

import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SPZ {
    public final C62897SWd A00 = new C62897SWd(null);
    public final Map A01 = AbstractC166987dD.A1G();

    public final Object A00() {
        int size;
        Object remove;
        C62897SWd c62897SWd = this.A00;
        while (true) {
            c62897SWd = c62897SWd.A01;
            if (!c62897SWd.equals(c62897SWd)) {
                List list = c62897SWd.A02;
                if (list != null && (size = list.size()) > 0 && (remove = c62897SWd.A02.remove(size - 1)) != null) {
                    return remove;
                }
                C62897SWd c62897SWd2 = c62897SWd.A01;
                c62897SWd2.A00 = c62897SWd.A00;
                c62897SWd.A00.A01 = c62897SWd2;
                Map map = this.A01;
                Object obj = c62897SWd.A03;
                map.remove(obj);
                ((InterfaceC65322Ti2) obj).Cts();
            } else {
                return null;
            }
        }
    }

    public final Object A01(InterfaceC65322Ti2 interfaceC65322Ti2) {
        int size;
        Map map = this.A01;
        C62897SWd c62897SWd = (C62897SWd) map.get(interfaceC65322Ti2);
        if (c62897SWd == null) {
            c62897SWd = new C62897SWd(interfaceC65322Ti2);
            map.put(interfaceC65322Ti2, c62897SWd);
        } else {
            interfaceC65322Ti2.Cts();
        }
        C62897SWd c62897SWd2 = c62897SWd.A01;
        c62897SWd2.A00 = c62897SWd.A00;
        c62897SWd.A00.A01 = c62897SWd2;
        C62897SWd c62897SWd3 = this.A00;
        c62897SWd.A01 = c62897SWd3;
        C62897SWd c62897SWd4 = c62897SWd3.A00;
        c62897SWd.A00 = c62897SWd4;
        c62897SWd4.A01 = c62897SWd;
        c62897SWd.A01.A00 = c62897SWd;
        List list = c62897SWd.A02;
        if (list != null && (size = list.size()) > 0) {
            return c62897SWd.A02.remove(size - 1);
        }
        return null;
    }

    public final void A02(InterfaceC65322Ti2 interfaceC65322Ti2, Object obj) {
        Map map = this.A01;
        C62897SWd c62897SWd = (C62897SWd) map.get(interfaceC65322Ti2);
        if (c62897SWd == null) {
            c62897SWd = new C62897SWd(interfaceC65322Ti2);
            C62897SWd c62897SWd2 = c62897SWd.A01;
            c62897SWd2.A00 = c62897SWd.A00;
            c62897SWd.A00.A01 = c62897SWd2;
            C62897SWd c62897SWd3 = this.A00;
            c62897SWd.A01 = c62897SWd3.A01;
            c62897SWd.A00 = c62897SWd3;
            c62897SWd3.A01 = c62897SWd;
            c62897SWd.A01.A00 = c62897SWd;
            map.put(interfaceC65322Ti2, c62897SWd);
        } else {
            interfaceC65322Ti2.Cts();
        }
        List list = c62897SWd.A02;
        if (list == null) {
            list = AbstractC166987dD.A1E();
            c62897SWd.A02 = list;
        }
        list.add(obj);
    }

    public final String toString() {
        int i;
        StringBuilder A0s = AbstractC58318PtA.A0s("GroupedLinkedMap( ");
        C62897SWd c62897SWd = this.A00;
        boolean z = false;
        for (C62897SWd c62897SWd2 = c62897SWd.A00; !c62897SWd2.equals(c62897SWd); c62897SWd2 = c62897SWd2.A00) {
            z = true;
            A0s.append('{');
            A0s.append(c62897SWd2.A03);
            A0s.append(':');
            List list = c62897SWd2.A02;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            A0s.append(i);
            A0s.append("}, ");
        }
        if (z) {
            A0s.delete(A0s.length() - 2, A0s.length());
        }
        return AbstractC166997dE.A0x(" )", A0s);
    }
}
