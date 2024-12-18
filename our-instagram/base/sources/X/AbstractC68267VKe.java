package X;

import java.util.Map;

/* renamed from: X.VKe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68267VKe {
    public static C69666Vt7 A00(C69666Vt7 c69666Vt7, Map map, String[] strArr) {
        int length;
        int i = 0;
        if (c69666Vt7 == null) {
            if (strArr == null) {
                return null;
            }
            length = strArr.length;
            if (length == 1) {
                return (C69666Vt7) map.get(strArr[0]);
            }
            if (length <= 1) {
                return c69666Vt7;
            }
            c69666Vt7 = new C69666Vt7();
        } else {
            if (strArr == null) {
                return c69666Vt7;
            }
            length = strArr.length;
            if (length == 1) {
                c69666Vt7.A00((C69666Vt7) map.get(strArr[0]));
                return c69666Vt7;
            }
            if (length <= 1) {
                return c69666Vt7;
            }
        }
        do {
            c69666Vt7.A00((C69666Vt7) map.get(strArr[i]));
            i++;
        } while (i < length);
        return c69666Vt7;
    }
}
