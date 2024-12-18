package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.UpcomingDropCampaignEventMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class IAE {
    public static Map A00(UpcomingDropCampaignEventMetadata upcomingDropCampaignEventMetadata) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (upcomingDropCampaignEventMetadata.Ap9() != null) {
            ProductCollection Ap9 = upcomingDropCampaignEventMetadata.Ap9();
            if (Ap9 != null) {
                treeUpdaterJNI = Ap9.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("collection_metadata", treeUpdaterJNI);
        }
        if (upcomingDropCampaignEventMetadata.AsQ() != null) {
            UpcomingEventMedia AsQ = upcomingDropCampaignEventMetadata.AsQ();
            if (AsQ != null) {
                treeUpdaterJNI2 = AsQ.F7o();
            }
            A1I.put("cover_media", treeUpdaterJNI2);
        }
        if (upcomingDropCampaignEventMetadata.AzY() != null) {
            A1I.put("drop_campaign_id", upcomingDropCampaignEventMetadata.AzY());
        }
        if (upcomingDropCampaignEventMetadata.BML() != null) {
            A1I.put("launch_type_subtitle", upcomingDropCampaignEventMetadata.BML());
        }
        if (upcomingDropCampaignEventMetadata.BSW() != null) {
            AbstractC37301Gc2.A1Q(upcomingDropCampaignEventMetadata.BSW(), A1I);
        }
        if (upcomingDropCampaignEventMetadata.BhR() != null) {
            List BhR = upcomingDropCampaignEventMetadata.BhR();
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = BhR.iterator();
            while (it.hasNext()) {
                AbstractC37303Gc4.A1U(A1E, it);
            }
            A1I.put("products", A1E);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
