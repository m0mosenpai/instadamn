package X;

import com.facebook.location.platform.api.Location;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.VOl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC68377VOl {
    public static Map A00(InterfaceC72032XFu interfaceC72032XFu) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC72032XFu.Bz7() != null) {
            linkedHashMap.put(Location.SPEED, interfaceC72032XFu.Bz7());
        }
        if (interfaceC72032XFu.Bze() != null) {
            linkedHashMap.put("startLagMs", interfaceC72032XFu.Bze());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
