package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class BFM {
    public static Map A00(InterfaceC107754tK interfaceC107754tK) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC107754tK.getMediaId() != null) {
            linkedHashMap.put("media_id", interfaceC107754tK.getMediaId());
        }
        if (interfaceC107754tK.BlW() != null) {
            linkedHashMap.put("reel_id", interfaceC107754tK.BlW());
        }
        if (interfaceC107754tK.getTitle() != null) {
            linkedHashMap.put(DialogModule.KEY_TITLE, interfaceC107754tK.getTitle());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
