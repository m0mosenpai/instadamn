package X;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: X.Num, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54036Num {
    public static final C54741OFs A00(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        String string = bundle.getString("post_live.extra.live_pending_media_id");
        if (string == null) {
            string = AbstractC43593JPy.A0x();
        }
        String A0k = AbstractC31173DnH.A0k(bundle, "post_live.extra.live_broadcast_id");
        long j = bundle.getLong("post_live.extra.live_duration_ms");
        boolean z = bundle.getBoolean("post_live.extra.is_landscape", false);
        boolean z2 = bundle.getBoolean("post_live.extra.live_has_shopping");
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("post_live.extra.live_branded_content_tag");
        C14360o3.A0C(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<com.instagram.pendingmedia.model.BrandedContentTag>");
        int i = bundle.getInt("post_live.extra.cover_image_width");
        int i2 = bundle.getInt("post_live.extra.cover_image_height");
        boolean z3 = bundle.getBoolean("post_live.extra.is_custom_cover_photo");
        String string2 = bundle.getString("post_live.extra.cover_photo_path");
        int i3 = bundle.getInt("post_live.extra.cover_picker_progress");
        return new C54741OFs(string, A0k, string2, bundle.getString("post_live.extra.caption"), bundle.getString("post_live.extra.title"), bundle.getString("post_live.extra.caption"), parcelableArrayList, i, i2, i3, j, z, z2, z3, bundle.getBoolean("post_live.extra.caption"), bundle.getBoolean("post_live.extra.share_preview_to_feed"), bundle.getBoolean("post_live.extra.internal"), bundle.getBoolean("post_live.extra.internal.switch.enabled"), bundle.getBoolean("post_live.extra.exclusive_post"));
    }
}
