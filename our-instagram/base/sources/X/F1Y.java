package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes6.dex */
public abstract class F1Y {
    public static final void A00(UserSession userSession, Activity activity, String str) {
        boolean A1R = AbstractC167007dF.A1R(0, activity, userSession);
        if (!AbstractC162267Oo.A03(userSession)) {
            C7F3 c7f3 = new C7F3(userSession);
            EHa eHa = new EHa();
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
            C189448aO A0W = AbstractC31174DnI.A0W(A0b, eHa, userSession);
            A0W.A16 = false;
            A0W.A0v = A1R;
            A0W.A0U = new C36730GGz(c7f3, userSession, str, 0);
            AbstractC31173DnH.A0w(activity, eHa, A0W);
        }
    }
}
