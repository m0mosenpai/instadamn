package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.Obw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55132Obw {
    public final Map A00;
    public final Map A01;
    public final Executor A02;
    public final boolean A03;

    public C55132Obw(Executor executor, boolean z) {
        C14360o3.A0B(executor, 1);
        this.A02 = executor;
        this.A03 = z;
        this.A01 = AbstractC166987dD.A1I();
        this.A00 = AbstractC166987dD.A1I();
    }

    public final void A03(InterfaceC57798PkQ interfaceC57798PkQ) {
        C14360o3.A0B(interfaceC57798PkQ, 0);
        AbstractC09800fd.A01("SubscriptionManager.unregister", -558242170);
        try {
            if (this.A03) {
                synchronized (this) {
                    ArrayList A1E = AbstractC166987dD.A1E();
                    Iterator A16 = AbstractC166997dE.A16(this.A01);
                    while (A16.hasNext()) {
                        Map map = (Map) A16.next();
                        Iterator A15 = AbstractC166997dE.A15(map);
                        while (A15.hasNext()) {
                            Map.Entry A1K = AbstractC166987dD.A1K(A15);
                            MSW.A19(A1K).remove(interfaceC57798PkQ);
                            if (MSW.A19(A1K).isEmpty()) {
                                A1E.add(A1K.getKey());
                            }
                        }
                        Iterator it = A1E.iterator();
                        while (it.hasNext()) {
                            C15500q5.A04(map).remove((InterfaceC16660sJ) it.next());
                        }
                    }
                    Iterator A162 = AbstractC166997dE.A16(this.A00);
                    while (A162.hasNext()) {
                        ((List) A162.next()).remove(interfaceC57798PkQ);
                    }
                }
            } else {
                ArrayList A1E2 = AbstractC166987dD.A1E();
                Iterator A163 = AbstractC166997dE.A16(this.A01);
                while (A163.hasNext()) {
                    Map map2 = (Map) A163.next();
                    Iterator A152 = AbstractC166997dE.A15(map2);
                    while (A152.hasNext()) {
                        Map.Entry A1K2 = AbstractC166987dD.A1K(A152);
                        MSW.A19(A1K2).remove(interfaceC57798PkQ);
                        if (MSW.A19(A1K2).isEmpty()) {
                            A1E2.add(A1K2.getKey());
                        }
                    }
                    Iterator it2 = A1E2.iterator();
                    while (it2.hasNext()) {
                        C15500q5.A04(map2).remove((InterfaceC16660sJ) it2.next());
                    }
                }
                Iterator A164 = AbstractC166997dE.A16(this.A00);
                while (A164.hasNext()) {
                    ((List) A164.next()).remove(interfaceC57798PkQ);
                }
            }
            AbstractC09800fd.A00(1194054851);
        } catch (Throwable th) {
            AbstractC09800fd.A00(300048866);
            throw th;
        }
    }

    public static final Object A00(C2N9 c2n9, C51732MtD c51732MtD, Class cls) {
        Object obj;
        AbstractC09800fd.A01("SubscriptionManager.getRsysOrSharedModel", -329391408);
        try {
            if (c2n9 == null) {
                obj = c51732MtD.A00(cls);
            } else {
                AbstractC53622NnT abstractC53622NnT = c51732MtD.A00;
                if (abstractC53622NnT != null) {
                    obj = ((N02) abstractC53622NnT).A00.A00(c2n9);
                } else {
                    obj = null;
                }
            }
            AbstractC09800fd.A00(1234572049);
            return obj;
        } catch (Throwable th) {
            AbstractC09800fd.A00(-2009592058);
            throw th;
        }
    }

    public static final void A01(InterfaceC57798PkQ interfaceC57798PkQ, Class cls, Map map) {
        AbstractC09800fd.A01("SubscriptionManager.registerClassLevelSubscription", -1604034839);
        try {
            List A12 = AbstractC43592JPx.A12(cls, map);
            if (A12 == null) {
                map.put(cls, AbstractC16960so.A1N(interfaceC57798PkQ));
            } else {
                A12.add(interfaceC57798PkQ);
            }
            AbstractC09800fd.A00(-1434394430);
        } catch (Throwable th) {
            AbstractC09800fd.A00(-196452869);
            throw th;
        }
    }

    public static final void A02(InterfaceC57798PkQ interfaceC57798PkQ, Class cls, Map map, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC09800fd.A01("SubscriptionManager.registerSelectorToOnChangeMapping", -2143326195);
        try {
            Map map2 = (Map) map.get(cls);
            if (map2 == null) {
                C15500q5.A06(interfaceC16660sJ, 1);
                map.put(cls, AbstractC06930Yk.A07(AbstractC25230BEn.A1b(interfaceC16660sJ, AbstractC16960so.A1N(interfaceC57798PkQ))));
            } else {
                C15500q5.A06(interfaceC16660sJ, 1);
                List A12 = AbstractC43592JPx.A12(interfaceC16660sJ, map2);
                if (A12 == null) {
                    map2.put(interfaceC16660sJ, AbstractC16960so.A1N(interfaceC57798PkQ));
                } else {
                    A12.add(interfaceC57798PkQ);
                }
            }
            AbstractC09800fd.A00(-1216360642);
        } catch (Throwable th) {
            AbstractC09800fd.A00(1288317286);
            throw th;
        }
    }
}
