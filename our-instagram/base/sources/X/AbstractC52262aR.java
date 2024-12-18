package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2aR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC52262aR {
    public static final Map A00 = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.2aS, java.lang.Object] */
    public static final C52272aS A00(InterfaceC52252aQ interfaceC52252aQ, C0YR c0yr) {
        C14360o3.A0B(c0yr, 1);
        Map map = A00;
        Object obj = map.get(interfaceC52252aQ);
        if (obj == null) {
            obj = C16910sj.A00;
            map.put(interfaceC52252aQ, obj);
        }
        map.put(interfaceC52252aQ, AnonymousClass090.A01(((AbstractC06830Ya) c0yr).name, (java.util.Set) obj));
        return new Object();
    }
}
