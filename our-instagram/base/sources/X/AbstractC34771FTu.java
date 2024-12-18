package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.FTu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34771FTu {
    public static final void A01(Context context, Intent intent, android.net.Uri uri, String str, String str2) {
        AbstractC167007dF.A1G(context, 0, uri);
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str).appendQueryParameter(AbstractC58317Pt9.A00(702), context.getPackageName()).appendQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
        intent.setData(buildUpon.build());
    }

    public static final String A00(android.net.Uri uri) {
        if (uri == null) {
            return null;
        }
        String queryParameter = uri.getQueryParameter(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
        if (queryParameter != null) {
            return queryParameter;
        }
        return uri.getQueryParameter("target_user_id");
    }
}
