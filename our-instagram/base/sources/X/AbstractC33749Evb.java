package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Evb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC33749Evb {
    public static Map A00(InterfaceC37273GbQ interfaceC37273GbQ) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC37273GbQ.getEmoji() != null) {
            A1I.put("emoji", interfaceC37273GbQ.getEmoji());
        }
        if (interfaceC37273GbQ.B6s() != null) {
            A1I.put("fit_id", interfaceC37273GbQ.B6s());
        }
        if (interfaceC37273GbQ.BGu() != null) {
            A1I.put("image_url", interfaceC37273GbQ.BGu());
        }
        if (interfaceC37273GbQ.getName() != null) {
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, interfaceC37273GbQ.getName());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
