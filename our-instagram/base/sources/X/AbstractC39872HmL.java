package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CreatorViewerInsightCTA;
import com.instagram.api.schemas.CreatorViewerInsightType;
import com.instagram.api.schemas.PopularReelWithFollowersInsightMetadata;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HmL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39872HmL {
    public static Map A00(JLM jlm) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (jlm.AtV() != null) {
            CreatorViewerInsightCTA AtV = jlm.AtV();
            if (AtV != null) {
                str = AtV.A00;
            } else {
                str = null;
            }
            A1I.put("cta", str);
        }
        if (jlm.BIH() != null) {
            CreatorViewerInsightType BIH = jlm.BIH();
            C14360o3.A0B(BIH, 0);
            A1I.put("insight_type", BIH.A00);
        }
        if (jlm.BeV() != null) {
            PopularReelWithFollowersInsightMetadata BeV = jlm.BeV();
            if (BeV != null) {
                treeUpdaterJNI = BeV.F7o();
            }
            A1I.put(AbstractC111324zv.A00(253), treeUpdaterJNI);
        }
        if (jlm.getText() != null) {
            AbstractC37300Gc1.A15(jlm.getText(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
