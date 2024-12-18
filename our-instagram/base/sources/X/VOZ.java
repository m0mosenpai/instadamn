package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class VOZ {
    public static Map A00(InterfaceC72035XFx interfaceC72035XFx) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC72035XFx.BkT() != null) {
            linkedHashMap.put("rating_text", interfaceC72035XFx.BkT());
        }
        if (interfaceC72035XFx.C9f() != null) {
            linkedHashMap.put("topic_text", interfaceC72035XFx.C9f());
        }
        if (interfaceC72035XFx.C9g() != null) {
            linkedHashMap.put("topics", interfaceC72035XFx.C9g());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
