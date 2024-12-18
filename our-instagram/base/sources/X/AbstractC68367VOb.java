package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.VOb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC68367VOb {
    public static Map A00(InterfaceC109884xG interfaceC109884xG) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC109884xG.BEm() != null) {
            linkedHashMap.put("icon_glyph", interfaceC109884xG.BEm());
        }
        if (interfaceC109884xG.BEw() != null) {
            linkedHashMap.put("icon_type", interfaceC109884xG.BEw());
        }
        if (interfaceC109884xG.getName() != null) {
            linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, interfaceC109884xG.getName());
        }
        if (interfaceC109884xG.BzU() != null) {
            linkedHashMap.put("src", interfaceC109884xG.BzU());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
