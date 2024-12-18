package X;

import java.util.Map;

/* loaded from: classes10.dex */
public abstract class S2E {
    public static C60638REx A00(C62740SOg c62740SOg, Integer num, Long l, Long l2, String str, Map map) {
        String A0R = l == null ? AnonymousClass001.A0R("", " eventMillis") : "";
        if (l2 == null) {
            A0R = AnonymousClass001.A0R(A0R, " uptimeMillis");
        }
        if (A0R.isEmpty()) {
            return new C60638REx(c62740SOg, num, str, map, l.longValue(), l2.longValue());
        }
        throw AbstractC31175DnJ.A0V("Missing required properties:", A0R);
    }
}
