package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;

/* renamed from: X.1Yt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28321Yt {
    public static C28321Yt A01;
    public Xj3 A00;

    public final void A00(FragmentActivity fragmentActivity, UserSession userSession, VEB veb, String str, String str2, String str3) {
        if (C06P.A01(fragmentActivity.mFragments.A00.A03)) {
            Bundle bundle = new Bundle();
            bundle.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, veb);
            if (str != null) {
                bundle.putString("media_id", str);
            }
            if (str2 != null) {
                bundle.putString("hoisted_module_id_or_url_path", str2);
            }
            if (str3 != null) {
                bundle.putString("utm_source", str3);
            }
            C6XJ c6xj = new C6XJ(fragmentActivity, bundle, userSession, ModalActivity.class, "voting_info_center");
            c6xj.A07();
            c6xj.A0C(fragmentActivity);
        }
    }
}
