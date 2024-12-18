package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.user.model.ScheduledLiveProductsMetadataIntf;
import com.instagram.user.model.UpcomingEventLiveMetadata;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class IAH {
    public static Map A00(UpcomingEventLiveMetadata upcomingEventLiveMetadata) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (upcomingEventLiveMetadata.AiJ() != null) {
            A1I.put(TraceFieldType.BroadcastId, upcomingEventLiveMetadata.AiJ());
        }
        if (upcomingEventLiveMetadata.CQq() != null) {
            A1I.put("is_broadcast_ended", upcomingEventLiveMetadata.CQq());
        }
        upcomingEventLiveMetadata.CcQ();
        A1I.put("is_scheduled_live", Boolean.valueOf(upcomingEventLiveMetadata.CcQ()));
        upcomingEventLiveMetadata.BO0();
        A1I.put("live_notifs_enabled", Boolean.valueOf(upcomingEventLiveMetadata.BO0()));
        if (upcomingEventLiveMetadata.Bf3() != null) {
            A1I.put("post_live_media_id", upcomingEventLiveMetadata.Bf3());
        }
        if (upcomingEventLiveMetadata.Bui() != null) {
            ScheduledLiveProductsMetadataIntf Bui = upcomingEventLiveMetadata.Bui();
            if (Bui != null) {
                treeUpdaterJNI = Bui.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("shopping_info", treeUpdaterJNI);
        }
        if (upcomingEventLiveMetadata.CGc() != null) {
            A1I.put("visibility", upcomingEventLiveMetadata.CGc());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
