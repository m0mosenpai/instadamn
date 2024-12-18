package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Wpk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71195Wpk implements Iterable {
    public final Object A02 = new Object();
    public final Map A03 = new HashMap();
    public java.util.Set A01 = Collections.emptySet();
    public List A00 = Collections.emptyList();

    public final int A00(Object obj) {
        int i;
        synchronized (this.A02) {
            Map map = this.A03;
            if (map.containsKey(obj)) {
                i = ((Integer) map.get(obj)).intValue();
            } else {
                i = 0;
            }
        }
        return i;
    }

    public final java.util.Set A01() {
        java.util.Set set;
        synchronized (this.A02) {
            set = this.A01;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.A02) {
            it = this.A00.iterator();
        }
        return it;
    }
}
