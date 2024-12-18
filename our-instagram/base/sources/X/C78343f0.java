package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.3f0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78343f0 {
    public final synchronized void A00(int i) {
        Map map = (Map) C78333ez.A07.getValue();
        Integer valueOf = Integer.valueOf(i);
        Object obj = map.get(valueOf);
        if (obj == null) {
            obj = new ArrayList();
            map.put(valueOf, obj);
        }
        ((List) obj).add(Boolean.valueOf(C2XV.A01()));
    }
}
