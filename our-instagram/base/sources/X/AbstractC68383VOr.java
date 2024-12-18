package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.VOr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC68383VOr {
    public static Map A00(InterfaceC72036XFy interfaceC72036XFy) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC72036XFy.AhM() != null) {
            linkedHashMap.put("border_color", interfaceC72036XFy.AhM());
        }
        if (interfaceC72036XFy.AhN() != null) {
            linkedHashMap.put("border_width", AbstractC166997dE.A0f(interfaceC72036XFy.AhN()));
        }
        if (interfaceC72036XFy.C8B() != null) {
            linkedHashMap.put("thumbnail_url", interfaceC72036XFy.C8B());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
