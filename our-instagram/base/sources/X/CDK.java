package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.MediaNoteMimicryTrigger;
import com.instagram.api.schemas.MediaNoteMimicryType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class CDK {
    public static Map A00(C52O c52o) {
        ArrayList arrayList;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        String str = null;
        if (c52o.CB5() != null) {
            List<MediaNoteMimicryTrigger> CB5 = c52o.CB5();
            if (CB5 != null) {
                arrayList = AbstractC167017dG.A0q(CB5);
                for (MediaNoteMimicryTrigger mediaNoteMimicryTrigger : CB5) {
                    C14360o3.A0B(mediaNoteMimicryTrigger, 0);
                    arrayList.add(mediaNoteMimicryTrigger.A00);
                }
            } else {
                arrayList = null;
            }
            A1I.put(AbstractC111324zv.A00(3260), arrayList);
        }
        if (c52o.CBW() != null) {
            MediaNoteMimicryType CBW = c52o.CBW();
            if (CBW != null) {
                str = CBW.A00;
            }
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
