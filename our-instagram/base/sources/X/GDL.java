package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes6.dex */
public final class GDL implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        UserSession userSession;
        C72743Nv A01;
        C14360o3.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("deal_template_id");
        if (queryParameter == null) {
            AbstractC34897FZj.A00();
            userSession = this.A01;
            A01 = AbstractC31180DnO.A0G(userSession, "com.instagram.incentive_platform.screens.deal_information", AbstractC167017dG.A0r(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, AbstractC31178DnM.A0f("QP")));
        } else {
            OX3 A00 = AbstractC34897FZj.A00();
            userSession = this.A01;
            A01 = A00.A01(userSession, queryParameter, "QP");
        }
        C140966Yy A0P = AbstractC31173DnH.A0P(this.A00, userSession);
        A0P.A0A = "QP";
        A0P.A0D(A01);
        A0P.A04();
    }

    public GDL(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
