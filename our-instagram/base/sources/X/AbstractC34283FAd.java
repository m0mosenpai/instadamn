package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.FriendshipStatus;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.FAd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC34283FAd {
    public static Map A00(InterfaceC37275GbS interfaceC37275GbS) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC37275GbS.Bs7() != null) {
            A1I.put("seen", interfaceC37275GbS.Bs7());
        }
        if (interfaceC37275GbS.CBD() != null) {
            A1I.put("ts", interfaceC37275GbS.CBD());
        }
        User CDj = interfaceC37275GbS.CDj();
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (CDj != null) {
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_USER, CDj.A07());
        }
        if (interfaceC37275GbS.CGI() != null) {
            FriendshipStatus CGI = interfaceC37275GbS.CGI();
            if (CGI != null) {
                treeUpdaterJNI = CGI.F7o();
            }
            A1I.put("viewer_relationship_info", treeUpdaterJNI);
        }
        if (interfaceC37275GbS.CH4() != null) {
            A1I.put("vote", interfaceC37275GbS.CH4());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
