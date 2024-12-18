package X;

import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class U4X {
    public static final C6AQ A00(C6FQ c6fq, C6FW c6fw) {
        Object A01 = c6fw.A01();
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        Map map = (Map) A02;
        Object A00 = c6fw.A00();
        C14360o3.A0C(A00, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A00;
        if (A01 instanceof String) {
            AnonymousClass632 A002 = C6AM.A00(c6fq);
            if (!A002.A05.containsKey(A01) && !A002.A04.containsKey(A01)) {
                throw new IllegalArgumentException(AnonymousClass001.A0g("Template with id ", (String) A01, " not found"));
            }
        }
        List list = c6fq.A0D;
        C14360o3.A06(list);
        return new C6AQ(A01, str, list, map);
    }
}
