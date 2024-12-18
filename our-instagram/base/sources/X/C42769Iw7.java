package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.Iw7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42769Iw7 implements GYB {
    public final AbstractC59962oe A00;
    public final UserSession A01;

    public C42769Iw7(AbstractC59962oe abstractC59962oe, UserSession userSession) {
        C14360o3.A0B(abstractC59962oe, 1);
        this.A00 = abstractC59962oe;
        this.A01 = userSession;
    }

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "TEMPLATE_BROWSER_ENTRY_POINT_DEEPLINK");
        UserSession userSession = this.A01;
        AbstractC59962oe abstractC59962oe = this.A00;
        AbstractC40914IAm.A00(abstractC59962oe.requireActivity(), abstractC59962oe.requireContext(), A0b, userSession);
    }
}
