package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class CDE {
    public static Map A00(InterfaceC31129DmC interfaceC31129DmC) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC31129DmC.getId() != null) {
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, interfaceC31129DmC.getId());
        }
        if (interfaceC31129DmC.C8B() != null) {
            A1I.put(AbstractC111324zv.A00(543), interfaceC31129DmC.C8B());
        }
        if (interfaceC31129DmC.getTitle() != null) {
            A1I.put(DialogModule.KEY_TITLE, interfaceC31129DmC.getTitle());
        }
        if (interfaceC31129DmC.getUsername() != null) {
            A1I.put(AbstractC37310GcC.A00(), interfaceC31129DmC.getUsername());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
