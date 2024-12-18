package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5F7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5F7 {
    public final List A03;
    public Map A02 = null;
    public Map A01 = null;
    public Map A00 = null;

    public final C5NW A00(String str, String str2) {
        Number number;
        if (str != null && str2 != null && (number = (Number) A02().get(str)) != null) {
            for (C5NW c5nw : A01(number.intValue())) {
                if (str2.equals(c5nw.A01)) {
                    return c5nw;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, X.Xf5] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, X.Xf5] */
    public final List A01(int i) {
        List list;
        Map map;
        synchronized (this) {
            if (this.A00 == null) {
                this.A00 = new HashMap();
                List list2 = this.A03;
                Iterator it = list2.iterator();
                int i2 = -1;
                int i3 = -1;
                int i4 = -1;
                while (it.hasNext()) {
                    i3++;
                    int i5 = ((C5NW) it.next()).A02;
                    if (i5 != i2) {
                        if (i2 >= 0) {
                            Map map2 = this.A00;
                            Integer valueOf = Integer.valueOf(i2);
                            ?? obj = new Object();
                            obj.A00 = i4;
                            obj.A01 = i3;
                            map2.put(valueOf, obj);
                        }
                        i2 = i5;
                        i4 = i3;
                    }
                }
                if (i2 >= 0) {
                    Map map3 = this.A00;
                    Integer valueOf2 = Integer.valueOf(i2);
                    int size = list2.size();
                    ?? obj2 = new Object();
                    obj2.A00 = i4;
                    obj2.A01 = size;
                    map3.put(valueOf2, obj2);
                }
            }
            list = this.A03;
            list.size();
            this.A00.size();
            map = this.A00;
        }
        C72492Xf5 c72492Xf5 = (C72492Xf5) map.get(Integer.valueOf(i));
        if (c72492Xf5 != null) {
            return list.subList(c72492Xf5.A00, c72492Xf5.A01);
        }
        return Collections.emptyList();
    }

    public final synchronized Map A02() {
        if (this.A02 == null) {
            this.A02 = new HashMap();
            for (C5NW c5nw : this.A03) {
                this.A02.put(c5nw.A00, Integer.valueOf(c5nw.A02));
            }
        }
        return this.A02;
    }

    public C5F7(List list) {
        this.A03 = Collections.unmodifiableList(new ArrayList(list));
    }
}
