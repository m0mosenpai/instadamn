package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.OriginalityFollowButtonInfo;
import com.instagram.api.schemas.OriginalityInfo;
import com.instagram.api.schemas.OriginalitySourceMediaInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hqw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40129Hqw {
    public static Map A00(OriginalityInfo originalityInfo) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (originalityInfo.Akh() != null) {
            A1I.put("can_remove_originality_label", originalityInfo.Akh());
        }
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (originalityInfo.B7H() != null) {
            OriginalityFollowButtonInfo B7H = originalityInfo.B7H();
            if (B7H != null) {
                treeUpdaterJNI = B7H.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("follow_button_info", treeUpdaterJNI);
        }
        if (originalityInfo.BZp() != null) {
            OriginalitySourceMediaInfo BZp = originalityInfo.BZp();
            if (BZp != null) {
                treeUpdaterJNI2 = BZp.F7o();
            }
            A1I.put("original_media", treeUpdaterJNI2);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
