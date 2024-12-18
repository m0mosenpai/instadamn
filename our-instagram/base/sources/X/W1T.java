package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class W1T {
    public final UserSession A00;

    public W1T(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final void A00(C68249VJl c68249VJl, W1T w1t, C19280xC c19280xC) {
        c19280xC.A0C("actor_igid", w1t.A00.userId);
        c19280xC.A0C("tip_id", c68249VJl.A05);
        c19280xC.A0C("channel_id", c68249VJl.A02);
    }
}
