package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.UserTagInfoDictIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.GdE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37372GdE {
    public static Map A00(UserTagInfoDictIntf userTagInfoDictIntf) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (userTagInfoDictIntf.AmW() != null) {
            linkedHashMap.put("categories", userTagInfoDictIntf.AmW());
        }
        if (userTagInfoDictIntf.Azj() != null) {
            linkedHashMap.put("duration_in_video_in_sec", AnonymousClass010.A0m(String.valueOf(userTagInfoDictIntf.Azj())));
        }
        ArrayList arrayList = null;
        if (userTagInfoDictIntf.Bec() != null) {
            List Bec = userTagInfoDictIntf.Bec();
            if (Bec != null) {
                arrayList = new ArrayList();
                Iterator it = Bec.iterator();
                while (it.hasNext()) {
                    Double A0m = AnonymousClass010.A0m(String.valueOf(((Number) it.next()).floatValue()));
                    if (A0m != null) {
                        arrayList.add(A0m);
                    }
                }
            }
            linkedHashMap.put("position", arrayList);
        }
        if (userTagInfoDictIntf.Bw5() != null) {
            linkedHashMap.put("show_category_of_user", userTagInfoDictIntf.Bw5());
        }
        if (userTagInfoDictIntf.Bzn() != null) {
            linkedHashMap.put("start_time_in_video_in_sec", AnonymousClass010.A0m(String.valueOf(userTagInfoDictIntf.Bzn())));
        }
        User CDj = userTagInfoDictIntf.CDj();
        if (CDj != null) {
            linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_USER, CDj.A07());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
