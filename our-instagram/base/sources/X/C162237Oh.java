package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7Oh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162237Oh {
    public final C162227Og A00;
    public final Map A01 = new LinkedHashMap();

    public final synchronized void A02(String str) {
        C14360o3.A0B(str, 0);
        this.A01.remove(str);
    }

    public final synchronized void A03(String str, long j) {
        C14360o3.A0B(str, 0);
        if (A00()) {
            Map map = this.A01;
            List list = (List) map.get(str);
            if (list == null) {
                list = new ArrayList();
            }
            if (!map.containsKey(str)) {
                map.put(str, list);
            }
            if (!A01(list, j)) {
                Iterator it = list.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((Number) it.next()).longValue() <= j - this.A00.A02) {
                        i++;
                    } else if (i > 0) {
                        list = list.subList(i, list.size());
                        map.put(str, list);
                    }
                }
                list.add(Long.valueOf(j));
            }
        }
    }

    public final synchronized boolean A04(String str, long j) {
        List list;
        C14360o3.A0B(str, 0);
        if (!A00() || (list = (List) this.A01.get(str)) == null) {
            return false;
        }
        return A01(list, j);
    }

    private final boolean A00() {
        C162227Og c162227Og = this.A00;
        if (c162227Og.A02 != 0 && c162227Og.A00 != 0 && c162227Og.A01 != 0) {
            return true;
        }
        return false;
    }

    public C162237Oh(C162227Og c162227Og) {
        this.A00 = c162227Og;
    }

    private final boolean A01(List list, long j) {
        if (!A00()) {
            return false;
        }
        int size = list.size();
        C162227Og c162227Og = this.A00;
        if (size < c162227Og.A00 || ((Number) AbstractC001800i.A0I(list)).longValue() + c162227Og.A02 < ((Number) AbstractC001800i.A0K(list)).longValue() || ((Number) AbstractC001800i.A0K(list)).longValue() + c162227Og.A01 < j) {
            return false;
        }
        return true;
    }
}
