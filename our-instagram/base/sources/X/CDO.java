package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class CDO {
    public static Map A00(InterfaceC31123Dm6 interfaceC31123Dm6) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC31123Dm6.BEi() != null) {
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, interfaceC31123Dm6.BEi());
        }
        if (interfaceC31123Dm6.BEz() != null) {
            A1I.put(AbstractC111324zv.A00(982), interfaceC31123Dm6.BEz());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
