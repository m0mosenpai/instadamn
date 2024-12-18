package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.DoT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC31245DoT {
    public static Map A00(InterfaceC81913lB interfaceC81913lB) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC81913lB.getId() != null) {
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, interfaceC81913lB.getId());
        }
        if (interfaceC81913lB.getUsername() != null) {
            A1I.put(AbstractC37310GcC.A00(), interfaceC81913lB.getUsername());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
