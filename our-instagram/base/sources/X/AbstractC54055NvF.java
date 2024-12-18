package X;

import com.instagram.api.schemas.IGLiveNotificationPreference;

/* renamed from: X.NvF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54055NvF {
    public static final String A00(IGLiveNotificationPreference iGLiveNotificationPreference) {
        int A05 = AbstractC25227BEk.A05(iGLiveNotificationPreference, 0);
        if (A05 != 1) {
            if (A05 != 3) {
                if (A05 != 2) {
                    if (A05 == 0) {
                        return "ig_live_notification_preference_unrecognized";
                    }
                    throw B4Z.A00();
                }
                return "turn_on_some_live_notifications";
            }
            return "turn_off_live_notifications";
        }
        return "turn_on_all_live_notifications";
    }
}
