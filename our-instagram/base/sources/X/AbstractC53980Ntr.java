package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.Ntr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53980Ntr {
    public static final N51 A00(UserSession userSession, String str) {
        C14360o3.A0B(str, 1);
        N51 n51 = new N51();
        Bundle A08 = MSX.A08(userSession);
        A08.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        n51.setArguments(A08);
        return n51;
    }
}
