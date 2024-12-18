package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CreatorViewerSignalPlainDetails;
import com.instagram.api.schemas.FormattedString;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HmW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39883HmW {
    public static Map A00(CreatorViewerSignalPlainDetails creatorViewerSignalPlainDetails) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (creatorViewerSignalPlainDetails.BEi() != null) {
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, creatorViewerSignalPlainDetails.BEi());
        }
        if (creatorViewerSignalPlainDetails.C3a() != null) {
            FormattedString C3a = creatorViewerSignalPlainDetails.C3a();
            if (C3a != null) {
                treeUpdaterJNI = C3a.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("subtitle", treeUpdaterJNI);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
