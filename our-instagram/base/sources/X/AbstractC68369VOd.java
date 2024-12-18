package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.VOd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC68369VOd {
    public static Map A00(InterfaceC72031XFt interfaceC72031XFt) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC72031XFt.BOM() != null) {
            linkedHashMap.put("location", interfaceC72031XFt.BOM());
        }
        if (interfaceC72031XFt.CBl() != null) {
            linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, interfaceC72031XFt.CBl());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
