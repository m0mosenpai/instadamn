package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.0XF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0XF {
    public ArrayList A00 = new ArrayList();
    public ArrayList A01 = new ArrayList();

    public static void A00(C0XF c0xf) {
        ArrayList arrayList = c0xf.A01;
        int size = arrayList.size() - 1;
        if (size >= 0 && arrayList.get(size) != null) {
            arrayList.remove(size);
        }
    }

    public final HashMap A01() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = null;
        A00(this);
        ArrayList arrayList = this.A01;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            if (obj != null) {
                hashMap2 = new HashMap();
                hashMap.put(obj, hashMap2);
            } else {
                ArrayList arrayList2 = this.A00;
                int i3 = i + 1;
                Object obj2 = arrayList2.get(i);
                i = i3 + 1;
                Object obj3 = arrayList2.get(i3);
                if (!(obj3 instanceof String)) {
                    if (obj3 instanceof Integer) {
                        obj3 = String.valueOf(((Number) obj3).intValue());
                    } else if (obj3 instanceof Long) {
                        obj3 = String.valueOf(((Number) obj3).longValue());
                    } else if (obj3 instanceof Double) {
                        obj3 = String.valueOf(((Number) obj3).doubleValue());
                    } else if (obj3 instanceof Boolean) {
                        obj3 = String.valueOf(((Boolean) obj3).booleanValue());
                    } else if (obj3 instanceof String[]) {
                        obj3 = Arrays.toString((Object[]) obj3);
                    } else if (obj3 instanceof int[]) {
                        obj3 = Arrays.toString((int[]) obj3);
                    } else if (obj3 instanceof long[]) {
                        obj3 = Arrays.toString((long[]) obj3);
                    }
                }
                hashMap2.put(obj2, obj3);
            }
        }
        return hashMap;
    }

    public final void A03(String str, Object obj) {
        ArrayList arrayList = this.A01;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = this.A00;
            arrayList2.add(str);
            arrayList2.add(obj);
            arrayList.add(null);
            return;
        }
        throw new IllegalStateException("Adding entries can be only done after category is started. Call startCategory first");
    }

    public final void A02(String str, long j) {
        A03(str, Long.valueOf(j));
    }
}
