package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2tI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62792tI {
    public final C1BX A00;
    public final C13920nI A01;

    public static C62792tI A00(C1BX c1bx) {
        return new C62792tI(c1bx, C13920nI.A00);
    }

    public final boolean A03(String str, long j) {
        long A04 = this.A00.A04(str, -2147483648L);
        if (A04 != -2147483648L) {
            if (System.currentTimeMillis() - j > A04 || A04 > System.currentTimeMillis()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C62792tI(C1BX c1bx, C13920nI c13920nI) {
        this.A00 = c1bx;
        this.A01 = c13920nI;
    }

    public static void A01(C1BX c1bx, java.util.Set set, long j, long j2) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Long l = (Long) entry.getValue();
            if (l.compareTo(Long.valueOf(j)) >= 0 && l.compareTo(Long.valueOf(j2)) <= 0) {
                c1bx.A0A((String) entry.getKey());
            }
        }
    }

    public final void A02(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        C1BX c1bx = this.A00;
        c1bx.A0C(str, currentTimeMillis);
        if (c1bx.A03() > 200) {
            int i = 50;
            java.util.Set A05 = c1bx.A05();
            ArrayList arrayList = new ArrayList();
            Iterator it = A05.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getValue() instanceof Long) {
                    if (((Long) entry.getValue()).compareTo(Long.valueOf(currentTimeMillis)) > 0) {
                        i2++;
                    }
                    arrayList.add(entry.getValue());
                } else {
                    it.remove();
                }
            }
            Collections.sort(arrayList);
            if (i2 > 0) {
                int min = Math.min(i2, 50);
                A01(c1bx, A05, currentTimeMillis + 1, ((Number) arrayList.get(((arrayList.size() - i2) + min) - 1)).longValue());
                i = 50 - min;
                if (i <= 0) {
                    return;
                }
            }
            A01(c1bx, A05, 0L, ((Number) arrayList.get(i - 1)).longValue());
        }
    }
}
