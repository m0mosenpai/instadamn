package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.5qz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C128305qz extends AbstractC06970Yo implements java.util.Set, Collection, InterfaceC15590qF {
    public final C57M A00;

    @Override // X.AbstractC17040sw
    public final int A08() {
        return this.A00.size();
    }

    @Override // X.AbstractC17040sw, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        Map.Entry entry;
        if (!(obj instanceof Map.Entry) || (entry = (Map.Entry) obj) == null) {
            return false;
        }
        C57M c57m = this.A00;
        Object obj2 = c57m.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != null) {
            return obj2.equals(value);
        }
        if (value != null || !c57m.containsKey(entry.getKey())) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC17040sw, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        C57O c57o = this.A00.A00;
        AbstractC128315r0[] abstractC128315r0Arr = new AbstractC128315r0[8];
        int i = 0;
        do {
            abstractC128315r0Arr[i] = new AbstractC128315r0();
            i++;
        } while (i < 8);
        return new AbstractC128345r3(c57o, abstractC128315r0Arr);
    }

    public C128305qz(C57M c57m) {
        this.A00 = c57m;
    }
}
