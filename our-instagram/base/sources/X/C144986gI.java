package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.6gI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144986gI {
    public final C23031Ai A00;
    public final UserSession A01;

    public C144986gI(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AbstractC23021Ah.A00(userSession);
    }

    public final boolean A00(C41551w4 c41551w4) {
        String str;
        C14360o3.A0B(c41551w4, 0);
        String str2 = this.A01.userId;
        Reel reel = c41551w4.A0H;
        User A0D = reel.A0D();
        if (A0D != null) {
            str = A0D.getId();
        } else {
            str = null;
        }
        if (!C14360o3.A0K(str2, str) && reel.A0l()) {
            C23031Ai c23031Ai = this.A00;
            if (!((Boolean) c23031Ai.A42.CES(c23031Ai, C23031Ai.A8c[142])).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
