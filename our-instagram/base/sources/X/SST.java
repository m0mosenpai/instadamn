package X;

import java.util.AbstractMap;

/* loaded from: classes10.dex */
public final class SST {
    public static TZp A00(Object destMapField, Object srcMapField) {
        TZp tZp = (TZp) destMapField;
        AbstractMap abstractMap = (AbstractMap) srcMapField;
        if (!abstractMap.isEmpty()) {
            if (!tZp.A00) {
                tZp = tZp.A01();
            }
            if (tZp.A00) {
                if (!abstractMap.isEmpty()) {
                    tZp.putAll(abstractMap);
                }
            } else {
                throw AbstractC43592JPx.A11();
            }
        }
        return tZp;
    }
}
