package X;

import android.app.Activity;
import android.content.Intent;
import com.instagram.common.session.UserSession;
import com.instagram.igtv.uploadflow.IGTVUploadActivity;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: X.1Xb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C27971Xb {
    public static C27971Xb A00;

    public final void A00(Activity activity, UserSession userSession, ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel, String str, String str2, List list, long j, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(str2, 3);
        C14360o3.A0B(list, 5);
        C22P c22p = C22P.A3B;
        Intent intent = new Intent(activity, (Class<?>) IGTVUploadActivity.class);
        intent.putExtra("IgSessionManager.SESSION_TOKEN_KEY", userSession.userId);
        intent.putExtra("uploadflow.extra.start_screen", "POST_LIVE_CANVAS");
        intent.putExtra("igtv_creation_entry_point_arg", c22p);
        intent.putExtra("uploadflow.extra.is_upload_flow_embedded", false);
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        intent.putExtra("igtv_creation_session_id_arg", obj);
        intent.putExtra("post_live.extra.live_pending_media_id", str);
        intent.putExtra("post_live.extra.live_broadcast_id", str2);
        intent.putExtra("post_live.extra.live_duration_ms", j);
        intent.putExtra("post_live.extra.internal", z);
        intent.putExtra("post_live.extra.internal.switch.enabled", true);
        intent.putExtra("post_live.extra.exclusive_post", z2);
        intent.putExtra("post_live.extra.live_branded_content_tag", new ArrayList(list));
        intent.putExtra("post_live.extra.fundraiser_info", existingStandaloneFundraiserForFeedModel);
        intent.addFlags(813694976);
        C12260kU.A0C(activity, intent);
    }
}
