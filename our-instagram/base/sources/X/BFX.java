package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.api.schemas.AdMetadataType;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class BFX {
    public static Map A00(InterfaceC88223wX interfaceC88223wX) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC88223wX.CBQ() != null) {
            AdMetadataType CBQ = interfaceC88223wX.CBQ();
            C14360o3.A0B(CBQ, 0);
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, CBQ.A00);
        }
        if (interfaceC88223wX.getValue() != null) {
            A1I.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, interfaceC88223wX.getValue());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
