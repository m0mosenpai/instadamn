package X;

import java.util.Map;

/* renamed from: X.2ae, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC52392ae {
    public static final AbstractC52412ag A00(InterfaceC52252aQ interfaceC52252aQ, String str, Map map) {
        StringBuilder sb;
        java.util.Set set = (java.util.Set) AbstractC52262aR.A00.get(interfaceC52252aQ);
        if (set != null) {
            java.util.Set A02 = AnonymousClass090.A02(map.keySet(), set);
            if (!A02.isEmpty()) {
                sb = new StringBuilder();
                sb.append(str);
                sb.append(" parameters [");
                sb.append(AbstractC001800i.A0P(", ", "", "", A02, null));
                sb.append("] have not been set");
            } else {
                return new C52402af(map);
            }
        } else {
            sb = new StringBuilder();
            sb.append("No parameters have been defined in contract ");
            sb.append(new C0YZ(interfaceC52252aQ.getClass()));
        }
        return new C52422ah(sb.toString());
    }
}
