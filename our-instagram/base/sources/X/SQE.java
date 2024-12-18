package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SQE {
    public final C02Q A00;
    public final SDF A01;
    public final SKD A02;
    public final C62403SAc A03;
    public final C62404SAd A04;
    public final SL2 A07;
    public final SKE A08;
    public final SVg A09;
    public final SDK A06 = new SDK();
    public final SWA A05 = new SWA();

    public final InterfaceC65473Tkq A00(Object obj) {
        InterfaceC65473Tkq AEP;
        SVg sVg = this.A09;
        synchronized (sVg) {
            Rs8.A00(obj);
            Map map = sVg.A00;
            Class<?> cls = obj.getClass();
            InterfaceC65472Tkp interfaceC65472Tkp = (InterfaceC65472Tkp) map.get(cls);
            if (interfaceC65472Tkp == null) {
                Iterator A16 = AbstractC166997dE.A16(map);
                while (true) {
                    if (A16.hasNext()) {
                        interfaceC65472Tkp = (InterfaceC65472Tkp) A16.next();
                        if (interfaceC65472Tkp.Avg().isAssignableFrom(cls)) {
                            break;
                        }
                    } else {
                        interfaceC65472Tkp = SVg.A01;
                        break;
                    }
                }
            }
            AEP = interfaceC65472Tkp.AEP(obj);
        }
        return AEP;
    }

    public final List A01() {
        List list;
        C62404SAd c62404SAd = this.A04;
        synchronized (c62404SAd) {
            list = c62404SAd.A00;
        }
        if (!list.isEmpty()) {
            return list;
        }
        throw new QB3();
    }

    public final List A02(Object obj) {
        List list;
        ArrayList A1E;
        SDF sdf = this.A01;
        Class<?> cls = obj.getClass();
        synchronized (sdf) {
            Map map = sdf.A00.A00;
            SAZ saz = (SAZ) map.get(cls);
            if (saz != null) {
                list = saz.A00;
            } else {
                list = null;
            }
            if (list == null) {
                C62954SYw c62954SYw = sdf.A01;
                synchronized (c62954SYw) {
                    try {
                        A1E = AbstractC166987dD.A1E();
                        for (SFW sfw : c62954SYw.A02) {
                            java.util.Set set = c62954SYw.A03;
                            if (!set.contains(sfw) && sfw.A02.isAssignableFrom(cls)) {
                                set.add(sfw);
                                InterfaceC65477Tku AEQ = sfw.A00.AEQ(c62954SYw);
                                Rs8.A00(AEQ);
                                A1E.add(AEQ);
                                set.remove(sfw);
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            c62954SYw.A03.clear();
                            throw th;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                list = Collections.unmodifiableList(A1E);
                if (map.put(cls, new SAZ(list)) != null) {
                    throw AbstractC43594JPz.A0o(cls, "Already cached loaders for model: ", AbstractC166987dD.A1C());
                }
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            List emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                InterfaceC65477Tku interfaceC65477Tku = (InterfaceC65477Tku) list.get(i);
                if (interfaceC65477Tku.CKb(obj)) {
                    if (z) {
                        emptyList = AbstractC25225BEi.A17(size - i);
                        z = false;
                    }
                    emptyList.add(interfaceC65477Tku);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Found ModelLoaders for model class: ");
            A1C.append(list);
            throw new RuntimeException(AbstractC167017dG.A0n(obj, ", but none that handle this specific model instance: ", A1C));
        }
        throw new RuntimeException(AbstractC167017dG.A0n(cls, "Failed to find any ModelLoaders registered for model class: ", AbstractC166987dD.A1C()));
    }

    public final void A03(InterfaceC65470Tkn interfaceC65470Tkn, Class cls, Class cls2, String str) {
        SL2 sl2 = this.A07;
        synchronized (sl2) {
            AbstractC43594JPz.A1Q(str, sl2.A00);
            Map map = sl2.A01;
            List A12 = AbstractC43592JPx.A12(str, map);
            if (A12 == null) {
                A12 = AbstractC166987dD.A1E();
                map.put(str, A12);
            }
            A12.add(new SFY(interfaceC65470Tkn, cls, cls2));
        }
    }

    public final void A04(InterfaceC65631Tps interfaceC65631Tps, Class cls) {
        SKE ske = this.A08;
        synchronized (ske) {
            ske.A00.add(new SDL(interfaceC65631Tps, cls));
        }
    }

    public final void A05(InterfaceC65472Tkp interfaceC65472Tkp) {
        SVg sVg = this.A09;
        synchronized (sVg) {
            sVg.A00.put(interfaceC65472Tkp.Avg(), interfaceC65472Tkp);
        }
    }

    public final void A06(InterfaceC65324Ti4 interfaceC65324Ti4, Class cls, Class cls2) {
        SDF sdf = this.A01;
        synchronized (sdf) {
            C62954SYw c62954SYw = sdf.A01;
            synchronized (c62954SYw) {
                SFW sfw = new SFW(interfaceC65324Ti4, cls, cls2);
                List list = c62954SYw.A02;
                list.add(list.size(), sfw);
            }
            sdf.A00.A00.clear();
        }
    }

    public final void A07(InterfaceC65326Ti7 interfaceC65326Ti7, Class cls, Class cls2) {
        SKD skd = this.A02;
        synchronized (skd) {
            skd.A00.add(new SFX(interfaceC65326Ti7, cls, cls2));
        }
    }

    public SQE() {
        C63591Spy c63591Spy = new C63591Spy(new C12550kz(20), new C63888SvM(1), new C63893SvR());
        this.A00 = c63591Spy;
        this.A01 = new SDF(c63591Spy);
        this.A03 = new C62403SAc();
        this.A07 = new SL2();
        this.A08 = new SKE();
        this.A09 = new SVg();
        this.A02 = new SKD();
        this.A04 = new C62404SAd();
        List asList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList A0q = AbstractC25230BEn.A0q(asList);
        A0q.add("legacy_prepend_all");
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            AbstractC58318PtA.A1W(A0q, it);
        }
        A0q.add("legacy_append");
        SL2 sl2 = this.A07;
        synchronized (sl2) {
            List list = sl2.A00;
            ArrayList A1F = AbstractC166987dD.A1F(list);
            list.clear();
            Iterator it2 = A0q.iterator();
            while (it2.hasNext()) {
                list.add(AbstractC166987dD.A1B(it2));
            }
            Iterator it3 = A1F.iterator();
            while (it3.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it3);
                if (!A0q.contains(A1B)) {
                    list.add(A1B);
                }
            }
        }
    }
}
