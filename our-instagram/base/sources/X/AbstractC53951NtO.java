package X;

import android.os.Bundle;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.NtO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53951NtO {
    public static final N5K A00(String str) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        N5K n5k = new N5K();
        n5k.setArguments(A0b);
        return n5k;
    }
}
