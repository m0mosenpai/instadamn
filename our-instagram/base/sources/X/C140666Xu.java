package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.6Xu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140666Xu {
    public final String A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C140666Xu(UserSession userSession, Reel reel) {
        User user;
        C14360o3.A0B(userSession, 2);
        String id = reel.getId();
        C14360o3.A07(id);
        this.A00 = id;
        boolean z = true;
        this.A04 = !reel.A16(userSession);
        this.A02 = reel.A1Y;
        User A00 = C08730cb.A00(userSession).A00();
        C1NB c1nb = reel.A0W;
        if (c1nb != null) {
            user = c1nb.CDj();
        } else {
            user = null;
        }
        this.A03 = C14360o3.A0K(A00, user);
        if (!reel.A0b() && !reel.A0i() && !reel.A0k()) {
            z = false;
        }
        this.A01 = z;
    }
}
