package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.user.model.ScheduledLiveProductsMetadata;
import com.instagram.user.model.UpcomingEventLiveMetadataImpl;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class IAI {
    public static UpcomingEventLiveMetadataImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            String str = null;
            Boolean bool3 = null;
            String str2 = null;
            ScheduledLiveProductsMetadata scheduledLiveProductsMetadata = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (TraceFieldType.BroadcastId.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_broadcast_ended".equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if ("is_scheduled_live".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("live_notifs_enabled".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("post_live_media_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("shopping_info".equals(A0s)) {
                    scheduledLiveProductsMetadata = IAC.parseFromJson(c16l);
                } else {
                    num = AbstractC31178DnM.A0V(c16l, num, A0s, "visibility");
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("is_scheduled_live", c16l, "UpcomingEventLiveMetadataImpl");
            } else if (bool2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("live_notifs_enabled", c16l, "UpcomingEventLiveMetadataImpl");
            } else {
                return new UpcomingEventLiveMetadataImpl(scheduledLiveProductsMetadata, bool3, num, str, str2, bool.booleanValue(), bool2.booleanValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
