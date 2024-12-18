package X;

import android.os.Bundle;
import com.instagram.clips.intf.ClipsViewerSource;

/* loaded from: classes5.dex */
public abstract class CLE {
    public static final C26837Bsz A00(ClipsViewerSource clipsViewerSource, String str, String str2, String str3, boolean z) {
        C14360o3.A0B(str2, 1);
        C26837Bsz c26837Bsz = new C26837Bsz();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("media_id", str);
        A0b.putString("grid_key", str2);
        A0b.putParcelable(AbstractC111324zv.A00(805), clipsViewerSource);
        A0b.putString(AbstractC111324zv.A00(AbstractC62862SUj.MAX_FACTORIAL), str3);
        A0b.putBoolean("should_show_followed_users_profile_pictures", z);
        c26837Bsz.setArguments(A0b);
        return c26837Bsz;
    }
}
