package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CreatorViewerInsightInfo;
import com.instagram.api.schemas.CreatorViewerInsightTypeV2;
import com.instagram.api.schemas.FormattedString;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HmJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39870HmJ {
    public static Map A00(CreatorViewerInsightInfo creatorViewerInsightInfo) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (creatorViewerInsightInfo.B8J() != null) {
            FormattedString B8J = creatorViewerInsightInfo.B8J();
            if (B8J != null) {
                treeUpdaterJNI = B8J.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("formatted_text", treeUpdaterJNI);
        }
        if (creatorViewerInsightInfo.BII() != null) {
            CreatorViewerInsightTypeV2 BII = creatorViewerInsightInfo.BII();
            C14360o3.A0B(BII, 0);
            A1I.put("insight_type_v2", BII.A00);
        }
        if (creatorViewerInsightInfo.getText() != null) {
            AbstractC37300Gc1.A15(creatorViewerInsightInfo.getText(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
