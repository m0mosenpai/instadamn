package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes6.dex */
public final class GE0 implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        Bundle A0E = AbstractC31174DnI.A0E(uri, 0);
        AbstractC31172DnG.A1I(uri, A0E, "should_show_promotion_content");
        AbstractC31173DnH.A1A(uri, A0E, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        AbstractC31173DnH.A1A(uri, A0E, "media_id");
        AbstractC31173DnH.A1A(uri, A0E, "dummy_param_random_uuid");
        AbstractC31172DnG.A1I(uri, A0E, "has_relaunched_from_main_activity");
        AbstractC35275FhA.A07(A0E, this.A00.requireActivity(), this.A01);
    }

    public GE0(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
