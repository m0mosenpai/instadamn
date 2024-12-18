package X;

import java.util.LinkedHashMap;

/* renamed from: X.0ZF, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0ZF {
    public static LinkedHashMap A00(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < strArr.length; i++) {
            linkedHashMap.put(strArr[i], Integer.valueOf(i));
        }
        return linkedHashMap;
    }
}
