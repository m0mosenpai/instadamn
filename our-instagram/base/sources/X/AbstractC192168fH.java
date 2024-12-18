package X;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.PolymorphicSerializer;

/* renamed from: X.8fH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC192168fH {
    public static final InterfaceC192248fP A00;
    public static final InterfaceC192248fP A01;
    public static final InterfaceC192208fL A02;
    public static final InterfaceC192208fL A03;

    static {
        InterfaceC192208fL interfaceC192208fL;
        InterfaceC192208fL interfaceC192208fL2;
        InterfaceC192248fP interfaceC192248fP;
        InterfaceC192248fP interfaceC192248fP2;
        final InterfaceC16660sJ interfaceC16660sJ = new InterfaceC16660sJ() { // from class: X.8fI
            @Override // X.InterfaceC16660sJ
            public final Object invoke(Object obj) {
                InterfaceC16510rw interfaceC16510rw = (InterfaceC16510rw) obj;
                InterfaceC192248fP interfaceC192248fP3 = AbstractC192168fH.A00;
                C14360o3.A0B(interfaceC16510rw, 0);
                Object A012 = AbstractC192288fT.A01(interfaceC16510rw, new C3R9[0]);
                if (A012 == null) {
                    A012 = AbstractC192298fX.A00.get(interfaceC16510rw);
                }
                if (A012 == null) {
                    if (AbstractC53012bi.A00(interfaceC16510rw).isInterface()) {
                        return new PolymorphicSerializer(interfaceC16510rw);
                    }
                    return null;
                }
                return A012;
            }
        };
        boolean z = AbstractC192188fJ.A00;
        if (z) {
            interfaceC192208fL = new C193418hM(interfaceC16660sJ);
        } else {
            interfaceC192208fL = new InterfaceC192208fL(interfaceC16660sJ) { // from class: X.8fK
                public final ConcurrentHashMap A00 = new ConcurrentHashMap();
                public final InterfaceC16660sJ A01;

                @Override // X.InterfaceC192208fL
                public final C3R9 AXX(InterfaceC16510rw interfaceC16510rw) {
                    Object putIfAbsent;
                    ConcurrentHashMap concurrentHashMap = this.A00;
                    Class A002 = AbstractC53012bi.A00(interfaceC16510rw);
                    Object obj = concurrentHashMap.get(A002);
                    if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(A002, (obj = new C192688gA((C3R9) this.A01.invoke(interfaceC16510rw))))) != null) {
                        obj = putIfAbsent;
                    }
                    return ((C192688gA) obj).A00;
                }

                {
                    this.A01 = interfaceC16660sJ;
                }
            };
        }
        A02 = interfaceC192208fL;
        final InterfaceC16660sJ interfaceC16660sJ2 = new InterfaceC16660sJ() { // from class: X.8fM
            @Override // X.InterfaceC16660sJ
            public final Object invoke(Object obj) {
                InterfaceC16510rw interfaceC16510rw = (InterfaceC16510rw) obj;
                InterfaceC192248fP interfaceC192248fP3 = AbstractC192168fH.A00;
                C14360o3.A0B(interfaceC16510rw, 0);
                C3R9 A012 = AbstractC192288fT.A01(interfaceC16510rw, new C3R9[0]);
                if (A012 == null) {
                    A012 = (C3R9) AbstractC192298fX.A00.get(interfaceC16510rw);
                }
                if (A012 == null) {
                    if (!AbstractC53012bi.A00(interfaceC16510rw).isInterface()) {
                        return null;
                    }
                    A012 = new PolymorphicSerializer(interfaceC16510rw);
                }
                return AbstractC192698gB.A00(A012);
            }
        };
        if (z) {
            interfaceC192208fL2 = new C193418hM(interfaceC16660sJ2);
        } else {
            interfaceC192208fL2 = new InterfaceC192208fL(interfaceC16660sJ2) { // from class: X.8fK
                public final ConcurrentHashMap A00 = new ConcurrentHashMap();
                public final InterfaceC16660sJ A01;

                @Override // X.InterfaceC192208fL
                public final C3R9 AXX(InterfaceC16510rw interfaceC16510rw) {
                    Object putIfAbsent;
                    ConcurrentHashMap concurrentHashMap = this.A00;
                    Class A002 = AbstractC53012bi.A00(interfaceC16510rw);
                    Object obj = concurrentHashMap.get(A002);
                    if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(A002, (obj = new C192688gA((C3R9) this.A01.invoke(interfaceC16510rw))))) != null) {
                        obj = putIfAbsent;
                    }
                    return ((C192688gA) obj).A00;
                }

                {
                    this.A01 = interfaceC16660sJ2;
                }
            };
        }
        A03 = interfaceC192208fL2;
        final InterfaceC16620sF interfaceC16620sF = new InterfaceC16620sF() { // from class: X.8fN
            @Override // X.InterfaceC16620sF
            public final Object invoke(Object obj, Object obj2) {
                InterfaceC16510rw interfaceC16510rw = (InterfaceC16510rw) obj;
                final List list = (List) obj2;
                InterfaceC192248fP interfaceC192248fP3 = AbstractC192168fH.A00;
                C14360o3.A0B(interfaceC16510rw, 0);
                C14360o3.A0B(list, 1);
                List A002 = AbstractC192158fG.A00(list, AbstractC73793Sj.A00);
                C14360o3.A0A(A002);
                return AbstractC192158fG.A01(A002, new InterfaceC16820sZ() { // from class: X.8gF
                    @Override // X.InterfaceC16820sZ
                    public final Object invoke() {
                        List list2 = list;
                        InterfaceC192248fP interfaceC192248fP4 = AbstractC192168fH.A00;
                        return ((InterfaceC16500rv) list2.get(0)).Anj();
                    }
                }, interfaceC16510rw);
            }
        };
        if (z) {
            interfaceC192248fP = new InterfaceC192248fP(interfaceC16620sF) { // from class: X.8hO
                public final InterfaceC16620sF A00;
                public final C193428hN A01 = new C193428hN();

                @Override // X.InterfaceC192248fP
                public final Object AXh(List list, InterfaceC16510rw interfaceC16510rw) {
                    Object c09540e5;
                    Object obj = this.A01.get(AbstractC53012bi.A00(interfaceC16510rw));
                    C14360o3.A07(obj);
                    C193448hP c193448hP = (C193448hP) obj;
                    Object obj2 = c193448hP.reference.get();
                    if (obj2 == null) {
                        InterfaceC16820sZ interfaceC16820sZ = new InterfaceC16820sZ() { // from class: X.8hQ
                            @Override // X.InterfaceC16820sZ
                            public final Object invoke() {
                                return new C192268fR();
                            }
                        };
                        synchronized (c193448hP) {
                            obj2 = c193448hP.reference.get();
                            if (obj2 == null) {
                                obj2 = interfaceC16820sZ.invoke();
                                c193448hP.reference = new SoftReference(obj2);
                            }
                        }
                    }
                    C192268fR c192268fR = (C192268fR) obj2;
                    ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new C192278fS((InterfaceC16500rv) it.next()));
                    }
                    ConcurrentHashMap concurrentHashMap = c192268fR.A00;
                    Object obj3 = concurrentHashMap.get(arrayList);
                    if (obj3 == null) {
                        try {
                            c09540e5 = (C3R9) this.A00.invoke(interfaceC16510rw, list);
                        } catch (Throwable th) {
                            c09540e5 = new C09540e5(th);
                        }
                        C09550e6 c09550e6 = new C09550e6(c09540e5);
                        obj3 = concurrentHashMap.putIfAbsent(arrayList, c09550e6);
                        if (obj3 == null) {
                            obj3 = c09550e6;
                        }
                    }
                    return ((C09550e6) obj3).A00;
                }

                {
                    this.A00 = interfaceC16620sF;
                }
            };
        } else {
            interfaceC192248fP = new InterfaceC192248fP(interfaceC16620sF) { // from class: X.8fO
                public final ConcurrentHashMap A00 = new ConcurrentHashMap();
                public final InterfaceC16620sF A01;

                @Override // X.InterfaceC192248fP
                public final Object AXh(List list, InterfaceC16510rw interfaceC16510rw) {
                    Object c09540e5;
                    Object putIfAbsent;
                    ConcurrentHashMap concurrentHashMap = this.A00;
                    Class A002 = AbstractC53012bi.A00(interfaceC16510rw);
                    Object obj = concurrentHashMap.get(A002);
                    if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(A002, (obj = new C192268fR()))) != null) {
                        obj = putIfAbsent;
                    }
                    C192268fR c192268fR = (C192268fR) obj;
                    ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new C192278fS((InterfaceC16500rv) it.next()));
                    }
                    ConcurrentHashMap concurrentHashMap2 = c192268fR.A00;
                    Object obj2 = concurrentHashMap2.get(arrayList);
                    if (obj2 == null) {
                        try {
                            c09540e5 = (C3R9) this.A01.invoke(interfaceC16510rw, list);
                        } catch (Throwable th) {
                            c09540e5 = new C09540e5(th);
                        }
                        C09550e6 c09550e6 = new C09550e6(c09540e5);
                        obj2 = concurrentHashMap2.putIfAbsent(arrayList, c09550e6);
                        if (obj2 == null) {
                            obj2 = c09550e6;
                        }
                    }
                    return ((C09550e6) obj2).A00;
                }

                {
                    this.A01 = interfaceC16620sF;
                }
            };
        }
        A00 = interfaceC192248fP;
        final InterfaceC16620sF interfaceC16620sF2 = new InterfaceC16620sF() { // from class: X.8fQ
            @Override // X.InterfaceC16620sF
            public final Object invoke(Object obj, Object obj2) {
                InterfaceC16510rw interfaceC16510rw = (InterfaceC16510rw) obj;
                final List list = (List) obj2;
                InterfaceC192248fP interfaceC192248fP3 = AbstractC192168fH.A00;
                C14360o3.A0B(interfaceC16510rw, 0);
                C14360o3.A0B(list, 1);
                List A002 = AbstractC192158fG.A00(list, AbstractC73793Sj.A00);
                C14360o3.A0A(A002);
                C3R9 A012 = AbstractC192158fG.A01(A002, new InterfaceC16820sZ() { // from class: X.B3M
                    @Override // X.InterfaceC16820sZ
                    public final Object invoke() {
                        List list2 = list;
                        InterfaceC192248fP interfaceC192248fP4 = AbstractC192168fH.A00;
                        return ((InterfaceC16500rv) AbstractC166987dD.A16(list2)).Anj();
                    }
                }, interfaceC16510rw);
                if (A012 != null) {
                    return AbstractC192698gB.A00(A012);
                }
                return null;
            }
        };
        if (z) {
            interfaceC192248fP2 = new InterfaceC192248fP(interfaceC16620sF2) { // from class: X.8hO
                public final InterfaceC16620sF A00;
                public final C193428hN A01 = new C193428hN();

                @Override // X.InterfaceC192248fP
                public final Object AXh(List list, InterfaceC16510rw interfaceC16510rw) {
                    Object c09540e5;
                    Object obj = this.A01.get(AbstractC53012bi.A00(interfaceC16510rw));
                    C14360o3.A07(obj);
                    C193448hP c193448hP = (C193448hP) obj;
                    Object obj2 = c193448hP.reference.get();
                    if (obj2 == null) {
                        InterfaceC16820sZ interfaceC16820sZ = new InterfaceC16820sZ() { // from class: X.8hQ
                            @Override // X.InterfaceC16820sZ
                            public final Object invoke() {
                                return new C192268fR();
                            }
                        };
                        synchronized (c193448hP) {
                            obj2 = c193448hP.reference.get();
                            if (obj2 == null) {
                                obj2 = interfaceC16820sZ.invoke();
                                c193448hP.reference = new SoftReference(obj2);
                            }
                        }
                    }
                    C192268fR c192268fR = (C192268fR) obj2;
                    ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new C192278fS((InterfaceC16500rv) it.next()));
                    }
                    ConcurrentHashMap concurrentHashMap = c192268fR.A00;
                    Object obj3 = concurrentHashMap.get(arrayList);
                    if (obj3 == null) {
                        try {
                            c09540e5 = (C3R9) this.A00.invoke(interfaceC16510rw, list);
                        } catch (Throwable th) {
                            c09540e5 = new C09540e5(th);
                        }
                        C09550e6 c09550e6 = new C09550e6(c09540e5);
                        obj3 = concurrentHashMap.putIfAbsent(arrayList, c09550e6);
                        if (obj3 == null) {
                            obj3 = c09550e6;
                        }
                    }
                    return ((C09550e6) obj3).A00;
                }

                {
                    this.A00 = interfaceC16620sF2;
                }
            };
        } else {
            interfaceC192248fP2 = new InterfaceC192248fP(interfaceC16620sF2) { // from class: X.8fO
                public final ConcurrentHashMap A00 = new ConcurrentHashMap();
                public final InterfaceC16620sF A01;

                @Override // X.InterfaceC192248fP
                public final Object AXh(List list, InterfaceC16510rw interfaceC16510rw) {
                    Object c09540e5;
                    Object putIfAbsent;
                    ConcurrentHashMap concurrentHashMap = this.A00;
                    Class A002 = AbstractC53012bi.A00(interfaceC16510rw);
                    Object obj = concurrentHashMap.get(A002);
                    if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(A002, (obj = new C192268fR()))) != null) {
                        obj = putIfAbsent;
                    }
                    C192268fR c192268fR = (C192268fR) obj;
                    ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new C192278fS((InterfaceC16500rv) it.next()));
                    }
                    ConcurrentHashMap concurrentHashMap2 = c192268fR.A00;
                    Object obj2 = concurrentHashMap2.get(arrayList);
                    if (obj2 == null) {
                        try {
                            c09540e5 = (C3R9) this.A01.invoke(interfaceC16510rw, list);
                        } catch (Throwable th) {
                            c09540e5 = new C09540e5(th);
                        }
                        C09550e6 c09550e6 = new C09550e6(c09540e5);
                        obj2 = concurrentHashMap2.putIfAbsent(arrayList, c09550e6);
                        if (obj2 == null) {
                            obj2 = c09550e6;
                        }
                    }
                    return ((C09550e6) obj2).A00;
                }

                {
                    this.A01 = interfaceC16620sF2;
                }
            };
        }
        A01 = interfaceC192248fP2;
    }
}
