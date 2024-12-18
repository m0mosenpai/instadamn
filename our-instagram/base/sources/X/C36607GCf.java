package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.GCf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36607GCf implements GYB {
    public final Fragment A00;

    public C36607GCf(Fragment fragment) {
        this.A00 = fragment;
    }

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        AbstractC155756z4.A00();
        Fragment fragment = this.A00;
        Intent A08 = AbstractC31173DnH.A08(fragment.requireContext());
        Bundle requireArguments = fragment.requireArguments();
        requireArguments.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "megaphone");
        AbstractC31174DnI.A1A(A08, 7, requireArguments);
        C12260kU.A06(fragment, A08, 12);
    }
}
