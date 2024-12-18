package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;

/* loaded from: classes6.dex */
public final class GE4 implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        Bundle A0E = AbstractC31174DnI.A0E(uri, 0);
        AbstractC31172DnG.A1I(uri, A0E, "scroll_to_message_access_toggle");
        String queryParameter = uri.getQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (queryParameter != null) {
            A0E.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, queryParameter);
        }
        AbstractC31178DnM.A0j(this.A00, A0E, this.A01, ModalActivity.class, AbstractC111324zv.A00(5155));
    }

    public GE4(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
