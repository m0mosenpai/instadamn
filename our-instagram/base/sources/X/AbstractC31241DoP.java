package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.hashtag.Hashtag;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.DoP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC31241DoP {
    public static Map A00(InterfaceC81933lD interfaceC81933lD) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (interfaceC81933lD.BD4() != null) {
            Hashtag BD4 = interfaceC81933lD.BD4();
            if (BD4 != null) {
                treeUpdaterJNI = BD4.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("hashtag", treeUpdaterJNI);
        }
        if (interfaceC81933lD.CDh() != null) {
            InterfaceC81913lB CDh = interfaceC81933lD.CDh();
            if (CDh != null) {
                treeUpdaterJNI2 = CDh.F7o();
            }
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_USER, treeUpdaterJNI2);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
