package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.8uI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200758uI {
    public C03190Dc A00;
    public AbstractC48762Lu A01;
    public InterfaceC200868uT A03;
    public AbstractC200888uV A04;
    public C200768uJ A05 = new Object();
    public C200778uK A02 = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.8uJ] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.8uK, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, X.8uT] */
    public C200758uI() {
        List<AbstractC200848uR> list = AbstractC200818uO.A03;
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        for (AbstractC200848uR abstractC200848uR : list) {
            arrayList.add(new C09530e4(abstractC200848uR.A01, abstractC200848uR.A02));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object obj = ((C09530e4) next).A00;
            Object obj2 = linkedHashMap.get(obj);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(obj, obj2);
            }
            ((List) obj2).add(next);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList3 = new ArrayList(AbstractC06950Ym.A1E(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((C09530e4) it2.next()).A01);
            }
            arrayList2.add(new C09530e4(key, AbstractC001800i.A0k(arrayList3)));
        }
        this.A00 = new C03190Dc(AbstractC06930Yk.A08(arrayList2));
        this.A03 = new Object();
        this.A04 = new AbstractC200888uV();
    }
}
