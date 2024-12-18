package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.U3p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66199U3p {
    public final C66198U3o A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;

    public C66199U3p(C66198U3o c66198U3o, List list, List list2, List list3) {
        this.A00 = c66198U3o;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(c66198U3o.A02, c66198U3o);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C66198U3o c66198U3o2 = (C66198U3o) it.next();
            linkedHashMap.put(c66198U3o2.A02, c66198U3o2);
        }
        this.A03 = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            C206409Bx c206409Bx = (C206409Bx) it2.next();
            linkedHashMap2.put(c206409Bx.A01, c206409Bx);
        }
        this.A02 = linkedHashMap2;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            C68917VeH c68917VeH = (C68917VeH) it3.next();
            linkedHashMap3.put(c68917VeH.A00, c68917VeH);
        }
        this.A01 = linkedHashMap3;
    }
}
