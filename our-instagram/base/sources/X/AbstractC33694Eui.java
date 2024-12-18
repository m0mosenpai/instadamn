package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.HallpassDetailsDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Eui, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC33694Eui {
    public static Map A00(HallpassDetailsDict hallpassDetailsDict) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (hallpassDetailsDict.getColor() != null) {
            A1I.put("color", hallpassDetailsDict.getColor());
        }
        if (hallpassDetailsDict.BAt() != null) {
            A1I.put("hallpass_id", hallpassDetailsDict.BAt());
        }
        if (hallpassDetailsDict.getName() != null) {
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, hallpassDetailsDict.getName());
        }
        List ByP = hallpassDetailsDict.ByP();
        if (ByP != null) {
            ArrayList A0q = AbstractC167017dG.A0q(ByP);
            Iterator it = ByP.iterator();
            while (it.hasNext()) {
                AbstractC31178DnM.A1U(A0q, it);
            }
            A1I.put("social_context_members", A0q);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
