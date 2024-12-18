package X;

import android.view.Choreographer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.4sx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC107524sx {
    public Choreographer.FrameCallback A00;
    public Runnable A01;
    public final AtomicReference A02 = new AtomicReference();

    /* JADX WARN: Multi-variable type inference failed */
    public void A01(long j) {
        Collection values;
        Collection values2;
        int size;
        C107494su c107494su = ((C107514sw) this).A00;
        c107494su.A02 = false;
        if (c107494su.A03) {
            if (c107494su.A00 != j) {
                C107484st c107484st = c107494su.A01;
                synchronized (c107484st) {
                    if (c107484st.A00) {
                        ArrayList arrayList = c107484st.A02;
                        arrayList.clear();
                        java.util.Set set = c107484st.A06;
                        if (set.size() != 0) {
                            C012504o c012504o = new C012504o(0);
                            C005001p c005001p = new C005001p(0);
                            ArrayDeque arrayDeque = new ArrayDeque();
                            Iterator it = set.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList2 = ((C107534sy) it.next()).A05;
                                int size2 = arrayList2.size();
                                for (int i = 0; i < size2; i++) {
                                    AbstractC107574t2 abstractC107574t2 = (AbstractC107574t2) arrayList2.get(i);
                                    ArrayList arrayList3 = abstractC107574t2.A02;
                                    if (arrayList3 != null && (size = arrayList3.size()) != 0) {
                                        c005001p.put(abstractC107574t2, Integer.valueOf(size));
                                    } else if (!c012504o.contains(abstractC107574t2)) {
                                        arrayDeque.add(abstractC107574t2);
                                        c012504o.add(abstractC107574t2);
                                    }
                                }
                            }
                            if (c005001p.isEmpty() || !c012504o.isEmpty()) {
                                while (!arrayDeque.isEmpty()) {
                                    AbstractC107574t2 abstractC107574t22 = (AbstractC107574t2) arrayDeque.pollFirst();
                                    arrayList.add(abstractC107574t22);
                                    Map map = abstractC107574t22.A03;
                                    if (map == null) {
                                        values2 = Collections.emptySet();
                                    } else {
                                        values2 = map.values();
                                    }
                                    for (Object obj : values2) {
                                        int intValue = ((Integer) c005001p.get(obj)).intValue() - 1;
                                        c005001p.put(obj, Integer.valueOf(intValue));
                                        if (intValue == 0) {
                                            arrayDeque.addLast(obj);
                                        } else if (intValue < 0) {
                                            throw new RuntimeException("Detected cycle.");
                                        }
                                    }
                                }
                                if (arrayList.size() == c005001p.size() + c012504o.size()) {
                                    Collections.reverse(arrayList);
                                    c107484st.A00 = false;
                                } else {
                                    throw new RuntimeException("Had unreachable nodes in graph -- this likely means there was a cycle");
                                }
                            } else {
                                throw new RuntimeException("Graph has nodes, but they represent a cycle with no leaf nodes!");
                            }
                        }
                    }
                    ArrayList arrayList4 = c107484st.A02;
                    int size3 = arrayList4.size();
                    for (int i2 = 0; i2 < size3; i2++) {
                        AbstractC107574t2 abstractC107574t23 = (AbstractC107574t2) arrayList4.get(i2);
                        float A02 = abstractC107574t23.A02(j);
                        if (j != abstractC107574t23.A01) {
                            abstractC107574t23.A01 = j;
                            abstractC107574t23.A00 = A02;
                        } else {
                            throw new RuntimeException("Got a calculate value call multiple times in the same frame. This isn't expected.");
                        }
                    }
                    int size4 = arrayList4.size();
                    for (int i3 = 0; i3 < size4; i3++) {
                        AbstractC107574t2 abstractC107574t24 = (AbstractC107574t2) arrayList4.get(i3);
                        Map map2 = c107484st.A05;
                        C107654tA c107654tA = (C107654tA) map2.get(abstractC107574t24);
                        if (c107654tA != null && !c107654tA.A01) {
                            Map map3 = abstractC107574t24.A03;
                            if (map3 == null) {
                                values = Collections.emptySet();
                            } else {
                                values = map3.values();
                            }
                            Iterator it2 = values.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!((C107654tA) map2.get(it2.next())).A01) {
                                        break;
                                    }
                                } else if (!(abstractC107574t24 instanceof InterfaceC107614t6) || ((InterfaceC107614t6) abstractC107574t24).isFinished()) {
                                    c107654tA.A01 = true;
                                }
                            }
                        }
                    }
                    c107484st.A01 = true;
                    for (C107534sy c107534sy : c107484st.A06) {
                        ArrayList arrayList5 = c107534sy.A05;
                        int size5 = arrayList5.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 < size5) {
                                if (((C107654tA) c107484st.A05.get(arrayList5.get(i4))).A01) {
                                    i4++;
                                }
                            } else {
                                C107554t0 c107554t0 = c107534sy.A00;
                                if (c107554t0 != null) {
                                    AbstractC107464sr abstractC107464sr = c107554t0.A00;
                                    abstractC107464sr.A03();
                                    abstractC107464sr.A08();
                                }
                                c107534sy.A00();
                            }
                        }
                    }
                    c107484st.A01 = false;
                    List list = c107484st.A03;
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        c107484st.A00((C107534sy) it3.next());
                    }
                    List list2 = c107484st.A04;
                    Iterator it4 = list2.iterator();
                    while (it4.hasNext()) {
                        c107484st.A01((C107534sy) it4.next());
                    }
                    list.clear();
                    list2.clear();
                }
                c107494su.A00 = j;
            }
            if (c107494su.A03 && !c107494su.A02) {
                c107494su.A05.A01(c107494su.A04);
                c107494su.A02 = true;
            }
        }
    }

    public static void A00(AbstractC107524sx abstractC107524sx, long j) {
        abstractC107524sx.A02.getAndSet(null);
        try {
            abstractC107524sx.A01(j);
        } finally {
        }
    }
}
