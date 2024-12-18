package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;

/* loaded from: classes6.dex */
public final class GCW implements GYB {
    public final Fragment A00;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        String str;
        C14360o3.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (queryParameter != null && queryParameter.length() != 0) {
            str = uri.getQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            C14360o3.A0A(str);
        } else {
            str = "megaphone";
        }
        AbstractC31177DnL.A0m();
        Bundle A0F = AbstractC31174DnI.A0F(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        A0F.putString("edit_profile_entry", str);
        C6XJ.A06(this.A00.requireContext(), A0F, ModalActivity.class, AbstractC111324zv.A00(772));
    }

    public GCW(Fragment fragment) {
        this.A00 = fragment;
    }
}
