package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Vrr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69588Vrr {
    public final List A00;
    public final Map A01;
    public final Map A02;
    public final List A03;

    public final C69333Vlf A00(VG3 vg3, VG3 vg32) {
        C14360o3.A0B(vg3, 0);
        W5L w5l = (W5L) this.A01.get(vg3);
        Integer num = null;
        if (w5l == null) {
            return null;
        }
        Map map = w5l.A01;
        C69762Vuz c69762Vuz = (C69762Vuz) map.get(vg32);
        if (c69762Vuz != null) {
            num = Integer.valueOf(c69762Vuz.A00);
        }
        Object obj = map.get(vg3);
        if (obj != null) {
            int i = ((C69762Vuz) obj).A00;
            int i2 = w5l.A00 - 1;
            Object obj2 = map.get(vg3);
            if (obj2 != null) {
                EnumC68118VCb enumC68118VCb = ((C69762Vuz) obj2).A03;
                List list = this.A00;
                C14360o3.A0B(list, 0);
                return new C69333Vlf(enumC68118VCb, num, i, i2, w5l.equals(AbstractC58320PtC.A0u(list)));
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C69588Vrr(List list) {
        this.A03 = list;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            W5L w5l = new W5L(new LinkedHashMap());
            arrayList.add(w5l);
            ArrayList A0k = MSY.A0k(map);
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry entry = (Map.Entry) A15.next();
                linkedHashMap.put(entry.getKey(), w5l);
                AbstractC31177DnL.A1S(entry, linkedHashMap2);
                A0k.add(C0eB.A00);
            }
            A0q.add(A0k);
        }
        this.A00 = AbstractC001800i.A0a(arrayList);
        this.A01 = AbstractC06930Yk.A0B(linkedHashMap);
        this.A02 = AbstractC06930Yk.A0B(linkedHashMap2);
    }
}
