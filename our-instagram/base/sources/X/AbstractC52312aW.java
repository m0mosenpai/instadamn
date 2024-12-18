package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2aW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC52312aW {
    public static final InterfaceC09390do A02 = AbstractC09440dt.A01(C52322aX.A00);
    public static final Map A00 = new LinkedHashMap();
    public static final Map A01 = new LinkedHashMap();

    public static final C52462al A00(InterfaceC52252aQ interfaceC52252aQ) {
        C52462al c52462al = (C52462al) A00.get(interfaceC52252aQ);
        if (c52462al != null) {
            return c52462al;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No experiment has been configured for contract ");
        sb.append(new C0YZ(interfaceC52252aQ.getClass()));
        throw new IllegalStateException(sb.toString());
    }
}
