package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Do3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC31220Do3 {
    public static Map A00(InterfaceC82273lo interfaceC82273lo) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        interfaceC82273lo.B1r();
        linkedHashMap.put("end", Integer.valueOf(interfaceC82273lo.B1r()));
        if (interfaceC82273lo.getId() != null) {
            linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, interfaceC82273lo.getId());
        }
        interfaceC82273lo.BzY();
        linkedHashMap.put("start", Integer.valueOf(interfaceC82273lo.BzY()));
        if (interfaceC82273lo.getUsername() != null) {
            linkedHashMap.put(AbstractC50531MSk.A02(42, 8, 43), interfaceC82273lo.getUsername());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
