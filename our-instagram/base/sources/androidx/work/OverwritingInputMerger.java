package androidx.work;

import X.AbstractC48512Kt;
import X.C14360o3;
import X.C48532Kv;
import X.C48552Kx;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends AbstractC48512Kt {
    @Override // X.AbstractC48512Kt
    public final C48532Kv A00(List list) {
        C48552Kx c48552Kx = new C48552Kx();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map unmodifiableMap = Collections.unmodifiableMap(((C48532Kv) it.next()).A00);
            C14360o3.A07(unmodifiableMap);
            linkedHashMap.putAll(unmodifiableMap);
        }
        c48552Kx.A02(linkedHashMap);
        return c48552Kx.A00();
    }
}
