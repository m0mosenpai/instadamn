package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.Cv5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29261Cv5 implements InterfaceC31036Dka {
    @Override // X.InterfaceC31036Dka
    public final int AzS() {
        return R.drawable.instagram_money_pano_outline_24;
    }

    @Override // X.InterfaceC31036Dka
    public final void D3K(FragmentActivity fragmentActivity, UserSession userSession) {
        AbstractC167017dG.A1N(fragmentActivity, userSession);
        AbstractC28393Cfw.A03(userSession, "creator_tools_main_page", "monetization_tools_row");
        C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
        C26775Brw c26775Brw = new C26775Brw();
        AbstractC25233BEq.A15(c26775Brw, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, null);
        A0r.A0B(null, c26775Brw);
        A0r.A04();
    }

    @Override // X.InterfaceC31036Dka
    public final int getTitleRes() {
        return 2131966863;
    }
}
