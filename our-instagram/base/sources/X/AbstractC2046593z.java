package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.user.model.User;

/* renamed from: X.93z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2046593z {
    public static final void A00(C1P1 c1p1, UserSession userSession, User user, String str, boolean z) {
        InterfaceC224116z Asx = user.A03.Asx();
        if (Asx != null) {
            Asx.At2();
        }
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A0B("creator/creator_info/");
        c25621Ms.A9s(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, user.getId());
        c25621Ms.A9s("surface_type", "android");
        if (z) {
            str = "self_profile";
        }
        c25621Ms.A9s(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        c25621Ms.A0P(null, AnonymousClass940.class, AnonymousClass941.class, false);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = c1p1;
        C1GJ.A06(A0N, 1653838317, 3, true, true);
    }
}
