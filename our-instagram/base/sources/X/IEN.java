package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public final class IEN {
    public final Map A01 = new ConcurrentHashMap();
    public final Map A00 = new ConcurrentHashMap();

    public IEN() {
        Iterator<E> it = EnumC39530Hcx.A00.iterator();
        while (it.hasNext()) {
            this.A01.put(it.next(), Collections.newSetFromMap(new ConcurrentHashMap()));
        }
        for (Object obj : Hd0.A00) {
            Iterator<E> it2 = C6K.A00.iterator();
            while (it2.hasNext()) {
                this.A00.put(AbstractC166987dD.A1L(obj, it2.next()), Collections.newSetFromMap(new ConcurrentHashMap()));
            }
        }
    }
}
