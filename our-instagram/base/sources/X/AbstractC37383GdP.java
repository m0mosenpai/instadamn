package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.GdP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37383GdP {
    public static Map A00(InterfaceC83933od interfaceC83933od) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC83933od.B4N() != null) {
            linkedHashMap.put("fallback_warning_message", interfaceC83933od.B4N());
        }
        if (interfaceC83933od.B8r() != null) {
            linkedHashMap.put("fsr_quality", interfaceC83933od.B8r());
        }
        if (interfaceC83933od.BwF() != null) {
            linkedHashMap.put("show_fallback_warning", interfaceC83933od.BwF());
        }
        if (interfaceC83933od.CDd() != null) {
            linkedHashMap.put("use_for_flash_cache_only", interfaceC83933od.CDd());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
