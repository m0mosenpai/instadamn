package X;

import com.instagram.avatars.common.AvatarInfo;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.Dqb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31371Dqb {
    public final C21C A00;
    public final UserSession A01;

    public final void A02(String str, boolean z) {
        C14360o3.A0B(str, 0);
        AbstractC31177DnL.A1M(this.A00.A00.ARD(), "KEY_COIN_FLIP_INTRO_ON_SELF_PROFILE_POST_CREATION_ELIGIBLE", str, z);
    }

    public final boolean A03(String str) {
        C14360o3.A0B(str, 0);
        return this.A00.A00.getBoolean(AnonymousClass001.A0R("KEY_COIN_FLIP_INTRO_ON_PROFILE_ENALBED", str), true);
    }

    public final Object A01(AvatarInfo avatarInfo, Boolean bool, String str, String str2, String str3, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        boolean z2 = false;
        C25621Ms A0c = AbstractC167017dG.A0c(this.A01);
        A0c.A0B("creatives/save_avatar_profile_settings/");
        A0c.A0I(AbstractC111324zv.A00(4118), z);
        if (bool != null) {
            z2 = bool.booleanValue();
        }
        A0c.A0I("is_coin_flip_tied_to_avatar", z2);
        AbstractC31173DnH.A1N(A0c);
        if (str != null) {
            A0c.A9s("background_id", str);
        }
        if (str2 != null) {
            A0c.A9s("animation_sticker_pack", str2);
        }
        if (str3 != null) {
            A0c.A9s("coin_flip_action_surface", str3);
        }
        if (avatarInfo != null) {
            String str4 = avatarInfo.A00;
            if (str4 != null) {
                A0c.A9s("avatar_id", str4);
            }
            String str5 = avatarInfo.A01;
            if (str5 != null) {
                A0c.A9s("avatar_revision_id", str5);
            }
            String str6 = avatarInfo.A02;
            if (str6 != null) {
                A0c.A9s(AbstractC111324zv.A00(175), str6);
            }
        }
        return A0c.A0N().A00(1868968123, interfaceC23621Ds);
    }

    public C31371Dqb(UserSession userSession, C21C c21c) {
        AbstractC167017dG.A1P(userSession, c21c);
        this.A01 = userSession;
        this.A00 = c21c;
    }

    public static final Object A00(UserSession userSession, String str, String str2, InterfaceC23621Ds interfaceC23621Ds) {
        Long A0j;
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0B("creatives/avatar_profile_pic/");
        A0M.A0R(C152506td.class, C152516te.class);
        if (str != null && (A0j = AbstractC166997dE.A0j(str)) != null) {
            A0M.A0E(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, A0j.longValue());
        }
        if (str2 != null) {
            A0M.A9s("coin_flip_type", str2);
        }
        return A0M.A0N().A00(987414878, interfaceC23621Ds);
    }
}
