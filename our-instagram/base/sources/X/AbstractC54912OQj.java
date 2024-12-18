package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.OQj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54912OQj {
    public static final N7N A00(String str, String str2, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString(AbstractC50532MSl.A00(), str);
        A0b.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
        A0b.putBoolean("saved_state", true);
        A0b.putBoolean("is_enabled", z);
        A0b.putBoolean("non_followers", z2);
        A0b.putBoolean("new_followers", z3);
        A0b.putBoolean("non_close_friends", z4);
        A0b.putLong("reminder_date", j);
        A0b.putLong("start_date", j2);
        A0b.putBoolean("some_interactions", z5);
        A0b.putBoolean("most_interactions", z6);
        A0b.putBoolean("feature_customization_enabled", z7);
        N7N n7n = new N7N();
        n7n.setArguments(A0b);
        return n7n;
    }

    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        boolean A1a = AbstractC167017dG.A1a(userSession, fragmentActivity);
        String A0j = AbstractC167017dG.A0j();
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0B("users/get_limited_interactions_settings/");
        C1ON A0e = AbstractC25227BEk.A0e(A0M, N2V.class, ONV.class);
        A0e.A00 = new C52221N9k(fragmentActivity, userSession, str, A0j, A1a ? 1 : 0);
        C1GJ.A03(A0e);
    }
}
