package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public final class PU5 implements Runnable {
    public final /* synthetic */ C57782Pk9 A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ AtomicInteger A03;
    public final /* synthetic */ InterfaceC16660sJ A04;

    public PU5(C57782Pk9 c57782Pk9, Object obj, List list, AtomicInteger atomicInteger, InterfaceC16660sJ interfaceC16660sJ) {
        this.A03 = atomicInteger;
        this.A01 = obj;
        this.A00 = c57782Pk9;
        this.A02 = list;
        this.A04 = interfaceC16660sJ;
    }

    public static void A00(C51732MtD c51732MtD, Object obj, Object obj2, Object obj3, AbstractCollection abstractCollection) {
        InterfaceC16820sZ A00;
        InterfaceC57797PkP interfaceC57797PkP = (InterfaceC57797PkP) obj;
        if (interfaceC57797PkP != null && (A00 = AbstractC53731NpK.A00(interfaceC57797PkP, c51732MtD, obj2, obj3)) != null) {
            abstractCollection.add(A00);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object invoke;
        Object invoke2;
        Object invoke3;
        Object invoke4;
        AtomicInteger atomicInteger = this.A03;
        if (atomicInteger.incrementAndGet() > 1) {
            OXE.A00.A02("RpStore", "RpStore execution entrant count > 1. Non-serial processing of actions may lead to undefined behavior.", null);
        }
        Object obj = this.A01;
        if (obj instanceof O1S) {
            C57782Pk9 c57782Pk9 = this.A00;
            if (c57782Pk9.equals(OZP.A00)) {
                OXE.A00.A03("RpStore", "subscribe called on finalized RpStore. No updates will be provided.", null);
            } else {
                C55736Op5 c55736Op5 = ((O1S) obj).A00;
                if (c55736Op5.A04) {
                    c55736Op5.A01(c57782Pk9.A01);
                }
            }
        } else {
            boolean z = obj instanceof O1T;
            C57782Pk9 c57782Pk92 = this.A00;
            if (z) {
                c57782Pk92.A01.A03(((O1T) obj).A00);
            } else {
                C51732MtD A0Q = MSZ.A0Q(c57782Pk92);
                List list = this.A02;
                C14360o3.A0B(list, 0);
                AbstractC25225BEi.A1U(new DHH(list, 10).invoke(this.A04), obj);
                C51732MtD A0Q2 = MSZ.A0Q(c57782Pk92);
                C55132Obw c55132Obw = c57782Pk92.A01;
                C14360o3.A0B(A0Q, 0);
                C14360o3.A0B(A0Q2, 1);
                AbstractC09800fd.A01("SubscriptionManager.onChange", -1105092824);
                try {
                    if (c55132Obw.A03) {
                        synchronized (c55132Obw) {
                            LinkedHashSet A0l = AbstractC31171DnF.A0l();
                            ArrayList A1E = AbstractC166987dD.A1E();
                            Iterator A15 = AbstractC166997dE.A15(c55132Obw.A01);
                            while (A15.hasNext()) {
                                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                                Class cls = (Class) A1K.getKey();
                                Map map = (Map) A1K.getValue();
                                C2N9 A00 = AbstractC53733NpM.A00(cls);
                                Iterator A152 = AbstractC166997dE.A15(map);
                                while (A152.hasNext()) {
                                    Map.Entry A1K2 = AbstractC166987dD.A1K(A152);
                                    InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) A1K2.getKey();
                                    List A19 = MSW.A19(A1K2);
                                    Object A002 = C55132Obw.A00(A00, A0Q, cls);
                                    Object A003 = C55132Obw.A00(A00, A0Q2, cls);
                                    if (A002 != null) {
                                        invoke3 = interfaceC16660sJ.invoke(A002);
                                    } else {
                                        invoke3 = null;
                                    }
                                    if (A003 == null) {
                                        invoke4 = null;
                                    } else {
                                        invoke4 = interfaceC16660sJ.invoke(A003);
                                    }
                                    if (!C14360o3.A0K(invoke3, invoke4)) {
                                        Iterator it = A19.iterator();
                                        while (it.hasNext()) {
                                            C55736Op5 c55736Op52 = (C55736Op5) ((InterfaceC57798PkQ) it.next());
                                            if (c55736Op52.A04) {
                                                if (c55736Op52 instanceof InterfaceC58273PsR) {
                                                    A0l.add(c55736Op52);
                                                } else if (c55736Op52 instanceof InterfaceC58272PsQ) {
                                                    A1E.add(new C57261Pbj(19, A0Q2, invoke4, c55736Op52));
                                                } else {
                                                    C14360o3.A0B(interfaceC16660sJ, 1);
                                                    A00(A0Q2, c55736Op52.A03.get(interfaceC16660sJ), invoke3, invoke4, A1E);
                                                    A0l.add(c55736Op52);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            Iterator A153 = AbstractC166997dE.A15(c55132Obw.A00);
                            while (A153.hasNext()) {
                                Map.Entry A1K3 = AbstractC166987dD.A1K(A153);
                                Class cls2 = (Class) A1K3.getKey();
                                List A192 = MSW.A19(A1K3);
                                C2N9 A004 = AbstractC53733NpM.A00(cls2);
                                Object A005 = C55132Obw.A00(A004, A0Q, cls2);
                                Object A006 = C55132Obw.A00(A004, A0Q2, cls2);
                                if (!C14360o3.A0K(A005, A006)) {
                                    Iterator it2 = A192.iterator();
                                    while (it2.hasNext()) {
                                        C55736Op5 c55736Op53 = (C55736Op5) ((InterfaceC57798PkQ) it2.next());
                                        if (c55736Op53.A04) {
                                            if (!(c55736Op53 instanceof InterfaceC58273PsR)) {
                                                if (c55736Op53 instanceof InterfaceC58272PsQ) {
                                                    A1E.add(new C57261Pbj(20, A0Q2, A006, c55736Op53));
                                                } else {
                                                    C14360o3.A0B(cls2, 1);
                                                    A00(A0Q2, c55736Op53.A02.get(cls2), A005, A006, A1E);
                                                }
                                            }
                                            A0l.add(c55736Op53);
                                        }
                                    }
                                }
                            }
                            c55132Obw.A02.execute(new PS7(A0Q2, A1E, A0l));
                        }
                    } else {
                        LinkedHashSet A0l2 = AbstractC31171DnF.A0l();
                        ArrayList A1E2 = AbstractC166987dD.A1E();
                        Iterator A154 = AbstractC166997dE.A15(c55132Obw.A01);
                        while (A154.hasNext()) {
                            Map.Entry A1K4 = AbstractC166987dD.A1K(A154);
                            Class cls3 = (Class) A1K4.getKey();
                            Map map2 = (Map) A1K4.getValue();
                            C2N9 A007 = AbstractC53733NpM.A00(cls3);
                            Iterator A155 = AbstractC166997dE.A15(map2);
                            while (A155.hasNext()) {
                                Map.Entry A1K5 = AbstractC166987dD.A1K(A155);
                                InterfaceC16660sJ interfaceC16660sJ2 = (InterfaceC16660sJ) A1K5.getKey();
                                List A193 = MSW.A19(A1K5);
                                Object A008 = C55132Obw.A00(A007, A0Q, cls3);
                                Object A009 = C55132Obw.A00(A007, A0Q2, cls3);
                                if (A008 != null) {
                                    invoke = interfaceC16660sJ2.invoke(A008);
                                } else {
                                    invoke = null;
                                }
                                if (A009 == null) {
                                    invoke2 = null;
                                } else {
                                    invoke2 = interfaceC16660sJ2.invoke(A009);
                                }
                                if (!C14360o3.A0K(invoke, invoke2)) {
                                    Iterator it3 = A193.iterator();
                                    while (it3.hasNext()) {
                                        C55736Op5 c55736Op54 = (C55736Op5) ((InterfaceC57798PkQ) it3.next());
                                        if (c55736Op54.A04) {
                                            if (c55736Op54 instanceof InterfaceC58273PsR) {
                                                A0l2.add(c55736Op54);
                                            } else if (c55736Op54 instanceof InterfaceC58272PsQ) {
                                                A1E2.add(new C57261Pbj(19, A0Q2, invoke2, c55736Op54));
                                            } else {
                                                C14360o3.A0B(interfaceC16660sJ2, 1);
                                                A00(A0Q2, c55736Op54.A03.get(interfaceC16660sJ2), invoke, invoke2, A1E2);
                                                A0l2.add(c55736Op54);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        Iterator A156 = AbstractC166997dE.A15(c55132Obw.A00);
                        while (A156.hasNext()) {
                            Map.Entry A1K6 = AbstractC166987dD.A1K(A156);
                            Class cls4 = (Class) A1K6.getKey();
                            List A194 = MSW.A19(A1K6);
                            C2N9 A0010 = AbstractC53733NpM.A00(cls4);
                            Object A0011 = C55132Obw.A00(A0010, A0Q, cls4);
                            Object A0012 = C55132Obw.A00(A0010, A0Q2, cls4);
                            if (!C14360o3.A0K(A0011, A0012)) {
                                Iterator it4 = A194.iterator();
                                while (it4.hasNext()) {
                                    C55736Op5 c55736Op55 = (C55736Op5) ((InterfaceC57798PkQ) it4.next());
                                    if (c55736Op55.A04) {
                                        if (!(c55736Op55 instanceof InterfaceC58273PsR)) {
                                            if (c55736Op55 instanceof InterfaceC58272PsQ) {
                                                A1E2.add(new C57261Pbj(20, A0Q2, A0012, c55736Op55));
                                            } else {
                                                C14360o3.A0B(cls4, 1);
                                                A00(A0Q2, c55736Op55.A02.get(cls4), A0011, A0012, A1E2);
                                            }
                                        }
                                        A0l2.add(c55736Op55);
                                    }
                                }
                            }
                        }
                        c55132Obw.A02.execute(new PS7(A0Q2, A1E2, A0l2));
                    }
                    AbstractC09800fd.A00(-886381852);
                } catch (Throwable th) {
                    AbstractC09800fd.A00(489673785);
                    throw th;
                }
            }
        }
        atomicInteger.decrementAndGet();
    }
}
