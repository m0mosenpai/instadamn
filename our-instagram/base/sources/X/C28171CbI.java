package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.CbI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28171CbI {
    public final C18920wW A00;
    public final UserSession A01;

    public C28171CbI(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AbstractC12220kQ.A02(userSession);
    }

    public static final void A00(C28171CbI c28171CbI, String str, String str2, String str3, boolean z) {
        C8U c8u;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c28171CbI.A00, "ig_creator_ai_fan_onboarding");
        if (A0f.isSampled()) {
            A0f.AAP("action", str);
            A0f.A9K("actor_user_id", AbstractC25228BEl.A13(c28171CbI.A01.userId));
            A0f.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
            A0f.A9K("target_user_id", AbstractC166997dE.A0j(str3));
            if (z) {
                c8u = C8U.NEW;
            } else {
                c8u = C8U.EXISTING;
            }
            A0f.A8R(c8u, "thread_type");
            A0f.Cht();
        }
    }
}
