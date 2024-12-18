package X;

import java.util.Map;

@Deprecated
/* renamed from: X.4C8, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4C8 {
    public static boolean A00(Map map) {
        if (!map.containsKey("update_prefetch_priority") || Integer.parseInt((String) map.get("update_prefetch_priority")) == 0) {
            return false;
        }
        return true;
    }
}
