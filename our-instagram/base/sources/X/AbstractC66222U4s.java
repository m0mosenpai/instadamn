package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.U4s, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66222U4s {
    public static final Object A00(C6FW c6fw) {
        int A0D = AbstractC65702TsY.A0D(c6fw);
        List list = c6fw.A00;
        String str = (String) list.get(1);
        Object obj = list.get(2);
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>");
        Map map = (Map) obj;
        C14360o3.A0B(map, 2);
        InterfaceC72008XEw A00 = U4N.A00(str, A0D);
        if (A00 != null) {
            U4N.A02(A00, map);
            return null;
        }
        return null;
    }
}
