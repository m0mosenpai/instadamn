package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.AudienceListIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.EuB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC33661EuB {
    public static Map A00(AudienceListIntf audienceListIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        audienceListIntf.CSR();
        A1I.put("is_default", Boolean.valueOf(audienceListIntf.CSR()));
        audienceListIntf.CXV();
        A1I.put("is_list_name_public", Boolean.valueOf(audienceListIntf.CXV()));
        audienceListIntf.CXW();
        A1I.put("is_list_named", Boolean.valueOf(audienceListIntf.CXW()));
        if (audienceListIntf.BNl() != null) {
            A1I.put("list_id", audienceListIntf.BNl());
        }
        if (audienceListIntf.getName() != null) {
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, audienceListIntf.getName());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
