package X;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class RVP extends AbstractC61607RqW {
    public static final InterfaceC65438TkA A06 = new InterfaceC65438TkA() { // from class: X.TE6
        @Override // X.InterfaceC65438TkA
        public final Object get() {
            return Collections.emptySet();
        }
    };
    public final List A00;
    public final Map A01 = AbstractC166987dD.A1G();
    public final Map A02 = AbstractC166987dD.A1G();
    public final Map A03 = AbstractC166987dD.A1G();
    public final AtomicReference A04 = new AtomicReference();
    public final C64437TDv A05;

    public final void A05(boolean z) {
        HashMap A10;
        if (C1EM.A00(null, Boolean.valueOf(z), this.A04)) {
            synchronized (this) {
                A10 = AbstractC58318PtA.A10(this.A01);
            }
            A00(A10);
        }
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [X.TE5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, X.TDw] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, X.TDw] */
    public RVP(Iterable iterable, Collection collection, Executor executor) {
        Map map;
        C64437TDv c64437TDv = new C64437TDv(executor);
        this.A05 = c64437TDv;
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.add(C63180Sef.A00(C64437TDv.class, c64437TDv, C64437TDv.class, InterfaceC65284ThH.class));
        C63180Sef.A01(RVP.class, this, A1E);
        for (Object obj : collection) {
            if (obj != null) {
                A1E.add(obj);
            }
        }
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC58318PtA.A1W(A1E2, it);
        }
        this.A00 = A1E2;
        ArrayList A1E3 = AbstractC166987dD.A1E();
        synchronized (this) {
            Iterator it2 = this.A00.iterator();
            while (it2.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC65438TkA) it2.next()).get();
                    if (componentRegistrar != null) {
                        A1E.addAll(componentRegistrar.getComponents());
                        it2.remove();
                    }
                } catch (TXN e) {
                    it2.remove();
                    android.util.Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            map = this.A01;
            if (map.isEmpty()) {
                S3X.A00(A1E);
            } else {
                ArrayList A1F = AbstractC166987dD.A1F(map.keySet());
                A1F.addAll(A1E);
                S3X.A00(A1F);
            }
            Iterator it3 = A1E.iterator();
            while (it3.hasNext()) {
                C63180Sef c63180Sef = (C63180Sef) it3.next();
                map.put(c63180Sef, new TE8(new C58436PvF(1, c63180Sef, this)));
            }
            ArrayList A1E4 = AbstractC166987dD.A1E();
            Iterator it4 = A1E.iterator();
            while (it4.hasNext()) {
                C63180Sef c63180Sef2 = (C63180Sef) it4.next();
                if (c63180Sef2.A01 == 0) {
                    final InterfaceC65438TkA interfaceC65438TkA = (InterfaceC65438TkA) map.get(c63180Sef2);
                    for (Object obj2 : c63180Sef2.A04) {
                        Map map2 = this.A02;
                        if (!map2.containsKey(obj2)) {
                            map2.put(obj2, interfaceC65438TkA);
                        } else {
                            final TE5 te5 = (TE5) ((InterfaceC65438TkA) map2.get(obj2));
                            A1E4.add(new Runnable(te5, interfaceC65438TkA) { // from class: X.TOn
                                public final TE5 A00;
                                public final InterfaceC65438TkA A01;

                                {
                                    this.A00 = te5;
                                    this.A01 = interfaceC65438TkA;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    TE5 te52 = this.A00;
                                    InterfaceC65438TkA interfaceC65438TkA2 = this.A01;
                                    if (te52.A01 == TE5.A03) {
                                        synchronized (te52) {
                                            te52.A00 = null;
                                            te52.A01 = interfaceC65438TkA2;
                                        }
                                        return;
                                    }
                                    throw AbstractC166987dD.A14("provide() can be called only once.");
                                }
                            });
                        }
                    }
                }
            }
            A1E3.addAll(A1E4);
            ArrayList A1E5 = AbstractC166987dD.A1E();
            HashMap A1G = AbstractC166987dD.A1G();
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                C63180Sef c63180Sef3 = (C63180Sef) A1K.getKey();
                if (c63180Sef3.A01 != 0) {
                    Object value = A1K.getValue();
                    for (Object obj3 : c63180Sef3.A04) {
                        if (!A1G.containsKey(obj3)) {
                            A1G.put(obj3, AbstractC166987dD.A1H());
                        }
                        ((java.util.Set) A1G.get(obj3)).add(value);
                    }
                }
            }
            Iterator A14 = AbstractC166997dE.A14(A1G);
            while (A14.hasNext()) {
                Map.Entry A1K2 = AbstractC166987dD.A1K(A14);
                Map map3 = this.A03;
                boolean A1V = AbstractC58319PtB.A1V(A1K2, map3);
                Object key = A1K2.getKey();
                if (!A1V) {
                    Collection A0y = AbstractC58318PtA.A0y(A1K2);
                    ?? obj4 = new Object();
                    obj4.A00 = null;
                    obj4.A01 = Collections.newSetFromMap(AbstractC58318PtA.A14());
                    obj4.A01.addAll(A0y);
                    map3.put(key, obj4);
                } else {
                    final C64438TDw c64438TDw = (C64438TDw) map3.get(key);
                    for (final InterfaceC65438TkA interfaceC65438TkA2 : (java.util.Set) A1K2.getValue()) {
                        A1E5.add(new Runnable(c64438TDw, interfaceC65438TkA2) { // from class: X.TOo
                            public final C64438TDw A00;
                            public final InterfaceC65438TkA A01;

                            {
                                this.A00 = c64438TDw;
                                this.A01 = interfaceC65438TkA2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                java.util.Set set;
                                Object obj5;
                                C64438TDw c64438TDw2 = this.A00;
                                InterfaceC65438TkA interfaceC65438TkA3 = this.A01;
                                synchronized (c64438TDw2) {
                                    if (c64438TDw2.A00 == null) {
                                        set = c64438TDw2.A01;
                                        obj5 = interfaceC65438TkA3;
                                    } else {
                                        set = c64438TDw2.A00;
                                        obj5 = interfaceC65438TkA3.get();
                                    }
                                    set.add(obj5);
                                }
                            }
                        });
                    }
                }
            }
            A1E3.addAll(A1E5);
            Iterator A12 = AbstractC43593JPy.A12(map);
            while (A12.hasNext()) {
                C63180Sef c63180Sef4 = (C63180Sef) A12.next();
                for (C62995SaJ c62995SaJ : c63180Sef4.A03) {
                    int i = c62995SaJ.A01;
                    boolean z = false;
                    if (i == 2) {
                        z = true;
                        Map map4 = this.A03;
                        Class cls = c62995SaJ.A02;
                        if (!map4.containsKey(cls)) {
                            java.util.Set emptySet = Collections.emptySet();
                            ?? obj5 = new Object();
                            obj5.A00 = null;
                            obj5.A01 = Collections.newSetFromMap(AbstractC58318PtA.A14());
                            obj5.A01.addAll(emptySet);
                            map4.put(cls, obj5);
                        }
                    }
                    Map map5 = this.A02;
                    Class cls2 = c62995SaJ.A02;
                    if (map5.containsKey(cls2)) {
                        continue;
                    } else if (i != 1) {
                        if (!z) {
                            SU5 su5 = TE5.A02;
                            InterfaceC65438TkA interfaceC65438TkA3 = TE5.A03;
                            ?? obj6 = new Object();
                            obj6.A00 = su5;
                            obj6.A01 = interfaceC65438TkA3;
                            map5.put(cls2, obj6);
                        }
                    } else {
                        throw new RuntimeException(String.format("Unsatisfied dependency for component %s: %s", c63180Sef4, cls2));
                    }
                }
            }
        }
        Iterator it5 = A1E3.iterator();
        while (it5.hasNext()) {
            AbstractC58319PtB.A1N(it5);
        }
        if (this.A04.get() != null) {
            A00(map);
        }
    }

    private void A00(Map map) {
        Queue queue;
        Object obj;
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            C63180Sef c63180Sef = (C63180Sef) A1K.getKey();
            InterfaceC65438TkA interfaceC65438TkA = (InterfaceC65438TkA) A1K.getValue();
            if (c63180Sef.A00 == 1) {
                interfaceC65438TkA.get();
            }
        }
        C64437TDv c64437TDv = this.A05;
        synchronized (c64437TDv) {
            queue = c64437TDv.A00;
            obj = null;
            if (queue != null) {
                c64437TDv.A00 = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            if (it.hasNext()) {
                it.next();
                obj.getClass();
                throw C00O.createAndThrow();
            }
        }
    }
}
