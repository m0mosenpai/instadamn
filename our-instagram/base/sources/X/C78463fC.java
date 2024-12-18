package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3fC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78463fC {
    public final Map A00;
    public final Map A01;

    public final Object A00(Object obj) {
        C14360o3.A0B(obj, 0);
        Object obj2 = this.A01.get(obj);
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    public final void A01(Object obj, Object obj2) {
        C14360o3.A0B(obj, 0);
        this.A00.put(obj, obj2);
    }

    public C78463fC(Map map) {
        this.A00 = new HashMap();
        this.A01 = map == null ? AbstractC06930Yk.A0E() : map;
    }

    public C78463fC() {
        this(null);
    }
}
