package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.CreatorViewerInsightInfo;
import com.instagram.api.schemas.CreatorViewerSignalWithInsightsInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hma, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39887Hma {
    public static Map A00(CreatorViewerSignalWithInsightsInfo creatorViewerSignalWithInsightsInfo) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (creatorViewerSignalWithInsightsInfo.BEi() != null) {
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, creatorViewerSignalWithInsightsInfo.BEi());
        }
        if (creatorViewerSignalWithInsightsInfo.BGW() != null) {
            A1I.put("image", creatorViewerSignalWithInsightsInfo.BGW());
        }
        if (creatorViewerSignalWithInsightsInfo.BIJ() != null) {
            List<CreatorViewerInsightInfo> BIJ = creatorViewerSignalWithInsightsInfo.BIJ();
            ArrayList arrayList = null;
            if (BIJ != null) {
                arrayList = AbstractC166987dD.A1E();
                for (CreatorViewerInsightInfo creatorViewerInsightInfo : BIJ) {
                    if (creatorViewerInsightInfo != null) {
                        arrayList.add(creatorViewerInsightInfo.F7o());
                    }
                }
            }
            A1I.put("insights", arrayList);
        }
        if (creatorViewerSignalWithInsightsInfo.BxE() != null) {
            A1I.put("signal", creatorViewerSignalWithInsightsInfo.BxE().F7o());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
