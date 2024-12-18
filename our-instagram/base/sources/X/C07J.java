package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.07J, reason: invalid class name */
/* loaded from: classes.dex */
public final class C07J {
    public static final C07J A02;
    public final Map A00;
    public final java.util.Set A01;

    public C07J(Map map, java.util.Set set) {
        C14360o3.A0B(set, 1);
        C14360o3.A0B(map, 3);
        this.A01 = set;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        this.A00 = linkedHashMap;
    }

    static {
        C16910sj c16910sj = C16910sj.A00;
        C16920sk c16920sk = C16920sk.A00;
        C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        A02 = new C07J(c16920sk, c16910sj);
    }
}
