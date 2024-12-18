package X;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6V2, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6V2 {
    public static final void A00(C1BX c1bx) {
        int i = 50;
        java.util.Set A05 = c1bx.A05();
        ArrayList arrayList = new ArrayList();
        Iterator it = A05.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof Long) {
                if (((Number) value).longValue() > Long.MAX_VALUE) {
                    i2++;
                }
                arrayList.add(value);
            } else {
                it.remove();
            }
        }
        List A0g = AbstractC001800i.A0g(arrayList, new Comparator() { // from class: X.6V3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C2BS.A00((Long) obj, (Long) obj2);
            }
        });
        if (i2 > 0) {
            int min = Math.min(i2, 50);
            Object obj = A0g.get(((A0g.size() - i2) + min) - 1);
            C14360o3.A0A(obj);
            A01(c1bx, A05, Long.MAX_VALUE, ((Number) obj).longValue());
            i = 50 - min;
            if (i <= 0) {
                return;
            }
        }
        Object obj2 = A0g.get(i - 1);
        C14360o3.A0A(obj2);
        A01(c1bx, A05, 0L, ((Number) obj2).longValue());
    }

    public static final void A01(C1BX c1bx, java.util.Set set, long j, long j2) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            C14360o3.A0C(value, "null cannot be cast to non-null type kotlin.Long");
            long longValue = ((Number) value).longValue();
            if (j <= longValue && longValue <= j2) {
                c1bx.A0A(str);
            }
        }
    }
}
