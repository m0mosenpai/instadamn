package X;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: X.4XZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4XZ {
    public final Map A00;
    public final Map A01;
    public final Map A02;
    public final Random A03;

    public C4XZ() {
        Random random = new Random();
        this.A02 = new HashMap();
        this.A03 = random;
        this.A01 = new HashMap();
        this.A00 = new HashMap();
    }

    public static void A01(long j, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Number) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    public static ArrayList A00(C4XZ c4xz, List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Map map = c4xz.A01;
        A01(elapsedRealtime, map);
        Map map2 = c4xz.A00;
        A01(elapsedRealtime, map2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C92134At c92134At = (C92134At) list.get(i);
            if (!map.containsKey(c92134At.A02) && !map2.containsKey(Integer.valueOf(c92134At.A00))) {
                arrayList.add(c92134At);
            }
        }
        return arrayList;
    }

    public final C92134At A02(List list) {
        C92134At c92134At;
        Object obj;
        ArrayList A00 = A00(this, list);
        if (A00.size() < 2) {
            obj = null;
            Iterator it = A00.iterator();
            if (it.hasNext()) {
                obj = it.next();
            }
        } else {
            Collections.sort(A00, new Comparator() { // from class: X.TSA
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    C92134At c92134At2 = (C92134At) obj2;
                    C92134At c92134At3 = (C92134At) obj3;
                    int i = c92134At2.A00;
                    int i2 = c92134At3.A00;
                    if (i == i2) {
                        return c92134At2.A02.compareTo(c92134At3.A02);
                    }
                    if (i >= i2) {
                        return 1;
                    }
                    return -1;
                }
            });
            ArrayList arrayList = new ArrayList();
            int i = ((C92134At) A00.get(0)).A00;
            int i2 = 0;
            while (true) {
                if (i2 >= A00.size()) {
                    break;
                }
                C92134At c92134At2 = (C92134At) A00.get(i2);
                if (i != c92134At2.A00) {
                    if (arrayList.size() == 1) {
                        obj = A00.get(0);
                    }
                } else {
                    arrayList.add(new Pair(c92134At2.A02, Integer.valueOf(c92134At2.A01)));
                    i2++;
                }
            }
            Map map = this.A02;
            C92134At c92134At3 = (C92134At) map.get(arrayList);
            if (c92134At3 != null) {
                return c92134At3;
            }
            List subList = A00.subList(0, arrayList.size());
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < subList.size(); i5++) {
                i4 += ((C92134At) subList.get(i5)).A01;
            }
            int nextInt = this.A03.nextInt(i4);
            int i6 = 0;
            while (true) {
                if (i3 < subList.size()) {
                    c92134At = (C92134At) subList.get(i3);
                    i6 += c92134At.A01;
                    if (nextInt < i6) {
                        break;
                    }
                    i3++;
                } else {
                    c92134At = (C92134At) SSP.A00(subList);
                    break;
                }
            }
            map.put(arrayList, c92134At);
            return c92134At;
        }
        return (C92134At) obj;
    }
}
