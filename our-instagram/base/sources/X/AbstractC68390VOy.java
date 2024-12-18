package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.VOy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC68390VOy {
    public static Map A00(InterfaceC72037XFz interfaceC72037XFz) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC72037XFz.getProfilePicUrl() != null) {
            linkedHashMap.put("profile_pic_url", interfaceC72037XFz.getProfilePicUrl());
        }
        if (interfaceC72037XFz.CDw() != null) {
            linkedHashMap.put("user_igid", interfaceC72037XFz.CDw());
        }
        if (interfaceC72037XFz.getUsername() != null) {
            linkedHashMap.put(AbstractC50531MSk.A00(), interfaceC72037XFz.getUsername());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
