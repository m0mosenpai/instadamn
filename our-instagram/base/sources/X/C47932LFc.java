package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.LFc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47932LFc {
    public static C47932LFc A00;
    public static final ConcurrentMap A01 = new ConcurrentHashMap();
    public static final ConcurrentMap A02 = new ConcurrentHashMap();

    public final boolean A00(String str) {
        C14360o3.A0B(str, 0);
        ConcurrentMap concurrentMap = A01;
        if (!concurrentMap.containsKey(str)) {
            return false;
        }
        ConcurrentMap concurrentMap2 = A02;
        if (!concurrentMap2.containsKey(str) && concurrentMap.containsKey(str)) {
            concurrentMap2.put(str, concurrentMap.get(str));
        }
        return true;
    }
}
