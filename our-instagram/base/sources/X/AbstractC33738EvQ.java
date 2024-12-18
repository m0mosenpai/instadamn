package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.EvQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC33738EvQ {
    public static Map A00(InterfaceC37274GbR interfaceC37274GbR) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC37274GbR.AsA() != null) {
            A1I.put("country_list", interfaceC37274GbR.AsA());
        }
        if (interfaceC37274GbR.Bks() != null) {
            A1I.put("reason", interfaceC37274GbR.Bks());
        }
        if (interfaceC37274GbR.BsS() != null) {
            A1I.put("segmented_video_group_handler_id", interfaceC37274GbR.BsS());
        }
        if (interfaceC37274GbR.Buy() != null) {
            A1I.put("should_disable_sharing", interfaceC37274GbR.Buy());
        }
        if (interfaceC37274GbR.CBn() != null) {
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, interfaceC37274GbR.CBn());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
