package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.EventPageNavigationMetadata;
import com.instagram.api.schemas.IGLocalEventDict;
import com.instagram.api.schemas.UpcomingEventIDType;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import com.instagram.user.model.UpcomingDropCampaignEventMetadata;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.UpcomingEventLiveMetadata;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class IAG {
    public static Map A00(UpcomingEvent upcomingEvent) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        TreeUpdaterJNI treeUpdaterJNI4;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI5 = null;
        if (upcomingEvent.Aza() != null) {
            UpcomingDropCampaignEventMetadata Aza = upcomingEvent.Aza();
            if (Aza != null) {
                treeUpdaterJNI4 = Aza.F7o();
            } else {
                treeUpdaterJNI4 = null;
            }
            A1I.put("drops_campaign_metadata", treeUpdaterJNI4);
        }
        if (upcomingEvent.B24() != null) {
            A1I.put("end_time", upcomingEvent.B24());
        }
        if (upcomingEvent.B2l() != null) {
            EventPageNavigationMetadata B2l = upcomingEvent.B2l();
            if (B2l != null) {
                treeUpdaterJNI3 = B2l.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1I.put("event_page_metadata", treeUpdaterJNI3);
        }
        if (upcomingEvent.getId() != null) {
            AbstractC37300Gc1.A12(upcomingEvent.getId(), A1I);
        }
        if (upcomingEvent.BG0() != null) {
            IGLocalEventDict BG0 = upcomingEvent.BG0();
            if (BG0 != null) {
                treeUpdaterJNI2 = BG0.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("ig_local_event_dict", treeUpdaterJNI2);
        }
        if (upcomingEvent.CW7() != null) {
            A1I.put("is_ig_local_event", upcomingEvent.CW7());
        }
        if (upcomingEvent.BLn() != null) {
            A1I.put("last_notification_time", upcomingEvent.BLn());
        }
        if (upcomingEvent.BNx() != null) {
            UpcomingEventLiveMetadata BNx = upcomingEvent.BNx();
            if (BNx != null) {
                treeUpdaterJNI = BNx.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("live_metadata", treeUpdaterJNI);
        }
        if (upcomingEvent.BQO() != null) {
            UpcomingEventMedia BQO = upcomingEvent.BQO();
            if (BQO != null) {
                treeUpdaterJNI5 = BQO.F7o();
            }
            A1I.put("media", treeUpdaterJNI5);
        }
        User Bah = upcomingEvent.Bah();
        if (Bah != null) {
            A1I.put("owner", Bah.A07());
        }
        upcomingEvent.getReminderEnabled();
        A1I.put("reminder_enabled", Boolean.valueOf(upcomingEvent.getReminderEnabled()));
        upcomingEvent.getStartTime();
        A1I.put(TraceFieldType.StartTime, Long.valueOf(upcomingEvent.getStartTime()));
        if (upcomingEvent.getStrongId() != null) {
            A1I.put("strong_id__", upcomingEvent.getStrongId());
        }
        if (upcomingEvent.getTitle() != null) {
            AbstractC37300Gc1.A17(upcomingEvent.getTitle(), A1I);
        }
        if (upcomingEvent.CD5() != null) {
            UpcomingEventIDType CD5 = upcomingEvent.CD5();
            C14360o3.A0B(CD5, 0);
            A1I.put("upcoming_event_id_type", CD5.A00);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
