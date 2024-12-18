package X;

import android.R;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.quicklog.MarkerEditor;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.reels.Reel;
import java.util.Arrays;

/* renamed from: X.3As, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69583As {
    public final C006802i A00 = C006802i.A0p;
    public final C69593At A01;
    public final UserSession A02;

    public final void A02(Reel reel, C41181vS c41181vS, boolean z) {
        int i;
        int i2;
        C14360o3.A0B(c41181vS, 2);
        MarkerEditor withMarker = this.A00.withMarker(R.drawable.alert_light_frame, reel.getId().hashCode());
        if (c41181vS.A0C() != null) {
            i = c41181vS.A0C().A00;
        } else {
            i = -1;
        }
        withMarker.annotate("media_type", String.valueOf(i));
        withMarker.annotate("json_loaded_from_cache", String.valueOf(z));
        UserSession userSession = this.A02;
        withMarker.annotate("reel_item_count", reel.A0O(userSession).size());
        withMarker.point("REEL_JSON_RECEIVED");
        withMarker.markerEditingCompleted();
        C69593At c69593At = this.A01;
        if (c41181vS.A0C() != null) {
            i2 = c41181vS.A0C().A00;
        } else {
            i2 = -1;
        }
        int size = reel.A0O(userSession).size();
        c69593At.A0G("media_type", i2);
        c69593At.A0K("json_loaded_from_cache", z);
        c69593At.A0G("reel_item_count", size);
        C69613Av c69613Av = c69593At.A03;
        if (z) {
            c69613Av.A02();
        } else {
            c69613Av.A05();
        }
    }

    public final void A04(Reel reel, String str) {
        C14360o3.A0B(reel, 0);
        C006802i c006802i = this.A00;
        c006802i.markerAnnotate(R.drawable.alert_light_frame, reel.getId().hashCode(), "cancel_reason", str);
        c006802i.markerEnd(R.drawable.alert_light_frame, reel.getId().hashCode(), (short) 4);
        C69593At c69593At = this.A01;
        c69593At.A0J("cancel_reason", str);
        c69593At.A08();
    }

    public final void A00() {
        C69593At c69593At = this.A01;
        c69593At.A0K("media_loaded_from_cache", false);
        c69593At.A04.A05();
    }

    public final void A01(Reel reel) {
        this.A00.markerEnd(R.drawable.alert_light_frame, reel.getId().hashCode(), (short) 2);
        C69593At c69593At = this.A01;
        c69593At.A00 = true;
        c69593At.A0E("progress_bar_started");
        c69593At.A05.A05();
    }

    public final void A03(Reel reel, C3G2 c3g2, int i) {
        String A0R = AnonymousClass001.A0R(C75653aW.A04(new C41551w4(this.A02, reel, false, null, null, C16910sj.A00, -1, System.currentTimeMillis(), false).A0H), c3g2.A00);
        C006802i c006802i = this.A00;
        c006802i.markerStart(R.drawable.alert_light_frame, reel.getId().hashCode());
        MarkerEditor withMarker = c006802i.withMarker(R.drawable.alert_light_frame, reel.getId().hashCode());
        withMarker.annotate("reel_id", reel.getId());
        withMarker.annotate("reel_position", String.valueOf(i));
        withMarker.annotate(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, A0R);
        withMarker.markerEditingCompleted();
        C69593At c69593At = this.A01;
        String id = reel.getId();
        C14360o3.A07(id);
        C14360o3.A0B(A0R, 2);
        c69593At.A09(AwakeTimeSinceBootClock.INSTANCE.now());
        c69593At.A0J("reel_id", id);
        c69593At.A0G("reel_position", i);
        c69593At.A0J(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, A0R);
    }

    public final void A05(String str) {
        this.A00.markerEnd(17323904, Arrays.hashCode(new Object[]{str}), (short) 3);
    }

    public final void A06(String str) {
        this.A00.markerEnd(17323904, Arrays.hashCode(new Object[]{str}), (short) 2);
    }

    public final void A07(String str) {
        this.A00.markerPoint(17323904, Arrays.hashCode(new Object[]{str}), "metadata_loaded");
    }

    public C69583As(UserSession userSession) {
        this.A02 = userSession;
        this.A01 = new C69593At(userSession);
    }
}
