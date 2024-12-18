package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CreatorViewerBottomCTA;
import com.instagram.api.schemas.CreatorViewerContextCTA;
import com.instagram.api.schemas.CreatorViewerSignalModel;
import com.instagram.api.schemas.CreatorViewerSignalWithInsightsInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HmM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39873HmM {
    public static Map A00(JMS jms) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (jms.AhW() != null) {
            CreatorViewerBottomCTA AhW = jms.AhW();
            if (AhW != null) {
                treeUpdaterJNI = AhW.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("bottom_cta", treeUpdaterJNI);
        }
        if (jms.AhY() != null) {
            List<CreatorViewerBottomCTA> AhY = jms.AhY();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (CreatorViewerBottomCTA creatorViewerBottomCTA : AhY) {
                if (creatorViewerBottomCTA != null) {
                    A1E.add(creatorViewerBottomCTA.F7o());
                }
            }
            A1I.put("bottom_cta_list", A1E);
        }
        if (jms.ArI() != null) {
            CreatorViewerContextCTA ArI = jms.ArI();
            if (ArI != null) {
                treeUpdaterJNI2 = ArI.F7o();
            }
            A1I.put("context_cta", treeUpdaterJNI2);
        }
        if (jms.BxL() != null) {
            List<CreatorViewerSignalWithInsightsInfo> BxL = jms.BxL();
            ArrayList A1E2 = AbstractC166987dD.A1E();
            for (CreatorViewerSignalWithInsightsInfo creatorViewerSignalWithInsightsInfo : BxL) {
                if (creatorViewerSignalWithInsightsInfo != null) {
                    A1E2.add(creatorViewerSignalWithInsightsInfo.F7o());
                }
            }
            A1I.put("signal_with_insights_list", A1E2);
        }
        if (jms.BxN() != null) {
            List<CreatorViewerSignalModel> BxN = jms.BxN();
            ArrayList A1E3 = AbstractC166987dD.A1E();
            for (CreatorViewerSignalModel creatorViewerSignalModel : BxN) {
                if (creatorViewerSignalModel != null) {
                    A1E3.add(creatorViewerSignalModel.F7o());
                }
            }
            A1I.put("signals", A1E3);
        }
        if (jms.getTitle() != null) {
            AbstractC37300Gc1.A17(jms.getTitle(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
