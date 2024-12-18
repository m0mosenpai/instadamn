package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AttributionUser;
import com.instagram.api.schemas.ProfilePicture;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.GdJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37377GdJ {
    public static Map A00(AttributionUser attributionUser) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (attributionUser.getInstagramUserId() != null) {
            A1I.put("instagram_user_id", attributionUser.getInstagramUserId());
        }
        if (attributionUser.CfY() != null) {
            A1I.put("is_verified", attributionUser.CfY());
        }
        if (attributionUser.Bhx() != null) {
            ProfilePicture Bhx = attributionUser.Bhx();
            if (Bhx != null) {
                treeUpdaterJNI = Bhx.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("profile_picture", treeUpdaterJNI);
        }
        if (attributionUser.getUsername() != null) {
            A1I.put(AbstractC37309GcB.A01(), attributionUser.getUsername());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
