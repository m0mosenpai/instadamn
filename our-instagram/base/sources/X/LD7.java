package X;

import android.os.Bundle;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes8.dex */
public abstract class LD7 {
    public static final KC8 A00(Integer num, String str, String str2) {
        C14360o3.A0B(str, 0);
        KC8 kc8 = new KC8();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("file_path", str);
        A0b.putString("source_media_id", str2);
        A0b.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, AbstractC46682Kkz.A00(num));
        A0b.putBoolean("from_create_btn", false);
        kc8.setArguments(A0b);
        return kc8;
    }

    public static final boolean A01(C22P c22p) {
        if (AbstractC001900j.A0a(c22p.toString(), "REMIX", false) || c22p == C22P.A17) {
            return false;
        }
        return true;
    }
}
