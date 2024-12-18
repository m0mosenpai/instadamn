package X;

import com.facebook.common.dextricks.StringTreeSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3ev, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC78293ev {
    public static final void A02(Object obj, Object obj2, List list, List list2, List list3, List list4, Map map) {
        C77843eC c77843eC;
        if (list != null && !list.isEmpty()) {
            if (list2 != null && !list2.isEmpty()) {
                HashMap hashMap = new HashMap(list2.size());
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    C77843eC c77843eC2 = (C77843eC) list2.get(i);
                    Class CBk = c77843eC2.A00.CBk();
                    if (map != null && (c77843eC = (C77843eC) map.get(CBk)) != null) {
                        boolean Ek2 = c77843eC2.A00.Ek2(c77843eC.A01, c77843eC2.A01, obj, obj2);
                        hashMap.put(CBk, Boolean.valueOf(Ek2));
                        if (!Ek2) {
                        }
                    }
                    list3.add(c77843eC2);
                }
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C77843eC c77843eC3 = (C77843eC) list.get(i2);
                    Class CBk2 = c77843eC3.A00.CBk();
                    if (!hashMap.containsKey(CBk2) || C14360o3.A0K(hashMap.get(CBk2), true)) {
                        list4.add(c77843eC3);
                    }
                }
                return;
            }
            list4.addAll(list);
            return;
        }
        if (list2 != null) {
            list3.addAll(list2);
        }
    }

    public static final void A01(C77843eC c77843eC, List list, Map map) {
        Class CBk = c77843eC.A00.CBk();
        if (map.put(CBk, c77843eC) != null) {
            int size = list.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    if (C14360o3.A0K(((C77843eC) list.get(size)).A00.CBk(), CBk)) {
                        list.remove(size);
                        break;
                    } else if (i < 0) {
                        break;
                    } else {
                        size = i;
                    }
                }
            }
            throw new IllegalStateException("Binder Map and Binder List out of sync!");
        }
        list.add(c77843eC);
    }

    public static final String A00(String str) {
        if (str.length() > 127) {
            String substring = str.substring(0, StringTreeSet.MAX_SYMBOL_COUNT);
            C14360o3.A07(substring);
            return substring;
        }
        return str;
    }
}
