package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Gmk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37945Gmk {
    public static Map A00(C43P c43p) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c43p.getAlgorithm() != null) {
            linkedHashMap.put("algorithm", c43p.getAlgorithm());
        }
        if (c43p.Byw() != null) {
            linkedHashMap.put("sources", c43p.Byw());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
