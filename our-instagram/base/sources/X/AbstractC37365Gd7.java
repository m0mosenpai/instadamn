package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Gd7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37365Gd7 {
    public static Map A00(InterfaceC88183wS interfaceC88183wS) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC88183wS.getData() != null) {
            linkedHashMap.put("data", interfaceC88183wS.getData());
        }
        if (interfaceC88183wS.Awj() != null) {
            InterfaceC84443pn Awj = interfaceC88183wS.Awj();
            if (Awj != null) {
                treeUpdaterJNI = Awj.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("demotion_control", treeUpdaterJNI);
        }
        if (interfaceC88183wS.getId() != null) {
            linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, interfaceC88183wS.getId());
        }
        interfaceC88183wS.BwU();
        linkedHashMap.put("show_icon", Boolean.valueOf(interfaceC88183wS.BwU()));
        if (interfaceC88183wS.C39() != null) {
            linkedHashMap.put("style", interfaceC88183wS.C39());
        }
        if (interfaceC88183wS.getText() != null) {
            linkedHashMap.put("text", interfaceC88183wS.getText());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
