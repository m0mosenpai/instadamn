package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ev2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC33714Ev2 {
    public static Map A00(InterfaceC110324y3 interfaceC110324y3) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC110324y3.getId() != null) {
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, interfaceC110324y3.getId());
        }
        if (interfaceC110324y3.getName() != null) {
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, interfaceC110324y3.getName());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
