package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes5.dex */
public final class BP5 {
    public final String A00;
    public final InterfaceC11380iw A01;
    public final C18920wW A02;
    public final UserSession A03;

    public BP5(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A00 = str;
        C19270xB c19270xB = new C19270xB("CreatorsGenAiLogger");
        this.A01 = c19270xB;
        this.A02 = AbstractC12220kQ.A01(c19270xB, userSession);
    }

    public final void A03(C8p c8p) {
        A02(null, null, c8p, null, null, null);
    }

    public final void A04(C8p c8p, String str) {
        A02(null, null, c8p, null, null, str);
    }

    public static final void A00(BP5 bp5, Long l, String str) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(bp5.A02, "ig_creator_ai_fan");
        if (A0f.isSampled()) {
            A0f.AAP("action", str);
            A0f.A9K("actor_user_id", AbstractC25228BEl.A13(bp5.A03.userId));
            String str2 = bp5.A00;
            if (str2 != null) {
                A0f.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
            }
            if (l != null) {
                A0f.A9K("target_user_id", Long.valueOf(l.longValue()));
            }
            A0f.Cht();
        }
    }

    public final void A01(C8j c8j) {
        A02(c8j, null, C8p.A08, null, null, this.A00);
    }

    public final void A02(C8j c8j, EnumC53352Nj2 enumC53352Nj2, C8p c8p, Boolean bool, Boolean bool2, String str) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02, "ig_creator_ai_creator");
        if (A0f.isSampled()) {
            A0f.A9K("actor_user_id", AbstractC25228BEl.A13(this.A03.userId));
            A0f.A8R(c8p, "action");
            A0f.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
            if (bool != null) {
                A0f.A7v("initial_toggle_value", Boolean.valueOf(bool.booleanValue()));
            }
            if (bool2 != null) {
                A0f.A7v("new_toggle_value", Boolean.valueOf(bool2.booleanValue()));
            }
            if (c8j != null) {
                A0f.A8R(c8j, AbstractC111324zv.A00(798));
            }
            if (enumC53352Nj2 != null) {
                C0Zx c0Zx = new C0Zx();
                c0Zx.A01(enumC53352Nj2, "audience");
                A0f.AAQ(c0Zx, "audience_context");
            }
            A0f.Cht();
        }
    }
}
