package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import java.util.UUID;

/* renamed from: X.6xd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C154886xd implements InterfaceC13000lm {
    public String A00;
    public final C18920wW A01;
    public final String A02;
    public final UserSession A03;

    public static final EnumC31498Dsi A00(int i, boolean z) {
        if (i == 29) {
            if (!z) {
                return EnumC31498Dsi.BROADCAST_CHATS;
            }
        } else {
            if (C4GR.A01(i)) {
                return EnumC31498Dsi.PUBLIC_CHATS;
            }
            if (!C4GR.A02(i)) {
                return null;
            }
        }
        return EnumC31498Dsi.CREATOR_SUBSCRIBER_CHATS;
    }

    public static final String A01(C154886xd c154886xd, FollowStatus followStatus, String str) {
        if (C14360o3.A0K(c154886xd.A02, str)) {
            return "self";
        }
        if (followStatus.ordinal() == 4) {
            return "follower";
        }
        return "non_follower";
    }

    public static final String A02(C154886xd c154886xd, C17Q c17q, String str) {
        if (C14360o3.A0K(c154886xd.A02, str)) {
            return "self";
        }
        if (c17q.ordinal() == 4) {
            return "subscriber";
        }
        return "non_subscriber";
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A03.A03(C154886xd.class);
    }

    public C154886xd(UserSession userSession) {
        this.A03 = userSession;
        this.A02 = userSession.userId;
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = "instagram_ibc_profile_actions";
        this.A01 = c12210kP.A00();
    }

    public static final void A03(C154886xd c154886xd) {
        c154886xd.A00 = UUID.randomUUID().toString();
    }
}
