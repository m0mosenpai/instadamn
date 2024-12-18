package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.4ss, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC107474ss {
    public Object A00;
    public CopyOnWriteArrayList A01 = new CopyOnWriteArrayList();

    public final void A02() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
        int size = copyOnWriteArrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C42N) copyOnWriteArrayList.get(size)).D1y(this);
            } else {
                return;
            }
        }
    }

    public final void A03() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
        int size = copyOnWriteArrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C42N) copyOnWriteArrayList.get(size)).DH4(this);
            } else {
                return;
            }
        }
    }

    public final void A04() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
        int size = copyOnWriteArrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C42N) copyOnWriteArrayList.get(size)).DiR(this);
            } else {
                return;
            }
        }
    }

    public final void A05() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
        int size = copyOnWriteArrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C42N) copyOnWriteArrayList.get(size)).E24(this);
            } else {
                return;
            }
        }
    }

    public final boolean A06() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
        for (int size = copyOnWriteArrayList.size() - 1; size >= 0; size--) {
            if (!((C42N) copyOnWriteArrayList.get(size)).Ejs(this)) {
                return false;
            }
        }
        return true;
    }

    public void A07() {
        if (this instanceof AbstractC107464sr) {
            A04();
            return;
        }
        C107584t3 c107584t3 = (C107584t3) this;
        c107584t3.A04();
        List list = c107584t3.A07;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC107474ss) list.get(i)).A07();
        }
    }

    public void A08() {
        if (this instanceof AbstractC107464sr) {
            C107534sy c107534sy = ((AbstractC107464sr) this).A00;
            if (c107534sy.A02) {
                c107534sy.A00();
                return;
            }
            return;
        }
        C107584t3 c107584t3 = (C107584t3) this;
        if (!c107584t3.A03) {
            return;
        }
        c107584t3.A03 = false;
        c107584t3.A01 = null;
        List list = c107584t3.A07;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC107474ss abstractC107474ss = (AbstractC107474ss) list.get(i);
            if (abstractC107474ss.A0B()) {
                abstractC107474ss.A08();
            }
        }
    }

    public void A09(C42Q c42q) {
        AbstractC107574t2 abstractC107574t2;
        if (this instanceof AbstractC107464sr) {
            AbstractC107464sr abstractC107464sr = (AbstractC107464sr) this;
            if (!abstractC107464sr.A06()) {
                abstractC107464sr.A02();
                return;
            }
            abstractC107464sr.A05();
            abstractC107464sr.A0C(c42q);
            C107534sy c107534sy = abstractC107464sr.A00;
            C107544sz c107544sz = c107534sy.A04;
            int i = 0;
            while (true) {
                ArrayList arrayList = c107544sz.A00;
                if (i < arrayList.size()) {
                    AbstractC107574t2 abstractC107574t22 = (AbstractC107574t2) arrayList.get(i);
                    AbstractC107574t2 abstractC107574t23 = (AbstractC107574t2) c107544sz.A02.get(i);
                    String str = (String) c107544sz.A01.get(i);
                    Map map = abstractC107574t23.A03;
                    if (map != null && (abstractC107574t2 = (AbstractC107574t2) map.get(str)) != null) {
                        C107544sz.A00(abstractC107574t2, abstractC107574t23, str);
                    }
                    ArrayList arrayList2 = abstractC107574t22.A02;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        abstractC107574t22.A02 = arrayList2;
                    }
                    arrayList2.add(abstractC107574t23);
                    Map map2 = abstractC107574t23.A03;
                    if (map2 == null) {
                        map2 = new LinkedHashMap();
                        abstractC107574t23.A03 = map2;
                    }
                    map2.put(str, abstractC107574t22);
                    i++;
                } else {
                    c107534sy.A01 = true;
                    c107534sy.A02 = true;
                    c107534sy.A03.A00(c107534sy);
                    return;
                }
            }
        } else {
            C107584t3 c107584t3 = (C107584t3) this;
            if (!c107584t3.A02) {
                c107584t3.A02 = true;
                c107584t3.A01 = c42q;
                if (!c107584t3.A06()) {
                    c107584t3.A02();
                    return;
                }
                c107584t3.A05();
                c107584t3.A03 = true;
                List list = c107584t3.A07;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((AbstractC107474ss) it.next()).A01.add(c107584t3.A06);
                }
                if (c107584t3.A05 == 0) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((AbstractC107474ss) list.get(i2)).A09(c107584t3.A01);
                    }
                    c107584t3.A00 = list.size();
                    return;
                }
                int size2 = list.size();
                for (int i3 = 1; i3 < size2; i3++) {
                    ((AbstractC107474ss) list.get(i3)).A07();
                }
                C107584t3.A01(c107584t3);
                return;
            }
            throw new RuntimeException(AbstractC111324zv.A00(1801));
        }
    }

    public void A0A(ArrayList arrayList) {
        if (this instanceof C107454sq) {
            arrayList.add(((C107454sq) this).A02);
            return;
        }
        List list = ((C107584t3) this).A07;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC107474ss) list.get(i)).A0A(arrayList);
        }
    }

    public boolean A0B() {
        if (this instanceof AbstractC107464sr) {
            return ((AbstractC107464sr) this).A00.A02;
        }
        return ((C107584t3) this).A03;
    }
}
