package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7TW, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7TW {
    public final int A00;
    public final Map A01 = new LinkedHashMap();

    public boolean A02(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return this.A01.values().contains(str);
    }

    private final void A00(C160787Im c160787Im, List list) {
        C910143t c910143t;
        Long l;
        long longValue;
        C910143t c910143t2;
        C83403nh c83403nh = c160787Im.A0e;
        C14360o3.A07(c83403nh);
        String A0h = c83403nh.A0h();
        if (A0h != null) {
            int i = this.A00;
            if (i != 98 && i != 91 && i != 179 && i != 169 && i != 184) {
                ImmutableList A0H = c83403nh.A0H();
                if (A0H != null && (c910143t2 = (C910143t) AbstractC001800i.A0O(A0H, 0)) != null) {
                    longValue = c910143t2.A0D;
                } else {
                    return;
                }
            } else {
                ImmutableList A0H2 = c83403nh.A0H();
                if (A0H2 == null || (c910143t = (C910143t) AbstractC001800i.A0O(A0H2, 0)) == null || (l = c910143t.A0o) == null) {
                    return;
                } else {
                    longValue = l.longValue();
                }
            }
            if (longValue != 0) {
                Map map = this.A01;
                Long valueOf = Long.valueOf(longValue);
                String str = (String) map.get(valueOf);
                if (str != null) {
                    if (!str.equals(A0h) && c83403nh.A1o(str)) {
                        map.put(valueOf, A0h);
                        list.add(str);
                    } else {
                        return;
                    }
                } else {
                    map.put(valueOf, A0h);
                }
                list.add(A0h);
            }
        }
    }

    public List A01(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                int type = ((C160787Im) obj).getType();
                int i = this.A00;
                if (type == i || (type == 105 && i == 91)) {
                    arrayList2.add(obj);
                }
            }
            List A0Y = AbstractC001800i.A0Y(arrayList2);
            if (A0Y != null) {
                Iterator it = A0Y.iterator();
                while (it.hasNext()) {
                    A00((C160787Im) it.next(), arrayList);
                }
            }
        }
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list2) {
                int type2 = ((C160787Im) obj2).getType();
                int i2 = this.A00;
                if (type2 == i2 || (type2 == 105 && i2 == 91)) {
                    arrayList3.add(obj2);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                A00((C160787Im) it2.next(), arrayList);
            }
        }
        return AbstractC001800i.A0a(arrayList);
    }

    public C7TW(int i) {
        this.A00 = i;
    }
}
