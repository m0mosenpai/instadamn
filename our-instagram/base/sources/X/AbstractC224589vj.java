package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.9vj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC224589vj {
    public static C176877tj A00(C176877tj c176877tj, List list, java.util.Set set, double d) {
        C176877tj c176877tj2 = null;
        int i = c176877tj.A02;
        int i2 = c176877tj.A01;
        int max = Math.max(i, i2);
        int min = Math.min(i, i2);
        if (d <= 0.0d) {
            d = AD7.A00(i, i2);
        }
        double d2 = Double.MAX_VALUE;
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C176877tj c176877tj3 = (C176877tj) it.next();
            int i3 = c176877tj3.A02;
            int i4 = c176877tj3.A01;
            int max2 = Math.max(i3, i4);
            int min2 = Math.min(i3, i4);
            double A00 = AD7.A00(i3, i4);
            if (set == null || set.isEmpty() || set.contains(Double.valueOf(A00))) {
                if (max2 == max && min2 == min && Math.abs(A00 - d) <= 0.001d) {
                    return c176877tj3;
                }
                double abs = Math.abs(d - A00);
                double d3 = abs - d2;
                if (d3 <= 0.001d) {
                    if (Math.abs(d3) > 0.001d) {
                        d2 = abs;
                        c176877tj2 = null;
                        z = false;
                    }
                    if (max2 >= max && min2 >= min) {
                        if (!z) {
                            c176877tj2 = c176877tj3;
                            z = true;
                        } else if (c176877tj2 != null && Long.signum((i3 * i4) - (c176877tj2.A02 * c176877tj2.A01)) < 0) {
                            c176877tj2 = c176877tj3;
                        }
                    } else if (!z) {
                        if (c176877tj2 != null && Long.signum((i3 * i4) - (c176877tj2.A02 * c176877tj2.A01)) <= 0) {
                        }
                        c176877tj2 = c176877tj3;
                    }
                }
            }
        }
        return c176877tj2;
    }
}
