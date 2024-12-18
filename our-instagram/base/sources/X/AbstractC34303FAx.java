package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FAx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34303FAx {
    public static final C1ON A00(EnumC33510Erj enumC33510Erj, UserSession userSession, Integer num) {
        C14360o3.A0B(userSession, 0);
        String str = null;
        String str2 = null;
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        AbstractC31173DnH.A1Q(A0M, "invites/get_user_invite_message/", new Object[0]);
        if (num != null) {
            str2 = AbstractC34302FAw.A00(num);
        }
        A0M.A0H("medium", str2);
        if (enumC33510Erj != null) {
            str = enumC33510Erj.A00;
        }
        A0M.A0H("invite_location", str);
        return AbstractC25227BEk.A0e(A0M, C32183ECe.class, FX5.class);
    }
}
