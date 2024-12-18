package X;

import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7tk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC176887tk {
    public static C176877tj A00(List list, int i, int i2) {
        double d;
        double d2 = i / i2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C176877tj c176877tj = (C176877tj) it.next();
            if (!A02(c176877tj)) {
                arrayList.add(c176877tj);
            }
        }
        Iterator it2 = arrayList.iterator();
        C176877tj c176877tj2 = null;
        int i3 = Integer.MAX_VALUE;
        double d3 = Double.MAX_VALUE;
        while (it2.hasNext()) {
            C176877tj c176877tj3 = (C176877tj) it2.next();
            int i4 = c176877tj3.A02;
            if (i4 == i && c176877tj3.A01 == i2) {
                return c176877tj3;
            }
            int i5 = c176877tj3.A01;
            if (i4 >= i5) {
                double d4 = i4;
                double d5 = i5;
                double d6 = d4 / d5;
                if (d6 >= d2) {
                    d = d5 * ((d5 * d6) - (d5 * d2));
                } else {
                    d = d4 * ((d4 / d6) - (d4 / d2));
                }
                int abs = Math.abs(i5 - i2);
                if (c176877tj2 == null || abs < i3 || (c176877tj2.A01 == i5 && d < d3)) {
                    i3 = abs;
                    c176877tj2 = c176877tj3;
                    d3 = d;
                }
            }
        }
        if (c176877tj2 == null) {
            return (C176877tj) arrayList.get(arrayList.size() - 1);
        }
        return c176877tj2;
    }

    public static ArrayList A01(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet(list);
        for (Object obj : list2) {
            if (hashSet.contains(obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(list);
        }
        Collections.sort(arrayList, new Comparator() { // from class: X.7tl
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(Object obj2, Object obj3) {
                C176877tj c176877tj = (C176877tj) obj2;
                C176877tj c176877tj2 = (C176877tj) obj3;
                return (c176877tj.A02 * c176877tj.A01) - (c176877tj2.A02 * c176877tj2.A01);
            }
        });
        return arrayList;
    }

    public static boolean A02(C176877tj c176877tj) {
        int i;
        int i2;
        String str = Build.MODEL;
        if (!str.startsWith("HUAWEI GRA") && !str.startsWith("HUAWEI MT7")) {
            if (str.equals("SD4930UR") && c176877tj.A02 == 2592) {
                i = c176877tj.A01;
                i2 = 1944;
            } else {
                return false;
            }
        } else if (c176877tj.A02 == 1440) {
            i = c176877tj.A01;
            i2 = 1080;
        } else {
            return false;
        }
        if (i == i2) {
            return true;
        }
        return false;
    }
}
