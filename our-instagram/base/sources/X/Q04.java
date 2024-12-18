package X;

import java.util.LinkedHashMap;

/* loaded from: classes10.dex */
public abstract class Q04 {
    public static final Q03 A00(Q03... q03Arr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Q03 q03 : q03Arr) {
            linkedHashMap.putAll(q03.A00);
            linkedHashMap2.putAll(q03.A01);
        }
        return new Q03(AbstractC06930Yk.A0B(linkedHashMap2), AbstractC06930Yk.A0B(linkedHashMap));
    }
}
